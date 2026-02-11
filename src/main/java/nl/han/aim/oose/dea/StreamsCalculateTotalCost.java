package nl.han.aim.oose.dea;

import nl.han.aim.oose.dea.helpers.Product;

import java.util.List;
import java.util.stream.Stream;

public class StreamsCalculateTotalCost {
    int calculateTotalCostOfAllProducts(List<Product> products) {

        return products.stream()
                .mapToInt(Product::getPrice)
                .sum();


    }

    int calculateTotalCostOfAllGadgets(List<Product> products) {
        // TODO: implement

        return 0;
    }
}
