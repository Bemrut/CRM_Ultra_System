package org.itstep.j2_16.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "ADRESS") // name of the entity to make a call from the sql criteria and so on
@Table(name = "ADRESS") // name of the table in the DB
public class Adress {
    @Id
    @GeneratedValue
    private int id;
    @Column(name = "first_name")
    private String Name;
    private String City;
    private String fullAdress;
    private String Country;
//    private String passport;
    private String description;

    // hibernate merge can't work without default constructor
    public Adress() {
        System.out.println("empty");
    }

    public Adress(String firstName, String lastName) {
        System.out.println("Constructor call");

        setFirstName(Name);
        setCity(City);

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setFirstName(String Name) {
        this.Name = Name;
        setfullAdress();
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
        setfullAdress();
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String Country){
        this.Country = Country;
        setfullAdress();
    }

    @Column(name = "full_name")
    public String getFullName() {
        return fullAdress;
    }

    public void setfullAdress() {
        this.fullAdress = (Name == null || Name.trim().isEmpty() ? "" : Name + " ")
                + (City == null || City.trim().isEmpty() ? "" : City) + (Country == null || Country.trim().isEmpty() ? "" : Country);
//        description = (StringUtils.isBlank(firstName) ? "" : firstName + " ")
//                + (StringUtils.isBlank(lastName) ? "" : lastName);
    }

//    public String getPassport() {
//        return passport;
//    }
//
//    public void setPassport(String passport) {
//        this.passport = passport;
//    }

    public String getDescription() {
        return description;
    }

    private void setDescription(String description) {
        this.description = description;
    }
}
