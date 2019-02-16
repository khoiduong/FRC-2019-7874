/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.VictorSPX;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.TankDrive_Command;

/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class DriveTrain_subsystem extends Subsystem {
  VictorSPX TopLeftVictor, BottomLeftVictor, TopRightVictor, BottomRightVictor;
  private RobotDrive MainDrive = new RobotDrive(RobotMap.LeftVictor2, RobotMap.RightVictor2);
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  @Override
  public void initDefaultCommand() {
    setDefaultCommand(new TankDrive_Command());
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
  public void TeleopDrive(Joystick Driver, Joystick Driver2){
    MainDrive.tankDrive(Driver.getY(), Driver2.getY());

  }
  public void Stop(){
    MainDrive.drive(0,0);

  }
}
