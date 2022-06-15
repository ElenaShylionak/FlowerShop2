package by.itstep.elena.java.stages.stage20.flowerShop.model.logic.sortstrategy;

import by.itstep.elena.java.stages.stage20.flowerShop.model.entity.abstracts.Flower;

public class SortByPriceDesc implements BouquetSortable{

    @Override
    public boolean compare(Flower flower1, Flower flower2) {
        return flower1.getPrice() < flower2.getPrice();
    }
}
