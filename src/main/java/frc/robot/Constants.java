/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants.  This class should not be used for any other purpose.  All constants should be
 * declared globally (i.e. public static).  Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants 
{
    public static final class Drive_Consts
    {
        public static final int Left = 1,
                                Left_Encoder = 2,
                                Right = 3,
                                Right_Encoder = 4;
    }
    public static final class Intake_Consts
    {
        public static final int Intake = 5,
                                Loader = 6;
    }
    public static final class Shoot_Consts
    {
        public static final int Shooter1 = 7,
                                Shooter2 = 8,
                                Slider = 9;
    }
    public static final class Hook
    {
        public static final int Hook = 10;
    }
}
