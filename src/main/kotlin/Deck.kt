package DeckOfCards

/**
 * Deck class
 * @property cards Mutable List of Card
 * @constructor Populates Cards with all 52 cards in a regular deck
 */
class Deck {

    var cards: MutableList<Card> = mutableListOf()

    init {
        for (suit in Suits.values())
            for (rank in Ranks.values())
                cards.add(Card(suit, rank))
    }

    /**
     * Shuffles the cards list
     */
    fun shuffle() = cards.shuffle()

    /**
     * Removes the first card form the cards list
     * @return Nullable card
     * @note use with ?. as the return type is nullable
     */
    fun dealOneCard(): Card? {

        when (cards.isNotEmpty()) {
            true -> return cards.removeAt(0)
            false -> return null
        }
    }

    /**
     * Prints all the deck
     */
    fun print() = cards.forEach { card -> card.print() }

}