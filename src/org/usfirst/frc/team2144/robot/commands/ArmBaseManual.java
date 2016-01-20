package org.usfirst.frc.team2144.robot.commands;

import org.usfirst.frc.team2144.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

public class ArmBaseManual extends CommandBase {

	public ArmBaseManual() {
	}

	@Override
	protected void initialize() {
		requires(armBase);
		armBase.enable();
		armBase.setAbsoluteTolerance(0.2);
	}

	@Override
	protected void execute() {
		armBase.setSetpointRelative(oi.getStick2Y());
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
