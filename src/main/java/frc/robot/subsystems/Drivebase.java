/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

import static frc.robot.Constants.Drive_Consts.*;

public class Drivebase extends SubsystemBase 
{
  private final SpeedControllerGroup m_Left = new SpeedControllerGroup( new WPI_TalonSRX(Left),
                                                                        new WPI_TalonSRX(Left_Encoder));
  private final SpeedControllerGroup m_Right = new SpeedControllerGroup(new WPI_TalonSRX(Right),
                                                                        new WPI_TalonSRX(Right_Encoder));
  private final DifferentialDrive m_Drive = new DifferentialDrive(m_Left, m_Right);
  public Drivebase() 
  {
    m_Drive.setMaxOutput(0.4);
  }
  public void arcadeDrive(final double xSpeed, final double zRotation)
  {
    m_Drive.arcadeDrive(xSpeed, zRotation);
  }
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
