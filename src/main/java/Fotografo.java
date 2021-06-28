public class Fotografo extends Trabalhador{

    private int numFotos;
    private float valorfoto;

    public int getNumFotos() {
        return numFotos;
    }

    public Fotografo setNumFotos(int numFotos) {
        this.numFotos = numFotos;
        return this;
    }

    public float getValorfoto() {
        return valorfoto;
    }

    public Fotografo setValorfoto(float valorfoto) {
        this.valorfoto = valorfoto;
        return this;
    }

    public float calculaSalario(){
        float salarioFinal;
        salarioFinal = (getSalarioHora() * getHorasTrabalhadas()) + (this.numFotos * this.valorfoto);
        return salarioFinal;
    }

}
