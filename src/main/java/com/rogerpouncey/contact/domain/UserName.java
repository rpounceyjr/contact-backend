package com.rogerpouncey.contact.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Embeddable;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Data
@AllArgsConstructor
@Embeddable
public class UserName {

    @NotNull
    @NotEmpty
    @Pattern(regexp = "\\D*")
    private String first;

    @Pattern(regexp = "\\D*")
    private String middle;

    @NotNull
    @NotEmpty
    @Pattern(regexp = "\\D*")
    private String last;

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getMiddle() {
        return middle;
    }

    public void setMiddle(String middle) {
        this.middle = middle;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public UserName() {}
}
