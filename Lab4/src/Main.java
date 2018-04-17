import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		StringManager Manager = new StringManager();
		try {
			Manager.printResult(Manager.textProceed(Manager.inputScaner()));
		}
		catch (IOException exception) {
			
		}
	}

}
