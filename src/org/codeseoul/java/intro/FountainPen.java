package org.codeseoul.java.intro;

public class FountainPen implements IWritable {

    public static final String THICKNESS = "variable";

    @Override
    public void write() {
        System.out.println("I'm writing ink at variable thickness");
    }
}
