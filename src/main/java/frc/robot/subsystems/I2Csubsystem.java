/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.I2C;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.commands.LightSensor;

/**
 * Add your docs here.
 */
public class I2Csubsystem extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  // last three zeros are place holders until we find the rest of the address
  private final I2C i2CReader = new I2C(I2C.Port.kOnboard, 0100000);

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    setDefaultCommand(new LightSensor());
  }

}