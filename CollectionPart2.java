package br.com.modulos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CollectionPart2 {

    public static void main(String[] args){

        Boolean flag = true;
        List<Pessoa> listaFeminino = new ArrayList<>();
        List<Pessoa> listaMasculino = new ArrayList<>();

        Scanner linha = new Scanner(System.in);

        System.out.println("Por favor entre com seu nome - sexo (m/f) separando por , ");
        String grupo = linha.next();
        String[] pessoas = grupo.split(",");

        for( int i = 0; i < pessoas.length; i++){

            String[] novaPessoa =  pessoas[i].split("-");

            if(novaPessoa[1].equals("m")){
                Pessoa p1 = new Pessoa(novaPessoa[0], novaPessoa[1]);
                listaMasculino.add(p1);
            }

            if(novaPessoa[1].equals("f")){
                Pessoa p1 = new Pessoa(novaPessoa[0], novaPessoa[1]);
                listaFeminino.add(p1);
            }

        }

        if (!listaFeminino.isEmpty()){
            Collections.sort(listaFeminino);
            System.out.println("**********************************************************");
            System.out.println("Imprimir Lista de Feminina: ");
            System.out.println("**********************************************************");
            listaFeminino.forEach( f -> System.out.println(f.getNome()));
        }

        if (!listaMasculino.isEmpty()){
            Collections.sort(listaMasculino);
            System.out.println("**********************************************************");
            System.out.println("Imprimir Lista de Masculina: ");
            System.out.println("**********************************************************");
            listaMasculino.forEach( m -> System.out.println(m.getNome()));
        }


    }
}
