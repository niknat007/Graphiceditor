package com.example.graphiceditor.model;

public class TextObject extends GraphicObject {

    private String text;
    private String fontFamily;
    private int fontSize;
    private String color; // "#000000"

    public TextObject() {}

    public TextObject(Long id, int x, int y,
                      String text,
                      String fontFamily,
                      int fontSize,
                      String color) {
        super(id, x, y);
        this.text = text;
        this.fontFamily = fontFamily;
        this.fontSize = fontSize;
        this.color = color;
    }

    public String getText() {
        return text;
    }

    public String getFontFamily() {
        return fontFamily;
    }

    public int getFontSize() {
        return fontSize;
    }

    public String getColor() {
        return color;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setFontFamily(String fontFamily) {
        this.fontFamily = fontFamily;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

