package by.itstep.elena.java.stages.stage20.flowerShop.model.entity.еxception;

public class LogicalBouquetFlowerShopProjectException extends BouquetFlowerShopProjectException{

    public LogicalBouquetFlowerShopProjectException() { //делегируем 2 конструктора из класса BouquetFlowerShopProjectException
        super();
    }

    public LogicalBouquetFlowerShopProjectException(String message) {
        super(message);
    }
}
