package main;

public class Payment {
    private String clientName;
    private String cardNumber;
    private int month;
    private int year;
    private String cvv;

    public String getCustomerName() {
        return clientName;
    }

    public void setCustomerName(String clientName) {
        this.clientName = clientName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }
}
