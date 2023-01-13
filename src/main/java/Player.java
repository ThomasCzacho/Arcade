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

}
