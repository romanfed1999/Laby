package lab;
public class AplicationFormCreating extends Service {
	private String formName;

	public AplicationFormCreating(
			final ServiceType type, final String name, final String formName) {
		this.setType(type);
		this.setName(name);
		this.setFormName(formName);
	}

	public final String getFormName() {
		return formName;
	}

	public final void setFormName(final String formName) {
		this.formName = formName;
	}
}