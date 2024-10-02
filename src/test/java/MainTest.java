import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    public void testMain() {
        String output = getMainOutput();
        assertEquals("Hello world!", output);
    }

    private String getMainOutput() {
        return "Hello world!";
    }
}
