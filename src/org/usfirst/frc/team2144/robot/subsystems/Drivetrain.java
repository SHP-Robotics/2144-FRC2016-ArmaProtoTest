
package org.usfirst.frc.team2144.robot.subsystems;

import org.usfirst.frc.team2144.robot.RobotMap;
import org.usfirst.frc.team2144.robot.commands.GatorDrive;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Drivetrain extends Subsystem {

	// Put methods for controlling this subsystem
	// here. Call these from Commands.

	public RobotDrive robit;
	public Talon fLeft, fRight, bLeft, bRight;

	public Drivetrain() {
		fLeft = new Talon(RobotMap.fLeftPort);
		fRight = new Talon(RobotMap.fRightPort);
		bLeft = new Talon(RobotMap.bLeftPort);
		bRight = new Talon(RobotMap.bRightPort);
		robit = new RobotDrive(fLeft, bLeft, fRight, bRight);
	}

	public void arcadeDrive(boolean isPrecise, double stickX, double stickY) {
		if (isPrecise)
			robit.arcadeDrive(stickY, stickX);
		else
			robit.arcadeDrive(stickY / 2, stickX / 2);
	}

	public void tankDrive(boolean isPrecise, double leftStickY, double rightStickY) {
		if (isPrecise)
			robit.tankDrive(leftStickY, rightStickY);
		else
			robit.tankDrive(leftStickY / 2, rightStickY / 2);
	}

	public void initDefaultCommand() {
		setDefaultCommand(new GatorDrive());
	}
}
