class Hero {
    private int health;
    private int damage;
    private String superpower;
    public Hero(int health, int damage, String superpower) {
        this.health = health;
        this.damage = damage;
        this.superpower = superpower;
    }
    public Hero(int health, int damage) {
        this.health = health;
        this.damage = damage;
        this.superpower = "Нет суперспособности";
    }
    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public String getSuperpower() {
        return superpower;
    }
}

class Boss {
    private int health;
    private int damage;
    private String defenseType;

    // Геттеры
    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public String getDefenseType() {
        return defenseType;
    }

    // Сеттеры
    public void setHealth(int health) {
        this.health = health;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setDefenseType(String defenseType) {
        this.defenseType = defenseType;
    }
}

public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(1000);
        boss.setDamage(50);
        boss.setDefenseType("Armor");

        System.out.println("Информация о боссе:");
        System.out.println("Здоровье: " + boss.getHealth());
        System.out.println("Урон: " + boss.getDamage());
        System.out.println("Тип защиты: " + boss.getDefenseType());

        Hero heroW = new Hero(150, 30, "Летать");
        Hero heroV = new Hero(120, 40);

        System.out.println("\nИнформация о герое 1:");
        System.out.println("Здоровье: " + heroW.getHealth());
        System.out.println("Урон: " + heroW.getDamage());
        System.out.println("Суперспособность: " + heroW.getSuperpower());

        System.out.println("\nИнформация о герое 2:");
        System.out.println("Здоровье: " + heroV.getHealth());
        System.out.println("Урон: " + heroV.getDamage());
        System.out.println("Суперспособность: " + heroV.getSuperpower());
    }
}




