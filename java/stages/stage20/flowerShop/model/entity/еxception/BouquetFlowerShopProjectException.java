package by.itstep.elena.java.stages.stage20.flowerShop.model.entity.еxception;



public class BouquetFlowerShopProjectException extends Exception{

    //для логических достаточно 2 конструктора (это дефолтный и который принмает сообщение, чтобы уточнить
    //в сообщении, что может пройти за исключительная ситуация

    // для технических нужно все 4 конструктора, которые уже есть в класса
    //Exception от которого мы просто расширяемся extends Exception

    public BouquetFlowerShopProjectException() {
        super();
    }

    public BouquetFlowerShopProjectException(String message) {
        super(message);
    }

    public BouquetFlowerShopProjectException(String message , Throwable cause) {
        super(message , cause);
    }

    public BouquetFlowerShopProjectException(Throwable cause) {
        super(cause);
    }
}
