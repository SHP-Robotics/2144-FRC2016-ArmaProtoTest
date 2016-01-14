package org.usfirst.frc.team2144.robot.commands;

import org.usfirst.frc.team2144.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

public class ArmBaseUp extends CommandBase {

	public ArmBaseUp() {
	}

	@Override
	protected void initialize() {
		requires(armBase);
		armBase.enable();
		armBase.setAbsoluteTolerance(2);
	}

	@Override
	protected void execute() {
		armBase.setSetpoint(RobotMap.armBaseUp);
	}

	@Override
	protected boolean isFinished() {
		return false;
	}

	@Override
	protected void end() {
		
	}

	@Override
	protected void interrupted() {

	}

}
