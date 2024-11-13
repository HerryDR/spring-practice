package com.jsf.spring6.bean;

import org.springframework.beans.factory.FactoryBean;

/**
 * @Description
 * @FileName PersonFactory
 * @Author JSF
 * @date 2024-05-09
 **/
public class PersonFactory implements FactoryBean<Person> {

    @Override
    public Person getObject() throws Exception {
        return new Person();
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }
}
