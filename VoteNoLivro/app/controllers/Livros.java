package controllers;

import java.util.List;

import com.avaje.ebean.Ebean;

import models.CadastraLivro;
import play.data.Form;
import views.html.*;
import play.mvc.Result;
import play.mvc.Controller;


public class Livros extends Controller{

	public static Result index() {
		List<CadastraLivro> livros = Ebean.createQuery(CadastraLivro.class).findList();
  	  	return ok(listaLivros.render(livros));  	  
	}
	
	public static Result formularioCadastraLivro() {
		Form<CadastraLivro> form = Form.form(CadastraLivro.class);
		return ok(formularioCadastraLivro.render(form));
	}
	
	public static Result cadastraLivro() {
  	  Form<CadastraLivro> form = Form.form(CadastraLivro.class).bindFromRequest();
  	  if (form.hasErrors()) {
  	    return badRequest(formularioCadastraLivro.render(form));
  	  }
  	  CadastraLivro cadastraLivro = form.get();
  	  cadastraLivro.save();
  	  return redirect(routes.Livros.cadastraLivro());
  	  
  	}
}
