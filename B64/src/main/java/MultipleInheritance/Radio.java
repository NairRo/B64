package MultipleInheritance;

public class Radio extends Machine implements Electronics{
	
	@Override
	public void start() {
		System.out.println("Started with ic: " + ic);
	}
	
	@Override
	void volumeController() {
		System.out.println("Controlling volume......");
	}
}
