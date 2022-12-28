package ie.atu;

public class Person {

    private String name;
    private String address;
    private String tele_Number;

    public Person() {

    }

    public Person(String name, String address, String tele_number) {
        this.name = name;
        this.address = address;
        this.tele_Number = tele_number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTele_Number() {
        return tele_Number;
    }

    public void setTele_Number(String tele_Number) {
        this.tele_Number = tele_Number;
    }
}

