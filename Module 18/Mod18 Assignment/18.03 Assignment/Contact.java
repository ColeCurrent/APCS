
/**
 * Write a description of class Contact here.
 *
 * @author Cole Current
 * @version 5/18/2020
 */
public class Contact
{
    private String name;
    private String relation;
    private String bday;
    private String phone;
    private String email;

    public Contact(String name, String relation, String bday, String phone, String email) {
        this.name = name;
        this.relation = relation;
        this.bday = bday;
        this.phone = phone;
        this.email = email;
    }

    public String toString() {
        return String.format("%12s%14s%10s%19s%24s", this.name, this.relation, this.bday, this.phone, this.email);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }

    public String getBday() {
        return bday;
    }

    public void setBday(String bday) {
        this.bday = bday;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
