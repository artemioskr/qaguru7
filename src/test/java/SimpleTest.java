import org.hamcrest.Matchers;
import org.hamcrest.core.IsEqual;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.not;

public class SimpleTest {

    @Test
    void PassedTest() {
        assertThat(5 + 5, is(equalTo(10)));
    }

    @Test
    void FailedTest() {
        assertThat(5 + 5, is(not(10)));
    }
}
