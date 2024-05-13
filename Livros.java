public class Livros{

  private String titulo;
  private String autor;
  private String ano;
  private String id;
  private boolean emprestado;
  

  //construtor
  public Livros(){ //
    
  }
  public Livros(String titulo, String autor, String ano, String id) {
    this.titulo = titulo;
    this.autor = autor;
    this.ano = ano;
    this.id = id;
    this.emprestado=false;
  }
  public String getTitulo() {
    return titulo;
  }
  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }
  public String getAutor() {
    return autor;
  }
  public void setAutor(String autor) {
    this.autor = autor;
  }
  public String getAno() {
    return ano;
  }
  public void setAno(String ano) {
    this.ano = ano;
  }
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }
  
  public String imprimir(){
    return "Titulo: " + titulo + " autor: " + autor + " ano: " + ano+ " id: " + id + " esta emprestado para:" + emprestado;
  }
}