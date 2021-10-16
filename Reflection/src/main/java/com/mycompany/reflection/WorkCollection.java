package com.mycompany.reflection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author InSearchDream
 */
public class WorkCollection {
    // реализация list, set, map
    public void WorkList(){
        System.out.println("==Список (list)==");
        List<String> elLlist = new ArrayList<>();
        elLlist.add("Hello world!");
        elLlist.add("Перевод:");
        elLlist.add("Привет мир!");     
        System.out.println("Вывод List целиком:\n" + elLlist);
        System.out.println("Вывод List по элементам:");
        for (int i = 0; i < elLlist.size(); i++)
            System.out.println(elLlist.get(i));
        
        System.out.println();
    }
    
    public void WorkSet(){
        System.out.println("==Набор уникальных значений (set)==");
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Hello world!");
        hashSet.add("Перевод:");
        hashSet.add("Перевод:"); 
        hashSet.add("Привет мир!");
        System.out.println("Набор Set: " + hashSet);
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Hello world!");
        treeSet.add("Перевод:");
        treeSet.add("Перевод:"); 
        treeSet.add("Привет мир!");
        System.out.println("Отсортированный набор Set: " + treeSet);
        System.out.println("Вывод первого элемента: " + treeSet.first());
        System.out.println("Вывод последнего элемента: " + treeSet.last());
        treeSet.remove("Перевод:");
        System.out.println("Набор после удаления элемента 'Перевод:': " + treeSet);
        
        System.out.println();        
    }       
    
    public void WorkMap(){
        System.out.println("==Карта 'ключ-значение' (map)==");
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("Hello world!", "Привет мир!");
        hashMap.put("List", "Список"); 
        hashMap.put("Set", "Набор"); 
        hashMap.put("Map", "Карта");
        System.out.println("Вывод всего содержимого Map" + hashMap);
        System.out.println("'Map' в переводе означает:"+ hashMap.get("Map"));
        System.out.println("Отображение содержит List? " + hashMap.containsKey("List"));
        System.out.println("Отображение содержит Java? " + hashMap.containsKey("Java"));
        
        System.out.println(); 
    }       
}
