package com.tw.academy.basic.$7_long_method;

/**
 * This class is a example for bad smell;
 *
 * @author  Thoughtworks
 * @version 1.0
 * @since   2018-1-1
 */
public class OrderReceipt {
    public static final String RECEIPT_HEADER = "======Printing Orders======\n";
    public static final double TAX_RATE = .10;
    public static final String SALES_TAX_TITLE = "Sales Tax";
    public static final String TOTAL_AMOUNT_TITLE = "Total Amount";
    public static final char SEPARATOR_SYMBOL = '\t';
    public static final char LINE_ITEM_SEPARATOR = '\n';
    private Order order;

    public OrderReceipt(Order order) {
        this.order = order;
    }

    public String getReceiptString() {
        StringBuilder receiptString = new StringBuilder();

        generateBasicInfo(receiptString);

        double totalSalesTax;
        double totalSales = 0d;
        double totalAmountWithTax;
        for (LineItem lineItem : order.getLineItems()) {
            generateLineItemInfo(receiptString, lineItem);
            totalSales += lineItem.totalAmount();
        }
        totalSalesTax = totalSales * TAX_RATE;
        totalAmountWithTax = totalSales + totalSalesTax;
        receiptString.append(SALES_TAX_TITLE).append(SEPARATOR_SYMBOL).append(totalSalesTax);
        receiptString.append(TOTAL_AMOUNT_TITLE).append(SEPARATOR_SYMBOL).append(totalAmountWithTax);
        return receiptString.toString();
    }

    private void generateBasicInfo(StringBuilder receiptString) {
        receiptString.append(RECEIPT_HEADER);
        receiptString.append(order.getCustomerName());
        receiptString.append(order.getCustomerAddress());
    }

    private void generateLineItemInfo(StringBuilder receiptString, LineItem lineItem) {
        receiptString.append(lineItem.getDescription());
        receiptString.append(SEPARATOR_SYMBOL);
        receiptString.append(lineItem.getPrice());
        receiptString.append(SEPARATOR_SYMBOL);
        receiptString.append(lineItem.getQuantity());
        receiptString.append(SEPARATOR_SYMBOL);
        receiptString.append(lineItem.totalAmount());
        receiptString.append(LINE_ITEM_SEPARATOR);
    }
}
