package com.example.graphiceditor.model;

public class ShapeObject extends GraphicObject {

    public enum ShapeType {
        RECTANGLE,
        ELLIPSE,
        LINE,
        FREE_DRAW
    }

    private ShapeType type;
    private String strokeColor;  // наприклад "#FF0000"
    private String fillColor;    // наприклад "#00FF00"
    private int strokeWidth;

    public ShapeObject() {}

    public ShapeObject(Long id, int x, int y,
                       ShapeType type,
                       String strokeColor,
                       String fillColor,
                       int strokeWidth) {
        super(id, x, y);
        this.type = type;
        this.strokeColor = strokeColor;
        this.fillColor = fillColor;
        this.strokeWidth = strokeWidth;
    }

    public ShapeType getType() {
        return type;
    }

    public void setType(ShapeType type) {
        this.type = type;
    }

    public String getStrokeColor() {
        return strokeColor;
    }

    public void setStrokeColor(String strokeColor) {
        this.strokeColor = strokeColor;
    }

    public String getFillColor() {
        return fillColor;
    }

    public void setFillColor(String fillColor) {
        this.fillColor = fillColor;
    }

    public int getStrokeWidth() {
        return strokeWidth;
    }

    public void setStrokeWidth(int strokeWidth) {
        this.strokeWidth = strokeWidth;
    }
}
