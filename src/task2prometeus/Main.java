package task2prometeus;

/**
 * Created by DmRG on 07.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();
        deck.order();
        while (deck.hasNext())
        {
            Card card = deck.drawOne();
            System.out.println(card.getSuit().getName() + " " + card.getRank().getName());
        }
    }
}
