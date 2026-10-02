package org.firstinspires.ftc.teamcode.components;

import com.arcrobotics.ftclib.controller.PIDController;
import com.arcrobotics.ftclib.controller.PIDFController;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.robotcore.external.navigation.AngleUnit;

public class Shooter {
    DcMotorEx shootM;
    double P,I,D,F;
    double currentVelocity, targetVelocity, shooterError, power;

    PIDFController shooterPID;

    public Shooter(HardwareMap h) {
        shootM = h.get(DcMotorEx.class, "Shooter");

        shootM.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        shootM.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        shootM.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

        shooterPID = new PIDFController(P,I,D,F);
        shooterPID.setIntegrationBounds(-10000000, 10000000);

        targetVelocity = 0;
    }

    public double getCurrentVelocity(){
        double vel = shootM.getVelocity(AngleUnit.RADIANS)*48;
        return vel;
    }


}
