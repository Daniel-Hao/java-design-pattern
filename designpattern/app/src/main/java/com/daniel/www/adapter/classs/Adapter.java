package com.daniel.www.adapter.classs;

/**
 * desc:Adapter
 * Author: Daniel
 * Date: 2017-01-05 14:55
 * 适配器模式将某个类的接口转换成客户端期望的另一个接口表示，
 * 目的是消除由于接口不匹配所造成的类的兼容性问题。
 * 主要分为三类：类的适配器模式、对象的适配器模式、接口的适配器模式。
 */
public class Adapter extends Source implements Targetable {

    @Override
    public void method2() {

        System.out.println("this is the targetable method!");
    }

    /**
     * 总结一下三种适配器模式的应用场景：
     * 类的适配器模式：当希望将一个类转换成满足另一个新接口的类时，可以使用类的适配器模式，
     * 创建一个新类，继承原有的类，实现新的接口即可。
     * 对象的适配器模式：当希望将一个对象转换成满足另一个新接口的对象时，
     * 可以创建一个Wrapper类，持有原类的一个实例，在Wrapper类的方法中，调用实例的方法就行。
     * 接口的适配器模式：当不希望实现一个接口中所有的方法时，可以创建一个抽象类Wrapper，
     * 实现所有方法，我们写别的类的时候，继承抽象类即可。
     */


    /**
     * 7种结构型模式：适配器模式、装饰模式、代理模式、外观模式、桥接模式、组合模式、享元模式。
     * 其中对象的适配器模式是各种模式的起源
     */

}
