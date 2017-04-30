package PrometeusWeek3Task2;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by DmRG on 07.03.2017.
 */
public class Deck {
    public ArrayList<Card> deckCard;

    public Deck() {
        int k = 0;
        for (int i = 0; i < Suit.values.length; i++) {
            for (int j = 0; j < Rank.values.length; j++) {
                deckCard.add(k, new Card(Rank.values[j], Suit.values[i]));
                k++;
            }
        }
    }

    public ArrayList<Card> getDeckCard() {
        return deckCard;
    }

    public void setDeckCard(ArrayList<Card> deckCard) {
        this.deckCard = deckCard;
    }

    public void shuffle() {
        Collections.shuffle(deckCard);
    }

    public void order() {
        ArrayList<Card> temtCard = new ArrayList<>();
        int k = 0;
        for (int i = 0; i < Suit.values.length; i++) {
            for (int j = 0; j < Rank.values.length; j++) {
                for (int l = 0; l < deckCard.size(); l++) {
                    if ((deckCard.get(l).getRank().getName() == Rank.values[j].getName() &&
                            (deckCard.get(l).getSuit().getName() == Suit.values[i].getName()))) {
                        temtCard.add(k, deckCard.get(l));
                        k++;
                        break;
                    }
                }
            }
        }
        deckCard = temtCard;
    }
    public boolean hasNext() {
        if (deckCard.size() != 0) return true;
        else return false;
    }
    public Card drawOne() {
        if (deckCard.size() != 0) {
            return deckCard.remove(deckCard.size() - 1);
        } else return null;
    }
}
