package com.jsf.spring6.bean;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @Description
 * @FileName People
 * @Author JSF
 * @date 2024-05-08
 **/
public class People {
    private List<String> names;
    private Set<String> phones;
    private Map<String,String> sons;
    private Properties properties;

    @Override
    public String toString() {
        return "People{" +
                "names=" + names +
                ", phones=" + phones +
                ", sons=" + sons +
                ", properties=" + properties +
                '}';
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public void setSons(Map<String, String> sons) {
        this.sons = sons;
    }

    public void setPhones(Set<String> phones) {
        this.phones = phones;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }

}
