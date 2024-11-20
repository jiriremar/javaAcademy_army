package cz.remar.military;

import java.util.ArrayList;
import java.util.List;

public class AllSoldiers {
    private String soldierName;
    public List<Military> militaryList;

    public AllSoldiers(String soldierName) {
        this.soldierName = soldierName;
        this.militaryList = new ArrayList<>();
    }

    public void addMilitary(Military military) {
        militaryList.add(military);
    }

    public void attack(){
        System.out.println(" ");
        System.out.println("--- ATACKING --- ");
        for (Military military : militaryList) {
            military.printAttackInfo();
        }
    }

    public void infoMilitary(){
        System.out.println(" ");
        System.out.println(soldierName.toUpperCase());
        for (Military military : militaryList) {
            military.printInfo();
        }
    }



}
