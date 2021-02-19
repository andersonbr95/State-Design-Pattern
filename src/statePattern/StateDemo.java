package statePattern;


public class StateDemo {
	public static void main(String[] args) {
		Context context = new Context();
		
		BeginState beginSpaceShip = new BeginState();
		beginSpaceShip.engineStatus(context);
		beginSpaceShip.shipStatus(context);

		
		SuspendState suspendEngine = new SuspendState();
		suspendEngine.engineStatus(context);
		suspendEngine.shipStatus(context);

		
		PowerDownState byeSpaceShip = new PowerDownState();
		byeSpaceShip.engineStatus(context);
		byeSpaceShip.shipStatus(context);

	}
}
