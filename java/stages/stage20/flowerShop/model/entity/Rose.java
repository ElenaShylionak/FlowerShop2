package by.itstep.elena.java.stages.stage20.flowerShop.model.entity;

import by.itstep.elena.java.stages.stage20.flowerShop.model.entity.abstracts.Flower;

import java.util.Objects;


public class Rose extends Flower {

    String color;
    enum color{ WHITE, RED, PINK, YELLOW, BLUE, BEIGE
    }

    String budShape; // форма бутона
    enum budShape{ CONICAL, CUPPED, ROUND, ROSETTESHAPED, POMPON
    }

    public Rose(String color) { //конструктор копирования
          color = color;
    }

    public Rose() { //дефолтный конструктор
         }

    public Rose(int weight, int price, String color, String budShape) { //конструктор с параметрами
        super(weight, price); //обращаемся к базовому классу
       //this для ссылки на текущий объект
        this.budShape = budShape;
        this.color = color;

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
        if (color.equals(rose.color))
            if (Objects.equals(budShape, rose.budShape)) return true;
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(),budShape, color);
    }

    @Override
    public String toString() {
        return "Rose{" +
                "Color='" + color + '\'' +
                ", budShape='" + budShape + '\'' +
                ", size='" +  '\'' +
                '}';
    }


}
