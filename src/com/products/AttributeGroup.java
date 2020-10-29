package com.products;

import java.util.ArrayList;
import java.util.List;

public class AttributeGroup implements AbstractAttribute {
    private String name;
    private String parentName;
    private List<AbstractAttribute> attributes;

    public AttributeGroup(String name) {
        this.attributes = new ArrayList<>();
        this.name = name;
    }

    public AttributeGroup(String name, String parentName) {
        this.attributes = new ArrayList<>();
        this.name = name;
        this.parentName = parentName;
    }

    public void addAttribute(AbstractAttribute attribute) {
        this.attributes.add(attribute);
    }

    public void removeAttribute(AbstractAttribute attribute) {
        this.attributes.remove(attribute);
    }

    @Override
    public void printAttribute(String parentName) {
        if (parentName != null && !parentName.isEmpty()) {
            System.out.println("name: " + this.name + "\tparent name: " + this.parentName);
        } else {
            System.out.println("name: " + this.name);
        }
        this.attributes.forEach(x->x.printAttribute(parentName));
    }

    @Override
    public String getName() {
        return this.name;
    }
}
