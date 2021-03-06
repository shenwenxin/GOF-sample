package com.github;

import java.util.Arrays;

/**
 * Title
 * Author jirenhe@wanshifu.com
 * Time 2017/6/22.
 * Version v1.0
 *
 * —在组合中表示叶节点对象，叶节点没有子节点。
 * —在组合中定义图元对象的行为。
 */
public class Leaf implements Component {

    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void add(Component component) {

    }

    @Override
    public void remove(Component component) {

    }

    @Override
    public void display() {
        this.display(0);
    }

    @Override
    public void display(int level) {
        char[] chars = new char[level];
        Arrays.fill(chars, '-');
        System.out.println(new String(chars) + this.name);
    }
}
