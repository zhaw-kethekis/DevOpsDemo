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
        assertThat("D").isEqualTo(romanConverter.convert(500));
    }

    @Test
    public void romanConverter5() {
        RomanConverter romanConverter = new RomanConverter();
        assertThat("VIII").isEqualTo(romanConverter.convert(8));
        assertThat("VII").isEqualTo(romanConverter.convert(7));
        assertThat("VI").isEqualTo(romanConverter.convert(6));
    }

    @Test
    public void romanConverter6() {
        RomanConverter romanConverter = new RomanConverter();
        assertThat("Numbers between 1-1000").isEqualTo(romanConverter.convert(1001));
    }

    @Test
    public void romanConverter7() {
        RomanConverter romanConverter = new RomanConverter();
        assertThat("Numbers between 1-1000").isEqualTo(romanConverter.convert(0));
    }

    @Test
    public void romanConverter8() {
        RomanConverter romanConverter = new RomanConverter();
        assertThat("XLVII").isEqualTo(romanConverter.convert(47));
    }

}
