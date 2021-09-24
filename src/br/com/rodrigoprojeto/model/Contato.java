package br.com.rodrigoprojeto.model;

import java.util.Objects;

public class Contato {

    private Long id;
    private String name;
    private String email;
    private String phoneNumber;
    private String smartPhone;
    private String instagram;


    public Contato(){

    }

    public Contato(Long id, String name, String email, String phoneNumber, String smartPhone, String instagram) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.smartPhone = smartPhone;
        this.instagram = instagram;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getSmartPhone() {
        return smartPhone;
    }

    public void setSmartPhone(String smartPhone) {
        this.smartPhone = smartPhone;
    }

    public String getInstagram() {
        return instagram;
    }

    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contato contato = (Contato) o;
        return Objects.equals(id, contato.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


    @Override
    public String toString() {
        return "Contato{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", smartPhone='" + smartPhone + '\'' +
                ", instagram='" + instagram + '\'' +
                '}';
    }
}
