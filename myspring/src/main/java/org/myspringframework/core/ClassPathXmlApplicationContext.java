package org.myspringframework.core;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description
 * @FileName ClassPathXmlApplicationContext
 * @Author JSF
 * @date 2024-05-10
 **/
public class ClassPathXmlApplicationContext implements ApplicationContext{
    private Map<String,Object> beanMap=new HashMap<>();

    public ClassPathXmlApplicationContext(String resource) {
        try {
            SAXReader reader = new SAXReader();
            Document document = reader.read(ClassLoader.getSystemClassLoader().getResourceAsStream(resource));
            //获取所有bean标签
            List<Node> beanNodes = document.selectNodes("//bean");
            //遍历集合
            beanNodes.forEach(beanNode->{
                Element beanElt = (Element) beanNode;
                //获取id
                String id = beanElt.attributeValue("id");
                //获取className
                String className= beanElt.attributeValue("class");
                try {
                    //通过反射机制创建对象
                    Class<?> clazz = Class.forName(className);
                    Constructor<?> defaultConstructor = clazz.getDeclaredConstructor();
                    Object bean = defaultConstructor.newInstance();
                    //存储到Map集合
                    beanMap.put(id,bean);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });

            //重新遍历，赋值
            beanNodes.forEach(beanNode->{
                Element beanElt= (Element) beanNode;
                //获取id
                String beanId=beanElt.attributeValue("id");
                //获取所有property标签
                List<Element> propertyElts = beanElt.elements("property");
                //遍历属性
                propertyElts.forEach(propertyElt->{
                    try {
                        //获取属性名
                        String propertyName=propertyElt.attributeValue("name");
                        //获取属性类型
                        Class<?> propertyType = beanMap.get(beanId).getClass().getDeclaredField(propertyName).getType();
                        //获取set方法名
                        String setMethodName="set"+propertyName.toUpperCase().charAt(0)+propertyName.substring(1);
                        //获取set方法
                        Method setMethod=beanMap.get(beanId).getClass().getDeclaredMethod(setMethodName,propertyType);
                        //获取属性值，value或者ref
                        //value
                        String value=propertyElt.attributeValue("value");
                        //ref
                        String propertyRef=propertyElt.attributeValue("ref");
                        Object actualValue=null;
                        if(value!=null){
                            //是value
                            String propertyTypeSimpleType= propertyType.getSimpleName();
                            switch (propertyTypeSimpleType){
                                case "byte":
                                    actualValue = Byte.parseByte(value);
                                    break;
                                case "short":
                                    actualValue = Short.parseShort(value);
                                    break;
                                case "int":
                                    actualValue = Integer.parseInt(value);
                                    break;
                                case "long":
                                    actualValue = Long.parseLong(value);
                                    break;
                                case "float":
                                    actualValue = Float.parseFloat(value);
                                    break;
                                case "double":
                                    actualValue = Double.parseDouble(value);
                                    break;
                                case "boolean":
                                    actualValue = Boolean.parseBoolean(value);
                                    break;
                                case "char":
                                    actualValue = value.charAt(0);
                                    break;
                                case "Byte":
                                    actualValue = Byte.valueOf(value);
                                    break;
                                case "Short":
                                    actualValue = Short.valueOf(value);
                                    break;
                                case "Integer":
                                    actualValue = Integer.valueOf(value);
                                    break;
                                case "Long":
                                    actualValue = Long.valueOf(value);
                                    break;
                                case "Float":
                                    actualValue = Float.valueOf(value);
                                    break;
                                case "Double":
                                    actualValue = Double.valueOf(value);
                                    break;
                                case "Boolean":
                                    actualValue = Boolean.valueOf(value);
                                    break;
                                case "Character":
                                    actualValue = Character.valueOf(value.charAt(0));
                                    break;
                                case "String":
                                    actualValue = value;
                                    break;
                            }
                            setMethod.invoke(beanMap.get(beanId),actualValue);
                        }
                        if (propertyRef!=null) {
                            setMethod.invoke(beanMap.get(beanId),beanMap.get(propertyRef));

                        }
                    } catch (NoSuchFieldException | NoSuchMethodException | InvocationTargetException |
                             IllegalAccessException e) {
                        throw new RuntimeException(e);
                    }
                });
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Override
    public Object getBean(String beanId) {
        return beanMap.get(beanId);
    }
}
