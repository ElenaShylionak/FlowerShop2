package by.itstep.elena.java.stages.stage20.flowerShop.model.logic.sortstrategy;

import by.itstep.elena.java.stages.stage20.flowerShop.model.entity.abstracts.Flowers;

public class SortByPriceDesc implements BouquetSortable{

    @Override
    public boolean compare(Flowers flower1, Flowers flower2) {
        return flower1.getPrice() < flower2.getPrice();
    }
}
