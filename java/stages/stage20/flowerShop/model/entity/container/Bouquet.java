package by.itstep.elena.java.stages.stage20.flowerShop.model.entity.container;

import by.itstep.elena.java.stages.stage20.flowerShop.model.entity.abstracts.Flower;

public interface Bouquet { //аналог корзины в мегашоп

        int size();  //Метод size () - это метод коллекции List.
        Flower get(int index); //???
    }


 //Создать лучше интерфейс или абстрактный класс?
//  public abstract class Bouquet { //мой контейнер (аналог корзины)
//        abstract int size();
//        abstract Flowers get(int index);