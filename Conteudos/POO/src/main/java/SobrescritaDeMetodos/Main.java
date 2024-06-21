package SobrescritaDeMetodos;

public class Main {

  public static void main(String[] args) {
    Warrior warrior = new Warrior();
    warrior.move();
    warrior.attack();

    Mage mage = new Mage();
    mage.move();
    mage.attack();

    Cleric cleric = new Cleric();
    cleric.move();
    cleric.attack();

    moveAndAttack(warrior);
    moveAndAttack(cleric);



  }

  public static void moveAndAttack(PlayableCharacter player) {
    player.move();
    player.attack();
  }
}
