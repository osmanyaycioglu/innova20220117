package com.training.spring.employee.rest.models;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

public class EmployeeRest {

    @NotEmpty
    @Size(min = 6, max = 12)
    private String  username;
    @NotEmpty
    @Size(min = 2, max = 15)
    private String  name;
    @NotEmpty
    @Size(min = 3, max = 20)
    private String  surname;
    @Positive
    @NotNull
    private Integer amount;

    public String getUsername() {
        return this.username;
    }

    public void setUsername(final String usernameParam) {
        this.username = usernameParam;
    }

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

    @Override
    public String toString() {
        return "Employee [username="
               + this.username
               + ", name="
               + this.name
               + ", surname="
               + this.surname
               + ", amount="
               + this.getAmount()
               + "]";
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amountParam) {
        amount = amountParam;
    }

}
