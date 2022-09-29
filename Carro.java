public class Carro {
    private Integer diametroDoPneu;
    private String motor;
    private String porta;
    private String busina;
    private String farol;
    private Boolean chave;
    private Boolean acelerador;
    private Boolean desligar;

    public Integer getDiametroDo() {
        return diametroDoPneu;
    }

    public void setDiametroDo(Integer diametroDo) {
        this.diametroDoPneu = diametroDo;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getPorta() {
        return porta;
    }

    public void setPorta(String porta) {
        this.porta = porta;
    }

    public String getBusina() {
        return busina;
    }

    public void setBusina(String busina) {
        this.busina = busina;
    }

    public String getFarol() {
        return farol;
    }

    public void setFarol(String farol) {
        this.farol = farol;
    }

    public Boolean getChave() {
        return chave;
    }

    public void setChave(Boolean chave) {
        this.chave = chave;
    }

    public Boolean getAcelerador() {
        return acelerador;
    }

    public void setAcelerador(Boolean acelerador) {
        this.acelerador = acelerador;
    }

    public static Boolean ligarCarro(Boolean chaveDoCarro) {

        if (chaveDoCarro != null && chaveDoCarro) {
            System.out.println("Ligando carro!");
            acelerarCarro(chaveDoCarro, true);
        } else {
            System.out.println("Estou sem as chaves do carro!");
        }
        return chaveDoCarro;

    }

    public static Boolean acelerarCarro(Boolean chaveDoCarro, Boolean acelerador) {
        if (chaveDoCarro != null && chaveDoCarro) {
            System.out.println("Acelerar carro!");
            desligarCarro(true);
        } else {
            System.out.println("Impossivel de acelerar o carro, não tem chave!");
        }
        return acelerador;
    }
    public static Boolean desligarCarro(Boolean chaveDoCarro){
        System.out.println("Carro desligado");
        return chaveDoCarro;
    }

    public static void main(String[] args) {
        ligarCarro(true);

    }
}
