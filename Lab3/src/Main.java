public class Main {
	public static void main(String[] args) {
		LawFirmManager Manager = new LawFirmManager();
		Lawyer Sergij = new Lawyer("Sergij", ServiceType.AplicationFormCreating, ServiceType.ContractCreation,
				ServiceType.CourtRepresentation);
		Lawyer Max = new Lawyer("Max", ServiceType.AplicationFormCreating, ServiceType.ContractCreation);
		Lawyer John = new Lawyer("John", ServiceType.CourtRepresentation);
		Manager.addLawyer(John);
		Manager.addLawyer(Max);
		Manager.addLawyer(Sergij);
		for (Lawyer lawyer : Manager.lawyerSortByName(
				Manager.lawyerSearch(ServiceType.AplicationFormCreating, ServiceType.ContractCreation)))
			System.out.println(lawyer.getName());
	}
}
