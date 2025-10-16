class DemonioBijuu {
    // Atributo privado — só a própria classe pode acessar diretamente
    private String habilidades; 

    // permite LER o valor do atributo privado
    public String getHabilidades() { 
        return habilidades;
    }

    // permite DEFINIR/MODIFICAR o valor do atributo privado
    public void setHabilidades(String habilidades) { 
        this.habilidades = habilidades;
    }
}

// Classe filha HERDA de DemonioBijuu
public class Naruto extends DemonioBijuu {
    public void mostrarPoder() {
        System.out.println("Habilidade: " + getHabilidades());
    }

    public static void main(String[] args) {
        Naruto ninja = new Naruto();
        ninja.setHabilidades("Modo Sábio dos seis Caminhos");
        ninja.mostrarPoder();
    }
}
     
        
    

    