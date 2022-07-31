package misClases;

public class HolaMundo {

    private String txt = "Hello World";

    //Imprime en pantalla el mensaje
    public void Escribir() {

        System.out.println(txt + ":)");

    }

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }

}
