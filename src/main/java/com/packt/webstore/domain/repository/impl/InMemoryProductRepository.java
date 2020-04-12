package com.packt.webstore.domain.repository.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;
import com.packt.webstore.domain.Product;
import com.packt.webstore.domain.repository.ProductRepository;


@Repository
public class InMemoryProductRepository implements ProductRepository{
	
private List<Product> listOfProducts = new ArrayList<Product>();

public InMemoryProductRepository() {
	Product iphone = new Product("P1234","iPhone 5s", new BigDecimal(500));
	iphone.setDescription("Apple iPhone 5s, smartfon z 4-calowym ekranem o rodzielczosci 640x1136 i 8-megapikselowym aparatem");
	iphone.setCategory("Smartfon");
	iphone.setManufacturer("Apple");
	iphone.setUnitsInStock(1000);
	
	Product laptop_dell = new Product("P1235", "Dell Inspiron", new BigDecimal(700));
	laptop_dell.setDescription("Dell Inspiron, 14-calowy laptop (czarny) z procesorem Intel Core 3. generacji");
	laptop_dell.setCategory("Laptop");
	laptop_dell.setManufacturer("Dell");
	laptop_dell.setUnitsInStock(1000);
	
	Product tablet_nexus = new Product("P1236", "Nexus 7" , new BigDecimal(300));
	tablet_nexus.setDescription("Google Nexus 7 jest najlzejszym 7-calowym tabletem z 4-rdzeniowym procesorem Qualcom Snapdragon S4 Pro");
	tablet_nexus.setCategory("Tablet");
	tablet_nexus.setManufacturer("Google");
	tablet_nexus.setUnitsInStock(1000);
	
	listOfProducts.add(iphone);
	listOfProducts.add(laptop_dell);
	listOfProducts.add(tablet_nexus);
}
public List<Product> getAllProducts(){
	return listOfProducts;
}

}
