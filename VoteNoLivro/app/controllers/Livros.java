package controllers;

import play.*;
import play.api.Routes;
import play.data.Form;
import play.mvc.*;
import play.mvc.Http.*;
import views.html.*;
import play.mvc.Results;
import play.mvc.Controller;


public class Livros extends Controller{

	public static Result index() {
		
		return ok(views.html.livros.render("eeeeeeeeeeeee"));
	}
}
