package com.java.collections;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Stream;

public class ArrayListEx {
    public static void main(String[] args) {

        List<Integer> integers=new ArrayList<>();
        integers.add(12);
        integers.add(23);
        integers.add(33);
        integers.add(44);
        integers.add(33);
        System.out.println(integers.stream().count());
        integers.stream().filter(n->n>23).forEach(System.out::println);

        Set<String> treeSet=new TreeSet<>();
        treeSet.add("Anny");
        treeSet.add("Funny");
        treeSet.add("anny");
        treeSet.add("Mittu");
        //treeSet.add(null);

        treeSet.stream().forEach(System.out::println);

        List<Integer> list=new CopyOnWriteArrayList();
        list.add(12);
        list.add(23);
        list.add(33);
        list.add(44);
        list.add(33);

        for (Integer i:list){
            System.out.println(i);
            list.add(345);

        }

        System.out.println(list);

        Map<Integer,String> stringMap=new ConcurrentHashMap<>();
        stringMap.put(1,"Naren");
        stringMap.put(2,"Funny");
        stringMap.put(3,"mittu");
        stringMap.put(4,"Sweety");
        stringMap.put(5,"Narender");
        stringMap.put(6,"Sweety");

        System.out.println(stringMap);
        for(Map.Entry<Integer,String> entrySet:stringMap.entrySet()){
            System.out.println(entrySet.getKey()+" "+entrySet.getValue());
            stringMap.put(7,"Neeraja");
        }

       /* Iterator<Integer> it=stringMap.keySet().iterator();
        while (it.hasNext()){
            Integer key=it.next();
            System.out.println(key+" "+stringMap.get(key));
        }*/

       stringMap.forEach((k,v)->System.out.println(k+"  "+v));

       /* List<Integer> list=new Vector<>();
        list.add(23);
        list.add(34);
        list.add(43);
        list.add(23);

        System.out.println(list);

        System.out.println("***********Set is not allow duplicate values & does''t follow the order **************");

        Set<String> strings=new HashSet<>();
        strings.add("Naren");
        strings.add("Funny");
        strings.add("Anny");
        strings.add("Sweety");
        strings.add("Mittu");

        strings.stream().forEach(System.out::println);
        System.out.println("Linked list does allow duplicate and it's main the sequence of order");
        Set<Integer> set=new LinkedHashSet<>();
        set.add(12);
        set.add(23);
        set.add(33);
        set.add(44);
        set.add(33);

        System.out.println(set);*/



    }
}
