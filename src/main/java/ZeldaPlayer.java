public class ZeldaPlayer {


    private int healthCurrent=8;
    private int healthTotal=9;
    private int damage=0;

    public int getHealthCurrent() {
        return healthCurrent;
    }
    public int getHealthTotal() {
        return healthTotal;
    }
    public int getDamage() {
        return damage;
    }




    public void display(){
        System.out.println("health: "+getHealthCurrent());
        System.out.println("damage: "+getDamage());
        System.out.println();
    }

public void hud(){
    System.out.println("*-Health-Max:10---------------------------*");
    System.out.print("| ");
    int lostHealth=healthTotal-healthCurrent;
    int heartIndex=0;
    int heartIndexL=0;
    int negativeSpace = 10-healthTotal;

    do{
        System.out.print("<3");
        heartIndex++;
    }while(heartIndex<healthCurrent);
    if (lostHealth!=0) {
        do {
            System.out.print("--");
            heartIndexL++;
        } while (heartIndexL < lostHealth);
    }do{
        System.out.print("  ");
        negativeSpace--;
    }while(negativeSpace>0);
    System.out.println("Action Points: ");
    System.out.println("*--------------------------------------*");

}



    public void setHealthCurrent(int H){this.healthCurrent=H;};
    public void setHealthTotal(int H2){this.healthTotal=H2;};
    public void setDamage(int D){this.damage=D;};



}

