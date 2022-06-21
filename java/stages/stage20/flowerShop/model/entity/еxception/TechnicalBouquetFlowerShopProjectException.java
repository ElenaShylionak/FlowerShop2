package by.itstep.elena.java.stages.stage20.flowerShop.model.entity.еxception;

public class TechnicalBouquetFlowerShopProjectException extends BouquetFlowerShopProjectException{
    // для технических нужно все 4 конструктора, которые уже есть в класса
    //Exception от которого мы просто расширяемся extends Exception

    public TechnicalBouquetFlowerShopProjectException() {
        super();
    }

    public TechnicalBouquetFlowerShopProjectException(String message) {
        super(message);
    }

    public TechnicalBouquetFlowerShopProjectException(String message , Throwable cause) {
        super(message , cause);
    }

    public TechnicalBouquetFlowerShopProjectException(Throwable cause) { //Один из конструкторов будет принимать Причину - cause
        super(cause);
    }
}
