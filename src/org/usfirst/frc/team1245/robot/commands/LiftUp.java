package org.usfirst.frc.team1245.robot.commands;

import org.usfirst.frc.team1245.robot.Robot;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class LiftUp extends CommandGroup {
    
    public  LiftUp() {
        // Add Commands here:
        // e.g. addSequential(new Command1());
        //      addSequential(new Command2());
        // these will run in order.

        // To run multiple commands at the same time,
        // use addParallel()
        // e.g. addParallel(new Command1());
        //      addSequential(new Command2());
        // Command1 and Command2 will run in parallel.

        // A command group will require all of the subsystems that each member
        // would require.
        // e.g. if Command1 requires chassis, and Command2 requires arm,
        // a CommandGroup containing them would require both the chassis and the
        // arm.
    	
	    //if(Robot.gripper.getValue() != DoubleSolenoid.Value.kForward &&
//    	   Robot.lifter.getValue() != DoubleSolenoid.Value.kForward) {
	        addSequential(new ToggleGrip());
		    addSequential(new Wait(0.8));
		    addSequential(new ToggleLift());
	    //}
    }
}