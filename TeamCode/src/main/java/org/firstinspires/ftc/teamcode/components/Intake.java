package org.firstinspires.ftc.teamcode.components;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Intake {
    DcMotorEx intakeM;
    public Intake(HardwareMap h){
        intakeM = h.get(DcMotorEx.class, "intake");

        intakeM.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        intakeM.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        intakeM.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
    }

    public void setIntakePw(double power) {
        intakeM.setPower(power);
    }

    public void stopIntake() {
        intakeM.setPower(0);
    }

}
