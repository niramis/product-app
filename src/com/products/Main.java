package com.products;

public class Main {

    public static void main(String[] args) {
        AttributeGroup productAttributes = new AttributeGroup("Product Attributes");

        AttributeGroup attributes1 = new AttributeGroup("Attributes 1");
        Attribute attribute1 = new Attribute("name1", "value1", attributes1.getName());
        Attribute attribute2 = new Attribute("name2", "value2", attributes1.getName());
        Attribute attribute3 = new Attribute("name3", "value3", productAttributes.getName());


        attributes1.addAttribute(attribute1);
        attributes1.addAttribute(attribute2);

        AttributeGroup attributes2 = new AttributeGroup("Attributes 2", productAttributes.getName());

        AttributeGroup attributes3 = new AttributeGroup("Attributes 3", attributes2.getName());

        Attribute attribute4 = new Attribute("name4", "value4", attributes3.getName());
        Attribute attribute5 = new Attribute("name5", "value5", attributes2.getName());

        attributes3.addAttribute(attribute4);

        attributes2.addAttribute(attributes3);
        attributes2.addAttribute(attribute5);


        productAttributes.addAttribute(attributes1);
        productAttributes.addAttribute(attribute3);
        productAttributes.addAttribute(attributes2);

        productAttributes.printAttribute("");
    }
}
