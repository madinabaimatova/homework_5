public class Hero {
    private int Health;
    private int Damage;
    private String Superpower;

    public Hero(int health, int damage) {
        Health = health;
        Damage = damage;
    }

    public Hero(int health, int damage, String superpower) {
        Health = health;
        Damage = damage;
        Superpower = superpower;
    }

    public int getHealth() {
        return Health;
    }

    public int getDamage() {
        return Damage;
    }

    public String getSuperpower() {
        return Superpower;
    }
}
