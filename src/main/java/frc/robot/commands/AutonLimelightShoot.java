/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import frc.robot.Constants.AutoConstants;
import frc.robot.Constants.ShooterConstants;
import frc.robot.subsystems.Shooter;
import frc.robot.subsystems.Superstructure;
import frc.robot.subsystems.Superstructure.SuperstructureState;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.CommandBase;

/**
 * An example command that uses an example subsystem.
 */
public class AutonLimelightShoot extends CommandBase {
  @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})
  private final Superstructure mSuperstructure;
  private final Timer mTimer;

  /**
   * Creates a new ExampleCommand.
   *
   * @param subsystem The subsystem used by this command.
   */
  public AutonLimelightShoot(Superstructure superstructure) {
    mSuperstructure = superstructure;
    mTimer = new Timer();
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(superstructure);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
      mTimer.reset();
      mTimer.start();
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    mSuperstructure.shoot(SuperstructureState.LIMELIGHT_SHOOTING);  // make sure to update velocity setpoint

  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
      mSuperstructure.stop();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return mTimer.get() > AutoConstants.kShooterLength;
  }
}
