import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

public class LawFirmManager {
	private List<Lawyer> lawyers = new ArrayList<Lawyer>();
	
	public final List<Lawyer> getLawyers() {
		return lawyers;
	}
	
	public final List<Lawyer> lawyerSearch(final ServiceType... searchServiceTypes) {
		List<Lawyer> foundLawyersList = new ArrayList<Lawyer>();
		//Set<Lawyer> foundLawyers = foundLawyersList.stream().collect(Collectors.toSet());
		for (Lawyer lawyer : lawyers) {
			for (ServiceType type2 : searchServiceTypes) {
				if (lawyer.getAbilitiesOfLawyer().contains(type2)) {
					foundLawyersList.add(lawyer);
					break;
				}
			}
		}
		return foundLawyersList;
	}

	public final List<Lawyer> lawyerSortByName(final List<Lawyer> lawyers) {
	
		lawyers.sort(Comparator.comparing(Lawyer::getName));
		return lawyers;
	}

	public final void addLawyer(final Lawyer lawyer) {
		this.lawyers.add(lawyer);
	}
}

