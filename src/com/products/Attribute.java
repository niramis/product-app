package com.products;

public class Attribute implements AbstractAttribute {

    private String name;
    private String value;
    private String parentName;

    public Attribute(String name, String value, String parentName) {
        this.name = name;
        this.value = value;
        this.parentName = parentName;
    }

    @Override
    public void printAttribute(String parentName) {
//        if (this.parentName != null && !this.parentName.isEmpty()) {
            System.out.println("name: " + this.name + "\tvalue: " + this.value + "\tparent name: " + this.parentName);
//        } else {
//            System.out.println("name: " + this.name + "\tvalue: " + this.value);
//        }
    }

    @Override
    public String getName() {
        return this.name;
    }
}
