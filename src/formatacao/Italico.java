package formatacao;

public class Italico implements Formatacao{

	private String str;
	
	public Italico(String str) {
		this.str = str;
	}
	
	@Override
	public String formatar() {
		String retorno = "\033[3m" + str + "\033[0m";
		return retorno;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}
	
	
}
