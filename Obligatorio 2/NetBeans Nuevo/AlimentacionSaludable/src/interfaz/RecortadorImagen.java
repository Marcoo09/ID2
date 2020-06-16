package interfaz;

import java.awt.Image;
import javax.swing.ImageIcon;

public class RecortadorImagen {
    private final int nuevoLargo;
    private final int nuevoAncho;
    
    public RecortadorImagen(int largo, int ancho){
        this.nuevoLargo = largo;
        this.nuevoAncho = ancho;
    }
    
    public void recortarImagen(ImageIcon imagenARecortar){
        Image imagen = imagenARecortar.getImage();
        Image nuevaImagenRecortada = 
                imagen.getScaledInstance(nuevoLargo, nuevoAncho, Image.SCALE_SMOOTH);

        imagenARecortar.setImage(nuevaImagenRecortada);
    }
}
