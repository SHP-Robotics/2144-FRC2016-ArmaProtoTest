package org.usfirst.frc.team2144.robot;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    public static final int fLeftPort = 0;
    public static final int fRightPort = 1;
    public static final int bLeftPort = 2;
    public static final int bRightPort = 3;
    public static final int ArmBasePort = 4;
    
    public static final int ArmBaseEncoderA = 0;
    public static final int ArmBaseEncoderB = 1;
    
    public static final int leftEncPortA = 0;
    public static final int leftEncPortB = 1;
    public static final int rightEncPortA = 2;
    public static final int rightEncPortB = 3;
    
	public static final int armBaseUp = 1000;
	public static final int armBaseDown = 0;
	
	
    
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static final int rangefinderPort = 1;
    // public static final int rangefinderModule = 1;
}
