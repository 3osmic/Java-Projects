package csc251.lab11.start;

import java.util.*;

public class MyLinkedListExtraTest{
  public static void main(String[] args) {
    String[] names = {"Tom", "Susan", "Kim", "George", "Peter", 
        "Jean", "George", "Jane", "Denise", "Jenny", "Susan", "Kathy", "Jane"};
    MyLinkedListExtra<String> list = new MyLinkedListExtra<>(names);   

    System.out.println(list);
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a name: ");
    String name = input.next();
    
    System.out.print("Enter an index: ");
    int index = input.nextInt();
    input.close();
    
    System.out.println("=== Before replacing the current name at index " + index + " with " + name);
    System.out.println(name + " is in the list? " + list.contains(name));
    System.out.println("name at index " + index + " is " + list.get(index));
    System.out.println("first index of " + name + " is " + list.indexOf(name));
    System.out.println("last index of " + name + " is " + list.lastIndexOf(name));
    list.set(index, name);
    System.out.println("=== After replacing the current name at index " + index + " with " + name);
    System.out.println(name + " is in the list? " + list.contains(name));
    System.out.println("name at index " + index + " is " + list.get(index));
    System.out.println("first index of " + name + " is " + list.indexOf(name));
    System.out.println("last index of " + name + " is " + list.lastIndexOf(name));
  }
}
