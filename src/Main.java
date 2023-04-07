import controlador.ControladorEspecialidad;
import modelo.ModeloEspecialidad;
import vista.VistaEspecialidad;

public class Main {
    public static void main(String[] args) {
        ModeloEspecialidad mp = new ModeloEspecialidad();
        VistaEspecialidad vp  = new VistaEspecialidad();
        ControladorEspecialidad cp = new ControladorEspecialidad(mp,vp);
        cp.iniciarVistaEspecialidad();
    }
}