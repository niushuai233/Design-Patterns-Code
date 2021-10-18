package cc.niushuai.study.designpattern.sixprinciples.single.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 人 实体类
 *
 * @author niushuai233
 * @date 2021/10/18 11:31:40
 */
@Data
@AllArgsConstructor
public class People {

    private String name;

    public void doSomething(String something) {
        System.out.println(this.getName() + "要去" + something + "...");
        if (something.equals("吃饭")) {
            System.out.println("吃的早饭");
        } else if (something.equals("跑步")) {
            System.out.println("去公园跑步");
        } else if (something.equals("喝水")) {
            System.out.println("喝的白开水");
        }
    }

    public void eat(String eatType) {
        if ("breakfast".equals(eatType)) {
            System.out.println(this.getName() + "吃早饭...");
        } else if ("lunch".equals(eatType)) {
            System.out.println(this.getName() + "吃午饭...");
        } else if ("dinner".equals(eatType)) {
            System.out.println(this.getName() + "吃晚饭...");
        }
    }

    public void drink(String drinkType) {
        if ("water".equals(drinkType)) {
            System.out.println(this.getName() + "喝白开水...");
        } else if ("cola".equals(drinkType)) {
            System.out.println(this.getName() + "喝可乐...");
        } else if ("wine".equals(drinkType)) {
            System.out.println(this.getName() + "喝白酒...");
        }
    }
}
