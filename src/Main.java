public class Main {
	public static void main(String[] args){
		Gerente Patrao = new Gerente();
		Patrao.setNome("José");
		Patrao.setHorarioTrabalho(8);
		Patrao.setCPF(123);
		Patrao.setAnoInicioEmpresa(2000);
		Patrao.obterInformacoesFuncionario();
		Patrao.temInsalubridade();
		System.out.println(Patrao.obterInformacoesFuncionario());
		System.out.println(Patrao.temInsalubridade());
		
		OperadorMaquina Operador = new OperadorMaquina();
		Operador.setNome("Pedro");
		Operador.setHorarioTrabalho(10);
		Operador.setCPF(122);
		Operador.setAnoInicioEmpresa(2000);
		Operador.obterInformacoesFuncionario();
		Operador.temInsalubridade();
		System.out.println(Operador.obterInformacoesFuncionario());
		System.out.println(Operador.temInsalubridade());
		
		EngenheiroEletrico Eletrico = new EngenheiroEletrico();
		Eletrico.setNome("Lucas");
		Eletrico.setHorarioTrabalho(9);
		Eletrico.setCPF(111);
		Eletrico.setAnoInicioEmpresa(2005);
		Eletrico.obterInformacoesFuncionario();
		Eletrico.temInsalubridade();
		System.out.println(Eletrico.obterInformacoesFuncionario());
		System.out.println(Eletrico.temInsalubridade());
		
		EngenheiroMecanico Mecanico = new EngenheiroMecanico();
		Mecanico.setNome("Luan");
		Mecanico.setHorarioTrabalho(9);
		Mecanico.setCPF(222);
		Mecanico.setAnoInicioEmpresa(2003);
		Mecanico.obterInformacoesFuncionario();
		Mecanico.temInsalubridade();
		System.out.println(Mecanico.obterInformacoesFuncionario());
		System.out.println(Mecanico.temInsalubridade());
	}
}