package com.rogerpouncey.contact.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import javax.persistence.Embeddable;

@Data
@AllArgsConstructor
@Embeddable
public class UserName {
    private String first;
    private String middle;
    private String last;

    public UserName() {}
}
