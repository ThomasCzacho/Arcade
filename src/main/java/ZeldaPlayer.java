public class ZeldaPlayer {


    private int healthCurrent=3;
    private int healthTotal=9;
    private int damage=3;
    private int actionPointsCurrent=5;
    private int actionPointsTotal=5;
    private boolean isBlocked=false;

// Action Point costs for specific actions, written here to be easily modified

    private final int lightAttackCost=3;
    private final int heavyAttackCost=4;
    private final int blockCost=2;
    private final int healCost=3;

    public int getHealthCurrent() {
        return healthCurrent;
    }
    public int getHealthTotal() {
        return healthTotal;
    }
    public int getDamage() {
        return damage;
    }
    public int getActionPointsCurrent(){return actionPointsCurrent;}
    public int getActionPointsTotal(){return actionPointsTotal;}
    public boolean getIsBlocked(){return isBlocked;}



    public void display(){
        System.out.println("health: "+getHealthCurrent());
        System.out.println("damage: "+getDamage());
        System.out.println("Blocked: "+getIsBlocked());
        System.out.println();
    }

public void hud(){
    System.out.println("*-Health--"+getHealthCurrent()+"/"+getHealthTotal()+"-----------------------------*");
    System.out.print("| ");
    int lostHealth=healthTotal-healthCurrent;
    int heartIndex=0;
    int heartIndexL=0;
    int negativeSpace = 10-healthTotal;

    do{
        System.out.print("♥ ");
        heartIndex++;
    }while(heartIndex<healthCurrent);
    if (lostHealth!=0) {
        do {
            System.out.print("- ");
            heartIndexL++;
        } while (heartIndexL < lostHealth);
    }do{
        System.out.print("  ");
        negativeSpace--;
    }while(negativeSpace>0);
    System.out.println("Action Points: "+getActionPointsCurrent()+"/"+getActionPointsTotal()+" |");
    System.out.println("*-----------------------------------------*");
    if(isBlocked){
        System.out.println("  \uD83D\uDEE1 Guarded \uD83D\uDEE1");
    }else{
        System.out.println();
    }

}



    public void setHealthCurrent(int H){this.healthCurrent=H;};
    public void setHealthTotal(int H2){this.healthTotal=H2;};
    public void setDamage(int D){this.damage=D;};
    public void setActionPointsCurrent(int A){this.actionPointsCurrent=A;}
    public void setActionPointsTotal(int A2){this.actionPointsTotal=A2;}
    public void setBlocked(boolean B){this.isBlocked=B;}


    public void attackH(ZeldaEnemy enemy) { //Heavy Attack
        if(actionPointsCurrent<blockCost){
            System.out.println("Not Enough Action Points to Heavy Attack ("+actionPointsCurrent+"/"+heavyAttackCost+" Points)");
        }else{



            int d = 0;

            if (enemy.getIsBlocked()){

                d+=(getDamage());


            }else{
                d=getDamage()*2;
            }
            enemy.setHealthCurrent(enemy.getHealthCurrent()-d);

            if (enemy.getIsBlocked()) {
                System.out.println("Player hits "+enemy.getName()+" for " + d + " Damage! (" + ((getDamage()*2) - d) + " Blocked!)\n");
            }else{
                System.out.println("Player hits "+enemy.getName()+" for " + d + " Damage!\n");
            }
            enemy.setBlocked(false);


        if(enemy.getHealthCurrent()<0){enemy.setHealthCurrent(0);} //enemies can't have negative health, default to 0
            setActionPointsCurrent(getActionPointsCurrent()-heavyAttackCost);//subtracts action points

        }}






    public void attackL(ZeldaEnemy enemy) { //Light Attack
        if(actionPointsCurrent<blockCost){
            System.out.println("Not Enough Action Points to Light Attack ("+actionPointsCurrent+"/"+lightAttackCost+" Points)");
        }else{



            int d = 0;

            if (enemy.getIsBlocked()){

                d+=(getDamage()/2);

                if (getDamage()%2 != 0){d++;}

            }else{
                d=getDamage();
            }
            enemy.setHealthCurrent(enemy.getHealthCurrent()-d);

            if (enemy.getIsBlocked()) {
                System.out.println("Player hits "+enemy.getName()+" for " + d + " Damage! (" + (getDamage() - d) + " Blocked!)\n");
            }else{
                System.out.println("Player hits "+enemy.getName()+" for " + d + " Damage!\n");
            }
            enemy.setBlocked(false);
            setActionPointsCurrent(getActionPointsCurrent()-lightAttackCost);//subtracts action points
            if(enemy.getHealthCurrent()<0){enemy.setHealthCurrent(0);} //enemies can't have negative health, default to 0


        }}


    public void block() { //Block
        if(actionPointsCurrent<blockCost){
            System.out.println("Not Enough Action Points to Block ("+actionPointsCurrent+"/"+blockCost+" Points)");
        }else{
        System.out.println("Player Guards for anticipated Attack\n");
        setBlocked(true);
        setActionPointsCurrent(getActionPointsCurrent()-blockCost);//subtracts action points
    }
    }


    public void heal() { //heal 3 points
        if(actionPointsCurrent<healCost){
            System.out.println("Not Enough Action Points to Heal ("+actionPointsCurrent+"/"+healCost+" Points)");
        }else{
            int h=0;
            h=healthCurrent+3;
            if(h>healthTotal){h=healthTotal;}
            int g = Math.abs(healthCurrent-h);

            System.out.println("Healed "+g+" ♥\n");

            setHealthCurrent(getHealthCurrent()+3);
            if(healthCurrent>healthTotal){setHealthCurrent(healthTotal);}
            setActionPointsCurrent(getActionPointsCurrent()-healCost);//subtracts action points



        }
    }


}

