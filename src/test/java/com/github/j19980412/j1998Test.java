package com.github.j19980412;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class j1998Test {
    @Test
    public void getType() throws Exception {
    }
    // Arrange
    j1998 triangle = new j1998(5, 10, 5);

    // Act
    String result = triangle.getType();

    // Assert
        Assert.assertEquals("不是三角形", result);// Arrange

    @Test
    public void add() throws Exception {
    }

}
