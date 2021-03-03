package com.rogerpouncey.contact.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

@Validated
@Data
@AllArgsConstructor
@Entity
public class Contact {
    @Id
    @GeneratedValue Long id;
    @Valid
    @Embedded
    @NotNull
    private UserName name;
    @Embedded
    @Valid
    @NotNull
    private Address address;
    @OneToMany(cascade = {CascadeType.ALL})
    @JoinColumn(name = "id", referencedColumnName = "id")

    @NotNull
    private List<@Valid Phone> phone;

    public List<Phone> getPhone() {
        return phone;
    }

    public void setPhone(List<Phone> phone) {
        this.phone = phone;
    }

    @NotBlank
    @Email
    @NotNull
    private String email;

    public Contact() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UserName getName() {
        return name;
    }

    public void setName(UserName name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) { this.email = email; }
}
