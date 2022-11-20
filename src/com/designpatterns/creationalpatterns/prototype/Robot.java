package com.designpatterns.creationalpatterns.prototype;

import java.util.List;

public class Robot implements Cloneable {

    private int ID;
    private List<String> features;
    private Components components;

    public Robot(int ID, List<String> features, Components components) {
        this.ID = ID;
        this.features = features;
        this.components = components;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public List<String> getFeatures() {
        return features;
    }

    public void setFeatures(List<String> features) {
        this.features = features;
    }

    public Components getComponents() {
        return components;
    }

    public void setComponents(Components components) {
        this.components = components;
    }

    // shallow clone: only primitives and references of objects are copied
    @Override
    public Robot clone(){
        try {
            return (Robot) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

}

