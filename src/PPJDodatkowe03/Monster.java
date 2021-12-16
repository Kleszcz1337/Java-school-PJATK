package PPJDodatkowe03;

public class Monster {
    private String name;
    private int health;
    private int strength;
    private int points;

    public Monster(String name, int health, int strength){
        this.name = name;
        this.health = health;
        this.strength = strength;
    }

    public Monster(String imie){
        this.name = imie;
        this.health = (int)(Math.random()*100)+1;
        this.strength = (int)(Math.random()*100)+1;
    }

    public Monster(){
        this.name = "Milosz";
        this.strength = 4;
        this.health = 100;
    }

    public String getName(){
        return name;
    }

    public int getHealth(){
        return health;
    }

    public void takeDamage(int damage){
        health -= damage;   // health = health - damage;
    }

    public int getPower(){
        return strength;
    }

    public boolean isAlive(){
        return health > 0;
    }

    public void addPoints(){
        points++;
    }

    public int getPoints(){
        return points;
    }

    public void show(){
        System.out.println("Nazwa potwora: " + name + " posiada on: " + health + " życia, ma " + strength +" siły, punktow: " + points);
    }

    public static Monster arena(Monster a, Monster b){
        int healthTmpA = a.getHealth();
        int healthTmpB = b.getHealth();

        while(a.isAlive() && b.isAlive()){  //walka konczy sie wtedy kiedy ktos pada
            a.takeDamage(b.getPower());
            if(a.isAlive())
                b.takeDamage(a.getPower());
            else {
                a.health = healthTmpA;
                b.health = healthTmpB;
                return b;
            }
        }
        b.health = healthTmpB;
        a.health = healthTmpA;
        return a;
    }

}
