package com.tw.academy.basic.$7_long_method;

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

    public String generateReceiptInfo() {
        StringBuilder receiptInfo = new StringBuilder();
        generateBasicInfo(receiptInfo);
        order.getLineItems().forEach(lineItem -> generateLineItemInfo(receiptInfo, lineItem));
        generateAmountInfo(receiptInfo);
        return receiptInfo.toString();
    }

    private void generateAmountInfo(StringBuilder receiptString) {
        double totalSalesTax;
        double totalSales;
        double totalAmountWithTax;
        totalSales = order.getLineItems().stream().map(LineItem::totalAmount).reduce(Double::sum).orElse(0d);
        totalSalesTax = totalSales * TAX_RATE;
        totalAmountWithTax = totalSales + totalSalesTax;
        receiptString.append(SALES_TAX_TITLE).append(SEPARATOR_SYMBOL).append(totalSalesTax);
        receiptString.append(TOTAL_AMOUNT_TITLE).append(SEPARATOR_SYMBOL).append(totalAmountWithTax);
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
