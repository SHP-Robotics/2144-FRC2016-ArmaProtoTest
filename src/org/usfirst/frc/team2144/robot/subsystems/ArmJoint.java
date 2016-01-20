package org.usfirst.frc.team2144.robot.subsystems;

import org.usfirst.frc.team2144.robot.RobotMap;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.PIDSubsystem;

public class ArmJoint extends PIDSubsystem {

	Encoder encoder;
	Talon controller;

	public ArmJoint() {
		super(1, 1, 1);
		encoder = new Encoder(RobotMap.ArmJointEncoderA, RobotMap.ArmJointEncoderB);
		controller = new Talon(RobotMap.ArmJointPort);
	}

	protected double returnPIDInput() {
		return encoder.get();
	}

	protected void usePIDOutput(double output) {
		controller.set(output);
	}

	protected void initDefaultCommand() {
	}

}
