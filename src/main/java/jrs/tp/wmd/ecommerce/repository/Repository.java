package jrs.tp.wmd.ecommerce.repository;

import java.util.Map;
import java.util.HashMap;
import jrs.tp.wmd.ecommerce.model.Order;
import jrs.tp.wmd.ecommerce.model.Customer;



public class Repository {
	private static Map<Long, Order> orders = new HashMap<>();
	private static Map<Long, Customer> customers = new HashMap<>();
	public static Map<Long, Order> getOrders(){
		return orders;
	}
	
	public static Map<Long, Customer> getCustomers(){
		return customers;
	}
	

}
