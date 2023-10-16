package no.hvl.dat100.prosjekt.modell;

import java.util.Random;

import no.hvl.dat100.prosjekt.TODO;

public class KortUtils {

	public KortUtils() {
		
	}
	/**
	 * Sorterer en samling. Rekkefølgen er bestemt av compareTo() i Kort-klassen.
	 * 
	 * @see Kort
	 * 
	 * @param samling
	 * 			samling av kort som skal sorteres. 
	 */
	
	public static void sorter(KortSamling samling) {
		// TODO - START
	        Kort[] kortTabell = samling.getSamling();
	        int antallKort = samling.getAntalKort();

	        // Bruk en enkel boblesortering for å sortere kortene
	        for (int i = 0; i < antallKort - 1; i++) {
	            for (int j = 0; j < antallKort - i - 1; j++) {
	                if (kortTabell[j].compareTo(kortTabell[j + 1]) > 0) {
	                    // Bytt plass på kortene
	                    Kort temp = kortTabell[j];
	                    kortTabell[j] = kortTabell[j + 1];
	                    kortTabell[j + 1] = temp;
	    // TODO - END                
	                }
	            }
	        }
	    }

		
		// TODO - END
	
	/**
	 * Stokkar en kortsamling. 
	 * 
	 * @param samling
	 * 			samling av kort som skal stokkes. 
	 */
	public static void stokk(KortSamling samling) {
		
		// TODO - START
		
	    Kort[] kortTabell = samling.getSamling();
        int antallKort = samling.getAntalKort();
        Random random = new Random();

        // Bruk Fisher-Yates algoritme for å stokke kortene
        for (int i = antallKort - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            // Bytt plass på kortene
            Kort temp = kortTabell[i];
            kortTabell[i] = kortTabell[j];
            kortTabell[j] = temp;
        }
    }

		// TODO - END
}
	

