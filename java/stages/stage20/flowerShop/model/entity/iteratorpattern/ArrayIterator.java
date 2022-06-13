package by.itstep.elena.java.stages.stage20.flowerShop.model.entity.iteratorpattern;

import by.itstep.elena.java.stages.stage20.flowerShop.model.entity.abstracts.Flowers;

public class ArrayIterator implements MyIterator {
    private Flowers[] flowers;
    private int current; //спросить на счет переменной, счетчик?

    public ArrayIterator(Flowers[] flowers){ //конструктор
        this.flowers = flowers;
        current = 0;
    }

    @Override
    public Flowers next() {
        return flowers[current++];
    }

    @Override
    public boolean hasNext() {
        return current < flowers.length;
    }

    @Override
    public void reset() {
        current = 0;
    }


}
