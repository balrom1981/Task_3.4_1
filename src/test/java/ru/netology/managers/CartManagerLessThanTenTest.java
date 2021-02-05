package ru.netology.managers;

import ru.netology.domain.PurchaseItem;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class CartManagerLessThanTenTest {


    CartManager manager = new CartManager(7);
    PurchaseItem first = new PurchaseItem(1, 1, "first", "comedy");
    PurchaseItem second = new PurchaseItem(2, 2, "second", "thriller");
    PurchaseItem third = new PurchaseItem(3, 3, "third", "drama");
    PurchaseItem fourth = new PurchaseItem(4, 4, "fourth", "horror");
    PurchaseItem fifth = new PurchaseItem(5, 5, "fifth", "love story");
    PurchaseItem sixth = new PurchaseItem(6, 6, "sixth", "drama");

    @BeforeEach
    public void setUp() {
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
    }
/* Проверяем, что выводит столько сколько есть, если меньше 10*/
    @Test
    void shouldLessTenMovies() {
        PurchaseItem[] actual = manager.getAll(6);
        PurchaseItem[] expected = new PurchaseItem[]{sixth, fifth, fourth, third, second, first};
        assertArrayEquals(actual, expected);
    }
}