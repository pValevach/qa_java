package com.example;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class FelineTest {

    @Test
    public void eatMeatTest() throws Exception {
        Feline feline = new Feline();
        List<String> actual = feline.eatMeat();
        assertEquals(List.of("Животные", "Птицы", "Рыба"), actual);
    }

    @Test
    public void getFamilyTest() {
        Feline feline = new Feline();
        String actual = feline.getFamily();
        assertEquals("Кошачьи", actual);
    }

    @Test
    public void getKittensNoParametersTest() {
        Feline feline = new Feline();
        int actual = feline.getKittens();
        assertEquals(1, actual);
    }

    @Test
    public void getKittensParameterizedTest() {
        Feline feline = new Feline();
        int actual = feline.getKittens(2);
        assertEquals(2, actual);
    }

    @Test
    public void getFoodException() throws Exception {
        Feline feline = new Feline();
        Exception exception = assertThrows("Ошибки нет",Exception.class,
                () -> feline.getFood(""));

        assertEquals("Неизвестный вид животного, используйте значение Травоядное или Хищник",exception.getMessage());
    }
}
