public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(999);
        boss.setDamage(166);
        boss.setDefence("fire");

        System.out.println("Information of boss:");
        System.out.println("Health: " + boss.getHealth());
        System.out.println("Damage: " + boss.getDamage());
        System.out.println("Protection: " + boss.getDefence());

        Hero[] heroes= createHeroes();

        for (int i = 0; i < heroes.length; i++) {
            System.out.println("Information of Heroes:");
            System.out.println("Health: " + heroes[i].getHealth());
            System.out.println("Damage: " + heroes[i].getDamage());
            System.out.println("SuperPower: " + heroes[i].getSuperpower());
            System.out.println("--------------");
        }
    }

    public static Hero[] createHeroes() {
        Hero hero1 = new Hero(300, 49, "Fly");
        Hero hero2 = new Hero(422, 66, "Invisible");
        Hero hero3 = new Hero(222, 101);
        return new Hero[]{hero1, hero2, hero3};
    }
}
