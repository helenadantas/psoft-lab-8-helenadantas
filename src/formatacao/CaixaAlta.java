package formatacao;

public class CaixaAlta implements Formatacao{

	private String str;
	
	public CaixaAlta(String str) {
		this.str = str;
	}
	
	@Override
	public String formatar() {
		String retorno = str.toUpperCase();
		return retorno;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}
	
	
}
