package org.codeseoul.java.intro;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {

        IWritable[] writingTools = {
                new Pencil("graphite", 0.2f),
                new BallpointPen(0.5f),
                new FountainPen()
        };

        for (IWritable tool : writingTools) {
            tool.write();
        }

        System.out.println("Fountain pen thickness: " +
                FountainPen.THICKNESS);

        // Factory method
        // https://en.wikipedia.org/wiki/Factory_method_pattern
        Logger logger = Logger.getLogger("mylogger");
        logger.log(Level.WARNING, "This is a warning!");
    }
}
