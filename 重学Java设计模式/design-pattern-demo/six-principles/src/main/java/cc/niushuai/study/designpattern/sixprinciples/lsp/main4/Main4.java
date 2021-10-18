package cc.niushuai.study.designpattern.sixprinciples.lsp.main4;

import java.util.HashMap;
import java.util.Map;

/**
 * TODO
 *
 * @author niushuai
 * @date 2021/10/18 15:04:30
 */

class Father {
    public Map<String, Object> run() {

        System.out.println("父类 run ...");
        return new HashMap();
    }
}

class Son extends Father {
    @Override
    public HashMap<String, Object> run() {

        System.out.println("子类 run ...");
        return new HashMap<>();
    }
}

public class Main4 {

    public static void main(String[] args) {

        System.out.println("父类结果");
        Father father = new Son();
        father.run();

        System.out.println("子类结果");
        Son son = new Son();
        son.run();
    }
}
