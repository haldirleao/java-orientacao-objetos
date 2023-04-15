package aula4_2;

// https://examples.javacodegeeks.com/java-development/core-java/reflection/get-super-class-of-an-object/

import java.awt.List;
 
public class GetSuperClassFromObject {
 
    public static void main(String[] args) {
         
 
  // Create new object
        Object o = new String("JavaCodeGeeks");
 
 
  // Get super class and print it
        Class<?> clazz = o.getClass().getSuperclass();
        System.out.println("Superclass = " + clazz);
 
        o = new List();
        clazz = o.getClass().getSuperclass();
        System.out.println("Superclass = " + clazz);
    }
}
