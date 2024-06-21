package heranca;

public class Main {

  public static void main(String[] args) {
    Warrior warrior = new Warrior();
    warrior.setName("Aragorn");
    warrior.setRace("Humano");
//    warrior.setWeapon("Espada");

    Warrior player1 = new Warrior();
    player1.setName("Aragorn");
    // A linha abaixo funcionará normalmente
    player1.setWeapon("Espada");

    PlayableCharacter player2 = new Warrior();
    player2.setName("Aragorn");

    System.out.println(warrior.getName() + " é da raça " + warrior.getRace() +
        " e utiliza " + warrior.getWeapon());

    System.out.println(player1.getName() + " é da raça " + player1.getRace() +
        " e utiliza " + player1.getWeapon());

    System.out.println(player2.getName() + " é da raça " + player2.getRace() +
        " e utiliza ");

  }

}
