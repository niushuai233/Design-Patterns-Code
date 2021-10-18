package cc.niushuai.study.designpattern.sixprinciples.dip;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * TODO
 *
 * @author niushuai
 * @date 2021/10/18 17:23:19
 */

class AShop {}
class BShop {}

@Data
@AllArgsConstructor
class Customer {
    private String name;
    public void shopping(AShop shop) {
        System.out.println(this.getName() + " 在 aShop shopping ...");
    }

    public void shopping(BShop shop) {
        System.out.println(this.getName() + " 在 bShop shopping ...");
    }
}

public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer("张三");

        customer.shopping(new AShop());
        customer.shopping(new BShop());
    }
}
