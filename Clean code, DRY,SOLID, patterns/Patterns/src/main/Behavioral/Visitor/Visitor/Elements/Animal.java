package org.example.Behavioral.Visitor.Visitor.Elements;

import org.example.Behavioral.Visitor.Visitor.Visitors.Visitor;

public interface Animal {

    void acceptVisitor(Visitor visitor);
}
