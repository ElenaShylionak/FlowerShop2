//package by.itstep.elena.java.stages.stage20.flowerShop.model.entity.iteratorpattern;
//
//import by.itstep.elena.java.stages.stage20.flowerShop.model.entity.abstracts.Flower;
//
//public class ArrayIterator implements MyIterator {
//    private Flower[] flowers;
//    private int current; //спросить на счет переменной, счетчик?
//
//    public ArrayIterator(Flower[] flower){ //конструктор
//        this.flowers = flower;
//        current = 0;
//    }
//
//    @Override
//    public Flower next() {
//        return flowers[current++];
//    }
//
//    @Override
//    public boolean hasNext() {
//        return current < flowers.length;
//    }
//
//    @Override
//    public void reset() {
//        current = 0;
//    }
//
//
//}
