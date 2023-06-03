package ch.zhaw.iwi.devops.roman;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class RomanConverterTest {
    
    @Test
    public void romanConverter1() {
        RomanConverter romanConverter = new RomanConverter();
        assertThat("III").isEqualTo(romanConverter.convert(3));
    }

    @Test
    public void romanConverter2() {
        RomanConverter romanConverter = new RomanConverter();
        String romString = romanConverter.getCharacter();
        assertThat(romString).isEqualTo(romanConverter.convert(3));
    }

    @Test
    public void romanConverter3() {
        RomanConverter romanConverter = new RomanConverter();
        assertThat("L").isEqualTo(romanConverter.convert(50));
    }

    @Test
    public void romanConverter4() {
        RomanConverter romanConverter = new RomanConverter();
        assertThat("There is no such number").isEqualTo(romanConverter.convert(500));
    }

}
