package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.questions.Attribute;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.questions.TextContent;
import userInterfaces.bookStorePage;

import static org.hamcrest.Matchers.hasItems;

public class pantallaPrincipalQtns{
//    public static pantallaPrincipalQtns textEquals(){
//        return new pantallaPrincipalQtns();
//    }
//
//    public String answeredBy(Actor actor) {
//        return BrowseTheWeb.as(actor).find(bookStorePage.LABEL_USER).getText();
//    }

    public static Question validateTextUsername(){
        //return actor -> Text.of(bookStorePage.LABEL_PASSWORD).viewedBy(actor).asInteger();
        return actor -> actor.asksFor(Text.of(bookStorePage.LABEL_USER).asString());
    }

    protected static Question validateTextPassword() {
        return actor -> actor.asksFor(Text.of(bookStorePage.LABEL_PASSWORD).asString());
    }
}

