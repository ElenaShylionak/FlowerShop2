package by.itstep.elena.java.stages.stage20.flowerShop.model.entity.comparators;

import by.itstep.elena.java.stages.stage20.flowerShop.model.entity.abstracts.Flowers;

import java.util.Comparator;

//С английского языка это переводится как «сравнимый».
// Чтобы наши объекты Flowers можно было сравнивать друг с другом и как-то сортировать,
// класс должен имплементировать этот интерфейс и реализовать его единственный метод — compareTo()
//Это типизированный интерфейс, то есть, требует указания конкретного класса, с которым он связан -Comparator<Flowers>

     public class SortByPriceDesc implements Comparator<Flowers> { //Сортировать по цене по убыванию

        @Override
        public int compare(Flowers o1, Flowers o2) {
            return Double.compare(o2.getPrice(), o1.getPrice());
        }
    }
