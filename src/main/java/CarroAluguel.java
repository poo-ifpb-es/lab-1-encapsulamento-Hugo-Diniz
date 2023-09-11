public class CarroAluguel {
    private float debito;
    private float valorPorKm;
    private float distanciaPercorrida;
    private boolean statusDisponivel;
    private boolean statusSinistro;

    public CarroAluguel(float valorPorKm) {
        this.valorPorKm = valorPorKm;
        this.statusSinistro = false;
        this.debito = 0;
        this.statusDisponivel = true;
    }

    public float getValorPorKm() {
        return this.valorPorKm;
    }

    public void setValorPorKm(float valor) {
        this.valorPorKm = valor;
    }

    public float getDistanciaPercorrida() {
        return this.distanciaPercorrida;
    }

    public void setDistanciaPercorrida(int distancia) {
        this.distanciaPercorrida = distancia;
    }

    public boolean isDisponivel(){
        return this.statusDisponivel;
    }

    public boolean hasSinistro() {
        return this.statusSinistro;
    }

    public void setSinistro(boolean sinistro) {
        this.statusSinistro = sinistro;
    }

    public float getDebito() {
        if (getDistanciaPercorrida() > 0) {
            if (hasSinistro()) {
                this.debito = (float)((getValorPorKm() * getDistanciaPercorrida()) + ((getValorPorKm() * getDistanciaPercorrida()) * 0.6));
            }else {
                this.debito = (getValorPorKm() * getDistanciaPercorrida());
            }        
        }
        return this.debito;
    }


    public void alugar() throws CarroIndisponivelException {
        if (isDisponivel()) {
            this.statusDisponivel = false;
        }else {
            throw new CarroIndisponivelException("O carro está indisponível.");
        }
    }

    public void devolver() throws CarroDisponivelException, CarroNaoPagoException {
        if (!isDisponivel()) {
            if (getDebito() == 0 ) {
                this.statusDisponivel = true;
                this.statusSinistro = false;
                this.distanciaPercorrida = 0;
            }else {
                throw new CarroNaoPagoException("O carro não foi pago.");
            }
        }else {
            throw new CarroDisponivelException("O carro está disponível.");
        }
    }

    public void pagar() throws CarroDisponivelException{
        if (isDisponivel()) {
            throw new CarroDisponivelException("O carro está disponível.");
        } else {
            if (getDebito() > 0) {
                this.debito = 0;
                this.statusSinistro = false;
                this.distanciaPercorrida = 0;
            }
        }

    }

}
