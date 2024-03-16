package frc.robot.subsystems;

import edu.wpi.first.wpilibj.PowerDistribution;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import org.littletonrobotics.junction.Logger;

public class PDH extends SubsystemBase {
    private PowerDistribution pdh = new PowerDistribution(1, PowerDistribution.ModuleType.kRev);
    @Override
    public void periodic() {
        Logger.recordOutput("PDH/voltage", pdh.getVoltage());
        Logger.recordOutput("PDH/TotalCurrent", pdh.getTotalCurrent());
        Logger.recordOutput("PDH/power", pdh.getTotalPower());

        for (int i = 0; i < 24; i++) {
            Logger.recordOutput("PDH/Channel" + i + "Current", pdh.getCurrent(i));
        }
    }
}
