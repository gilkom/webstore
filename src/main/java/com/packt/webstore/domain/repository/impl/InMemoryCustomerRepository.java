package com.packt.webstore.domain.repository.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import com.packt.webstore.domain.Customer;
import com.packt.webstore.domain.Product;
import com.packt.webstore.domain.repository.CustomerRepository;


@Repository
public class InMemoryCustomerRepository {

private List<Customer> listOfCustomers = new ArrayList<Customer>();
	
public InMemoryCustomerRepository() {
	Customer klientPierwszy = new Customer("C1234", "Jan Kowalski", "Warszawa, Wolska 3/123");
	klientPierwszy.setNoOfOrdersMade(5);
	
	Customer klientDrugi = new Customer("C1235", "Anna Wisniewska","Warszawa, Twarda 12/84");
	klientDrugi.setNoOfOrdersMade(12);
	
	Customer klientTrzeci = new Customer("C1236", "Tomasz Koterski", "£owicz, Warszawska 3/123");
	klientTrzeci.setNoOfOrdersMade(5);
	
	listOfCustomers.add(klientPierwszy);
	listOfCustomers.add(klientDrugi);
	listOfCustomers.add(klientTrzeci);
}
public List<Customer> getAllCustomers(){
	return listOfCustomers;
}
public Customer getCustomerById(String customerId) {
	Customer customerById = null;
	for(Customer customer : listOfCustomers) {
		if(customer!=null && customer.getCustomerId()!=null && customer.getCustomerId().contentEquals(customerId)) {
			customerById = customer;
			break;
		}
	}
	if(customerById == null) {
		throw new IllegalArgumentException("Brak klienta o wskazanym id: " + customerId);
	}
	return customerById;
}

}