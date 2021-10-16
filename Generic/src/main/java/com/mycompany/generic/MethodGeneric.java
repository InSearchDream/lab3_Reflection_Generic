package com.mycompany.generic;
import java.util.*;
/**
 *
 * @author InSearchDream
 */
public class MethodGeneric{
    public static <T> T getValue(Object obj) {
            return (T) obj;
    }
    
    public static void main(String []args) {
        List list = Arrays.asList("HelloWorld!", "Привет, мир!");
            for (Object elList : list) {
		System.out.println(MethodGeneric.<String>getValue(elList));
            }
    }
}

