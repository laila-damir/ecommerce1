package jrs.tp.wmd.ecommerce.ressources;

import java.util.List;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jrs.tp.wmd.ecommerce.service.OrderManagementService;
import jrs.tp.wmd.ecommerce.model.Order;


@Path("/orders")
public class OrderRessource {
		OrderManagementService orderManagementService = new OrderManagementService();
		@GET
		@Produces(MediaType.APPLICATION_JSON)
		public List<Order> getorders(){
			return orderManagementService.getOrders();
		}
		
		@POST
		@Consumes(MediaType.APPLICATION_JSON)
        @Produces (MediaType.APPLICATION_JSON)
		public Order submitOrder(Order order) {
			return orderManagementService. submitOrder (order);
		}
		@PUT
		@Path("/{orderId}")
		@Consumes (MediaType.APPLICATION_JSON)
		@Produces (MediaType.APPLICATION_JSON)
		public Order updateorder (@PathParam(" orderId") long id, Order order) {
			order.setId(id);
			return orderManagementService.updateOrder(order);
		}
		@GET
		@Path("/{orderId}")
		@Produces (MediaType.APPLICATION_JSON)
		public Order getorderDetails (@PathParam( "orderId") long id) {
			return orderManagementService.getOrderDetails(id);
}}
