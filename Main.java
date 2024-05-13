import java.util.Scanner;

class Main{
    public static void main(String[] args){
     
        Scanner ler = new Scanner(System.in);
        ListaContatos lc = new ListaContatos();
        Contato objContato = new Contato(null, null);

        Biblioteca a1 = new Biblioteca(); 
        Livros objLivro = new Livros();

        int menu;
        String titulo, autor, ano, id;
        String nome, sobrenome;

        do{
           
           System.out.println(" ---- MENU ----");
           System.out.println(" 1 - Doar Livro");
           System.out.println(" 2 - Listar");
           System.out.println(" 3 - Pegar emprestado");
           System.out.println(" 4 - Devolver");
           System.out.println(" 5 - Sair");
            menu = ler.nextInt();
            ler.nextLine();

            switch(menu){

                case 1:
                    System.out.println("Informe o titulo: ");
                    titulo=ler.nextLine();
                    System.out.println("Autor: ");
                    autor = ler.nextLine();
                    System.out.println("Ano: ");
                    ano=ler.nextLine();
                    System.out.println("Id:");
                    id=ler.nextLine();


                    objLivro = new Livros(titulo, autor, ano, id);
                    //guardar na lista
                    a1.adicionar(objLivro);

                    break;
                case 2:
                    System.out.println("Lista de livros:\n");
                    System.out.println( a1.listar());
                    break;
                case 3:
                    System.out.println("Retirar livro");
                    System.out.println("Informe seu nome");
                    nome=ler.nextLine();
                    System.out.println("Informe seu sobrenome");
                    sobrenome=ler.nextLine();
                    objContato = new Contato(nome, sobrenome);
                    System.out.println("Digite o titulo");
                    titulo=ler.nextLine();

                    if( ! a1.getListaDeLivros().isEmpty()){
                        if(a1.remover(titulo)){
                            System.out.println("Livro: " + objLivro.getTitulo() + " Emprestado com sucesso para: " + objContato.getNome() + objContato.getSobrenome());
                        }
                    }else{
                        System.out.println("Sem livros para emprestar");
                    }
                    break;
                case 4:
                System.out.println("informe o titulo");
                titulo=ler.nextLine();
                System.out.println("Autor");
                autor = ler.nextLine();
                System.out.println("Ano");
                ano=ler.nextLine();
                System.out.println("id");
                id=ler.nextLine();


                objLivro = new Livros(titulo, autor, ano, id);
                
                a1.adicionar(objLivro);
                System.out.println(" Livro: " + objLivro.getTitulo() + " Devolvido com sucesso por: " + objContato.getNome());

                    break;
                 case 5:
                    System.out.println("Saindo...");
                    break;   
                default:
                System.out.println("Opcao inválida!");    

            }
        }while(menu !=5);

    }

}   