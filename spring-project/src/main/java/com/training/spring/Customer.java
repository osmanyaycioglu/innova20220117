package com.training.spring;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.training.spring.validation.StartWith;

@Entity
//@Table(name = "musteri")
public class Customer {

    @Id
    @GeneratedValue
    @JsonIgnore
    private Long    customerId;

    @NotEmpty
    @Size(min = 2, max = 20, message = "name 2 ile 20 arasında olmalı")
    private String  name;
    @NotEmpty
    @Size(min = 3, max = 25)
    @StartWith("soy:")
    private String  surname;
    @NotNull
    @Max(300)
    @Min(50)
    private Integer height;
    @NotNull
    @Max(250)
    @Min(10)
    private Integer weight;

    // @Fetch(FetchMode.SELECT)
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "customer")
    private Phone phone;


    public String getName() {
        return this.name;
    }

    public void setName(final String nameParam) {
        this.name = nameParam;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(final String surnameParam) {
        this.surname = surnameParam;
    }

    public Integer getHeight() {
        return this.height;
    }

    public void setHeight(final Integer heightParam) {
        this.height = heightParam;
    }

    public Integer getWeight() {
        return this.weight;
    }

    public void setWeight(final Integer weightParam) {
        this.weight = weightParam;
    }

    @Override
    public String toString() {
        return "Customer [name="
               + this.name
               + ", surname="
               + this.surname
               + ", height="
               + this.height
               + ", weight="
               + this.weight
               + "]";
    }

    public Long getCustomerId() {
        return this.customerId;
    }

    public void setCustomerId(final Long customerIdParam) {
        this.customerId = customerIdParam;
    }

    public Phone getPhone() {
        return this.phone;
    }

    public void setPhone(final Phone phoneParam) {
        this.phone = phoneParam;
    }


}
