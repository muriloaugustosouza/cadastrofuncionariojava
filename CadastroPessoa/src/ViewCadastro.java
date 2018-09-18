import java.util.ArrayList;
import java.util.Scanner;

public class ViewCadastro {
	private Scanner teclado;

	public ViewCadastro() {
		teclado = new Scanner(System.in);
	}

	public String mostraMenu() {
		System.out.println("MENU - CADASTRO FUNCION�RIO");
		System.out.println("1 - Inserir");
		System.out.println("2 - Listar");
		System.out.println("3 - Alterar");
		System.out.println("4 - Excluir");
		System.out.println("5 - Pesquisar");
		System.out.println("6 - Sair");
		System.out.println("Op��o: ");
		return teclado.nextLine();
	}

	public Pessoa inserir() {
		Pessoa umaPessoa = new Pessoa();
		System.out.println("INSERIR");
		System.out.println("Nome: ");
		umaPessoa.setNome(teclado.nextLine());

		System.out.println("Fone: ");
		umaPessoa.setFone(teclado.nextLine());

		System.out.println("PIS: ");
		umaPessoa.setPis(teclado.nextLine());
		
		System.out.println("CPF: ");
		umaPessoa.setCpf(teclado.nextLine());
		return umaPessoa;
	}

	public void listar(ArrayList<Pessoa> agenda) {
		System.out.println("\nLISTA DE FUNCION�RIOS");
		for (int pos = 0; pos < agenda.size(); pos++) {
			System.out.println("Posi��o: " + pos + " : " + agenda.get(pos).toString());
		
		}

	}

	public void alterar(ArrayList<Pessoa> agenda) {
		listar(agenda);
		boolean continuar = true;
		int pos = 0;
		do {
			System.out.println("Digite a posi��o do registro para alterar: ");
			try {
				pos = Integer.parseInt(teclado.nextLine());
				if (pos >= 0 & pos < agenda.size()) {
					continuar = false;
				}else {
					System.out.println("Digite um c�digo v�lido!");
				}
			} catch (Exception e) {
				System.out.println("C�digo digitado inv�lido!!!");
			}
		} while (continuar);
		
		System.out.println("Nome ("+ agenda.get(pos).getNome() +"): ");
		agenda.get(pos).setNome(teclado.nextLine());
		
		System.out.println("Fone ("+ agenda.get(pos).getFone() +"): ");
		agenda.get(pos).setFone(teclado.nextLine());
		
		System.out.println("PIS ("+ agenda.get(pos).getPis() +"): ");
		agenda.get(pos).setPis(teclado.nextLine());
		
		System.out.println("CPF ("+ agenda.get(pos).getCpf() +"): ");
		agenda.get(pos).setCpf(teclado.nextLine());
		
	}
	
	public void excluir(ArrayList<Pessoa> agenda) {
		listar(agenda);
		boolean continuar = true;
		int pos = 0;
		do {
			System.out.println("Digite a posi��o do registro para excluir: ");
			try {
				pos = Integer.parseInt(teclado.nextLine());
				if (pos >= 0 & pos < agenda.size()) {
					continuar = false;
				}else {
					System.out.println("Digite um c�digo v�lido!");
				}
			} catch (Exception e) {
				System.out.println("C�digo digitado inv�lido!!!");
			}
		} while (continuar);
		
		agenda.remove(pos);
		System.out.println("C�digo Funcion�rio Exclu�do");
		
		listar(agenda);
		
			
	}
	
	public void pesquisar(ArrayList<Pessoa> agenda) {
		Pessoa umaPessoa = new Pessoa();
		System.out.println("Digite o nome do funcion�rio: ");
		umaPessoa.setNome(teclado.nextLine());
	
		for(int x = 0; x < agenda.size(); x++)
{
			
			if(agenda.get(x).getNome().equals(umaPessoa.getNome()) ==true)
			{
				System.out.println("Funcion�rio Encontrado!!!");
				System.out.println("Nome ("+ agenda.get(x).getNome()+"):");
				
				System.out.println("Fone ("+ agenda.get(x).getFone()+"):");
				
				System.out.println("PIS ("+ agenda.get(x).getPis()+"):");
				
				System.out.println("CPF ("+ agenda.get(x).getCpf()+"):");
				
			}
		}
	}
	

}
