package lab;

import java.util.List;
import java.util.Collections;
import java.util.ArrayList;

public class Lawyer {
	private Integer id;
	private String name;
	private List<ServiceType> abilitiesOfLawyer = new ArrayList<ServiceType>();
	final static String COMA = ",";
	
	public static String getHeaders() {
        return "lawyer_name,abilities";
	}
	
	public String toCSV(Lawyer lawyer) {
        return getName() + COMA + LawFirmManager.lawyerAbilitiesToString(lawyer);
	}
	
	public final List<ServiceType> getAbilitiesOfLawyer() {
		return abilitiesOfLawyer;
	}

	public final void setAbilitiesOfLawyer(List<ServiceType> abilitiesOfLawyer) {
		this.abilitiesOfLawyer = abilitiesOfLawyer;
	}

	public Lawyer(final String name, final ServiceType... abilitiesOfLawyer) {
		this.name = name;
		Collections.addAll(this.abilitiesOfLawyer, abilitiesOfLawyer);
	}

	public final String getName() {
		return name;
	}

	public final void setName(final String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}