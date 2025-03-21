package Basics;

public class MyClass {
     //Fields
     private String name;
     private int age;
 
 //constructor 
 public MyClass(String name, int age) {
     this.name = name;
     this.age = age;
 }
 
 // Getter for name 
 public String getName() {
     return name;
  }
 
 // Setter for name
 public void setName(String name) {
     this.name = name;
 }
 
 // Getter for age
 public int getAge() {
     return age;
  }
 
 
 // Setter for age
 public void setAge(int age) {
     this.age = age;
 }
 
 // Method
 public void print() {
     System.out.println("Name: " + name + " Age: " + age);
 }
    
}
