public class EngenheiroEletrico extends Engenheiro{
	public String Nome;
	public int horarioTrabalho;
	public int CPF;
	public int anoInicioEmpresa;
	
	public String obterInformacoesFuncionario(){
		return "Nome = " +this.Nome+ "CPF = " +this.CPF+ "Cargo = Engenheiro Elétrico ";
	}
	public boolean temInsalubridade(){
		return false;
	}
	
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public int getHorarioTrabalho() {
		return horarioTrabalho;
	}
	public void setHorarioTrabalho(int horarioTrabalho) {
		this.horarioTrabalho = horarioTrabalho;
	}
	public int getCPF() {
		return CPF;
	}
	public void setCPF(int cPF) {
		CPF = cPF;
	}
	public int getAnoInicioEmpresa() {
		return anoInicioEmpresa;
	}
	public void setAnoInicioEmpresa(int anoInicioEmpresa) {
		this.anoInicioEmpresa = anoInicioEmpresa;
	}	
}