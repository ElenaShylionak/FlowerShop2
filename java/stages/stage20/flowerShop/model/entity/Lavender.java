package by.itstep.elena.java.stages.stage20.flowerShop.model.entity;

import by.itstep.elena.java.stages.stage20.flowerShop.model.entity.abstracts.Flower;

import java.util.Objects;

public class Lavender extends Flower { //производный класс Flowers

    private String variety; //сорт лаванды
    enum variety {JAGGED, NARROWLEAVED, BROADLEAVED, HYBRID

    }
    private String view; //вид лаванды

    public Lavender() { //дефолтный конструктор
    }

    public Lavender(int weight, int price, String variety, String view) { //конструктор с параметрами
        super(weight, price); //обращаемся к базовому классу
        this.variety = variety; //this для ссылки на текущий объект
        this.view = view;

    }
    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    public String getView() {
        return view;
    }

    public void setView(String view) {
        this.view = view;
    }

    // Этот метод сравнивает содержимое объектов и выводит значение типа boolean.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Lavender)) return false;
        if (!super.equals(o)) return false;
        Lavender lavender = (Lavender) o;
        return Objects.equals(variety, lavender.variety) && Objects.equals(view, lavender.view);
    }

    //возвращает числовое значение фиксированной длины для любого объекта.
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), variety, view);
    }
    @Override
    public String toString() {
        return "Lavender{" +
                "variety='" + variety + '\'' +
                ", view='" + view + '\'' +
                '}';
    }

}