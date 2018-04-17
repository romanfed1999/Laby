
public class AplicationFormCreating extends Service {
	private String formName;

	public AplicationFormCreating(ServiceType type, String name, String formName) {
		this.setType(type);
		this.setName(name);
		this.formName = formName;
		LawFirm.services.add(this);
	}

	public String getFormName() {
		return formName;
	}

	public void setFormName(String formName) {
		this.formName = formName;
	}
}
