package org.usfirst.frc.team2560.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    public Joystick joystick0, joystick1;
	
	public OI() {
	joystick0 = new Joystick(RobotMap.joystick0);
	joystick1 = new Joystick(RobotMap.joystick1);
	}
	
	public Joystick getJoystick0() 
	{
    	return joystick0;
	}
	
	public Joystick getJoystick1()
	{
		return joystick1;
	}
}

