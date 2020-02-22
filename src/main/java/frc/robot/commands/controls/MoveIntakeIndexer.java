package frc.robot.commands.controls;

import edu.wpi.first.wpilibj2.command.ParallelCommandGroup;
import frc.robot.Constants;
import frc.robot.subsystems.Indexer;
import frc.robot.subsystems.Intake;

public class MoveIntakeIndexer extends ParallelCommandGroup {
    public MoveIntakeIndexer(Intake intake, Indexer indexer) {
        super.addCommands(
            new MoveIntake(intake, Constants.SPEED_INTAKE, 1),
            new MoveIndexer(indexer, Constants.SPEED_INDEXER, 1)
        );
    }
}