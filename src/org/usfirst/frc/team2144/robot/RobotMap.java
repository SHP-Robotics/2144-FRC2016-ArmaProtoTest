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
    public static int fLeftPort = 0;
    public static int fRightPort = 1;
    public static int bLeftPort = 2;
    public static int bRightPort = 3;
    public static int ArmBasePort = 4;
    
    public static int ArmBaseEncoderA = 0;
    public static int ArmBaseEncoderB = 1;
    
	public static int armBaseUp = 1000;
	public static int armBaseDown = 0;
    
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1;
}
