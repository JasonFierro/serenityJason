package questions.pagos;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import static userInterfaces.portalPagos.pagosPage.*;

public class pagosQstn {

    @NotNull
    @Contract(pure = true)
    public static Question validateTextPagar(){
        return actor -> actor.asksFor(Text.of(BTN_PAGAR).asString());
    }
}
