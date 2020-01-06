package all_insure;

/**
 *
 * @author Vinh
 */
public class Insurance {
    private int customer_id, insurance_id;
    private String insurance_type;
    double price;

    public Insurance() {
    }

    
    public Insurance(int customer_id, int insurance_id, String insurance_type) {
        this.customer_id = customer_id;
        this.insurance_id = insurance_id;
        this.insurance_type = insurance_type;
    }
    public Insurance(String insurance_type) {
        this.insurance_type = insurance_type;
    }
    
    // setters 
    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public void setInsurance_id(int insurance_id) {
        this.insurance_id = insurance_id;
    }

    public void setInsurance_type(String insurance_type) {
        this.insurance_type = insurance_type;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    
    
    // getters

    public int getCustomer_id() {
        return customer_id;
    }

    public int getInsurance_id() {
        return insurance_id;
    }

    public String getInsurance_type() {
        return insurance_type;
    }

    public double getPrice() {
        return price;
    }
    
    
}
