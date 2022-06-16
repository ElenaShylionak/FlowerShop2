package by.itstep.elena.java.stages.stage20.flowerShop.model.entity.container;

import by.itstep.elena.java.stages.stage20.flowerShop.model.entity.abstracts.DecorationBouquet;
import by.itstep.elena.java.stages.stage20.flowerShop.model.entity.abstracts.Flower;

import java.util.ArrayList;
import java.util.List;

public class Bouquet {
    private List<Flower> flowers; //цветы
    public List<DecorationBouquet> decorationBouquets; //упаковка букета

    public Bouquet() {
        //и в каи в качестве имплементации заложим arraylist, который будет реализовывать наш список продуктовчестве
        // имплементации заложим arraylist, который будет реализовывать наш список цветов и упаковки
        flowers = new ArrayList<>();
        decorationBouquets = new ArrayList<>();
    }

    public Bouquet(List<Flower> flowerList , List<DecorationBouquet> decorationBouquetList) {
        flowers = flowerList; //цветам присвоим этот лист
        decorationBouquets = decorationBouquetList;
    }

    //реализукм метод add (добавить  в букет)
    public void add(Flower flower , DecorationBouquet decorationBouquet) {
        flowers.add(flower);
        decorationBouquets.add(decorationBouquet);
    }

    //реализуем метод remove (удалить из букета)
    public boolean remove(Flower flower) {
        return flowers.remove(flower);
    }

    //реализуем метод remove для упаковки (букет без оформления)
    public boolean remove(DecorationBouquet decorationBouquet) {
        return decorationBouquets.add(decorationBouquet);
    }

    public int size() {
        return flowers.size();
    }
    public int sizeDec() {
        return decorationBouquets.size();
    }

    public Flower getFlowers(int index) {
        return flowers.get(index);
    }

    public DecorationBouquet getDecorationBouquets(int index2) {
        return decorationBouquets.get(index2);
    }

    public void set(Flower flower , int index , DecorationBouquet decorationBouquet , int index2) {
        flowers.set(index , flower);
        decorationBouquets.set(index2 , decorationBouquet);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        if (size() == 0 || sizeDec() == 0) {
           builder.append("There are no flowers in the bouquet") ;
        }else {
            builder.append("Bouquet: \n");
        }
       return builder.toString();
    }


    }

