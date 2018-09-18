import java.util.ArrayList;

public class ControleCadastro {
	private ViewCadastro viewCadastro;
	private ArrayList<Pessoa> agenda = new ArrayList<Pessoa>();

	public ControleCadastro() {
		viewCadastro = new ViewCadastro();
		trataMenu();
	}

	private void trataMenu() {
		boolean continuar = true;
		do {
			String opc = viewCadastro.mostraMenu();

			switch (opc) {
			case "1":
				 agenda.add(viewCadastro.inserir());
				break;
			case "2":
				viewCadastro.listar(agenda);
				break;
			case "3":
				viewCadastro.alterar(agenda);
				break;
			case "4":
				viewCadastro.excluir(agenda);
				break;
			case "5":
				viewCadastro.pesquisar(agenda);
				break;
			case "6":
				System.out.println("Programa Encerrado!! Tenha um �timo dia!");
				continuar = false;
				break;
			default:
				System.out.println("Op��o inv�lida");
				break;
			}
		} while (continuar);
	}

}
