package me.tony.tonyirl.account.serviceprovider.test;

import java.util.Map;

public class Foo {

    private String name;
    private Map<String, String> map;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    @Override
    public String toString() {
        return "Foo{" +
                "name='" + name + '\'' +
                ", map=" + map +
                '}';
    }
}
