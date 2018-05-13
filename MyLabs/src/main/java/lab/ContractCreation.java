package lab;
public class ContractCreation extends Service {
	private String contractName;

	public ContractCreation(
			final ServiceType type, final String name, final String contractName) {
		this.setType(type);
		this.setName(name);
		this.setContractName(contractName);
	}

	public final String getContractName() {
		return contractName;
	}

	public final void setContractName(final String contractName) {
		this.contractName = contractName;
	}
}
