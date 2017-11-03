package tp.service;

import java.util.ArrayList;
import java.util.List;

import tp.data.Compte;
//Simulation d'un service métier (sans spring, sans database)
public class ServiceCompte {
	
	private static ServiceCompte uniqueInstance;
	
	public static ServiceCompte getInstance(){
		if(uniqueInstance==null){
			uniqueInstance=new ServiceCompte();
		}
		return uniqueInstance;
	}
	
	public boolean verifAuth(Long numClient , String password){
		boolean res=false;
		if(password.equals("pwd"+numClient)){
			res=true; //ok pour numClient=1 et password=pwd1
		}
		return res;
	}
	
	
	public List<Compte> comptesDuClient(Long numClient){
		List<Compte> comptes = new ArrayList<Compte>();
		comptes.add(new Compte(1L,"compte 1" , 150.0));
		comptes.add(new Compte(2L,"compte 2" , 50.0));
		comptes.add(new Compte(3L,"compte 3" , 250.0));
		return comptes;
	}

}
