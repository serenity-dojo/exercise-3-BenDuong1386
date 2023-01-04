package com.serenitydojo;

import org.junit.Assert;
import org.junit.Test;

public class WhenCreatingObjects {
    @Test
    public void testDogMakeRightNoise() {
        Assert.assertEquals(Dog.makeNoise(), "Woof");
    }
}
