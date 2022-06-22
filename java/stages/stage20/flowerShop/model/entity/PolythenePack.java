//package by.itstep.elena.java.stages.stage20.flowerShop.model.entity;
//
//import by.itstep.elena.java.stages.stage20.flowerShop.model.entity.abstracts.DecorationBouquet;
//
//import java.util.Objects;
//
//public class PolythenePack extends DecorationBouquet {
//     private String color;
//        enum color{TRANSPARENT, WHITE, YELLOW, SILVER, ROSE, GOLD
//
//    }
//    private String compound; //cостав
//    enum compound{ CELOPHAN, MESH, FOIL, ORGANZA
//
//    }
//     private String shape; // форма
//    enum shape{ROLL, CONE, TUBUS,
//
//    }
//
//    public PolythenePack() {
//
//    }
//
//    public PolythenePack(double priceDecoration , double weighDecoration , String color, String compound,String shape) {
//        super(priceDecoration , weighDecoration);
//        this.color = color;
//        this.compound = compound;
//        this.shape = shape;
//    }
//
//    public String getColor() {
//        return color;
//    }
//
//    public void setColor(String color) {
//        this.color = color;
//    }
//
//    public String getCompound() {
//        return compound;
//    }
//
//    public void setCompound(String compound) {
//        this.compound = compound;
//    }
//
//    public String getShape() {
//        return shape;
//    }
//
//    public void setShape(String shape) {
//        this.shape = shape;
//    }
//
//    @Override
//    public String toString() {
//        return "PolythenePack{" +
//                "color='" + color + '\'' +
//                ", compound='" + compound + '\'' +
//                ", shape='" + shape + '\'' +
//                '}';
//    }
//
//    @Override
//    public boolean equals(Object o) { //????
//        if (this == o) return true;
//        if (!(o instanceof PolythenePack)) return false;
//        if (!super.equals(o)) return false;
//        PolythenePack that = (PolythenePack) o;
//        return getColor().equals(that.getColor()) && getCompound().equals(that.getCompound()) && getShape().equals(that.getShape());
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(color, compound , shape);
//    }
//}
