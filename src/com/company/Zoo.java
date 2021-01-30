package com.company;

import java.util.*;

public class Zoo {
    private ArrayList<WishingZoo> allWishingZoo = new ArrayList<>();
    private Map<Aviary, String> aviaries = new HashMap<>();
    private ArrayList<String> notInZoo = new ArrayList<>();

    public void setAllWishingZoo(WishingZoo being){
        allWishingZoo.add(being);
    }

    public void setAviaries(Aviary aviary, String name){
        aviaries.put(aviary, name);
    }

    public void setNotInZoo(String name){
        notInZoo.add(name);
    }

    public ArrayList<WishingZoo> getAllWishingZoo(){
        return allWishingZoo;
    }

    public void distribution(){
        int aviaryNumber = 0;

        for (WishingZoo wishing : allWishingZoo){
            String getInterface = Arrays.toString(wishing.getClass().getInterfaces());
            if (getInterface.contains("Exotic")){
                aviaryNumber++;
                if (getInterface.contains("Heatloving")){
                    HeatAviary heatAviary = new HeatAviary((Exotic) wishing, aviaryNumber);
                    setAviaries(heatAviary, wishing.getName());
                } else {
                    ColdAviary coldAviary = new ColdAviary((Exotic) wishing, aviaryNumber);
                    setAviaries(coldAviary, wishing.getName());
                }
            } else {
                setNotInZoo(wishing.getName());
            }
        }
    }

    public void display(){
        int heatCount = 0;
        int coldCount = 0;

        for (Map.Entry<Aviary, String> aviary : aviaries.entrySet()){
            if (aviary.getKey().getClass() == HeatAviary.class){
                heatCount++;
            } else if (aviary.getKey().getClass() == ColdAviary.class){
                coldCount++;
            }
        }

        System.out.println("\n\nСозданные вольеры:");
        System.out.println("Всего: " + aviaries.size());
        System.out.println("Теплых: " + heatCount);
        System.out.println("Холодных: " + coldCount);
        System.out.println("\nСущества, размещенные в зоопарке:");

        for (Map.Entry<Aviary, String> aviary : aviaries.entrySet()){
            System.out.println("Вольер №" + aviary.getKey().getNumber() + ": " + aviary.getValue());
        }

        System.out.println("\nСущества, не попавшие в зоопарк:");

        for (String kicked : notInZoo){
            System.out.println(kicked);
        }
    }
}
