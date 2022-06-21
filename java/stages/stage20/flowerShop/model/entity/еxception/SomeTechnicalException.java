package by.itstep.elena.java.stages.stage20.flowerShop.model.entity.еxception;

public class SomeTechnicalException extends TechnicalBouquetFlowerShopProjectException{
    //

    public SomeTechnicalException() {
        super();
    }

    public SomeTechnicalException(String message) {
        super(message);
    }

    public SomeTechnicalException(String message , Throwable cause) {
        super(message , cause);
    }

    public SomeTechnicalException(Throwable cause) { //Один из конструкторов будет принимать Причину - cause
        super(cause);
    }
}
