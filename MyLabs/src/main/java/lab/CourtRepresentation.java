package lab;
public class CourtRepresentation extends Service {
	private String courtName;

	public CourtRepresentation(
			final ServiceType type, final String name, final String courtName) {
		this.setType(type);
		this.setName(name);
		this.setCourtName(courtName);
	}

	public final String getCourtName() {
		return courtName;
	}

	public final void setCourtName(final String courtName) {
		this.courtName = courtName;
	}
}
