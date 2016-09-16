package org.usfirst.frc.team2560.robot.subsystems;

import org.usfirst.frc.team2560.robot.RobotMap;
import org.usfirst.frc.team2560.robot.commands.DriveWithJoysticks;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.TalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveTrain extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	private SpeedController left, right;
	private RobotDrive drive;

	public DriveTrain()
	{
		left = new TalonSRX(RobotMap.left); //might need to change depending on the motor type
		right = new TalonSRX(RobotMap.right);
		
		drive = new RobotDrive (left, right);
	}
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
    	setDefaultCommand(new DriveWithJoysticks());
    }
    public void arcadeDrive(Joystick joy)
    {
    	drive.arcadeDrive(-joy.getY(), -joy.getTwist()/2);
    } //Left open in case arcade mode is decided
//    public void arcadeDrive(double forwardAxis, double twistAxis)
//    {
//    	drive.arcadeDrive(forwardAxis, twistAxis);
//    } Not needed for now, but there for reference or later use
    
    public void tankDrive(double leftAxis, double rightAxis){
    	drive.tankDrive(leftAxis, rightAxis);
    }
    public void stop() {
    	drive.tankDrive(0, 0);
    }
    
//    public void drive(double outputMagnitude, double curve){
//    	drive.drive(outputMagnitude, curve);
//    } Not needed for now, but there for reference or later use
}
