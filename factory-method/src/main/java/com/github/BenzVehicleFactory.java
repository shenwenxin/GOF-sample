package com.github;

/**
 * Title
 * Author jirenhe@wanshifu.com
 * Time 2017/6/19.
 * Version v1.0
 */
public class BenzVehicleFactory implements VehicleFactory{

    public Vehicle getVehicle() {
        return new Benz();
    }
}
