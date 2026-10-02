package org.firstinspires.ftc.teamcode.teleop;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;

import org.firstinspires.ftc.teamcode.components.Intake;

import com.arcrobotics.ftclib.gamepad.GamepadEx;
import com.arcrobotics.ftclib.gamepad.GamepadKeys;
import com.arcrobotics.ftclib.gamepad.ToggleButtonReader;

public class Main extends OpMode {

    Intake intake;

    @Override
    public void init() {
        intake = new Intake(hardwareMap);

//       ToggleButtonReader imuReader = new ToggleButtonReader(new GamepadEx(gamepad1), GamepadKeys.Button.A);
    }

    @Override
    public void loop() {
        if(gamepad1.right_trigger>0.02){
            intake.setIntakePw(1);
        }
    }
}
