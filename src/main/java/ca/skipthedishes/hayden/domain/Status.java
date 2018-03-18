package ca.skipthedishes.hayden.domain;

public enum Status {

	CREATED(0), CONFIRMED(1), AT_PRODUCTION_LINE(2), WAITING_FOR_COURIRER(3), ON_THE_WAY(4), DELIVERED(5), CANCELED(6);

	private Integer id;

	private Status(Integer id) {
		this.id = id;
	}

	public static Status valueOf(Integer id) {
		for (Status item : Status.values()) {
			if (item.id.equals(id)) {
				return item;
			}
		}
		return null;
	}

}
