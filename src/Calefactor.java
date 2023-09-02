import java.util.Objects;

public class Calefactor {
    private String marca;
    private String modelo;
    private byte potencia;
    private int anioFabricacion;
    private boolean encendido;

    public Calefactor(String marca, String modelo, byte potencia, int anioFabricacion, boolean encendido){
        this.marca = marca;
        this.modelo = modelo;
        this.potencia = potencia;
        this.anioFabricacion = anioFabricacion;
        this.encendido = encendido;
    }


    public void enciende(){
        encendido = true;
    }

    public void apaga(){
        encendido = false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Calefactor that)) return false;
        return anioFabricacion == that.anioFabricacion && Objects.equals(marca, that.marca) && Objects.equals(modelo, that.modelo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marca, modelo, anioFabricacion);
    }

    // getter

    public byte getPotencia() {
        return potencia;
    }

    public boolean isEncendido() {
        return encendido;
    }


    // setter

    public void setPotencia(byte potencia) {
        if(this.encendido){
            if(potencia <= 3 && potencia >= 1){
                this.potencia = potencia;
            }else{
                System.out.println("No ha sido posible el cambio. Error: potencia fuera del rango permitido");
            }
        }else{
            System.out.println("No ha sido posible el cambio. Error: calefactor apagado");
        }
    }

    public String toString(){
        return (marca+", "+modelo+", "+anioFabricacion+", "+toEstado()+", "+toPotencia());
    }

    private String toPotencia(){
        String potencia = "0";
        switch (this.potencia) {
            case 1 -> potencia = "bajo";
            case 2 -> potencia = "medio";
            case 3 -> potencia = "alto";
        }
        return potencia;
    }

    private String toEstado(){
        String estado = " ";

        if(this.encendido){
            estado = "encendido";
        }else {
            estado = "apagado";
        }
        return estado;
    }

}
