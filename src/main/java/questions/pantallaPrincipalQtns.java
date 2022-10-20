package questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import userInterfaces.bookStorePage;

public class pantallaPrincipalQtns{
//    public static pantallaPrincipalQtns textEquals(){
//        return new pantallaPrincipalQtns();
//    }
//
//    public String answeredBy(Actor actor) {
//        return BrowseTheWeb.as(actor).find(bookStorePage.LABEL_USER).getText();
//    }

    @NotNull
    @Contract(pure = true)
    public static Question validateTextUsername(){
        //return actor -> Text.of(bookStorePage.LABEL_PASSWORD).viewedBy(actor).asInteger();
        return actor -> actor.asksFor(Text.of(bookStorePage.LABEL_USER).asString());
    }

    @NotNull
    @Contract(pure = true)
    protected static Question validateTextPassword() {
        return actor -> actor.asksFor(Text.of(bookStorePage.LABEL_PASSWORD).asString());
    }
}

