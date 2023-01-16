public class ZeldaEnemy {

    private int healthCurrent=6;
    private int healthTotal=6;
    private int damage=0;
    private int actionPointsCurrent=5;
    private boolean isBlocked=false;
    private String name;


    public int getHealthCurrent() {
        return healthCurrent;
    }
    public int getHealthTotal() {
        return healthTotal;
    }
    public int getDamage() {
        return damage;
    }

    public boolean getIsBlocked(){return isBlocked;}
    public String getName(){return name;}

    public ZeldaEnemy( int healthT, int healthC, int damage, String name){

        this.healthTotal = healthT;
        this.healthCurrent = healthC;
        this.damage = damage;
        this.name = name;

    }


    public void display(){
        System.out.println("health_C: "+getHealthCurrent());
        System.out.println("damage: "+getDamage());
        System.out.println("name: "+getName());
        System.out.println();
    }


    public void setHealthCurrent(int H){this.healthCurrent=H;};
    public void setHealthTotal(int H2){this.healthTotal=H2;};
    public void setDamage(int D){this.damage=D;};
    public void setBlocked(boolean B){this.isBlocked=B;}



    public void hud(){
        int i=0;
        System.out.print("*-"+getName()+"--"+getHealthCurrent()+"/"+getHealthTotal());
        if(getHealthTotal()<10){
            System.out.print("-");
        }if(getHealthCurrent()<10){
            System.out.print("-");
        }
        do{
            System.out.print("-");
            i++;
        }while(i<33-getName().length());
        System.out.println("*");

        System.out.print("| ");
        int lostHealth=healthTotal-healthCurrent;
        int heartIndex=0;
        int heartIndexL=0;
        int negativeSpace = 20-healthTotal;


        if(healthCurrent>0) {
            do {
                System.out.print("♥ ");
                heartIndex++;
            } while (heartIndex < healthCurrent);
            if (lostHealth != 0) {
                do {
                    System.out.print("- ");
                    heartIndexL++;
                } while (heartIndexL < lostHealth);
            }
            do {
                System.out.print("  ");
                negativeSpace--;
            } while (negativeSpace > 0);
            System.out.println("");
        }else{

            System.out.println(" Dead \uD83D\uDD71                                ");
        }
        System.out.println("*-----------------------------------------*");
        if(isBlocked){
            System.out.println("  \uD83D\uDEE1 Guarded \uD83D\uDEE1");
        }else{
            System.out.println();
        }
    }



    public void attack(ZeldaPlayer player) {
        int d = 0;

        if (player.getIsBlocked()){

            d+=(getDamage()/2);

            if (getDamage()%2 != 0){d++;}

        }else{
            d=getDamage();
        }
        player.setHealthCurrent(player.getHealthCurrent()-d);

        if (player.getIsBlocked()) {
            System.out.println(name + " hits Player for " + d + " Damage! (" + (getDamage() - d) + " Blocked!)");
        }else{
            System.out.println(name + " hits Player for " + d + " Damage!");
        }
        player.setBlocked(false);
        player.setActionPointsCurrent(player.getActionPointsTotal()); //returns player to full action points


    }

    public void block() { //Block

        setBlocked(true);
        System.out.println(name+" Guards against next attack!\n");

    }
}
