package ru.netology.managers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.PurchaseItem;

import static org.junit.jupiter.api.Assertions.*;

class CartManagerTest {

    CartManager manager = new CartManager(10, 10);
    PurchaseItem first = new PurchaseItem(1, 1, "first", "comedy");
    PurchaseItem second = new PurchaseItem(2, 2, "second", "thriller");
    PurchaseItem third = new PurchaseItem(3, 3, "third", "drama");
    PurchaseItem fourth = new PurchaseItem(4, 4, "fourth", "horror");
    PurchaseItem fifth = new PurchaseItem(5, 5, "fifth", "love story");
    PurchaseItem sixth = new PurchaseItem(6, 6, "sixth", "drama");
    PurchaseItem seventh = new PurchaseItem(7, 7, "seventh", "horror");
    PurchaseItem eighth = new PurchaseItem(8, 8, "eighth", "comedy");
    PurchaseItem ninth = new PurchaseItem(9, 9, "ninth", "love story");
    PurchaseItem tenth = new PurchaseItem(10, 10, "tenth", "horror");


    @BeforeEach
    public void setUp() {
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
    }
/* Проверяем что выводит десять последних */
    @Test
    void shouldTenMovies() {
        PurchaseItem[] actual = manager.getAll();
        PurchaseItem[] expected = new PurchaseItem[]{tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};
        assertArrayEquals(actual, expected);
    }

}