package entidades;

public class Libro {
    private String Titulo;
    private String Autor;
    private Integer numEjemplares;
    private Integer ejemplaresPrestados;

    public Libro() {
    }

    public Libro(String Titulo, String Autor, Integer numEjemplares, Integer ejemplaresPrestados) {
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.numEjemplares = numEjemplares;
        this.ejemplaresPrestados = ejemplaresPrestados;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public Integer getNumEjemplares() {
        return numEjemplares;
    }

    public void setNumEjemplares(Integer numEjemplares) {
        this.numEjemplares = numEjemplares;
    }

    public Integer getEjemplaresPrestados() {
        return ejemplaresPrestados;
    }

    public void setEjemplaresPrestados(Integer ejemplaresPrestados) {
        this.ejemplaresPrestados = ejemplaresPrestados;
    }

    @Override
    public String toString() {
        return "Libro{" + "Titulo=" + Titulo + ", Autor=" + Autor + ", numEjemplares=" + numEjemplares + ", ejemplaresPrestados=" + ejemplaresPrestados + '}';
    }




    }
    
    

