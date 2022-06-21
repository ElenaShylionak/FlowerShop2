package by.itstep.elena.java.stages.stage20.flowerShop.model.entity;

import by.itstep.elena.java.stages.stage20.flowerShop.model.entity.abstracts.Flower;

import java.util.Objects;


public class Rose extends Flower {

    String Color;

    enum Color{ WHITE, RED, PINK, YELLOW, BLUE, BEIGE
    }
    String budShape;
    String size;

    public Rose(String color) { //конструктор копирования
          Color = color;
    }

    public Rose() { //дефолтный конструктор
         }

    public Rose(String budShape, int weight, int price, String size, String Color) { //конструктор с параметрами
        super(weight, price); //обращаемся к базовому классу
        this.size = size; //this для ссылки на текущий объект
        this.budShape = budShape;
        this.Color = Color;

    }
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getBudShape() {
        return budShape;
    }

    public void setBudShape(String budShape) {
        this.budShape =  budShape;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rose)) return false;
        if (!super.equals(o)) return false;
        Rose rose = (Rose) o;
        if (Color.equals(rose.Color))
            if (Objects.equals(budShape, rose.budShape)) if (Objects.equals(size, rose.size)) return true;
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(),budShape, size, Color);
    }

    @Override
    public String toString() {
        return "Rose{" +
                "Color='" + Color + '\'' +
                ", budShape='" + budShape + '\'' +
                ", size='" + size + '\'' +
                '}';
    }


}
