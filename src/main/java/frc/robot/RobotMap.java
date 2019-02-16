/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
import com.ctre.phoenix.motorcontrol.can.VictorSPX;



public class RobotMap {
  public static VictorSPX LeftVictor1;
  public static VictorSPX LeftVictor2;
  public static VictorSPX RightVictor1;
  public static VictorSPX RightVictor2;
public RobotMap() {
  LeftVictor1 = new VictorSPX(1);
  LeftVictor2 = new VictorSPX(2);
  RightVictor1 = new VictorSPX(3);
  RightVictor2 = new VictorSPX(4);

  LeftVictor1.follow(LeftVictor2);
  RightVictor1.follow(RightVictor2);

}

  // For example to map the left and right motors, you could define the
  // following variables to use with your drivetrain subsystem.
  // public static int leftMotor = 1;
  // public static int rightMotor = 2;

  // If you are using multiple modules, make sure to define both the port
  // number and the module. For example you with a rangefinder:
  // public static int rangefinderPort = 1;
  // public static int rangefinderModule = 1;
}
