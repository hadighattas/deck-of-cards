package DeckOfCards


fun main(args: Array<String>) {
    /**
     * Instantiate a deck and call the primary constructor
     */
    val deck = Deck()

    /**
     * Deal a card from the deck and print it to the console
     */
    deck.dealOneCard().print(System.out)

    /**
     * Shuffle the deck
     */
    deck.shuffle()

    /**
     * Dealing all the remaining cards
     */
    for (i in 1..deck.getSize())
        deck.dealOneCard().print(System.out)

    /**
     * Dealing an extra card from an empty deck
     */
    deck.dealOneCard().print(System.out)
}
