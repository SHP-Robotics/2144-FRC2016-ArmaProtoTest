package org.usfirst.frc.team2144.robot.subsystems;

import org.usfirst.frc.team2144.robot.RobotMap;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.PIDSubsystem;

/**
 *
 */
public class ArmBase extends PIDSubsystem {

	Talon controller;
	AnalogInput potentiometer;

	// Initialize your subsystem here
	public ArmBase() {
		// Use these to get going:
		// setSetpoint() - Sets where the PID controller should move the system
		// to
		// enable() - Enables the PID controller.
		super(1, 1, 1);
		controller = new Talon(RobotMap.ArmBasePort);
		potentiometer = new AnalogInput(RobotMap.ArmBasePotPort);
	}

	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		// setDefaultCommand(new ArmBaseUp());
	}

	protected double returnPIDInput() {
		// Return your input value for the PID loop
		// e.g. a sensor, like a potentiometer:
		// yourPot.getAverageVoltage() / kYourMaxVoltage;
		return potentiometer.getAverageVoltage();
	}

	protected void usePIDOutput(double output) {
		// Use output to drive your system, like a motor
		controller.set(output);
	}

	public double get_pot() {
		return potentiometer.getAverageVoltage();
	}
}
