package be.abis.exb6.test;

import be.abis.exb6.model.Address;
import be.abis.exb6.model.Company;
import be.abis.exb6.model.Person;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ExB6 {

    public static void main(String[] args) {
        Address address = new Address();
        address.setCountry("Belgium");
        address.setStreet("Fabiola avenue");
        address.setNr("110");
        address.setTown("Leuven");
        address.setZipCode("2000");

        Company c1 = new Company();
        c1.setName("Abis");
        c1.setAddress(address);

        Person p1 = new Person();
        p1.setFirstName("Ann");
        p1.setLastName("Smits");
        p1.setCompany(c1);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate birthDate = LocalDate.parse("20.04.1985", dtf);
        p1.setBirthDate(birthDate);

        Person p2 = new Person();
        p2.setFirstName("John");
        p2.setLastName("Doe");
        birthDate = LocalDate.parse("20.04.1966", dtf);
        p2.setBirthDate(birthDate);
        Company c2 = new Company();
        c2.setName("");
        c2.setAddress(null);
        p2.setCompany(c2);

        System.out.println("Person 1 info \n" + p1);
        System.out.println("Person 2 info \n" + p2);

    }

}
