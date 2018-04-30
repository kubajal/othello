package model;

import javax.swing.*;

public class Figure {

    private String color;
    public ImageIcon icon;
    public Integer x;
    public Integer y;

    public void setColor(String _color){
        color = _color;
    }
    public ImageIcon getIcon() { return icon; }
    public Figure(String _c, Integer _x, Integer _y){
        if(_c == "WHITE")
            icon = new ImageIcon("/model/white.png");
        else
            icon = new ImageIcon("/model/black.png");
        color = _c;
        x = _x;
        y = _y;
    }
}
