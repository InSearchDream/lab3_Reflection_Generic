package com.mycompany.reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 *
 * @author InSearchDream
 */
public class OutputInfo {
    public void getInfoClass(Class cl) {
	System.out.println("==Имя класса==\n" + cl.getName());
	//вывести поля
	getFields(cl);
        //вывести методы
	getMethods(cl);
        //вывести аннотации
        getAnnotations(cl);
	//вывести конструкторы
	getConstructors(cl);
	//вывести интерфейсы
        getInterfaces(cl);
        //вывести предков
        getParent(cl);        
    }   
    
    void getFields(Class cl){
        Field[] flds = cl.getDeclaredFields();
        System.out.println("==Список полей класса==");
        if (flds.length != 0)               
            for (Field fld : flds)
                System.out.println(fld.toString());
        else System.out.println("Поля не найдены");
    }
    
    void getMethods(Class cl){
        Method[] methods = cl.getDeclaredMethods();
        System.out.println("==Список методов класса==");
        if (methods.length != 0)                
            for (Method method : methods)
                System.out.println(method.toString());
        else System.out.println("Методы не найдены");
    }
    
    void getAnnotations(Class cl){
        Annotation[] ann = cl.getAnnotations();
        System.out.println("==Список аннотаций класса==");
        if (ann.length != 0) {
            for (Annotation annot : ann)
	        System.out.println(annot.toString());
        }
        else System.out.println("Аннотации не найдены");
    }
        
    void getConstructors(Class cl){
        Constructor[] constr = cl.getDeclaredConstructors();
        System.out.println("==Список конструкторов класса==");
        if (constr.length != 0)                
            for (Constructor cstr : constr)
                System.out.println(cstr.toString());
        else System.out.println("Конструкторы не найдены");
    }
     
    void getInterfaces(Class cl){
        Class[] iface = cl.getInterfaces();
        System.out.println("==Список интерфейсов класса==");
        if (iface.length != 0)                
            for (Class inter : iface)
                System.out.println(inter.toString());
        else System.out.println("Интерфейсы не найдены");
    }   
    
    void getParent(Class cl){
        Class clpar = cl.getSuperclass();
	System.out.println("==Предки класса==");
        if (clpar != null) {
            System.out.println(clpar.getName() +"\n");
        // повторить вывод информации для другого класса
            getInfoClass(clpar);
	}
        else System.out.println("Предки не найдены\n");
    }
        
}
