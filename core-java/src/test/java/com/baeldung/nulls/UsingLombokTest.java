package com.baeldung.nulls;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsingLombokTest {

    private UsingLombok classUnderTest;

    @BeforeEach
    public void setup() {
        classUnderTest = new UsingLombok();
    }

    @Test
    public void whenNullArg_thenThrowNullPointerException() {

        assertThrows(NullPointerException.class, () -> classUnderTest.accept(null));

    }

}