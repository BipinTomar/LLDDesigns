package org.example.basicstrong.oop.DesignPatterns;

import java.util.*;

public class IteratorDesignPattern {
        public static void main(String[] args)
        {
            List<String> list = new ArrayList<String>();
            list.add("Tom");
            list.add("John");
            list.add("Rohan");
            list.add("Shiva");
            Iterator<String> itr = list.iterator();

            while(itr.hasNext()) {
                System.out.println("Name :"+itr.next());
            }
            System.out.println("Concrete Iterator we get is: "+itr.toString());

            Set<String> set = new HashSet<>();
            set.add("SetTom");
            set.add("SetJohn");
            set.add("SetRohan");

            Iterator<String> setItr = set.iterator();
            System.out.println("Concrete Iterator we get is: "+setItr.toString());
            while(setItr.hasNext()) {
                System.out.println("Name :" + setItr.next());
            }
        }
}
