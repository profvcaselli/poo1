package br.com.rodrigoprojeto;

import br.com.rodrigoprojeto.model.Contato;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        List<Contato> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        Contato contato = new Contato();
        System.out.println("Digite seu nome");
        contato.setName(sc.next());
        System.out.println("Digite seu email");
        contato.setEmail(sc.next());

        list.add(contato);

        System.out.println(list);

    }
}
