package tp.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import tp.data.Compte;
import tp.data.Virement;
//Simulation d'un service m�tier (sans spring, sans database)
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
	
	//pour la simulation sans base (map en m�moire):
	private Map<Long,Compte> mapComptes = new HashMap<Long,Compte>();
	
	public /*ou private*/ ServiceCompte(){
		mapComptes.put(1L,new Compte(1L,"compte 1" , 150.0));
		mapComptes.put(2L,new Compte(2L,"compte 2" , 250.0));
		mapComptes.put(3L,new Compte(3L,"compte 3" , 350.0));
		mapComptes.put(4L,new Compte(4L,"compte 4" , 450.0));
		mapComptes.put(5L,new Compte(5L,"compte 5" , 550.0));
	}
	
	public void effectuerVirement(Virement ordreVirement){
		Compte cptDeb = mapComptes.get(ordreVirement.getNumCptDeb());
		Compte cptCred= mapComptes.get(ordreVirement.getNumCptCred());
		cptDeb.setSolde(cptDeb.getSolde() - ordreVirement.getMontant());
		cptCred.setSolde(cptCred.getSolde() + ordreVirement.getMontant());
	}
	
	public List<Compte> comptesDuClient(Long numClient){
		List<Compte> listeComptes = new ArrayList<Compte>();
		
		for(Compte c : mapComptes.values()){
			if(numClient == 1L && c.getNumero() <= 3L){
				listeComptes.add(c);
			}
			else if(numClient != 1L && c.getNumero() > 3L){
				listeComptes.add(c);
			}
		}
		
		return listeComptes;
	}
	
	
	
	
	
	
	
	
	
	

}
