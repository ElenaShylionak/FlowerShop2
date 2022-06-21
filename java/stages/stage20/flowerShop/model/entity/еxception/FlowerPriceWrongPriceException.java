package by.itstep.elena.java.stages.stage20.flowerShop.model.entity.еxception;

public class FlowerPriceWrongPriceException extends LogicalBouquetFlowerShopProjectException {
    public  FlowerPriceWrongPriceException() { //делегируем 2 конструктора из класса BouquetFlowerShopProjectException
        super();
    }

    public  FlowerPriceWrongPriceException(String message) {
        super(message);
    }

}

