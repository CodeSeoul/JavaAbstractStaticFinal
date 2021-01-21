package org.codeseoul.java.intro;

public abstract class AbstractWritingTool implements IWritable {
    protected String material;
    protected float thicknessInMm;

    public String getMaterial() {
        return material;
    }

    public float getThicknessInMm() {
        return thicknessInMm;
    }

    public AbstractWritingTool(String material, float thicknessInMm) {
        this.material = material;
        this.thicknessInMm = thicknessInMm;
    }

    public void write() {
        System.out.println("I'm writing " + this.material +
                " at " + this.thicknessInMm + "mm thick.");
    }
}
