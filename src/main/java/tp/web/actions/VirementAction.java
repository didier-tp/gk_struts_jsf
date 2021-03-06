package tp.web.actions;

import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import tp.data.Virement;
import tp.service.IServiceCompte;

@Component() //id/name par defaut de ce composant spring : 
// virementAction (nom de classe avec minuscule au debut)
@Scope("prototype")
public class VirementAction extends ActionSupport 
  implements SessionAware , ModelDriven<Virement> {
	
	private String message;
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	private Virement virement =new Virement(); 
	
	@Override
	public Virement getModel() {
		return virement;
	}
	//solution 1 : +get/set sur virement
	//et avec dans les pages JSP <s:property value="virement.montant" />
	//et avec <s:textfield value="virement.montant" ...>
	
	//solution 2 : //pas obligatoirement de get/set sur Virement
	//mais implémentation de ModelDriven<Virement>
	//et avec dans les pages JSP <s:property value="montant" />
	//et avec <s:textfield value="montant" ...>

    private SessionMap<String,Object> sessionMap;
	
	@Override //from SessionAware (for session injection)
	public void setSession(Map<String, Object> map) {
	sessionMap=(SessionMap)map;
	}
	//une instance instance d'un service partagée suffit
	@Autowired
		private IServiceCompte serviceCompte; /* = 
				       ServiceCompte.getInstance();*/

	public String realiserVirement(){
		String res="success";
		try {
			serviceCompte.effectuerVirement(this.virement);
		} catch (Exception e) {
			res="error";
			this.message="echec virement" + e.getMessage();
		}
		return res;
	}
	
	

}
