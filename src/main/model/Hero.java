package main.model;

public class Hero {

    private String name;
    private Integer power;
    private String superPower;
    private Integer health;


    public Hero(){

    }

    public Hero(String name, Integer power, String superPower, Integer health) {
        this.name = name;
        this.power = power;
        this.superPower = superPower;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public String getSuperPower() {
        return superPower;
    }

    public void setSuperPower(String superPower) {
        this.superPower = superPower;
    }

    public Integer getHealth() {
        return health;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }
}
