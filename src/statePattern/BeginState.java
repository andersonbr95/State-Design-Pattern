package statePattern;

public class BeginState implements State{

	@Override
	public void engineStatus(Context context) {
	System.out.println("Engines moving online\n");
	context.setState(this);// TODO Auto-generated method stub
	}
	
	
	public void shipStatus(Context context) {
		System.out.println("We've been waiting...\n");
		context.setState(this);
	}
	public String toString() {
		return "begin";
	}

}
