import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void polybiusCipher() {
        assertAll(
                () -> assertEquals("22343414125415", Main.polybiusCipher("goodbye")),
                () -> assertEquals(true, Main.saveToFile("22343414125415")),
                () -> assertEquals("22343414125415", Main.readFromFile("22343414125415")),
                () -> assertEquals("goodbye", Main.decryptPolybiusCipher("22343414125415"))
        );
        assertAll(
                () -> assertEquals("5143451544", Main.polybiusCipher("vsuet")),
                () -> assertEquals(true, Main.saveToFile("5143451544")),
                () -> assertEquals("5143451544", Main.readFromFile("5143451544")),
                () -> assertEquals("vsuet", Main.decryptPolybiusCipher("5143451544"))
        );
        assertAll(
                () -> assertEquals("5134423433155523", Main.polybiusCipher("voronezh")),
                () -> assertEquals(true, Main.saveToFile("5134423433155523")),
                () -> assertEquals("5134423433155523", Main.readFromFile("5134423433155523")),
                () -> assertEquals("voronezh", Main.decryptPolybiusCipher("5134423433155523"))
        );
    }
}