package store;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StoreTest {

    @Test
    void getTotalCost() {
        Store store = new Store();

        assertEquals(13.25, store.calculateTotalCost("ABCDABA"));
    }
}
