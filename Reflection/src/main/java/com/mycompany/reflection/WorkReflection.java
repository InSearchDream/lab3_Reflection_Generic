package com.mycompany.reflection;

import java.util.ArrayList;

/**
 *
 * @author InSearchDream
 */
public class WorkReflection {
    public static void main(String[] args){
        
        // вывод информации о классе	
        // создание объекта класса ArrayList
        ArrayList list = new ArrayList<>();
        Class cls = list.getClass();
        // получаем информацию о классе
	OutputInfo infoClass = new OutputInfo();
	infoClass.getInfoClass(cls);
        
        // исполнение методов класса
        list.add("Hello world!");
        list.add(null);
        list.add("Привет мир!");
        System.out.println("ArrayList:\n" + list);
        list.remove(1);
        System.out.println("ArrayList после удаления:\n" + list);        
        System.out.println("Индекс первого вхождения строки 'Привет мир!' в списке: " + list.indexOf("Привет мир!") + "\n");
        
        // работа с коллекциями (list, set, map)
        WorkCollection worccol = new WorkCollection();
        worccol.WorkList();
        worccol.WorkSet();
        worccol.WorkMap();       
    }       
}
