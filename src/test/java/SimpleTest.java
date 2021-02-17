import io.qameta.allure.Description;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class SimpleTest {

    @Test
    @Description("5+5 = 10")
    void PassedTest() {
        assertThat(5 + 5, is(equalTo(10)));
    }

    @Test
    @Description("5+5 != 10")
    void FailedTest() {
        assertThat(5 + 5, is(not(10)));
    }
}
