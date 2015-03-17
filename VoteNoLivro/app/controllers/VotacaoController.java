package controllers;

import java.util.List;

import com.avaje.ebean.Ebean;

import models.VotacaoModel;
import play.data.Form;
import views.html.*;
import play.mvc.Result;
import play.mvc.Controller;

public class VotacaoController extends Controller{
	
	public static Result index() {
		List<VotacaoModel> votos = Ebean.createQuery(VotacaoModel.class).findList();
  	  	return ok(listaVotos.render(votos));
	}

}
