package numeroPerfecto;
import java.util.*;
public class numero_perfecto {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int numero,perfecto;
		perfecto=0;
		System.out.println("Ingresa el numero");
		numero=sc.nextInt();
		for(int x=2;x<=numero;x++) {
			if(numero%x==0) {
				perfecto=perfecto+(numero/x);
			}
		}
		/*while(x<=numero) {
			if(numero%x==0) {
				perfecto=perfecto+(numero/x);
			}
			x=x+1;
		}*/
		if(perfecto==numero) {
			System.out.println("El numero "+numero+" es perfecto");
		}
		else {
			System.out.println("El numero "+numero+" no es perfecto");
		}
	}
}
