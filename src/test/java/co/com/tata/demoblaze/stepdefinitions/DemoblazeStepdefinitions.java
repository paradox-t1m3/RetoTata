package co.com.tata.demoblaze.stepdefinitions;

import co.com.tata.demoblaze.model.DemoblazeData;
import co.com.tata.demoblaze.questions.VerificarAdicionDeProducto;
import co.com.tata.demoblaze.questions.VerificarEnvioDeFormulario;
import co.com.tata.demoblaze.questions.VerificarInicioDeSesion;
import co.com.tata.demoblaze.questions.VerificarRegistroDeUsuarioExitoso;
import co.com.tata.demoblaze.tasks.*;
import co.com.tata.demoblaze.userinterface.IniciarSesionPage;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class DemoblazeStepdefinitions {

    @Before
    public void configuracionInicial(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que (.*) ingresa a la pagina de demoblaze$")
    public void queCristianIngresaALaPaginaDeDemoblaze(String actor) {
        theActorCalled(actor).wasAbleTo(AbrirNavegador.enLaPagina());
    }

    @Dado("^que (.*) ingresa al registro de usuario$")
    public void queCristianIngresaAlRegistroDeUsuario(String actor) {
        theActorCalled(actor).wasAbleTo(IngresarAlRegistroDeUsuario.deLaPagina());
    }

    @Cuando("^ingresa los datos de registro$")
    public void ingresaLosDatosDeRegistro(List<DemoblazeData> demoblazeData) {
        theActorInTheSpotlight().attemptsTo(RegistrarUsuario.enDemoblaze(demoblazeData));
    }

    @Entonces("^se muestra el mensaje Sign up successful$")
    public void seMuestraElMensajeSignUpSuccessful() {
        theActorInTheSpotlight().should(seeThat(VerificarRegistroDeUsuarioExitoso.enMensajeEmergente()));
    }

    @Dado("^que (.*) ingresa al inicio de sesion$")
    public void queCristianIngresaAlInicioDeSesion(String actor) {
        theActorCalled(actor).wasAbleTo(IngresarAinicioDeSesion.deLaPagina());
    }

    @Cuando("^ingresa sus credenciales$")
    public void ingresaSusCredenciales(List<DemoblazeData> demoblazeData) {
        theActorInTheSpotlight().attemptsTo(IniciarSesion.enDemoblaze(demoblazeData));
    }

    @Entonces("^Inicia sesion en la pagina$")
    public void iniciaSesionEnLaPagina() {
        theActorInTheSpotlight().should(seeThat(VerificarInicioDeSesion.enLaPagina()));
    }

    @Dado("^que (.*) ingresa al registro de fomulario de contacto$")
    public void queCristianIngresaAlRegistroDeFomularioDeContacto(String actor) {
        theActorCalled(actor).wasAbleTo(IngresarAcontacto.deLaPagina());
    }

    @Cuando("^ingresa los datos del formulario$")
    public void ingresaLosDatosDelFormulario(List<DemoblazeData> demoblazeData) {
        theActorInTheSpotlight().attemptsTo(LlenarFormularioContacto.deDemoblaze(demoblazeData));
    }

    @Entonces("^se muestra el mensaje Thanks for the message!!$")
    public void seMuestraElMensajeThanksForTheMessage() {
        theActorInTheSpotlight().should(seeThat(VerificarEnvioDeFormulario.deContacto()));
    }

    @Dado("^que (.*) ingresa al home$")
    public void queCristianIngresaAlHome(String actor) {
        theActorCalled(actor).wasAbleTo(IngresarAHome.enLaPagina());
    }

    @Cuando("^selecciona una categoria de producto$")
    public void seleccionaUnaCategoriaDeProducto(List<DemoblazeData> demoblazeData) {
        theActorInTheSpotlight().attemptsTo(SeleccionarCategoria.deLaPagina(demoblazeData));
    }

    @Cuando("^selecciona el producto$")
    public void seleccionaElProducto(List<DemoblazeData> demoblazeData) {
        theActorInTheSpotlight().attemptsTo(SeleccionarProducto.deLaPagina(demoblazeData));
    }

    @Cuando("^adiciona el producto$")
    public void adicionaElProducto() {
        theActorInTheSpotlight().attemptsTo(AdicionarProducto.deDomoblaze());
    }

    @Entonces("^se muestra el mensaje Product added$")
    public void seMuestraElMensajeProductAdded() {
        theActorInTheSpotlight().should(seeThat(VerificarAdicionDeProducto.deContacto()));
    }

}
