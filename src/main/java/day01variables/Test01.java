package day01variables;

import java.util.HashSet;


    public class Test01 {

        public static void main(String[] args) {

            HashSet<String> hs = new HashSet<>();

            hs.add("A");

            hs.add("B");

            hs.add("A");

            hs.add(null);

            hs.add(null);

            System.out.println(hs);

        }

    }