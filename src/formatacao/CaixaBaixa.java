package formatacao;

public class CaixaBaixa implements Formatacao{

	private String str;
	
	public CaixaBaixa(String str) {
		this.str = str;
	}
	
	@Override
	public String formatar() {
		String retorno = str.toLowerCase();
		return retorno;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}
	
	
}
