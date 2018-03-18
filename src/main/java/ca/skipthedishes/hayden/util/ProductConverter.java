package ca.skipthedishes.hayden.util;

import ca.skipthedishes.hayden.api.response.ProductResponse;
import ca.skipthedishes.hayden.domain.Product;

public class ProductConverter {

	public static ProductResponse toProductResponse(Product product) {
		ProductResponse result = null;
		if (product != null) {
			result = new ProductResponse(product.getId(), product.getName(), product.getDescription(),
					product.getPrice());
		}
		return result;
	}

}
