package statePattern;

public class PowerDownState implements State{
	
	public String toString() {
		
		return "stop";
	}

	@Override
	public void engineStatus(Context context) {
		System.out.println("Engine is currently not running ");
		context.setState(this);
	}

	@Override
	public void shipStatus(Context context) {
		System.out.println("We'll see you next time for the next adventure.");
		context.setState(this);
		
	}
	
}
