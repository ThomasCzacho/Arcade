public class Player {

    //Fields

    private int tokens=0;
    private int tickets=0;

    public int getBalance() {
        return tokens;
    }
    public int getTickets() {
        return tickets;
    }



    public void display(){
        System.out.println("Tokens: "+getBalance());
        System.out.println("Tickets: "+getTickets());
        System.out.println();
    }

    public void setBalance(int B){this.tokens=B;};
    public void setTickets(int T){this.tickets=T;};

    public void help(){
        System.out.println("Games can be played using Tokens. Played Games award Tickets" +
                " that can be redeemed for Prizes. Don't go spending all your Tokens!");
    }
    public void screen(){
        String s="*----------------------------------------------------------------------------------------------------------------------------------------------*";
        System.out.println(s);
        int sl=s.length();
        int counter=1;
        do{
            if(counter==3){
                System.out.print("|3         Width: 144  Height: 23\n");
            }else {
                System.out.println("|" + counter);
            }
            counter++;
        }while(counter!=22);
        System.out.println(s);
    }

    public void startup(){
        String s= "*----------------------------------------------------------------------------------------------------------------------------------------------*";
        System.out.println(s);

        System.out.println("\n\n\n                           db      `7MM\"\"\"Mq.    .g8\"\"\"bgd       db      `7MM\"\"\"Yb.   `7MMF'      db      \r\n" +
                           "                          ;MM:       MM   `MM. .dP'     `M      ;MM:       MM    `Yb.   MM       ;MM:     \r\n" +
                           "                         ,V^MM.      MM   ,M9  dM'       `     ,V^MM.      MM     `Mb   MM      ,V^MM.    \r\n" +
                           "                        ,M  `MM      MMmmdM9   MM             ,M  `MM      MM      MM   MM     ,M  `MM    \r\n" +
                           "                        AbmmmqMA     MM  YM.   MM.            AbmmmqMA     MM     ,MP   MM     AbmmmqMA   \r\n" +
                           "                       A'     VML    MM   `Mb. `Mb.     ,'   A'     VML    MM    ,dP'   MM    A'     VML  \r\n" +
                           "                     .AMA.   .AMMA..JMML. .JMM.  `\"bmmmd'  .AMA.   .AMMA..JMMmmmdP'   .JMML..AMA.   .AMMA.\r\n");
        System.out.println("                                            An Interactive Text Based Story Adventure\n\n\n\n\n\n\n\n");
        System.out.println(s);


    }

}