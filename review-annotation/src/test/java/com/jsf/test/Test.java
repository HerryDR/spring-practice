package com.jsf.test;

import com.jsf.annotation.Component;

import java.io.File;
import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @Description
 * @FileName Test
 * @Author JSF
 * @date 2024-05-10
 **/
public class Test {
    public static void main(String[] args) {
        Map<String, Object> beanMap=new HashMap<>();
        String packageName="com.jsf.bean";
        String path=packageName.replaceAll("\\.","/");
        URL url = ClassLoader.getSystemClassLoader().getResource(path);
        File file = new File(url.getPath());
        File[] files = file.listFiles();
        Arrays.stream(files).forEach(f->{
            String className=packageName+"."+f.getName().split("\\.")[0];
            try {
                Class<?> clazz = Class.forName(className);
                if(clazz.isAnnotationPresent(Component.class)){
                    Component component = clazz.getAnnotation(Component.class);
                    String beanId=component.value();
                    Object bean=clazz.newInstance();
                    beanMap.put(beanId,bean);
                }
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            } catch (InstantiationException e) {
                throw new RuntimeException(e);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        });
        System.out.println(beanMap);
    }
}
