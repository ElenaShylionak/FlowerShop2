package by.itstep.elena.java.stages.stage20.flowerShop.model.entity.container;

import by.itstep.elena.java.stages.stage20.flowerShop.model.entity.abstracts.DecorationBouquet;
import by.itstep.elena.java.stages.stage20.flowerShop.model.entity.abstracts.Flower;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Bouquet { // !!!!!переписать контейнер  - сделать прослойку где цветаы и оформление букета!!!!
    private List<Flower> flowers; //цветы
    private List<DecorationBouquet> decorationBouquets; //упаковка букета

    public Bouquet() {
        //в качестве имплементации заложим arraylist, который будет реализовывать наш список цветов и упаковки

        flowers = new ArrayList<>();
        decorationBouquets = new ArrayList<>();
    }

    public Bouquet(List<Flower> flowerList , List<DecorationBouquet> decorationBouquetList) {
        flowers = flowerList; //цветам присвоим этот лист
        decorationBouquets = decorationBouquetList;
    }

    public <E> Bouquet(LinkedList<E> es) { //!!!!!

    }

    //реализукм метод add (добавить  в букет)
    public void add(Flower flower) {
        flowers.add(flower);
        DecorationBouquet decorationBouquet;
        //decorationBouquets.add(decorationBouquet);
    }

    //реализуем метод remove (удалить из букета)
    public boolean remove(Flower flower) {
        return flowers.remove(flower);
    }

    //реализуем метод remove для упаковки (букет без оформления)
    public boolean remove(DecorationBouquet decorationBouquet) {
        return decorationBouquets.add(decorationBouquet);
    }
    //размер
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

        if (size() == 0 || sizeDec() == 0) { //защита от дурака
           builder.append("There are no flowers in the bouquet") ;
        }else {
            builder.append("Bouquet: \n");
        }
       return builder.toString();
    }


    }

