package by.itstep.elena.java.stages.stage20.flowerShop.model.logic;

public class Flowers<publice> {
     private String name; //имя цветка
     private double weight; // вес цветка
    private double price; //стоимость цветка

   public Flowers(String nameFlower, double weightFlower, double priceFlower){
       name = nameFlower;
       weight = weightFlower;
       price = priceFlower;
    }
    // Метод суперкласса
    public void setName(String userName) { //метод ничего не возвращает
       name = userName;
   }
    public String getName(String userName) { //Тип воз-го объекта String. Будет возвращаться строка
        return name;

    }
    public void setWeight(double userWeight) {
        weight = userWeight;
    }
    public double getWeight(double userWeigh) {
        return weight;
    }

    public void setPrice(double userPrice) {
        price = userPrice;
    }
    public double getPrice(double userPrice) {
        return price;
    }

}
