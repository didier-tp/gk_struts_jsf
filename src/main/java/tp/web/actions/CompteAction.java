package tp.web.actions;

import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionSupport;

import tp.data.Compte;
import tp.service.ServiceCompte;

//plusieurs instances de la classe CompteAction
@Component() //id/name par defaut de ce composant spring : 
             // compteAction (nom de classe avec minuscule au debut)
@Scope("prototype")
public class CompteAction extends ActionSupport  implements SessionAware{
	
	private Long numClient;//valeur différente pour chaque utilisateur
	private String password;
	private List<Compte> comptes;
	
	@PostConstruct
	public void apresInitSpring(){
		System.out.println("initialise par spring");
	}
	
	//une instance instance d'un service partagée suffit
	@Autowired
	private ServiceCompte serviceCompte ; /*= 
			       ServiceCompte.getInstance();*/
	
	private SessionMap<String,Object> sessionMap;
	
	@Override //from SessionAware (for session injection)
	public void setSession(Map<String, Object> map) {
	sessionMap=(SessionMap)map;
	}
	
	public String login(){
		System.out.println("login() appelé sur " + this.toString());
		if(serviceCompte.verifAuth(numClient, password)){
			this.sessionMap.put("numClient", this.numClient);
			//affichage d'une chose en session
			//via <s:property value="#session.numClient"/> dans une page jsp
			return "success";
		}
		else{ this.message="echec authentification. veuillez réessayer";
			return "error"; //ou "input" ou ...
		}
	}
	
	public String recupComptesDuClient(){
		System.out.println("recupComptesDuClient() appelé sur " 
	                       + this.toString());
		String res="success";
		try {
			this.numClient = (Long) this.sessionMap.get("numClient");
			this.comptes = serviceCompte.comptesDuClient(numClient);
			this.sessionMap.put("comptes", this.comptes);//pour #session.comptes dans
			//select/s:iterator/option de virement.jsp 
		} catch (Exception e) {
			e.printStackTrace();
			res="error"; // ou "input" ou ...
		}
		return res;
	}
	
	
	//+get/set
	
	public Long getNumClient() {
		return numClient;
	}

	public void setNumClient(Long numClient) {
		this.numClient = numClient;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Compte> getComptes() {
		return comptes;
	}

	public void setComptes(List<Compte> comptes) {
		this.comptes = comptes;
	}

	
	
private String message=null;
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	

}
