package com.training.spring.data;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.training.spring.Customer;

public interface ICustomerDao extends CrudRepository<Customer, Long> {

    List<Customer> findByName(String name);

    List<Customer> findByNameAndSurname(String name,
                                        String surname);

    List<Customer> findByNameAndSurnameOrderByName(String name,
                                                   String surname);

    List<Customer> findByNameIn(List<String> name);

    @Query("select c from Customer c where c.name=?1 and c.surname=?2")
    List<Customer> searchNameSurname(String name,
                                     String surname);

    @Query("select c from Customer c where c.name=:isim and c.surname=:soy")
    List<Customer> searchNameSurname2(@Param("isim") String name,
                                      @Param("soy") String surname);

    @Query(value = "select * from customer c where c.name=:isim and c.surname=:soy", nativeQuery = true)
    List<Customer> searchNameSurname3(@Param("isim") String name,
                                      @Param("soy") String surname);

}
