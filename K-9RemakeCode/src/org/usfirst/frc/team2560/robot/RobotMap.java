package org.usfirst.frc.team2560.robot;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	
	//Speed Controllers = PWM
	public static int left = 0; //Might need to change if the PWM's are different.
	public static int right = 1;
	
	//Joystick = USB
	public static int joystick0 = 0;
	public static int joystick1 = 1; 
}
//For example to map the left and right motors, you could define the
// following variables to use with your drivetrain subsystem.
// public static int leftMotor = 1;
// public static int rightMotor = 2;

// If you are using multiple modules, make sure to define both the port
// number and the module. For example you with a rangefinder:
// public static int rangefinderPort = 1;
// public static int rangefinderModule = 1;