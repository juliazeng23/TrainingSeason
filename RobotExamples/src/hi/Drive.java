package hi;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Drive extends Subsystem {
	private Talon left = new Talon(0);
	
	private Talon right = new Talon(1);
	
	private RobotDrive drive = new RobotDrive(left, right);
	
	public void drive(double y, double x) {
		drive.arcadeDrive(y, x);
	}


}
