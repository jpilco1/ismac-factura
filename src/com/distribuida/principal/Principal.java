package com.distribuida.principal;

import java.util.Date;

import com.distribuida.entities.Clientes;
import com.distribuida.entities.Factura;
import com.distribuida.entities.Producto;


public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Clientes cliente = new Clientes();
		cliente.setIdCliente(1);
		cliente.setCedula("1755378385");
		cliente.setNombre("jimmy");
		cliente.setApellido("Pilco");
		cliente.setEdad(99);
		cliente.setFechaNacimiento(new Date());
		cliente.setDireccion("Tumbaco");
		cliente.setTelefono("0968241486");
		cliente.setCorreo("jimmy910@gmail.com");
		
		Clientes cliente2 =new Clientes();
		
		cliente2.setIdCliente(2);
		cliente2.setCedula("0632548529");
		cliente2.setNombre("Manuel");
		cliente2.setApellido("Tituaña");
		cliente2.setEdad(56);
		cliente2.setFechaNacimiento(new Date());
		cliente2.setDireccion("Calderon");
		cliente2.setTelefono("0987383043");
		cliente2.setCorreo("manuel_titu@gmail.com");
		
		Clientes cliente3 = new Clientes ();
		
		cliente3.setIdCliente(3);
		cliente3.setNombre("Maria");
		cliente3.setApellido("Cueva");
		cliente3.setCedula("1710454905");
		cliente3.setEdad(53);
		cliente3.setCorreo("maria05@gmail.com");
		cliente3.setDireccion("Carapungo");
		cliente3.setFechaNacimiento(new Date());
		cliente3.setTelefono("0992973387");
		
		Producto producto =new Producto();
		
		producto.setIdProducto(1);
		producto.setNombre("Manzana");
		producto.setDescripcion("Caja de Manzanas");
		producto.setPrecio(25.30);
		producto.setStock(100);
		
		Factura factura =new Factura();
		
		factura.setIdFactura(1);
		factura.setNumFactura("FAC-0001");
		factura.setFecha(new Date());
		factura.setTotalNeto(56.32);
		factura.setIva(0.12);
		factura.setTotal(60.15);
		
		//inyeccion de dependencias
		factura.setCliente(cliente);
		
		//impresion
		System.out.println(factura.toString());
		
		Producto producto2 = new Producto();
		
		producto.setIdProducto(2);
		producto.setNombre("Pera");
		producto.setDescripcion("funda de 12 unit");
		producto.setPrecio(15.12);
		producto.setStock(50);
		
		
		Factura factura2 = new Factura();
		factura2.setCliente(cliente2);
		factura2.setFecha(new Date());
		factura2.setIdFactura(2);
		factura2.setNumFactura("FAC-0002");
		factura2.setTotalNeto(30.25);
		factura2.setIva(0.12);
		factura2.setTotal(33.88);
		
		
		//inyeccion de dependencias
		factura2.setCliente(cliente2);
		
		//impresion 
		System.out.println(factura2.toString());
		
		Producto producto3 = new Producto();
		
		producto3.setIdProducto(3);
		producto3.setNombre("Piña");
		producto3.setDescripcion("Carton de Piña");
		producto3.setPrecio(30.25);
		producto3.setStock(45);
		
		Factura factura3 = new Factura();
		
		factura3.setCliente(cliente3);
		factura3.setIdFactura(3);
		factura3.setFecha(new Date());
		factura3.setNumFactura("FAC-0003");
		factura3.setTotalNeto(46.35);
		factura3.setIva(0.12);
		factura3.setTotal(51.91);
		
		//inyeccion de dependencias
		
		factura3.setCliente(cliente3);
		
		//impresion
		
		System.out.println(factura3.toString());

}
	}
