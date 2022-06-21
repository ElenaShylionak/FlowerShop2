package by.itstep.elena.java.stages.stage20.flowerShop.model.entity.abstracts;

//Это базовый класс имеет важную переменную price, 2 конструктора, гетеры и сетеры, так как поля приватные

import by.itstep.elena.java.stages.stage20.flowerShop.model.entity.еxception.FlowerPriceWrongPriceException;

import java.util.Objects;

public class Flower implements Comparable<Flower> {
    //Для упорядочивания объектов одного типа, хранящихся в массиве или коллекции есть интерфейс Comparable

    private double price; //стоимость цветка
    private double weigh; //вес цветка

    public Flower() { //дефолтный конструктор
    }

    public Flower(double weightFlower, double priceFlower){ //конструктор с параметрами

        price = priceFlower;
        weigh = weightFlower;
    }
    // Методы суперкласса
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) throws FlowerPriceWrongPriceException { //будем генерировать логический Exception
        //Если цена нормальная, то мы изменяем состояние, а если нет, то в нашем случае ничего не происходит - void
        //А это значит если клиент вводит значение неправильное, программа ничего не возвращает
        //Единственный способ что-то возвратить – это генерировать Ошибку. В нашем случае, логический Exception

        if (price > 0) {//защита от дурака, цена не может быть мельше нуля
            this.price = price;
        }else {
            throw new FlowerPriceWrongPriceException("Incorrect price data entered");
        }
    }

    public double getWeigh() {
        return weigh;
    }

    public void setWeigh(double weigh) {
        this.weigh = weigh;
    }

    @Override
    public String toString() {
        return "Flowers{" +
                "price=" + price +
                ", weigh=" + weigh +
                '}';
    }
    // Этот метод сравнивает содержимое объектов и выводит значение типа boolean.
    // Значение true - если содержимое эквивалентно, и false — если нет.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flower)) return false;
        Flower flowers = (Flower) o;
        return Double.compare(flowers.price, price) == 0 &&
                Double.compare(flowers.weigh, weigh) == 0;

    }

    //возвращает числовое значение фиксированной длины для любого объекта
    //Сравнить два числа между собой — гораздо быстрее, чем сравнить два объекта методом equals()
    //Если два объекта равны (т.е. метод equals() возвращает true), у них должен быть одинаковый хэш-код.
    @Override
    public int hashCode() {
        System.out.println("hashCode");
        return Objects.hash(price,weigh);
    }
    //Метод compareTo в Java сравнивает вызывающий объект с объектом, переданным в качестве параметра,
    // и возвращает в результате выполнения сравнения целое число:

    //   * положительное, если вызывающий объект больше объекта, переданного в качестве параметра;
    //   * отрицательное, если вызывающий объект меньше объекта, переданного в качестве параметра;
    //   * нуль, если объекты равны.

    @Override
    public int compareTo(Flower o) {
        return 0;
    }
}
