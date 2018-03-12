package DeckOfCards

fun main(args: Array<String>) {
    val deck = Deck()

    /**
     * This call shouldj
     */
    deck.dealOneCard()?.print()
    print(Card(Suits.CLUBS, Ranks.ACE))
    Card(Suits.CLUBS, Ranks.ACE).print()


}