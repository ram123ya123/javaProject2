package project1;
//Class with private variables and public getters and setters
 public class Student {
 // Private variables
 private String name;
 private int age;

 // Setter method for name
 public void setName(String name) {
     this.name = name;
 }

 // Getter method for name
 public String getName() {
     return name;
 }

 // Setter method for age
 public void setAge(int age) {
     this.age = age;
 }

 // Getter method for age
 public int getAge() {
     return age;
 }
}

//Main class to use the Student class
public class Main {
 public static void main(String[] args) {
     // Create a Student object
     Student s1 = new Student();

     // Set values using setters
     s1.setName("Ramya");
     s1.setAge(22);

     // Get values using getters
     System.out.println("Name: " + s1.getName());
     System.out.println("Age: " + s1.getAge());
 }
}

