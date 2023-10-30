package com.CalculadoraTests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculadoraTest {
	
	@SuppressWarnings("deprecation")
	@Test
	public void dadoDosNumerosQueSeSuman_ElResultadoEsperadoEs() {
		double numero1 = 950;
		double numero2 = 9867;
		
		double resultado = 10817;
		
		assertEquals(resultado, Calculadora.sumar(numero1, numero2));
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void dadoDosNumerosQueSeRestan_ElResultadoEsperadoEs() {
		double numero1 = 9867;
		double numero2 = 950;
		
		double resultado = 8917;
		
		assertEquals(resultado, Calculadora.restar(numero1, numero2));
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void dadoDosNumerosQueSeMultiplican_ElResultadoEsperadoEs() {
		double numero1 = 9867;
		double numero2 = 950;
		
		double resultado = 9373650;
		
		assertEquals(resultado, Calculadora.restar(numero1, numero2));
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void dadoDosNumerosQueSeDividen_ElResultadoEsperadoEs() {
		double numero1 = 9867;
		double numero2 = 950;
		
		double resultado = 10.3863157895;
		
		assertEquals(resultado, Calculadora.restar(numero1, numero2));
	}
	

}
