package com.comidas;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ComidasMaker {
	
	public static void main(String[] args) {
		String comida = "Bistek|Pollo";
		String chile = "verde|rojo|morita|pasilla";
		String verdura = "papas|nopales|calabazas|a la Mexiana";
		String []comidas = comida.split("[|]");
		String []chiles = chile.split("[|]");
		String []verduras = verdura.split("[|]");
		Set<String> set = new HashSet<String>();
		for(String ccomida: comidas) {
			for(String cchile:chiles) {
				for (String cverduras:verduras) {
					String comidaFinal = ccomida +" "+ (cverduras.startsWith("a la")? "" : "en chile " + cchile)+
							(cverduras.startsWith("a la")? "" : " con ")+
							cverduras;
					set.add(comidaFinal);
				}
			}
		}
		Iterator<String> itSet =set.iterator();
		while(itSet.hasNext()) {
			System.out.println(itSet.next()); 
		}
	}
}
