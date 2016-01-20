package org.usfirst.frc.team2144.robot.commands;

import org.usfirst.frc.team2144.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

public class ArmBaseDown extends CommandBase {

	public ArmBaseDown() {
	}

	@Override
	protected void initialize() {
		requires(armBase);
		armBase.enable();
		armBase.setAbsoluteTolerance(0.2);
	}

	@Override
	protected void execute() {
		armBase.setSetpoint(RobotMap.armBaseDown);
	}

	@Override
	protected boolean isFinished() {
		return true;
	}

	@Override
	protected void end() {
		
	}

	@Override
	protected void interrupted() {

	}

}
