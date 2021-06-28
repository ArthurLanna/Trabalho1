public class Professor extends Trabalhador{

    private int numDiasAulas;

    public int getNumDiasAulas() {
        return numDiasAulas;
    }

    public Professor setNumDiasAulas(int numDiasAulas) {
        this.numDiasAulas = numDiasAulas;
        return this;
    }

    public float calculaSalario(){
        float salarioFinal;
        salarioFinal = getSalarioHora() * getHorasTrabalhadas() * this.numDiasAulas;
        return salarioFinal;
    }
}
