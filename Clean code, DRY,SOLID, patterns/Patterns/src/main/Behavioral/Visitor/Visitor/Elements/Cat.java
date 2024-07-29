package org.example.Behavioral.Visitor.Visitor.Elements;


import org.example.Behavioral.Visitor.Visitor.Visitors.Visitor;

public class Cat implements Animal {

    @Override
    public void acceptVisitor(Visitor visitor) {
        visitor.visitCat(this);
    }
}
