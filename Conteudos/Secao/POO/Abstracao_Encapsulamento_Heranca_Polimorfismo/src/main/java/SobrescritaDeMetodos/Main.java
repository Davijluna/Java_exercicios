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
    cleric.heal();                       // Cura básica
    cleric.heal("Poção de Vida");        // Cura com a Poção de Vida
    cleric.heal("Feitiço de Luz", 7);

    System.out.println(" ");

    moveAndAttack(warrior);
    moveAndAttack(cleric);

    System.out.println(" ");

    Barbarian barbarian = new Barbarian();
    barbarian.move();



  }

  public static void moveAndAttack(PlayableCharacter player) {
    player.move();
    player.attack();
  }
}
