package ru.otus;

import org.junit.Assert;
import org.junit.Test;
import ru.otus.good.Crow;

public class CrowTest {
    @Test
    public void flyingTest() {
        Crow crow = new Crow("Mag");
        crow.feed();
        Assert.assertFalse(crow.isFlying());
    }
}
