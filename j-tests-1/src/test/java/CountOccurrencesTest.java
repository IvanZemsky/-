import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountOccurrencesTest {

    @Test
    @DisplayName("CountOccurances")
    void countOccurrences() {
        assertAll(
                () -> assertEquals(2, CountOccurrences.countOccurrences("abcdeabcde", "abc")),
                () -> assertEquals(1, CountOccurrences.countOccurrences("", "")),
                () -> assertEquals(1, CountOccurrences.countOccurrences("привет", "привет")),
                () -> assertEquals(0, CountOccurrences.countOccurrences("абв", "абвгд")),
                () -> assertEquals(0, CountOccurrences.countOccurrences("123", "$@!")),
                () -> assertEquals(0, CountOccurrences.countOccurrences(null, "12345"))
        );
    }
}