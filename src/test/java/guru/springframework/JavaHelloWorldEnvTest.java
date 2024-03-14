package guru.springframework;

import org.junit.jupiter.api.Test;

public class JavaHelloWorldEnvTest {
    @Test
    void getHello() {
        System.out.println("#################");
        System.out.println(System.getenv("TEST_HOST"));
    }
}
