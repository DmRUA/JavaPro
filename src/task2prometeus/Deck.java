package task2prometeus;

import java.util.Random;

/**
 * Created by DmRG on 07.03.2017.
 */
public class Deck {
    public Card[] cardDeck;

    public Deck() {
        int k = 0;
        cardDeck = new Card[36];
        for (int i = 0; i < Suit.values.length; i++) {
            for (int j = 0; j < Rank.values.length; j++) {
                 cardDeck[k] = new Card(Rank.values[j], Suit.values[i]);
                 k++;
            }
        }
    }

    public void shuffle()
    {
        Random random = new Random();
        Card cardOne, cardTwo;
        for (int i = 0; i < 16; i++) {
            int tempOneRandom = random.nextInt(cardDeck.length);
            cardOne = cardDeck[tempOneRandom];
            int tempTwoRandom = random.nextInt(cardDeck.length);
            cardTwo = cardDeck[tempTwoRandom];
            cardDeck[tempOneRandom] = cardTwo;
            cardDeck[tempTwoRandom] = cardOne;

        }
    }

    public void order() {
        Card[] tempDeck = new Card[cardDeck.length];
        int k = 0;
        for (int i = 0; i < Suit.values.length; i++) {
            for (int j = 0; j < Rank.values.length; j++) {
                for (int l = 0; l < cardDeck.length; l++) {
                    if ((cardDeck[l].getRank().getName() == Rank.values[j].getName() &&
                            (cardDeck[l].getSuit().getName() == Suit.values[i].getName()))) {
                        tempDeck[k] = cardDeck[l];
                        k++;
                        break;
                    }
                }
            }
        }
        cardDeck = tempDeck;
    }
    public boolean hasNext() {
       if (cardDeck.length != 0)  return true;
       else return false;
    }
    public Card drawOne() {
        if (cardDeck.length != 0) {
            Card tempCard = cardDeck[cardDeck.length-1];
            Card [] tempCardDeck = new Card[cardDeck.length-1];
            System.arraycopy(cardDeck, 0, tempCardDeck, 0, (cardDeck.length-1));
            cardDeck = tempCardDeck;
            return tempCard;
        } else return null;
    }
}
