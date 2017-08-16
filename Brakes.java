
public class Brakes implements LeftFrontBrake, RightFrontBrake, LeftRearBrake, RightRearBrake {
	
	public void pushLeftFrontBrake() {
		System.out.println("Left Front brake is pushed.");
		
	}
	public void pushRightFrontBrake() {
		System.out.println("Right Front brake is pushed");
	}
	public void pushLeftRearBrake() {
		System.out.println("Left Rear brake is pushed");
	}
	public void pushRightRearBrake() {
		System.out.println("Right Rear brake is pushed");
	}
	public void pushAllBrakes() {
		pushLeftFrontBrake();
		pushRightFrontBrake();
		pushLeftRearBrake();
		pushRightRearBrake();
		
	}

}
