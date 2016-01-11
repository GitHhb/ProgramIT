public class HogerLager {
    public static void main(String[] arg){
        Card card = new Card();
        System.out.println(card.cardNrToName(25));
        System.out.println(card.cardNameToNr(CardColor.Ruiten, CardValue.Aas));

    }
}


enum CardColor {Schoppen, Ruiten, Harten, Klaver}
enum CardValue {_1, _2, _3, _4, _5, _6, _7, _8, _9, Boer, Vrouw, Heer, Aas}

class Card {
    /* A card deck consists of 52 cards C (4 colors * 13 values),
    *  represented by the numbers Cn, with 0 <= Cn < 52.
    *  Class Card creates a mapping of the card number to its name.
    */
    // Note: checkout: Map, List, HashMap

    // Init
      // Reverse lookup arrays for the enums
    String[] ordToCardColor = new String[4];   // reverse enum CardColor, from ordinal to CardColor
    String[] ordToCardValue = new String[13];  // reverse enum CardValue, from ordinal to CardValue
    { for (CardColor n: CardColor.values())
        ordToCardColor[n.ordinal()] = n.name();
      for (CardValue n: CardValue.values())
        ordToCardValue[n.ordinal()] = n.name();
    }
      // Create a deck and shuffle it
    int[] deck = new int[52];
    {}

    // Methods
    public String cardNrToName(int cardnr) {
        // 0 <= cardnr < 52
        int colorNr = cardnr / 13;
        int valueNr = cardnr % 13;
        //System.out.println(CardColor.)
        return ordToCardColor[colorNr] + " " + ordToCardValue[valueNr];

    }

    public int cardNameToNr(CardColor cc, CardValue cv) {
        return cc.ordinal() * 13 + cv.ordinal();
    }

    public void shuffleDeck(){}
}

class Card1{
    // Init card
    int[][] card = new int[4][13];
    { for (int i = 0; i < 4; i++)
        for (int j = 0; j < 13; j++)
            card[i][j] = i * 13 + j;
    }

    public static void main(String[] a){
        Card1 card = new Card1();
        System.out.println("kaart " + card.card[CardColor.Harten.ordinal()][CardValue._1.ordinal()]);
        System.out.println("method " + card.cardName(CardColor.Ruiten, CardValue.Boer));
    }

    public String cardName (CardColor cc, CardValue cv){
        return cc + " " + cv;
    }
}

enum Card2 {
    CardColor, CardValue
}
