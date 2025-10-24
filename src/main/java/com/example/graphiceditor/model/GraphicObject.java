package com.example.graphiceditor.model;

public abstract class GraphicObject {
    protected Long id;
    protected int x;
    protected int y;

    // спільне для будь-якого об'єкта на полотні
    public GraphicObject() {}

    public GraphicObject(Long id, int x, int y) {
        this.id = id;
        this.x = x;
        this.y = y;
    }

    public Long getId() {
        return id;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
