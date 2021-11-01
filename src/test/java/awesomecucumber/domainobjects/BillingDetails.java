package awesomecucumber.domainobjects;

public class BillingDetails {

    public BillingDetails(String billingFirstName, String billingLastName, String billingAddressOne,
                          String billingCity, String billingStateName, String billingZip,
                          String billingEmail) {
        this.billingFirstName = billingFirstName;
        this.billingLastName = billingLastName;
        this.billingAddressOne = billingAddressOne;
        this.billingCity = billingCity;
        this.billingStateName = billingStateName;
        this.billingZip = billingZip;
        this.billingEmail = billingEmail;
    }

    public String getBillingFirstName() {
        return billingFirstName;
    }

    public void setBillingFirstName(String billingFirstName) {
        this.billingFirstName = billingFirstName;
    }

    public String getBillingLastName() {
        return billingLastName;
    }

    public void setBillingLastName(String billingLastName) {
        this.billingLastName = billingLastName;
    }

    public String getBillingAddressOne() {
        return billingAddressOne;
    }

    public void setBillingAddressOne(String billingAddressOne) {
        this.billingAddressOne = billingAddressOne;
    }

    public String getBillingCity() {
        return billingCity;
    }

    public void setBillingCity(String billingCity) {
        this.billingCity = billingCity;
    }

    public String getBillingStateName() {
        return billingStateName;
    }

    public void setBillingStateName(String billingStateName) {
        this.billingStateName = billingStateName;
    }

    public String getBillingZip() {
        return billingZip;
    }

    public void setBillingZip(String billingZip) {
        this.billingZip = billingZip;
    }

    public String getBillingEmail() {
        return billingEmail;
    }

    public void setBillingEmail(String billingEmail) {
        this.billingEmail = billingEmail;
    }

    private String billingFirstName;
    private String billingLastName;
    private String billingAddressOne;
    private String billingCity;
    private String billingStateName;
    private String billingZip;
    private String billingEmail;
}
