public class Linha {
    private Ponto inicioPonto;
    private Ponto fimPonto;

    public Linha(Ponto inicio, Ponto fim) {
        this.inicioPonto = inicio;
        this.fimPonto = fim;
    }

    public Ponto getInicio() {
        return this.inicioPonto;
    }

    public void setInicio(Ponto inicio) {
        this.inicioPonto = inicio;
    }

    public Ponto getFim() {
        return this.fimPonto;
    }

    public void setFim(Ponto fim) {
        this.fimPonto = fim;
    }

    public double getComprimento() {
        double dx = fimPonto.getX() - inicioPonto.getX();
        double dy = fimPonto.getY() - inicioPonto.getY();

        return Math.sqrt((dx * dx) + (dy * dy));
    }
}