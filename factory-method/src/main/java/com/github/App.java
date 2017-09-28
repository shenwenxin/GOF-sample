package com.github;

/**
 ** 意图
 * 定义一个用于创建对象的接口，让子类决定实例化哪一个类。FactoryMethod使一个类的实例化延迟到其子类。
 *
 * 适用性
 * 当一个类不知道它所必须创建的对象的类的时候。
 * 当一个类希望由它的子类来指定它所创建的对象的时候。
 * 当类将创建对象的职责委托给多个帮助子类中的某一个，并且你希望将哪一个帮助子类是代理者这一信息局部化的时候。
 **
 */
public class App 
{
    public static void main( String[] args )
    {
        Vehicle vehicle = new BenzVehicleFactory().getVehicle();
        vehicle.run();
        vehicle = new BmwVehicleFactory().getVehicle();
        vehicle.run();
    }
}
