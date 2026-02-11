package nl.han.aim.oose.dea;

import nl.han.aim.oose.dea.helpers.Product;

import java.util.List;
import java.util.stream.Stream;

import static nl.han.aim.oose.dea.helpers.ProductCategory.GADGETS;

public class StreamsCalculateTotalCost {
    int calculateTotalCostOfAllProducts(List<Product> products) {

        return products.stream()
                .mapToInt(Product::getPrice)
                .sum();


    }

    int calculateTotalCostOfAllGadgets(List<Product> products) {

        return products.stream()
                .filter(Product -> Product.getCategory() == GADGETS)
                .mapToInt(Product::getPrice)
                .sum();

    }
}
