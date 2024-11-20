package cz.remar.military;

public class Military {
    protected String name;
    private int damage;
    private String type;

    public Military(String name, int damage, String type) {
        this.name = name;
        this.damage = damage;
        this.type = type;
    }

    public Military() {

    }

    public void printInfo() {
        System.out.println("My name is " + name + " and Iam " + type.toUpperCase());
    }

    public void printAttackInfo() {
        System.out.println("    " + name + "(" + type + ") attacking " + damage + " power.");
    }

    public void printDefenceInfo() {
        System.out.println("    " + name + "(" + type + ") defending " + damage + " power.");
    }

    public void printAdaptiveInfo() {
        System.out.println("    " + name + "(" + type + ") attacking and defending " + damage + " power.");
    }

    public String getTypeMilitary() {
        return type;
    }

}
