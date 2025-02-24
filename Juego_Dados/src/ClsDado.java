import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class ClsDado {

    private int numero;

    public void lanzar(Random r) {
        // ASIGNARLE AL NUMERO DEL DADO UN VALOR AL AZAR ENTRE 1-6
        numero = r.nextInt(6) + 1;

    }

    public void mostrar(JLabel lbl) {
        String nombreArchivo = "/imagenes/" + numero + ".jpg";
        ImageIcon imgDado = new ImageIcon(getClass().getResource(nombreArchivo));
        lbl.setIcon(imgDado);

    }
}
