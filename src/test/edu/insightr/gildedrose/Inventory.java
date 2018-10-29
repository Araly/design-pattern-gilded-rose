package edu.insightr.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Inventory {

    @Test
    void updateQuality() {
        int expected = 5;
        int value = 5;
        assertEquals(expected, value);
        //SETUP
        Inventory testInventory = new Inventory();
        Item vest = testInventory.getItems
    }
}

void vest() {
    Inventory testInventory = new Inventory();
    Item vest = testInventory.getItems
}

// Adrien
    void ConjuredQualityTest(){
        int expected = 5;
        int value = 5;
        assertEquals(expected,value);
        //SETUP, we verify that our item matches the initial values
        Inventory testInventory = new Inventory();
        Item manaCake = testInventory.getItems()[5];
        assertEquals("Conjured Mana Cake", manaCake.getName());
        assertEquals(16,manaCake.getQuality());
        assertEquals(1,manaCake.getSellIn());
        //ACTION
        testInventory.updateQuality();
        //TEST, we expect conjured items quality to decrease by 2
        assertEquals(14,manaCake.getQuality());
        assertEquals(0,manaCake.getSellIn());
        //ACTION
        testInventory.updateQuality();
        //TEST,  we expect conjured items quality to decrease by 4 when SellIn is below zero
        assertEquals(10, manaCake.getQuality());
        assertEquals(-1,manaCake.getSellIn());
    }