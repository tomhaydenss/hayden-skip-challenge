package ca.skipthedishes.hayden.util;

import ca.skipthedishes.hayden.api.response.CousineResponse;
import ca.skipthedishes.hayden.domain.Cousine;

public class CousineConverter {

	public static CousineResponse toCousineResponse(Cousine cousine) {
		CousineResponse result = null;
		if (cousine != null) {
			result = new CousineResponse(cousine.getId(), cousine.getName());
		}
		return result;
	}

}
