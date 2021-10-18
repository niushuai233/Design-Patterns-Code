package cc.niushuai.study.designpattern.sixprinciples.lsp;

/**
 * 里式替换原则
 *
 * @author niushuai
 * @date 2021/10/18 13:48:48
 */

class Father {

    public void print() {
        System.out.println("i am father");
    }
}

class Son extends Father {
    @Override
    public void print() {
        System.out.println("i am son");
    }
}

class Daughter extends Father {
    @Override
    public void print() {
        System.out.println("i am daughter");
    }
}

public class Main {

    public static void main(String[] args) {

        Father father = new Father();
        father.print();

        Son son = new Son();
        son.print();

        Daughter daughter = new Daughter();
        daughter.print();
    }
}
