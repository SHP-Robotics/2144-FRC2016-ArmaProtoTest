package org.usfirst.frc.team2144.robot.commands;

public class ResetEverything extends CommandBase {

	@Override
	protected void initialize() {
		requires(drivetrain);
		requires(armBase);
	}

	@Override
	protected void execute() {
		drivetrain.reset_encoders();
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
