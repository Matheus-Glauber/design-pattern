package patterns.creational.singleton;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SingletonTest {

    private static Singleton instanceT1;
    private static Singleton instanceT2;

    @Test
    @DisplayName("Test singleton instances")
    void test_singleton() {
        Singleton instance1 = Singleton.getInstance("Teste1");
        Singleton instance2 = Singleton.getInstance("Teste2");
        assertEquals(instance1, instance2);
        assertEquals(instance1.getValue(), instance2.getValue());
    }

    @Test
    @DisplayName("Test singleton instances in multi thread no safe")
    void test_singleton_multi_thread() throws InterruptedException {
        new Thread(t1).start();
        new Thread(t2).start();
        Thread.sleep(1000);

        assertEquals(instanceT1, instanceT2);
        assertEquals(instanceT1.getValue(), instanceT2.getValue());
    }

    private static Runnable t1 = () -> instanceT1 = Singleton.getInstance("Teste1");

    private static Runnable t2 = () -> instanceT2 = Singleton.getInstance("Teste2");
}