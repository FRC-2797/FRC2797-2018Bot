package org.usfirst.frc2797.KnightsFRC2018v2.commands;

import org.usfirst.frc2797.KnightsFRC2018v2.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class ToggleElevatorLock extends Command {
	private boolean done;
	
	public ToggleElevatorLock() {
		done = false;
	}
	
	protected void execute() {
		Robot.elevator.toggleElevatorLock();
		done = true;
	}
	
	protected boolean isFinished() {
		return done;
	}
}
