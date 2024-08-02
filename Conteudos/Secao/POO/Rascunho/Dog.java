package Rascunho;

public class Dog implements Animal{
  @Override
  public void eat() {
    System.out.println("Dog is eating");
  }

  @Override
  public void sleep() {
    System.out.println("Dog is sleeping");
  }

  public static void main(String[] args) {
    Dog myDog = new Dog();
    myDog.eat();
    myDog.sleep();
  }

}
