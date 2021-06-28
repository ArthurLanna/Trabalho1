public class Aluno extends Pessoa{

    private float nota1;
    private float nota2;
    private float notaFinal;
    private String Matricula;

    public float getNota1() {
        return nota1;
    }

    public Aluno setNota1(float nota1) {
        this.nota1 = nota1;
        return this;
    }

    public float getNota2() {
        return nota2;
    }

    public Aluno setNota2(float nota2) {
        this.nota2 = nota2;
        return this;
    }

    public float getNotaFinal() {
        return notaFinal;
    }

    public Aluno setNotaFinal(float notaFinal) {
        this.notaFinal = notaFinal;
        return this;
    }

    public String getMatricula() {
        return Matricula;
    }

    public Aluno setMatricula(String matricula) {
        Matricula = matricula;
        return this;
    }

    public boolean verificaAprovacao(){
        float media = (this.nota1 + this.nota2)/2;
        if (media >= 6.0f){
            return true;
        }
        else{
            media = (media + notaFinal)/2;
            if (media >= 6.0f){
                return true;
            }
        }
        return false;
    }
}
