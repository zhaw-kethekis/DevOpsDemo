package ch.zhaw.iwi.devops.roman;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class RomanConverterTest {
    
    @Test
    public void romanConverter1() {
        RomanConverter romanConverter = new RomanConverter();
        assertThat("III").isEqualTo(romanConverter.convert(3));
    }

}
