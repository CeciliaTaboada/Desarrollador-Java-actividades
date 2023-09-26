package clasetresactividades;

public class strings {

	public static void main(String[] args) {
		// STRINGS
		
		String txt1 = "Hola mundo";
		
		System.out.println(txt1.length());
		
		String txt2= "Hola mundo";
		
		if(txt1.equals(txt2)) {
			System.out.println("Es lo mismo");
		}
		
		System.out.println(txt2.toUpperCase());
		
		String nombreApellido = "Pepito, Flores";
		
		String nombreApellidosSeparado[] = nombreApellido.split(",");
		System.out.println(nombreApellidosSeparado[0]);
		System.out.println(nombreApellidosSeparado[1]);
	
		String muchasPalabras = "casa arbol mandarina naranja";
		
		for(String palabra: muchasPalabras.split(" ")) {
			System.out.println(palabra);
		}
		
		String dosLineas = "La casa. \nHola";
		
		System.out.println(dosLineas);
		
		String txt3 = " Holaaa";
		
		if(txt3.contains("laa")) {
			System.out.println("Si, la contiene");
		}else {
			System.out.println("No la contiene");
		}
	
		if(txt3.toUpperCase().contains("LAA")) {
			System.out.println("Si, la contiene");
		}else {
			System.out.println("No la contiene");
		}
		
		if(txt3.startsWith(" ")) {
			txt3 = txt3.substring(1, txt3.length());
			System.out.println("Si, la contiene " + txt3 );
		}else {
			System.out.println("No la contiene");
		}
		
		//Transformar String a ASCII
		
		byte[] decodeByte = txt1.getBytes();
		
		for(byte letra: decodeByte) {
			System.out.println(letra);
		}
		
	}

}
