import java.util.ArrayList;

public class ListaContatos {


    private ArrayList<Contato> listaContatos = new ArrayList<>();  

  public ArrayList<Contato> getListaContatos() {
    return listaContatos;
  }

   public void adicionar(Contato c){
     listaContatos.add(c);
   }
   public String listar(){
     String saida ="";  
     int i=1;

     for( Contato c : listaContatos){
       saida += "\n ----Livro num:" + (i++) +"---"; 
       saida+= c.imprimir() + "\n";
     }
     return saida;
   }
   public  boolean emprestar(String nome){
     for(Contato c : listaContatos){
       if(c.getNome().equalsIgnoreCase(nome)){ 
         listaContatos.remove(c);
         return true;
       }
     }
     return false; 
   }
   
