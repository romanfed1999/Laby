
public class ContractCreation extends Service {
	private String contractName;

	public ContractCreation(ServiceType type, String name, String contractName) {
		this.setType(type);
		this.setName(name);
		this.contractName = contractName;
		LawFirm.services.add(this);
	}

	public String getContractName() {
		return contractName;
	}

	public void setContractName(String contractName) {
		this.contractName = contractName;
	}
}
