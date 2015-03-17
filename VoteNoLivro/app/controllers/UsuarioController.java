package controllers;

import java.util.List;

import com.avaje.ebean.Ebean;

import models.CadastraLivro;
import models.CadastraUsuario;
import play.data.Form;
import views.html.*;
import play.mvc.Result;
import play.mvc.Controller;

public class UsuarioController extends Controller {

	
	public static Result index() {
		List<CadastraUsuario> usuarios = Ebean.createQuery(CadastraUsuario.class).findList();
  	  	return ok(listaUsuarios.render(usuarios));  	  
	}
	
	public static Result formularioCadastraUsuario() {
		Form<CadastraUsuario> form = Form.form(CadastraUsuario.class);
		return ok(formularioCadastraUsuario.render(form));
	}
	
	public static Result cadastraUsuario() {
	  	  Form<CadastraUsuario> form = Form.form(CadastraUsuario.class).bindFromRequest();
	  	  if (form.hasErrors()) {
	  	    return badRequest(formularioCadastraUsuario.render(form));
	  	  }
	  	  CadastraUsuario cadastraUsuario = form.get();
	  	  cadastraUsuario.save();
	  	  return redirect(routes.UsuarioController.cadastraUsuario());
	  	  
	  	}	
	
}
