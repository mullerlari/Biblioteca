import java.util.ArrayList;

public class Biblioteca{ 
  private ArrayList<Livros> listaDeLivros = new ArrayList<>();  

  public ArrayList<Livros> getListaDeLivros() {
    return listaDeLivros;
  }
   public void adicionar(Livros l){
     listaDeLivros.add(l);
   }
   public String listar(){
     String saida ="";  
     int i=1;

     for( Livros l : listaDeLivros){
       saida += "\nLivro: " + (i++) +"  "; 
       saida+= l.imprimir() + "\n";
     }
     return saida;
   }
   public  boolean remover(String titulo){
     for(Livros l : listaDeLivros){
       if(l.getTitulo().equalsIgnoreCase(titulo)){  
         listaDeLivros.remove(l);
         return true;
       }
     }
     return false;
     
   }


}
