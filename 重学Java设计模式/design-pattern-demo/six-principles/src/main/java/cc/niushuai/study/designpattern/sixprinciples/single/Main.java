package cc.niushuai.study.designpattern.sixprinciples.single;

import cc.niushuai.study.designpattern.sixprinciples.single.entity.People;

/**
 * 主类
 *
 * @author niushuai
 * @date: 2021/10/18 11:32:55
 */
public class Main {

    public static void main(String[] args) {
        People people = new People("张三");

        // people.doSomething("吃饭");
        // people.doSomething("喝水");
        // people.doSomething("跑步");

        // 吃的动作
        people.eat("breakfast");
        people.eat("dinner");

        // 喝的动作
        people.drink("water");
        people.drink("wine");
    }
}