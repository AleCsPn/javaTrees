public class Aluno implements Comparable<Aluno> {
    private String nome;
    private int matricula;
    
    public String getNome(){
        return nome;
    }
    public int getMatricula(){
        return matricula;
    }

    public Aluno(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    @Override 
    public int compareTo(Aluno outro){
        return Integer.compare(this.matricula, outro.matricula);
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(this.matricula);
    }

    @Override 
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }

        if(obj == null || getClass() != obj.getClass()){
            return false;
        }

        Aluno outro = (Aluno) obj;

        return this.matricula == outro.matricula;
    }

    @Override 
    public String toString(){
        return "[Matricula: "+matricula +" - Nome: "+nome+"]";
    }

}
