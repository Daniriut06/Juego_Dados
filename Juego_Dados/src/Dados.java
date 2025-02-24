import java.awt.Color;
import java.awt.Font;

import javax.print.attribute.standard.JobPriority;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class Dados extends JFrame {
    public Dados(){
        setSize(600,500);
        setTitle("Juego de Dados");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(null);

        //elementos para mostrar los dados :D
        String nombreArchivo = "/imagenes/1.jpg";
        ImageIcon imgDado = new ImageIcon(getClass().getResource(nombreArchivo));
        JLabel lblDado1 = new JLabel();
        lblDado1.setIcon(imgDado);
        lblDado1.setBounds(10,10,imgDado.getIconWidth(),imgDado.getIconHeight());
        getContentPane().add(lblDado1);

        JLabel lblDado2 = new JLabel();
        lblDado2.setIcon(imgDado);
        lblDado2.setBounds(10+imgDado.getIconHeight(),10,imgDado.getIconWidth(),imgDado.getIconHeight());
        getContentPane().add(lblDado2);

        JLabel lblTituloLanzamientos = new JLabel("Lanzamientos");
        lblTituloLanzamientos.setHorizontalAlignment(SwingConstants.CENTER);
        lblTituloLanzamientos.setBounds(30 + 2 * imgDado.getIconWidth(), 10, 100, 25);
        getContentPane().add(lblTituloLanzamientos);

        JLabel lblTituloCenas = new JLabel("Cenas");
        lblTituloCenas.setHorizontalAlignment(SwingConstants.CENTER);
        lblTituloCenas.setBounds(160 + 2 * imgDado.getIconWidth(), 10, 100, 25);
        getContentPane().add(lblTituloCenas);

        JLabel lblLanzamientos = new JLabel("0");
        lblLanzamientos.setBounds(30 + 2 * imgDado.getIconHeight(), 40, 100, 100);
        lblLanzamientos.setBackground(new Color(0,0,0));
        lblLanzamientos.setForeground(new Color(51,255,0));
        lblLanzamientos.setOpaque(true);
        lblLanzamientos.setHorizontalAlignment(SwingConstants.RIGHT);
        lblLanzamientos.setFont(new Font("Tahoma", 1, 72));
        getContentPane().add(lblLanzamientos);

        JLabel lblCenas = new JLabel("0");
        lblCenas.setBounds(160 + 2 * imgDado.getIconHeight(), 40, 100, 100);
        lblCenas.setBackground(new Color(0,0,0));
        lblCenas.setForeground(new Color(51,255,0));
        lblCenas.setOpaque(true);
        lblCenas.setHorizontalAlignment(SwingConstants.RIGHT);
        lblCenas.setFont(new Font("Tahoma", 1, 72));
        getContentPane().add(lblCenas);

        JButton btnIniciar = new JButton("iniciar");
        btnIniciar.setBounds(10, 20 + imgDado.getIconHeight(),100,25);
        getContentPane().add(btnIniciar);

        JButton btnLanzar = new JButton("Lanzar");
        btnLanzar.setBounds(10, 60 + imgDado.getIconHeight(), 100, 25);
        getContentPane().add(btnLanzar);

        


    }

}
