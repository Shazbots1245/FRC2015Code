package org.usfirst.frc.team1245.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class SimpleAutonomous extends CommandGroup {
    
    public  SimpleAutonomous(int stagingZone) {
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
        
        //Move 25.4 inches forward to surround the container
        //Don't know whether I can start with the container surrounded
        //addSequential(new DirectionalDrive(0.0, -0.5, 1.0));
        
        // Pick up the container
        addSequential(new LiftUp());
        addSequential(new Wait(1.4));
        
        // Drive forward 22 inches toward the tote
        addSequential(new DirectionalDrive(0.0, -0.5, 1.5));
        
        // Stack the container onto the tote
        addSequential(new Stack());
        addSequential(new Wait(1.4));
        
        // Pick up the tote container stack
        addSequential(new LiftUp());
        addSequential(new Wait(1.4));
        
        switch(stagingZone) {
        case 1:
            // Slide to the left about 35 inches
            addSequential(new DirectionalDrive(-0.5, 0.0, 0.55));
            addSequential(new DirectionalDrive(0.0, 0.7, 1.0));
            break;
        case 2:
            break;
        }
        
        // Drive into the autozone
        addSequential(new DirectionalDrive(-0.5, 0.0, 2.0));
    }
}
