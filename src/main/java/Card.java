public class Card {

    String suit;
    String title;
    int number;

    public Card(String suit, String title, int number){
        this.suit = suit;
        this.title = title;
        this.number = number;

        //titles: King, Queen, Jack, Ace, null
        //numbers: 1-10, if statement will read if it has a title and will ignore this.
        //this.suit includes hearts, clubs, diamonds, spades, this keeps track, no other purpose
    }



    public void setSuit(String S){this.suit=S;};
    public void setTitle(String T){this.title=T;};
    public void setNumber(int N){this.number=N;};

    //values are private, to read the values you need to use the GET method,
    // to change values you need to use the SET method
    //if(hn2.getNumber()==99){ etc.

    //

    public String getSuit() {
        return suit;
    }
    public String getTitle() {
        return title;
    }
    public int getNumber() {
        return number;
    }


}
//the number of cards is 52 without the Jokers.
// This is because there are 4 suits in a deck
// (Hearts, Clubs, Diamonds and Spades). Each of the 4 suits gets 13 cards. This means that 13×4 gives us
// a total of 52 cards.