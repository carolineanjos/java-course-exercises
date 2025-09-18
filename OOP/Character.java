class Character {
  String name;
  int powerLevel;

  public Character(String nameInit, int powerLevelInit) {
    this.name = nameInit;
    this.powerLevel = powerLevelInit;
  }

  public void tryUpLevelPower(int level) {
    level += 20;
  }
  
  public void changeName(Character character){
    character.name = "SuperMan";
  }

  public void increasePowerLevel() {
    this.powerLevel += 10;
  }

  public static void main(String[] args) {
    Character hero = new Character("SpiderMan", 70);

    System.out.println("antes de tentar aumentar o nivel: " + hero);
    hero.tryUpLevelPower(hero.powerLevel);
    System.out.println("depois de aumentar: " + hero);

    System.out.println("Antes de mudarname: " + hero.name);
    hero.changeName(hero);
    System.out.println("Depois de mudarname: " + hero.name);

    System.out.println("Antes de aumentarNivelDePoder: " + hero.powerLevel);
    hero.increasePowerLevel();
    System.out.println("Depois de aumentarNivelDePoder: " + hero.powerLevel);
  }
}