public class Trabalhador  extends Pessoa{

    private float salarioHora;
    private float horasTrabalhadas;

    public float getSalarioHora() {
        return salarioHora;
    }

    public Trabalhador setSalarioHora(float salarioHora) {
        this.salarioHora = salarioHora;
        return this;
    }

    public float getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public Trabalhador setHorasTrabalhadas(float horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
        return this;
    }
}
