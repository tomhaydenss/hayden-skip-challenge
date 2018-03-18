package ca.skipthedishes.hayden.util;

import ca.skipthedishes.hayden.api.response.StoreResponse;
import ca.skipthedishes.hayden.domain.Store;

public class StoreConverter {

	public static StoreResponse toStoreResponse(Store store) {
		StoreResponse result = null;
		if (store != null) {
			result = new StoreResponse(store.getId(), store.getName(), store.getAddress());
		}
		return result;
	}

}
