package model;

import model.Figure;
import javax.swing.*;

public class Field extends JButton {

    public Figure figure;
    public Integer x;
    public Integer y;
    void setFigure(Figure f){
        add(new JLabel(f.icon));
        figure = f;
    }
    public Field(int _x, int _y){
        x = _x;
        y = _y;
    }
}