package com.github;

import java.io.Console;

/**
 * Title
 * Author jirenhe@wanshifu.com
 * Time 2017/6/20.
 * Version v1.0
 */
public class Camera {

    public void TurnOn() {
        System.out.println("Turning on the camera.");
    }

    public void TurnOff() {
        System.out.println("Turning off the camera.");
    }

    public void Rotate(int degrees) {
        System.out.println("Rotating the camera by " + degrees + " degrees");
    }
}

