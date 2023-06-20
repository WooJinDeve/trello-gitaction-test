package com.example;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class TrelloTest1 {

    @Test
    void test1() {
        int a = 1;
        int b = 2;

        assertThat(3).isEqualTo(a + b);
    }


    @Test
    void test2() {
        int a = 3;
        int b = 4;

        assertThat(7).isEqualTo(a + b);
    }
}
