package by.itstep.elena.java.stages.stage20.flowerShop.util;

import by.itstep.elena.java.stages.stage20.flowerShop.model.entity.Lavender;
import by.itstep.elena.java.stages.stage20.flowerShop.model.entity.Rose;
import by.itstep.elena.java.stages.stage20.flowerShop.model.entity.container.Bouquet;

import java.util.LinkedList;

public class HardcodeBouquettBuilder {

    public static Bouquet createBasket() {

        Rose rose = new Rose(2 , 5 , "RED" , "ball");
        Lavender lavender = new Lavender(1, 15, "JAGGED", "field");


        Bouquet bouquet = new Bouquet(new LinkedList<>());

        return bouquet;

    }
}
//        Orange orange3 = new Orange(220, 3500, 6.5);
//        Orange orange4 = new Orange(200, 3000, 4.5);
//        Milk milk1 = new Milk(1000, 3.5, 2.5);
//        Milk milk2 = new Milk(500, 3.2, 2.2);
//        Milk milk3 = new Milk(5000, 2.5, 10.0);
//        Milk milk4 = new Milk(1500, 1.0, 3.5);
//        Bread bread = new Bread("White", "Best", 3.5);
//
//        Basket basket = new Basket(new LinkedList<>());
//        basket.add(orange3);
//        basket.add(orange4);
//        basket.add(bread);
//        basket.add(milk1);
//        basket.add(milk2);
//        basket.add(milk3);
//        basket.add(milk4);
//
//        return basket;
//    }