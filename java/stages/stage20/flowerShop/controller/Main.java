package by.itstep.elena.java.stages.stage20.flowerShop.controller;

import by.itstep.elena.java.stages.stage20.flowerShop.model.entity.Carnation;
import by.itstep.elena.java.stages.stage20.flowerShop.model.entity.Lavender;
import by.itstep.elena.java.stages.stage20.flowerShop.model.entity.Rose;
//import by.itstep.elena.java.stages.stage20.flowerShop.model.entity.container.Bouquet;

public class Main extends Object{



    public static void main(String[] args) {

        Lavender lavender = new Lavender((int) 0.20 , 5, "Rosea", "narowLeaf");
        Lavender lavender1 = new Lavender((int) 0.20 , 5, "Rosea", "narowLeaf");


//        Bouquet bouquet = new Bouquet();
//     bouquet.add(lavender);
//   bouquet.add(lavender1);

        System.out.println(lavender);


    }

}
