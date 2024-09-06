import java.util.Random;

import javax.swing.ImageIcon;
import javex.swing.JLabel;
import javax.swing.JPanel;


public class Carta {

    private int indice;
    
    public Carta(Random r) {
        indice = r.nextInt(bound:52) + 1;
    }

    public void mostar(JPanel pnl, int x, int y) {
        String nombreImagen ="/imagenes/CARTAS" + String.valueOf(indice) + ".jpg";
        ImageIcon imagen = new ImageIcon(getClass().getResource(nombreImagen));

        JLabel lbl = new JLabel(imagen);
        lbl.setBounds(x,y, imagen.getIconWidth(), imegen.getIconHeight());

        pnl.add(lbl);

    }

    public Pinta getPinta() {
        if (indice <= 13){
            return Pinta.TREBOL;
        } else if (indeice <= 26){
            return Pinta.PICA;
        } else if (indice <= 39){
            return Pinta.CORAZON;
        } else{
            return Pinta.DIAMANTE;
        }

    }
    public NombreCarta getNombre() {
        int residuo = indice % 13;
        if (residuo == 0){
            residuo = 13;
        }

        return NombreCarta.values()[residuo - 1];
        }
    }
