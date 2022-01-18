package com.training.spring.employee.models;


public class Employee {

    private String username;
    private String name;
    private String surname;
    private int    amount;

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

    public int getAmount() {
        return this.amount;
    }

    public void setAmount(final int amountParam) {
        this.amount = amountParam;
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
               + this.amount
               + "]";
    }


}
