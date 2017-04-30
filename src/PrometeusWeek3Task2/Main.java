package PrometeusWeek3Task2;


/**
 * Created by DmRG on 07.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();

        deck.drawOne();
        deck.drawOne();
        deck.drawOne();
        deck.drawOne();
        deck.drawOne();
        deck.drawOne();
        deck.drawOne();
        deck.drawOne();

        deck.shuffle();
    }
}
