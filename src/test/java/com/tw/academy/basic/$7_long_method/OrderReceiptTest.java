package com.tw.academy.basic.$7_long_method;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;


public class OrderReceiptTest {
    @Test
    public void should_print_customer_information_on_order() {
        Order order = new Order("Mr X", "Chicago, 60601", new ArrayList<LineItem>());
        OrderReceipt receipt = new OrderReceipt(order);

        String output = receipt.generateReceiptInfo();

        assertThat(output).contains("Mr X", "Chicago, 60601");
    }

    @Test
    public void should_print_line_item_and_sales_tax_information() {
        ArrayList<LineItem> lineItems = new ArrayList<LineItem>() {{
            add(new LineItem("milk", 10.0, 2));
            add(new LineItem("biscuits", 5.0, 5));
            add(new LineItem("chocolate", 20.0, 1));
        }};
        OrderReceipt receipt = new OrderReceipt(new Order(null, null, lineItems));

        String output = receipt.generateReceiptInfo();

        assertThat(output).contains(
                "milk\t10.0\t2\t20.0\n",
                "biscuits\t5.0\t5\t25.0\n",
                "chocolate\t20.0\t1\t20.0\n",
                "Sales Tax\t6.5",
                "Total Amount\t71.5"
        );
    }

}
