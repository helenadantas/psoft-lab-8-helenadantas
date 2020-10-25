package formatacao;


public class Controller {
	public Controller( ) {}
	
	public String formatarStr(int valor, String str) {
		Formatacao formatacao = null;
		String retorno = "";
		try {
			if(valor == 1) {
				formatacao = new CaixaAlta(str);
			}
			else if(valor == 2) {
				formatacao = new CaixaBaixa(str);
			}
			else if(valor == 3) {
				formatacao = new Italico(str);
			}
			else if(valor == 4) {
				formatacao = new Negrito(str);
			}
			retorno = formatacao.formatar();
			
	
		}catch(Exception e) {
			System.out.println("Valor invalido");
		}
		return retorno;

	}
}
