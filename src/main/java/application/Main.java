package application;

import store.*;

public class Main {

    public static void main(String[] args) {

        //TODO: create product
        //TODO: ?create cart
        Store store = new Store();

        System.out.println(store.calculateTotalCost("ABCDABA"));

    }
}