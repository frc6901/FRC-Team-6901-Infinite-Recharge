/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.kinematics.DifferentialDriveKinematics;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide
 * numerical or boolean constants. This class should not be used for any other
 * purpose. All constants should be declared globally (i.e. public static). Do
 * not put anything functional in this class.
 *
 * <p>
 * It is advised to statically import this class (or one of its inner classes)
 * wherever the constants are needed, to reduce verbosity.
 */
public final class Constants {
    public static final int shooterPort1 = 3;
    public static final int shooterPort2 = 2;
    public static final int controllerPort = 0;

    //TODO Modify constants
    public static final class ShooterConstants{
      
      //static constants
      public static final double kAccelGravity = 9.8; //m/s^2
      public static final double kDragCoefficient = 0.5; //predetermined constant
      public static final double kBallMass = 0.141748; //kg
      public static final double kDensityAir = 1.225; //kg/m^3 at 15C, sea level
      public static final double kAreaCross = 0.02482866647; // m^2 of cross section
      public static final double kTerminalVelocity = 14.5823998377; //m/s
      
      //dynamic constants
      public static final double kLaunchHeight = 0.0; //0 m
      public static final double kLaunchAlpha = Math.PI/4.0; //radians from horizontal

      public static final double kFlyWheelRadius = 0.0381; // m;

    }
    //TODO Modify Constants and also change inner classes
    public static final class DriveConstants {
      public static final int kLeftMotor1Port = 1;
      public static final int kLeftMotor2Port = 1;
      public static final int kRightMotor1Port = 2;
      public static final int kRightMotor2Port = 2;
      public static final int kPigeonPort = 0;
  
      public static final int[] kLeftEncoderPorts = new int[]{0, 1};
      public static final int[] kRightEncoderPorts = new int[]{2, 3};
      public static final boolean kLeftEncoderReversed = false;
      public static final boolean kRightEncoderReversed = true;
  
      public static final double kTrackwidthMeters = 0.5842;
      public static final DifferentialDriveKinematics kDriveKinematics =
          new DifferentialDriveKinematics(kTrackwidthMeters);
  
      public static final int kEncoderCPR = 4096;
      public static final double kWheelDiameterMeters = 0.15;
      public static final double kEncoderDistancePerPulse =
          // Assumes the encoders are directly mounted on the wheel shafts
          (kWheelDiameterMeters * Math.PI) / ((double) kEncoderCPR);
  
      public static final boolean kGyroReversed = true;
  
      // These are example values only - DO NOT USE THESE FOR YOUR OWN ROBOT!
      // These characterization values MUST be determined either experimentally or theoretically
      // for *your* robot's drive.
      // The Robot Characterization Toolsuite provides a convenient tool for obtaining these
      // values for your robot.
      public static final double ksVolts = 1.1;
      public static final double kvVoltSecondsPerMeter = .28;
      public static final double kaVoltSecondsSquaredPerMeter = 0.0835;
  
      // Example value only - as above, this must be tuned for your drive!
      public static final double kPDriveVel = .00274;
    }

    public static final class AutoConstants {
      public static final double kMaxSpeedMetersPerSecond = 3;
      public static final double kMaxAccelerationMetersPerSecondSquared = 3;
  
      // Reasonable baseline values for a RAMSETE follower in units of meters and seconds
      public static final double kRamseteB = 2;
      public static final double kRamseteZeta = 0.7;
    }

}