package by.itstep.elena.java.stages.stage20.flowerShop.util;
import by.itstep.elena.java.stages.stage20.flowerShop.model.entity.container.Bouquet;

public class RandomBouquetBuilder {

    public static Bouquet craeatBouquet() {

         final int DEFAULT_FLOWER_COUNT = 10; //делаем переменную по дефолту, это делает для того, что бы
        // метод Bouquet craeatBouquet() не принимал ни каких параметоров

        enum FlowerType { //обявляем именновые константы
           ROSE, CARNATION, LAVANDER
        }

        Bouquet bouquet = new Bouquet();
        for (int i = 0; i < DEFAULT_FLOWER_COUNT; i++) {

        }

        return bouquet;

    }
}
