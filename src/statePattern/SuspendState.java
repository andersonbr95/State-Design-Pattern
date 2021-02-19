package statePattern;

public class SuspendState implements State{

	public String toString() {
		return "suspend";
	}

	@Override
	public void engineStatus(Context context) {
		System.out.println("Engines are Idle, conserving power\n");// TODO Auto-generated method stub
		context.setState(this);
	}

	@Override
	public void shipStatus(Context context) {
		System.out.println("Autopilot engaged, smooth sailing from here\n");// TODO Auto-generated method stub
		context.setState(this);// TODO Auto-generated method stub
		
	}
}
