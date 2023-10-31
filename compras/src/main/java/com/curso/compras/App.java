package com.curso.compras;

import com.curso.compras.models.*;

public class App 
{
    public static void main( String[] args )
    {
        //Se instancia una persona
    	Persona nahuel = new Persona("Nahuel", "Ramirez");
    	
    	//Se crean los descuentos
    	DescuentoFijo descuento1 = new DescuentoFijo();
    	descuento1.setValorDescuento(14);
    	
    	DescuentoPorcentaje descuento2 = new DescuentoPorcentaje();
    	descuento2.setValorDescuento(0.3);
    	
    	//Se instancian 3 productos
    	Producto harina = new Producto("Harina", 100.0);
    	Producto roastBeef = new Producto("Roast Beef", 1250.5);
    	Producto leche = new Producto("Leche", 250.5);
    	
    	//Instancio 3 items carrito
    	ItemCarrito item1 = new ItemCarrito(harina, 3);
    	ItemCarrito item2 = new ItemCarrito(roastBeef, 1);
    	ItemCarrito item3 = new ItemCarrito(leche, 3);
    	
    	//Instancio un carrito
    	
    	Carrito carrito = new Carrito(nahuel);
    	
    	carrito.setItem1(item1);
    	carrito.setItem2(item2);
    	carrito.setItem3(item3);
    	
    	System.out.println("Costo final del carrito sin descuento = "+carrito.getCostoFinal());
    	
    	System.out.println("Costo final del carrito con descuento fijo = "+carrito.getCostoFinal(descuento1));
    	System.out.println("Costo final del carrito con descuento con porcentaje = "+carrito.getCostoFinal(descuento2));
    	
    }
}
