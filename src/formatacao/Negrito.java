package formatacao;

public class Negrito implements Formatacao{
	private String str;
	
	public Negrito(String str) {
		this.str = str;
	}
	
	@Override
	public String formatar() {
		String retorno = "\033[1m" + str + "\033[1m";
		return retorno;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}
	
	
}
