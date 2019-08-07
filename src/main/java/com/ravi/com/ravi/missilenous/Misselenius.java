package com.ravi.com.ravi.missilenous;

import java.util.Enumeration;
import java.util.Properties;

public class Misselenius {
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.put("key", "val");
        Enumeration<?> enumeration = properties.propertyNames();
        while (properties.propertyNames().hasMoreElements()) {
            Object next = enumeration.nextElement();
            System.out.println(next + "\t" + properties.get(next));
        }
    }
}
