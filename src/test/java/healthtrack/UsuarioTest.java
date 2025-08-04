package healthtrack;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class UsuarioTest {

    @Test
    public void testActualizarPeso_ActualizaCorrectamente() {
        Usuario usuario = new Usuario("Lucía", 68.0);
        usuario.actualizarPeso(70.5);
        assertEquals(70.5, usuario.getPeso(), 0.01, "El peso debe actualizarse correctamente");
    }

    @Test
    public void testActualizarPeso_PesoNegativo_LanzaExcepcion() {
        Usuario usuario = new Usuario("Juan", 75.0);
        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            usuario.actualizarPeso(-10.0);
        });
        assertEquals("El peso debe ser un valor positivo.", ex.getMessage());
    }
}
