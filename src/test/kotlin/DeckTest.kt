import DeckOfCards.Card
import DeckOfCards.Deck
import java.io.ByteArrayOutputStream
import kotlin.test.*


internal class DeckTest {
    var deck = Deck()

    @org.junit.Before
    fun setUp() {
        deck = Deck()
    }


    /**
     * @see Deck
     * Testing Deck constructor
     * Check if deck contains 52 cards
     */
    @org.junit.Test
    fun deckConstructor() {
        assertTrue(deck.getSize() == 52)
    }

    /**
     *@see Deck.dealOneCard
     * Testing dealOneCard method
     * Check if a card is returned from a new deck
     */
    @org.junit.Test
    fun dealOneCard() {
        assertTrue(deck.dealOneCard() is Card)
    }

    /**
     * @see Deck.dealOneCard
     * Testing dealOneCard method
     * Deal all 52 cards from deck and then try to deal 53rd card output should be "Null"
     */
    @org.junit.Test
    fun dealFromEmptyDeck() {
        for (i in 1..deck.getSize()) {
            deck.dealOneCard()
        }
        val byteArrayOutputStream = ByteArrayOutputStream()
        deck.dealOneCard().print(byteArrayOutputStream)
        assertEquals("Null", byteArrayOutputStream.toString().trim())
    }

    /**
     * @see Deck.shuffle
     * Testing shuffle method
     * Take all original elements from deck copy them to new shuffledDeck and shuffles this new Deck
     * and then check if all elements are still the same regardless of order
     */
    @org.junit.Test
    fun shuffle() {
        val deckShuffled = Deck()
        deckShuffled.cards.clear()
        deck.cards.forEach { card -> deckShuffled.cards.add(card) }
        deckShuffled.shuffle()
        val containSameElements = deck.cards.containsAll(deckShuffled.cards) && deckShuffled.cards.containsAll(deck.cards)
        assertTrue(containSameElements)
    }

    /**
     * @see Deck.print
     * Testing print method
     * Print the deck to Output stream and check 52 cards have been printed
     */
    @org.junit.Test
    fun print() {
        val byteArrayOutputStream = ByteArrayOutputStream()
        deck.print(byteArrayOutputStream)
        val cardsStrings = byteArrayOutputStream.toString().trim().split("\r\n")
        assertEquals(cardsStrings.size, 52)
    }

}