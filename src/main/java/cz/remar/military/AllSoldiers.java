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
        System.out.println("--- ATACKING ---\nyour attack battalion");
        for (Military military : militaryList) {
            military.printAttackInfo();
        }
    }

    public void defend(){
        System.out.println(" ");
        System.out.println("--- DEFEND ---\nyour defend battalion");
        for (Military military : militaryList) {
            military.printDefenceInfo();
        }
    }

    public void attackAndDefence(){
        System.out.println(" ");
        System.out.println("--- ATACKING and DEFENDING ---\nyour Super battalion");
        for (Military military : militaryList) {
            military.printAdaptiveInfo();
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
