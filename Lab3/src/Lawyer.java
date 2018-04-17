import java.util.*;

public class Lawyer extends LawFirm {
	private String name;
	public List<ServiceType> abilitiesOfLawyer = new ArrayList<ServiceType>();

	public Lawyer(String name, ServiceType... abilitiesOfLawyer) {
		this.name = name;
		Collections.addAll(this.abilitiesOfLawyer, abilitiesOfLawyer);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}