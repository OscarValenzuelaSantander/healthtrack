package healthtrack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.jupiter.api.*;

@Disabled("No se ejecuta en CI/CD sin entorno gráfico")
public class UsuarioSeleniumTest {

    private static WebDriver driver;

    @BeforeAll
    public static void setup() {

        driver = new ChromeDriver();
    }

    @AfterAll
    public static void tearDown() {
        if (driver != null) driver.quit();
    }

    @Test
    public void testFlujoActualizarPeso() {
        driver.get("http://localhost:8080/registro");

        driver.findElement(By.id("nombre")).sendKeys("Camila");
        driver.findElement(By.id("apellido")).sendKeys("García");
        driver.findElement(By.id("peso")).sendKeys("65.5");
        driver.findElement(By.id("btnActualizar")).click();

        WebElement mensaje = driver.findElement(By.id("mensajeExito"));
        Assertions.assertTrue(mensaje.getText().contains("Peso actualizado"), "Debe mostrar mensaje de éxito");

        WebElement pesoActual = driver.findElement(By.id("pesoActual"));
        Assertions.assertEquals("65.5", pesoActual.getText());
    }
}
