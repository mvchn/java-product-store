package store;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StoreTest {

    @Test
    void getTotalCost() {

        Store store = new Store();
        store.addProduct(new Product("A", 1.25));
        store.addProduct(new Product("B", 4.25));
        store.addProduct(new Product("C", 1));
        store.addProduct(new Product("D", 0.75));

        assertEquals(13.25, store.calculateTotalCost("ABCDABA"));
    }
}
