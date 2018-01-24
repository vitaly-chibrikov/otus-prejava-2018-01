package ru.otus;

import org.junit.Assert;
import org.junit.Test;
import ru.otus.good.Bird;
import ru.otus.good.Crow;

public class BirdTest {

    @Test
    public void nameTest() {
        Bird bird = new Crow("Mag");
        Assert.assertEquals("Wrong name", "Mag", bird.getName());
    }

    @Test
    public void toStringTest() {
        Bird bird = new Crow("Mag");
        Assert.assertTrue(bird.toString().contains("Mag"));
    }

    @Test(expected = RuntimeException.class)
    public void wrongNameTest() {
        Bird bird = new Crow("");
    }
}
