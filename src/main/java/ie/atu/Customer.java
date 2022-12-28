package ie.atu;

public class Customer extends Person {


    private String customerNumber;
    private boolean mailingList;

    public Customer(String name, String address, String tele_number, boolean mailinglist, String customernumber) {
    }

    public Customer(String name, String address, String tele_Number,String customerNumber, boolean mailingList) {
        super(name,address,tele_Number);
        this.customerNumber = customerNumber;
        this.mailingList = mailingList;
    }



    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public boolean isMailingList() {
        return mailingList;
    }

    public void setMailingList(boolean mailingList) {
        this.mailingList = mailingList;
    }
}
