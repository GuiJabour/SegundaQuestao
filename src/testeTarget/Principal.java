package testeTarget;

import java.util.ArrayList;
import java.util.List;

/*RESPOSTA da questão 2 do Teste*/
public class Principal {

	public static void main(String[] args) {
		int numero = 14;
		int ultimo = 0;
		int i = 2;
		boolean pertence = false;
		
		List<Integer> sequencia = new ArrayList<Integer>();
		sequencia.add(0);
		sequencia.add(1);
		
		while (ultimo < numero) {
			sequencia.add(sequencia.get(i -2) + sequencia.get(i -1));
			ultimo = sequencia.get(i);
			System.out.println(ultimo);
			i++;
		}
		for (Integer integer : sequencia) {
			if (integer == numero) {
				pertence = true;
			}
		}
		
		if (pertence) {
			System.out.println("O número "+ numero +" pertence a sequencia de Fibonacci!");
		}else{
			System.out.println("O número "+ numero +" nao pertence a sequencia de Fibonacci!");
		}
		
	}

}
