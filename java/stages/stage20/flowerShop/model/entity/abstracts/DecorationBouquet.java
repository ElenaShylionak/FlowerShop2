package by.itstep.elena.java.stages.stage20.flowerShop.model.entity.abstracts;

import java.util.Objects;

public class DecorationBouquet  {


    private double priceDecoration; //стоимость упаковки
    private double weighDecoration; //вес упаковки

    public DecorationBouquet() {
    }
    public DecorationBouquet(double priceDecoration, double weighDecoration) {
        this.priceDecoration = priceDecoration;
        this.weighDecoration = weighDecoration;
    }
    // Методы суперкласса

    public double getPriceDecoration() {
        return priceDecoration;
    }

    public void setPriceDecoration(double priceDecoration) {
        this.priceDecoration = priceDecoration;
    }

    public double getWeighDecoration() {
        return weighDecoration;
    }

    public void setWeighDecoration(double weighDecoration) {
        this.weighDecoration = weighDecoration;
    }

    @Override
    public String toString() {
        return "DecorationBouquet{" +
                "priceDecoration=" + priceDecoration +
                ", weighDecoration=" + weighDecoration +
                '}';
    }

    // Этот метод сравнивает содержимое объектов и выводит значение типа boolean.
    // Значение true - если содержимое эквивалентно, и false — если нет.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DecorationBouquet)) return false;
        DecorationBouquet pack = (DecorationBouquet) o;
        return Double.compare(pack.priceDecoration, priceDecoration) == 0 && Double.compare(pack.weighDecoration, weighDecoration) == 0;



    }

    @Override
    public int hashCode() {
        return Objects.hash(priceDecoration, weighDecoration);
    }

    //С английского "Comparable" переводится как "сравнимый".
    // Имплементируя этот интерфейс мы как бы говорим "Теперь объекты этого класса можно сравнивать между собой!"
   // @Override
  //  public int compareTo(DecorationBouquet o) {
    // return 0;
}

