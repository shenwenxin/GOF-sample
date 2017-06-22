package com.github;

/**
 * Title
 * Author jirenhe@wanshifu.com
 * Time 2017/6/22.
 * Version v1.0
 */
public class RefinedAbstraction extends Abstraction{

    public RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void doSomething() {
        implementor.operation();
    }
}
