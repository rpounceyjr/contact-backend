package com.rogerpouncey.contact.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.validation.annotation.Validated;

import javax.persistence.Embeddable;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@Embeddable
public class UserName {

    @NotNull
    @NotEmpty
    private String first;
    private String middle;
    @NotNull
    @NotEmpty
    private String last;

    public UserName() {}
}
