package org.usfirst.frc.team2144.robot.commands;

public class ResetEverything extends CommandBase {

	@Override
	protected void initialize() {
		// TODO Auto-generated method stub
		requires(drivetrain);
		requires(armBase);
	}

	@Override
	protected void execute() {
		drivetrain.reset_encoders();
		armBase.reset_encoder();
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
