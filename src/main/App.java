package main;

import main.model.Hero;

public class App {

    public static void fight(Hero h1, Hero h2){
        System.out.println("INICIANDO BATALHA ENTRE "+h1.getName()+" E "+h2.getName());

        if(h1.getPower() > h2.getPower()) {
            System.out.println("O Vencedor foi: "+h1.getName());
        }else {
            System.out.println("O Vencedor foi: "+h2.getName());
        }

    }

    public static void main(String[] args) {
        Hero batman = new Hero("Batman", 200, "Dinheiro", 100);
        Hero superman = new Hero("Superman", 600, "Criptoniano", 1000000);

        fight(batman,superman);

    }
}
