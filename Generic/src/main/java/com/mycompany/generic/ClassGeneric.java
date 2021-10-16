package com.mycompany.generic;
import java.util.*;
/**
 *
 * @author InSearchDream
 */

public class ClassGeneric{
    public static void main(String[] args){
	List<String> list = new ArrayList<>();     
        list.add("Hello world!");
        list.add("Привет мир!");
	for (Object str : list) {
            System.out.println(str);
	}
        
        List elList = new ArrayList();
        elList.add(123);
        elList.add("один, два, три!");        
	for (Object str : elList) {
            System.out.println(str);
	}
    }
}


