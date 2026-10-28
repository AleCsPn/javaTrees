import java.util.*;

    public class App {
            static int menu(Scanner leia){
            System.out.println("Arvore Binária de Busca");
            System.out.println("1. Inserir elemento");
            System.out.println("2. Remover elemento");
            System.out.println("3. Buscar elemento");
            System.out.println("4. Exibir árvore");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = leia.nextInt();
            leia.nextLine();
            return opcao;
        }

    public static void main(String[] args) throws Exception {
        
    Scanner leia = new Scanner(System.in);
            BinarySearchTree<Aluno> arvore = new BinarySearchTree<>(); // Instanciar a arvore
            int opcao=0;
            do {
                System.out.println("----------------------------------");
                opcao = menu(leia);
                switch (opcao) {
                    case 1:
                        System.out.print("Digite o nome do aluno: ");
                        String nome = leia.nextLine();
                        System.out.print("Digite a Matricula do aluno: ");
                        int matricula = leia.nextInt();
                        leia.nextLine();
                        Aluno aluno = new Aluno(nome, matricula);
                        arvore.add(aluno); // inserir
                        System.out.println("Aluno cadastrado com sucesso!");
                        break;
                    case 2:
                        System.out.print("Digite o elemento a ser removido: ");
                        int elementoRemover = leia.nextInt();
                        // Implementar a remoção do elemento na árvore
                        System.out.println("Elemento removido com sucesso!");
                        break;
                    case 3:
                        System.out.print("Digite a matricula do aluno: ");
                        int alunoBusca = leia.nextInt();

                        Aluno chaveBusca = new Aluno("Nome",alunoBusca);

                        Aluno resultado = arvore.buscar(chaveBusca);
                        if (resultado != null) {
                            System.out.println("Aluno " + resultado + " encontrado!");
                        } else {
                            System.out.println("Aluno não encontrado!");
                        }
                        break;

                    case 4:
                        System.out.println("Exibindo a árvore em pre-ordem:");
                        arvore.preOrder(); // percurso 
                        System.out.println("Exibindo a árvore em ordem:");
                        arvore.inOrder();
                        System.out.println("Exibindo a árvore em pos-ordem:");
                        arvore.postOrder();
                        break;
                    case 0:
                        System.out.println("Saindo...");
                        break;
                    default:
                        System.out.println("Opção inválida! Tente novamente.");
                }
            } while (opcao!=0);
        }

}
