/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

import static frc.robot.Constants.Shoot_Consts.*;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

public class Shooter extends SubsystemBase {
  private final WPI_VictorSPX m_shooter1 = new WPI_VictorSPX(Shooter1);
  private final WPI_VictorSPX m_shooter2 = new WPI_VictorSPX(Shooter2);
  private final SpeedControllerGroup m_Shooter = new SpeedControllerGroup(m_shooter1, m_shooter2);
  public Shooter() 
  {
    m_shooter1.setInverted(true);
  }

  public void Shoot(final double Speed)
  {
    m_Shooter.set(Speed);
  }

  public void Stop()
  {
    m_Shooter.stopMotor();
  }
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
