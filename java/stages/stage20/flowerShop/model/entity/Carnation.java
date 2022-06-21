package by.itstep.elena.java.stages.stage20.flowerShop.model.entity;

import by.itstep.elena.java.stages.stage20.flowerShop.model.entity.abstracts.Flower;

import java.util.Objects;

public class Carnation extends Flower { //производный класс Flowers


    private String nameView; //название вида гвоздики

    private String color;  //цвет
    enum color{ WHITE, RED, PINK, YELLOW, BLUE, BEIGE, ORANGE
    }

    public Carnation() { //дефолтный конструктор
    }

    public Carnation(int weight, int price, String nameView, String color) { //конструктор с параметрами - которые наследует и своими индивидуальными
        super(weight, price); //обращаемся к суперклассу
        this.color =color; //this для ссылки на текущий объект
        this.nameView = nameView;
    }
    public String getNameView() {
        return nameView;
    }

    public void setNameView(String nameView) {
        this.nameView = nameView;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Carnation{" +
                "nameView='" + nameView + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Carnation)) return false;
        if (!super.equals(o)) return false;
        Carnation carnation = (Carnation) o;
        return Objects.equals(nameView, carnation.nameView) && Objects.equals(color, carnation.color); //cпросить

    }

   //@Override
 //   public int hashCode() { задать вопрос на счет почему getNameView(), getColor());
     //   return Objects.hash(super.hashCode(), getNameView(), getColor());

         @Override
          public int hashCode() {
          return Objects.hash(super.hashCode(), color, nameView);
           }
    }


