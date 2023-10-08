package listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Pedro");
        list.add("Jose");
        list.add(1, "Maria");
        list.add("Marcelo");
        list.add("Rob");
        list.add("Paula");
        list.add("Pietro");
        list.add("Ana");

        list.remove("Jose");
        list.removeIf(x -> x.charAt(0) == 'M');//removendo os nomes que começam com M
        System.out.println(list.size());
        for(String i : list) {
            System.out.println(i);
        }
        
        //encontrar posição do bob
        System.out.println("Posição do Rob: " + list.indexOf("Rob"));
        System.out.println("_-------------------------_");
        // filtrar algo
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'P').collect(Collectors.toList());
        for(String i : result) {
            System.out.println(i);
        }
        //encontrar o primeiro elemento que comece com algo
        System.out.println("---------------------");

        String name = list.stream().filter(x -> x.charAt(0) == 'P').findFirst().orElse(null);
        System.out.println(name);
 
    }
}
