package nvf.coffeecart;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void testBrew() {
        assertEquals("Coffee is brewing", App.brew());
    }
}