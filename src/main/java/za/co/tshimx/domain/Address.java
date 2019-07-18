package za.co.tshimx.domain;

/**
 *
 * @author tshimologo
 */
public class Address {
    
    private String streetNo;
    private String streetName;
    private String unitNo;
    private String ComplexName;
    private String suburbName;
    private String cityName;
    private String postalCode;

    public Address(String streetNo, String streetName, String unitNo, String ComplexName, String suburbName, String cityName, String postalCode) {
        this.streetNo = streetNo;
        this.streetName = streetName;
        this.unitNo = unitNo;
        this.ComplexName = ComplexName;
        this.suburbName = suburbName;
        this.cityName = cityName;
        this.postalCode = postalCode;
    }

    public String getStreetNo() {
        return streetNo;
    }

    public void setStreetNo(String streetNo) {
        this.streetNo = streetNo;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getUnitNo() {
        return unitNo;
    }

    public void setUnitNo(String unitNo) {
        this.unitNo = unitNo;
    }

    public String getComplexName() {
        return ComplexName;
    }

    public void setComplexName(String ComplexName) {
        this.ComplexName = ComplexName;
    }

    public String getSuburbName() {
        return suburbName;
    }

    public void setSuburbName(String suburbName) {
        this.suburbName = suburbName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
    
    
}
