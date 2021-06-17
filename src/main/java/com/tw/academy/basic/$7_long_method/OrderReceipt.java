package com.tw.academy.basic.$7_long_method;

/**
 * This class is a example for bad smell;
 *
 * @author  Thoughtworks
 * @version 1.0
 * @since   2018-1-1
 */
public class OrderReceipt {
    private Order order;

    public OrderReceipt(Order order) {
        this.order = order;
    }

    public String getReceiptString() {
        StringBuilder receiptString = new StringBuilder();

        receiptString.append("======Printing Orders======\n");
        receiptString.append(order.getCustomerName());
        receiptString.append(order.getCustomerAddress());

        double totalSalesTax;
        double totalSales = 0d;
        double totalAmountWithTax;
        for (LineItem lineItem : order.getLineItems()) {
            receiptString.append(lineItem.getDescription());
            receiptString.append('\t');
            receiptString.append(lineItem.getPrice());
            receiptString.append('\t');
            receiptString.append(lineItem.getQuantity());
            receiptString.append('\t');
            receiptString.append(lineItem.totalAmount());
            receiptString.append('\n');
            totalSales += lineItem.totalAmount();
        }
        totalSalesTax = totalSales * .10;
        totalAmountWithTax = totalSales + totalSalesTax;

        receiptString.append("Sales Tax").append('\t').append(totalSalesTax);

        receiptString.append("Total Amount").append('\t').append(totalAmountWithTax);
        return receiptString.toString();
    }
}
