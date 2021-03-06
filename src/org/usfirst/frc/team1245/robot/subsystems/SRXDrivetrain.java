// Drivetrain controlled by Talon SRX's

package org.usfirst.frc.team1245.robot.subsystems;

import org.usfirst.frc.team1245.robot.commands.MecanumDrivePID;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.RobotDrive;


/**
 *
 */
public class SRXDrivetrain extends Drivetrain {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new MecanumDrivePID());
    }
    
    public SRXDrivetrain(int frontLeft, int rearLeft, int frontRight, int rearRight) {
    	// Initialize the Talon SRX's
        tFrontLeft = new CANTalon(frontLeft);
    	tRearLeft = new CANTalon(rearLeft);
    	tFrontRight = new CANTalon(frontRight);
    	tRearRight = new CANTalon(rearRight);
    	
    	// Initialize the RobotDrive object and invert the left controllers
    	robotDrive = new RobotDrive(tFrontLeft, tRearLeft, tFrontRight, tRearRight);
    	robotDrive.setInvertedMotor(RobotDrive.MotorType.kFrontLeft, true);
    	robotDrive.setInvertedMotor(RobotDrive.MotorType.kRearLeft, true);
    }
}

