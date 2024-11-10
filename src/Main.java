//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

     Gato ravena = new Gato();
     ravena.setNome("Ravena");
     ravena.setEspecie("Gato");
     ravena.setSexo("Femea");
     ravena.emitirSom();

     Cachorro pacoca = new Cachorro();
     pacoca.setNome("Paçoca");
     pacoca.setEspecie("Cachorro");
     pacoca.setSexo("Macho");
     pacoca.emitirSom();
    }
}