import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		ArrayList<String> filmes = new ArrayList<>();
		filmes.add("1 - Adão Negro");
		filmes.add("2 - Pantera Negra: Wakanda pra Sempre");
		filmes.add("3 - Mundo Estranho");
		filmes.add("4 - Ligação Explosiva");
		filmes.add("5 - Força Bruta");
		
		String nome;
		int escolha;

    JOptionPane.showMessageDialog(null, "Olá, seja bem vindo ao CineTech!");
    nome = JOptionPane.showInputDialog(null, "Para começarmos, me informe o seu nome: ");
    JOptionPane.showMessageDialog(null, nome + ", vamos ver quais filmes estão em cartaz?");
    escolha = Integer.parseInt(JOptionPane.showInputDialog(null, filmes + " Digite o número correspondente do filme que deseja assistir!"));
    
    if (escolha == 1)
    	JOptionPane.showMessageDialog(null, "Você escolheu o filme - Adão Negro. Vamos para a escolha da sessão do filme!");
    else if (escolha == 2)
    	JOptionPane.showMessageDialog(null, "Você escolheu o filme - Pantera Negra: Wakanda pra Sempre. Vamos para a escolha da sessão do filme!");
    else if (escolha == 3)
    	JOptionPane.showMessageDialog(null, "Você escolheu o filme - Mundo Estranho. Vamos para a escolha da sessão do filme!");
    else if (escolha == 4)
    	JOptionPane.showMessageDialog(null, "Você escolheu o filme - Ligação Explosiva. Vamos para a escolha da sessão do filme!");
    else if (escolha == 5)
    	JOptionPane.showMessageDialog(null, "Você escolheu o filme - Força Bruta. Vamos para a escolha da sessão do filme!");
    else 
    	JOptionPane.showMessageDialog(null, "Desculpe... Não conseguimos identificar o filme solicitado. Por favor, entre novamente no sistema para recomeçar.");
    
    
    JOptionPane.showInputDialog(null, "As sessões disponíveis para esse filme são: Sessão 1 - 14h45, Sessão 2 - 18h00 e Sessão 3 - 21h10. Digite o número da sessão que deseja assistir!");
    JOptionPane.showMessageDialog(null, "Agora que escolhemos o filme e a sessão, vamos para os ingressos!");
    JOptionPane.showMessageDialog(null, "Os preços dos tipos de ingressos para esse filme são: Inteira R$34 e Meia-Entrada R$17");
    
    int inteira;
    int	meia;
    int valor;
    inteira = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos ingressos do tipo Inteira você irá comprar?"));
    meia = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos ingressos do tipo Meia-Entrada você irá comprar?"));
    valor = (inteira * 34) + (meia * 17);
    JOptionPane.showMessageDialog(null, "O valor deu R$" + valor);
    JOptionPane.showMessageDialog(null, "Retire a ficha que saiu do terminal e pague no balcão ao lado para efetivar a compra!");
    JOptionPane.showMessageDialog(null, "O CineTech agradece pela sua preferência, " + nome + ", tenha um ótimo filme!");
  
    

   
	}

	
}
