public class Circulo {
    private float raio;
    private float pi = 3.14159f;


    public Circulo(float raio) {
        this.raio = raio;
    }

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }

    public float getArea() {
        return (pi * (raio * raio));
    }

    public float getCircunferencia() {
        return ((pi * raio) * 2);
    }
}
