package cc.niushuai.study.designpattern.sixprinciples.dip.main1;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * TODO
 *
 * @author niushuai
 * @date 2021/10/18 17:23:19
 */
interface Shop {
    String name();
    String sales();
}

class AShop implements Shop{

    @Override
    public String name() {
        return "AShop";
    }

    @Override
    public String sales() {
        return "铅笔";
    }
}

class BShop implements Shop{

    @Override
    public String name() {
        return "BShop";
    }

    @Override
    public String sales() {
        return "橡皮";
    }
}

@Data
@AllArgsConstructor
class Customer {
    private String name;

    public void shopping(Shop shop) {
        System.out.println(this.getName() + " 在 " + shop.name() + " shopping ... 买" + shop.sales());
    }
}

public class Main1 {
    public static void main(String[] args) {

        Customer customer = new Customer("张三");

        customer.shopping(new AShop());
        customer.shopping(new BShop());
    }
}
