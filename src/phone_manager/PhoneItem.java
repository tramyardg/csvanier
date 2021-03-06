package phone_manager;

/**
 *
 * @author RAYMARTHINKPAD
 */
public class PhoneItem {
    PhoneItemUtil util = new PhoneItemUtil();
    
    // empty constructor
    public PhoneItem(){};
    
    // constructor
    public PhoneItem(String name, String phone) {
        this.name = name.trim();
        this.phone = phone.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone.trim();
    }
    
    public void setItem(PhoneItem phoneItem) {
        this.name = phoneItem.name;
        this.phone = phoneItem.phone;
    }
    
    private String name;
    private String phone;
    
    @Override
    public String toString() {
        return String.format("%-15s%s", name, this.util.formatPhone(phone));
    }
}
