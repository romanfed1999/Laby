
public abstract class Service {
	private ServiceType type;
	private String name;

	public final ServiceType getType() {
		return type;
	}

	public final void setType(final ServiceType type) {
		this.type = type;
	}

	public final String getName() {
		return name;
	}

	public final void setName(final String name) {
		this.name = name;
	}
}
