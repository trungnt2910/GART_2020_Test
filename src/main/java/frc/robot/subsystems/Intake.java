/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

import static frc.robot.Constants.Intake_Consts.*;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

public class Intake extends SubsystemBase 
{
  private final SpeedControllerGroup m_Intake = new SpeedControllerGroup( new WPI_VictorSPX(Intake), 
                                                                          new WPI_VictorSPX(Loader)); 
  public Intake() 
  {
  }
  public void Enable_Intake(final double speed)
  {
    m_Intake.set(speed);
  }
  public void Disable_Intake()
  {
    m_Intake.stopMotor();
  }
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
