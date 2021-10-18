package cc.niushuai.study.designpattern.sixprinciples.lsp.main3;

import java.util.HashMap;
import java.util.Map;

/**
 * TODO
 *
 * @author niushuai
 * @date 2021/10/18 14:49:12
 */

class Father {

    public void run(HashMap<String, Object> hashMap) {
        System.out.println("父类 run...");
    }
}

class Son extends Father {

    // @Override 此处不能声明 override
    public void run(HashMap<String, Object> map) {
        System.out.println("子类 run...");
    }
}

public class Main3 {

    public static void main(String[] args) {

        HashMap<String, Object> map = new HashMap<>();

        System.out.println("父类结果");
        Father father = new Father();
        father.run(map);

        System.out.println("子类结果");
        Son son = new Son();
        son.run(map);
    }
}
