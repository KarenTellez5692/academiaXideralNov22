package introLambda;

public class Principal {

	public static void main(String[] args) {
		int x = 8;
		int y = 4;
		Operacion ope1 = new Suma();
		int resultado = ope1.ejecuta(x, y);
		System.out.println(resultado);
		
		Operacion ope2 = (r,v) -> r-v;
		resultado = ope2.ejecuta(x, y);
		System.out.println(resultado);
		
		Operacion ope3 = (r,v) -> r*v;
		resultado = ope3.ejecuta(x, y);
		System.out.println(resultado);
		
		Operacion ope4 = (r,v) -> r/v;
		resultado = ope4.ejecuta(x, y);
		System.out.println(resultado);
		
		Operacion ope5 = (r,v) -> r+v;
		resultado = ope5.ejecuta(x, y);
		System.out.println(resultado);
		
	}

}
