import org.example.StringProcessor;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringProcessorTest {

    // Задание 1

    @Test
    public void testStringRepeaterCounter() {
        assertEquals("aaa", StringProcessor.stringRepeaterCounter("a", 3));
        assertEquals("", StringProcessor.stringRepeaterCounter("a", 0));
    }

    // Задание 2

    @Test
    public void testStringOccurrencesProcessor() {
        assertEquals(3, StringProcessor.stringOccurrencesProcessor("ababab", "ab"));
        assertEquals(0, StringProcessor.stringOccurrencesProcessor("hello", "world"));
    }

    // Задание 3


    @Test
    public void testCharReplacementProcessor() {
        assertEquals("один два три один два", StringProcessor.charReplacementProcessor("1 2 3 1 2"));
    }

    // Задание 4

    @Test
    public void testDeleteEverySecondCharacterProcessor() {
        assertEquals("б суас?н ос!", StringProcessor.deleteEverySecondCharacterProcessor("бу испугался? не бойся!").toString());
    }
}
