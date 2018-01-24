package ru.otus;

import org.junit.Assert;
import org.junit.Test;
import ru.otus.good.Blackbird;

public class BlackbirdTest {
    @Test
    public void flyingTest() {
        Blackbird blackbird = new Blackbird("Terry");
        blackbird.feed();
        Assert.assertTrue(blackbird.isFlying());
    }
}
