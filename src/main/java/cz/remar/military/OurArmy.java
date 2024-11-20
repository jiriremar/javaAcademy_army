package cz.remar.military;

import java.util.ArrayList;
import java.util.List;

public class OurArmy {
    private String armyName;
    public List<AllSoldiers> allSoldiersList;

    public OurArmy(String armyName) {
        this.armyName = armyName;
        this.allSoldiersList = new ArrayList<>();
    }

    public OurArmy(){

    }

    public void addAllSoldiers(AllSoldiers allSoldiers) {
        this.allSoldiersList.add(allSoldiers);
    }

    public void infoArmy(){
        System.out.println(" ");
        System.out.println("---- REPORT " + armyName.toUpperCase() + " ----");
        for (AllSoldiers allSoldier : allSoldiersList) {
            allSoldier.infoMilitary();
        }
    }

    public void search(String typeSoldier){
        System.out.println("---SEARCH---");
        for (AllSoldiers allSoldier : allSoldiersList) {
            String info = allSoldier.toString();
            System.out.println(info);

        }
    }
}
