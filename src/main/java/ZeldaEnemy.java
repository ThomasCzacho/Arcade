public class ZeldaEnemy {


    private int health=0;
    private int damage=0;
    private String name;

    public int getHealth() {
        return health;
    }
    public int getDamage() {
        return damage;
    }
    public String getName(){return name;}

    public ZeldaEnemy( int health, int damage, String name){

        this.health = health;
        this.damage = damage;
        this.name = name;

    }


    public void display(){
        System.out.println("health: "+getHealth());
        System.out.println("damage: "+getDamage());
        System.out.println("name: "+getName());
        System.out.println();
    }


    public void setHealth(int H){this.health=H;}
    public void setDamage(int D){this.damage=D;}
    public void setName(String N){this.name=N;}



}
