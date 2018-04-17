import java.util.*;
import java.util.stream.Collectors;

public class LawFirmManager {
	private List<Lawyer> lawyers = new ArrayList<Lawyer>();

	public List<Lawyer> getLawyers() {
		return lawyers;
	}

	public Set<Lawyer> lawyerSearch(ServiceType... searchServiceTypes) {
		List<Lawyer> foundLawyersList = new ArrayList<Lawyer>();
		Set<Lawyer> foundLawyers = foundLawyersList.stream().collect(Collectors.toSet());

		for (Lawyer lawyer : lawyers) {
				for (ServiceType type2 : searchServiceTypes) {
					if (lawyer.abilitiesOfLawyer.contains(type2)) {
						foundLawyers.add(lawyer);
						break;
					}
				}
		}
		return foundLawyers;
	}

	public List<Lawyer> lawyerSortByName(Set<Lawyer> lawyers) {
		List<Lawyer> lawyersList = new ArrayList<Lawyer>(lawyers);
		lawyersList.sort(Comparator.comparing(Lawyer::getName));
		return lawyersList;
	}
	
	public void addLawyer(Lawyer lawyer) {
		this.lawyers.add(lawyer);
	}
}
