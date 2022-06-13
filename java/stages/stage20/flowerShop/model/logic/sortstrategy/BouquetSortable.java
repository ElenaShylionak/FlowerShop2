package by.itstep.elena.java.stages.stage20.flowerShop.model.logic.sortstrategy;

import by.itstep.elena.java.stages.stage20.flowerShop.model.entity.abstracts.Flowers;

public interface BouquetSortable {
    boolean compare(Flowers flower1, Flowers flower2); //уточнить на счет сравнения
}

//Компаратор - это тот, кто выполняет сравнивание, то есть делает compare.
//в этом интерфейсе есть всего 1 абстрактный метод без реализации. Что это нам даёт?

//Мы можем написать код компаратора теперь вот так:

//Comparator<Message> comparator = (o1, o2) -> o1.getId().compareTo(o2.getId());

//В скобочках — то, как мы назовём переменные. Java сама увидит, что т.к. метод то всего один,
// то понятно какие входные параметры нужны, сколько, каких типов. Далее мы говорим стрелочкой,
// что хотим их передать вот в этот участок кода.