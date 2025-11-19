public class lec10 {
    //Multilevel inheritance with method overriding example
// *****FIRST CODE EXAMPLE
// class Animal{
//     void eat(){
//         System.out.println("eating...");
//     }
// }
// class Dog extends Animal{
//     void eat(){
//         System.out.println("biryaaniiii...");
//     }
// }

// class Main{
//     public static void main(String args[]){
//         Animal s1=new Dog();
//         s1.eat();
//     }
// }

// *****FIRST CODE EXAMPLE WITH ERROR

// class Animal{
//     void eat(){
//         System.out.println("eating...");
//     }
// }
// class Dog extends Animal{
//     void eat(){
//         System.out.println("biryaaniiii...");
//     }
//     void sleep(){
//         System.out.println("sleeping..."); // This line will cause a compile-time error because Dog class is a child class and cannot access private members of the parent class.
//     }
// }

// class Main{
//     public static void main(String args[]){
//         Animal s1=new Dog();
//         s1.eat();
//         s1.sleep();
//     }
// }


// *****SECOND CODE EXAMPLE
// class Animal{
//     void eat(){
//         System.out.println("eating...");
//     }
//         void sleep(){
//         System.out.println("sleeping...");
//     }
// }
// class Dog extends Animal{
//     void eat(){
//         System.out.println("biryaaniiii...");
//     }
//         void sleep(){
//         System.out.println("sleeping...");
//         }
// }

// class Main{
//     public static void main(String args[]){
//         Animal s1=new Dog();
//         s1.eat();
//         s1.sleep();
//     }
// }


// *****SECOND CODE EXAMPLE WITHOUT OVERRIDING SLEEP METHOD
// class Animal{
//     void eat(){
//         System.out.println("eating...");
//     }
//         void sleep(){
//         System.out.println("sleeping...");
//     }
// }
// class Dog extends Animal{
//     void eat(){
//         System.out.println("biryaaniiii...");
//     }
// }
// class Main{
//     public static void main(String args[]){
//         Dog s1=new Dog();
//         s1.eat();
//         s1.sleep();
//     }
// }


//ABSTRACT CLASS EXAMPLE
// abstract class Animal{
//     abstract void eat();
// }
// class Cat extends Animal{
//     void eat(){
//         System.out.println("cat is eating DORA CAKEES...");
//     }
// }
// class Main{
//     public static void main(String args[]){
//         // Animal a=new Animal(); // This line will cause a compile-time error because we cannot instantiate an abstract class.
//         Cat c=new Cat();
//         c.eat();
//     }
// }
}
