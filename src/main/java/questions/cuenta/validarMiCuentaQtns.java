package questions.cuenta;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import userInterfaces.bookStorePage;

import static userInterfaces.cuenta.miCuentaPage.*;

public class validarMiCuentaQtns {

    @NotNull
    @Contract(pure = true)
    public static Question validateTextPedidos(){
        return actor -> actor.asksFor(Text.of(LABEL_PEDIDOS).asString());
    }

    @NotNull
    @Contract(pure = true)
    public static Question validateTextDirecciones() {
        return actor -> actor.asksFor(Text.of(LABEL_DIRECCIONES).asString());
    }

    @NotNull
    @Contract(pure = true)
    public static Question validateTextDatos() {
        return actor -> actor.asksFor(Text.of(LABEL_DATOS).asString());
    }

    @NotNull
    @Contract(pure = true)
    public static Question validateTextInicio() {
        return actor -> actor.asksFor(Text.of(LABEL_INICIO).asString());
    }

    @NotNull
    @Contract(pure = true)
    public static Question validateTextLealtad() {
        return actor -> actor.asksFor(Text.of(LABEL_LEALTAD).asString());
    }

    @NotNull
    @Contract(pure = true)
    public static Question validateTextSalir() {
        return actor -> actor.asksFor(Text.of(LABEL_SALIR).asString());
    }

}
