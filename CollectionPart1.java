package br.com.modulos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CollectionPart1 {

    public static void main(String[] args) {

        Scanner linha = new Scanner(System.in);

        System.out.println("Por favor com alguns nomes separados por , ");
        String nomePessoas = linha.next();
        String[] nomes = nomePessoas.split(",");

        List<String> listaNomes = new ArrayList<>();

        for ( String nome : nomes){
            listaNomes.add(nome);
        }

        Collections.sort(listaNomes);
        System.out.println(listaNomes);
        System.out.println("");

    }

}
