
public class Administrador extends Funcionario implements Autenticavel {
	private int senha;
	
	@Override
	public boolean autentica(int senha) {
		if (senha == this.senha) {
			return true;
		}
		return false;
	}
	
	@Override
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	@Override
	public double getBonificacao() {
		return 500;
	}

}
