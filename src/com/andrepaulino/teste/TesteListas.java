package com.andrepaulino.teste;

import java.util.ArrayList;
import java.util.Collections;

public class TesteListas {
    public static void main(String[] args) {
        String curso1 = "Java 8: Tire proveito dos novos recursos da linguagem";
        String curso2 = "Apache Camel";
        String curso3 = "Certificação Java SE 8 Programmer I";

        ArrayList<String> cursos = new ArrayList<>();
        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);

        System.out.println("O primeiro curso da lista eh o: " + cursos.get(0));
        Collections.sort(cursos);

        System.out.println(cursos);
    }
}