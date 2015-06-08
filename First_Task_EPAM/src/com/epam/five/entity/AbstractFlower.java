package com.epam.five.entity;

/**
 * Created by aleks.levchenko on 25-May-15.
 */
public abstract class AbstractFlower {

    private int id;
    private String name;
    private int freshness;
    private String color;
    private int stemLength;
    private int cost;
    private String family;

    protected AbstractFlower(int id, String name, int freshness, String color, int stemLength, int cost, String family){
        this.id = id;
        this.name = name;
        this.freshness = freshness;
        this.color = color;
        this.stemLength = stemLength;
        this.cost = cost;
        this.family = family;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFreshness() {
        return freshness;
    }

    public void setFreshness(int freshness) {
        this.freshness = freshness;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getStemLength() {
        return stemLength;
    }

    public void setStemLength(int stemLength) {
        this.stemLength = stemLength;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("id: ").append(id).append("\nname: ").append(name).append("\nfreshness").append(freshness);
        sb.append("\ncolor: ").append(color).append("\nstemLength").append(stemLength).append("\ncost").append(cost);
        sb.append("\nfamily").append(family);
        return sb.toString();
    }

    }

