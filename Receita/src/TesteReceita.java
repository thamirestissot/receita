
public class TesteReceita {

	public static void main(String[] args) {
		IReceita bolo = new ReceitaBolo();
		IReceita bolo = new ReceitaPao();
		System.out.println(bolo.receita());
		
		
	}
	
}
