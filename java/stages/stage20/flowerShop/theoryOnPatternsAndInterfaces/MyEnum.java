package by.itstep.elena.java.stages.stage20.flowerShop.theoryOnPatternsAndInterfaces;

public class MyEnum {
    //В жизни часто у нас есть выбор из ограниченного количества вариантов. Это можно сравнить с "меню", из которого мы можем выбирать.
    //Именно Enum позволяет создать такое "меню" - ограниченый набор значений, из которого пользователь может выбирать то, что ему нужно.

    //Как представить такое "меню" в коде:

    public enum myEnum {
        WINTER,
        SUMMER,
        SPRING,
        FALL;

    }
    //Enum - это отдельная структура. Он может находится в отдельном файле, а может быть частью класса.
    // Но при этом enum не обязательно должен лежать в каком-либо классе.

    //У enum есть модификатор доступа. Если Ваш enum не лежит внутри какого-нибудь класса, он должен быть объявлен public.
    // Если сделать его private, Вы получите ошибку.

    //Если же enum будет "внутри" класса, он может быть объявлен private.

    //Что еще нужно знать об enum:

    //    конструктор
    //    могут быть методы

    //Каждое перечисление имеет статический метод values(). Он возвращает массив всех констант перечисления:

    //public class Program{
    //
    //    public static void main(String[] args) {
    //
    //        Type[] types = Type.values();
    //        for (Type s : types) { System.out.println(s); }
    //    }
    //}
    //enum Type
    //{
    //    SCIENCE,
    //    BELLETRE,
    //    PHANTASY,
    //    SCIENCE_FICTION
    //}

}
