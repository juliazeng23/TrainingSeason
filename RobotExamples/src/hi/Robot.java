package hi;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Scheduler;

public class Robot extends IterativeRobot {
	public void robotInit() {
		drive = new Drive();
	}
	public void autonomousInit() {}

	public void autonomousPeriodic() {
		Scheduler.getInstance().run();
	}

	public void teleopInit() {}

	public void teleopPeriodic() {}
	
	public static Drive drive;
	
	

}
