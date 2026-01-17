package tech.samagua.java_tdd_b010501.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WordTest {

    @Test
    public void oneIncorrectLetter() {
        var word = new Word("A");

        var score = word.guess("Z");

        var result = score.letter(0);

        assertEquals(Letter.INCORRECT, result);
    }

}
