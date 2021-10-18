package cc.niushuai.study.designpattern.sixprinciples.lsp.main2;

/**
 * TODO
 *
 * @author niushuai
 * @date 2021/10/18 14:15:05
 */

class Father {
    public void run() {
        System.out.println("father run...");
    }
}

class Son extends Father {

    public void run2() {
        System.out.println("son run 2...");
    }
}

public class Main2 {

    public static void main(String[] args) {

        System.out.println("父类运行结果...");
        Father father = new Father();
        father.run();

        System.out.println("子类运行结果...");
        Son son = new Son();
        son.run();

        System.out.println("子类调用自己的方法结果...");
        son.run2();
    }
}
