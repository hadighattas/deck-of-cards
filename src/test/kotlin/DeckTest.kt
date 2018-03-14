import DeckOfCards.Card
import DeckOfCards.Deck
import kotlin.test.*

internal class DeckTest {
    var deck = Deck()

    /**
     * @see Deck
     * Testing Deck constructor to check if it contains 52 cards when initialized
     */
    @org.junit.Test
    fun deckConstructor() {
        deck = Deck()
        assertTrue(deck.getSize() == 52)
    }

    /**
     *@see Deck.dealOneCard
     * Testing dealOneCard method to check if it returns a Card from a new Deck
     */
    @org.junit.Test
    fun dealOneCard() {
        deck = Deck()
        assertTrue(deck.dealOneCard() is Card)
    }

    /**
     * @see Deck.dealOneCard
     * Testing dealOneCard method to check output after 53rd call
     */
    @org.junit.Test
    fun dealEmptyDeck() {
        deck = Deck()
        /**
         * Deal 52 Cards
         */
        for (i in 1..deck.getSize()) {
            deck.dealOneCard()
        }
        /**
         * Deal 53rd card, output should be Null not Card
         */
        assertFalse(deck.dealOneCard() is Card)
    }
}