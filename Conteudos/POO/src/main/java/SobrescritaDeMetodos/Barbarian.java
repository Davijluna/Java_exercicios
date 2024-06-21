package SobrescritaDeMetodos;

public class Barbarian extends PlayableCharacter{

  @Override
  public void move() {
    System.out.println("O Barbaro pega impulso ...");
    super.move();
  }
}
