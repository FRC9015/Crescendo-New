package frc.robot.Commands.Presets;

import edu.wpi.first.wpilibj2.command.Command;
import static frc.robot.RobotContainer.*;

public class PassNotePreset extends Command{
    public PassNotePreset(){
        addRequirements(PIVOT);
    }
 
    @Override
    public void initialize() {
       PIVOT.passNotePreset();
    }
    @Override
    public void execute() {   
    }

    @Override
    public void end(boolean interrupted) {
        PIVOT.intake();
    }   
}
