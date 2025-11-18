package nvf.coffeecart;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    void testBrew() {
        assertEquals("Coffee is brewing", App.brew());
    }

    @Test
    void testCalculateCaffeineBoost() {
        assertEquals(20, App.calculateCaffeineBoost(1));
        assertThrows(IllegalArgumentException.class,
                () -> App.calculateCaffeineBoost(-1));
    }

    @Test
    void testIsValidRoast() {
        // Valid
        assertTrue(App.isValidRoast("light"));

        // Case-insensitive
        assertTrue(App.isValidRoast("DaRk"));

        // Invalid
        assertFalse(App.isValidRoast("espresso"));
        assertFalse(App.isValidRoast(""));
        assertFalse(App.isValidRoast(null));
    }
}
