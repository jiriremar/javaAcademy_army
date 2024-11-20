package cz.remar;

import cz.remar.military.*;

public class Main {
    public static void main(String[] args) {
        Sniper sniper1 = new Sniper("Montgomery Burns", 9, "sniper");
        Sniper sniper2 = new Sniper("Baney Gambel", 10, "sniper");
        Sniper sniper3 = new Sniper("Kent Brockman", 6, "sniper");
        Granademan granade1 = new Granademan("John Smith", 8, "granademan");
        Flamethower flamethower1 = new Flamethower("Homer Simpsons", 7, "flamethower");
        Flamethower flamethower2 = new Flamethower("Moe Sizlack", 15, "flamethower");
        Flamethower flamethower3 = new Flamethower("Ned Flanders", 21, "flamethower");
        Flamethower flamethower4 = new Flamethower("Apu Nahasapimapetilon", 14, "flamethower");

        AllSoldiers attackBattalion = new AllSoldiers("---- ATTACK ----");
        attackBattalion.addMilitary(sniper1);
        attackBattalion.addMilitary(flamethower2);
        attackBattalion.addMilitary(sniper3);

        AllSoldiers defendBattalion = new AllSoldiers("---- DEFEND -----");
        defendBattalion.addMilitary(granade1);
        defendBattalion.addMilitary(flamethower3);
        defendBattalion.addMilitary(flamethower4);

        AllSoldiers adaptiveBattalion = new AllSoldiers("---- ADAPTIVE -----");
        adaptiveBattalion.addMilitary(flamethower1);
        adaptiveBattalion.addMilitary(sniper2);

        OurArmy springfieldArmy = new OurArmy("Springfield Army");
        springfieldArmy.addAllSoldiers(attackBattalion);
        springfieldArmy.addAllSoldiers(defendBattalion);
        springfieldArmy.addAllSoldiers(adaptiveBattalion);

        springfieldArmy.infoArmy();


    }
}