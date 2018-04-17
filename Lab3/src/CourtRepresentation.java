
public class CourtRepresentation extends Service {
	private String courtName;

	public CourtRepresentation(ServiceType type, String name, String courtName) {
		this.setType(type);
		this.setName(name);
		this.courtName = courtName;
		LawFirm.services.add(this);
	}

	public String getCourtName() {
		return courtName;
	}

	public void setCourtName(String courtName) {
		this.courtName = courtName;
	}
}
