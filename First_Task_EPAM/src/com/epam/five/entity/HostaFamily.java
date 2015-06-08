package com.epam.five.entity;

/**
 * Created by aleks.levchenko on 01-Jun-15.
 */
public class HostaFamily extends AbstractFlower {
    private int leafLength;
    private int leafWidth;
    private int leafColor;

    public HostaFamily (int id, String name, int freshness, String color, int stemLength, int cost, int leafLength,
                        int leafWidth, int leafColor, String family) {
        super(id, name, freshness, color, stemLength, cost, family);
        this.leafColor = leafColor;
        this.leafLength = leafLength;
        this.leafWidth = leafWidth;
    }

    public int getLeafLength() {
        return leafLength;
    }

    public void setLeafLength(int leafLength) {
        this.leafLength = leafLength;
    }

    public int getLeafWidth() {
        return leafWidth;
    }

    public void setLeafWidth(int leafWidth) {
        this.leafWidth = leafWidth;
    }

    public int getLeafColor() {
        return leafColor;
    }

    public void setLeafColor(int leafColor) {
        this.leafColor = leafColor;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("\nHostaFamily\n");
        sb.append(super.toString());
        sb.append("\nleaf length").append(leafLength);
        sb.append("\nleaf width").append(leafWidth);
        sb.append("\nleaf color").append(leafColor);
        return sb.toString();
    }
}

