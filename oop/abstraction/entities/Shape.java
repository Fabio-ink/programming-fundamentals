package oop.abstraction.entities;

public abstract class Shape {

    protected Color color;

    public Shape(Color color){
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract Double getArea(); //Sempre que houver um método abstrato na classe, a mesma também deve ser abstrata.

}
