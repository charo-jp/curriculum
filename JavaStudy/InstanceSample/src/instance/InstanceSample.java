package instance;

public class InstanceSample {
	private String firstName;
	private int id = 0;
	private static int staticVarId = 0;
	public InstanceSample(String firstName) {
		this.firstName = firstName;
	}
	public void incrementId() {
        this.id++;
        System.out.println("id: var          = " + this.id);
        InstanceSample.staticVarId++;
        System.out.println("id: static var   = " + InstanceSample.staticVarId);
    }
}
