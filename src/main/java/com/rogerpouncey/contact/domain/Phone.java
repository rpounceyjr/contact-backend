package com.rogerpouncey.contact.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


@Data
@AllArgsConstructor
@Entity
public class Phone {
    @Id
    @GeneratedValue
    Long phoneId;

    @NotNull
    @NotBlank
    private String number;

    @NotNull
    @NotBlank
    private String type;

    public Phone() {}

    public Long getPhoneId() {
        return phoneId;
    }

    public void setPhoneId(Long phoneId) {
        this.phoneId = phoneId;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {

        if(type.toLowerCase() != "cell" || type.toLowerCase() != "home" || type.toLowerCase() != "work") {
            this.type = "home";
        }
        else this.type = type;
        }
    }

