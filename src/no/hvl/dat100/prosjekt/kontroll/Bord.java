package no.hvl.dat100.prosjekt.kontroll;

import no.hvl.dat100.prosjekt.modell.KortSamling;
import no.hvl.dat100.prosjekt.modell.KortUtils;
import no.hvl.dat100.prosjekt.TODO;
import no.hvl.dat100.prosjekt.modell.Kort;

/**
 * Klasse som implementerer bordet som spilles på. 
 * 
 * Klassen har objektvariablene bunkeTil og bunkeFra som skal brukes til å representere 
 * kortene som er i de to bunker på border. 
 */
public class Bord {

	private KortSamling bunkeFra;
	private KortSamling bunkeTil;
	
	/**
	 * Metoden oppretter to bunker, til- og fra-bunken
	 * Alle kortene legges til fra-bunken. 
	 */
	public Bord() {
		
		// TODO - START
		
	bunkeFra = new KortSamling();
	bunkeTil = new KortSamling();
	
		// TODO - END
	}
	
	/**
	 * Gir peker/referanse til til-bunken.
	 * 
	 * @return referanse/peker til til-bunken.
	 */
	public KortSamling getBunkeTil() {
		
		return bunkeTil;
		
	}

	/**
	 * Gir peker/referanse til fra-bunken.
	 * 
	 * @return referanse/peker til fra-bunken.
	 */
	public KortSamling getBunkeFra() {
		
		return bunkeFra;
		
	}
	
	/**
	 * Sjekker om til-bunken er tom.
	 * 
	 * @return true om til-bunken er tom, false ellers.
	 */
	public boolean bunketilTom() {
		
		// TODO - START
				
		if (bunkeFra.erTom()) {
			return true;
		}else {
			return false;
		}
		

		// TODO - END
	}

	/**
	 * Sjekker om fra-bunken er tom.
	 * 
	 * @return true om fra-bunken er tom, false ellers.
	 */
	public boolean bunkefraTom() {
		
		// TODO - START
		
	if (bunkeTil.erTom()) {
		return true;
	}else {
		return false;
	}
	
		// TODO - END
		
	}
	
	/**
	 * Gir antall kort i fra-bunken.
	 * 
	 * @return antall kort i fra-bunken.
	 */
	public int antallBunkeFra() {
		
		// TODO - START
		
	return bunkeFra.getAntalKort();

		// TODO - END
	}

	/**
	 * Gir antall kort i til-bunken.
	 * 
	 * @return antall kort i til-bunken.
	 */
	public int antallBunkeTil() {
		
		// TODO - START
		
	return bunkeTil.getAntalKort();
	
	
	// TODO - END
	}
	
	/**
	 * Tar øverste kortet fra fra-bunken og legger dettte til til-bunken (med
	 * billedsiden opp, men det trenger ikke gruppen tenke på).
	 */
	public void vendOversteFraBunke() {
		
		// TODO - START
		
	    if (!bunkeFra.erTom()) {
	        Kort øversteKort = bunkeFra.taSiste(); 
	        bunkeTil.leggTil(øversteKort); 	    }
	}
		// TODO - END
		
	
		
	/**
	 * Tar øverste kortet fra fra-bunken.
	 * 
	 * @return peker/referanse til det kort som blev tatt fra fra-bunken
	 */
	
	public Kort taOversteFraBunke() {
		
		// TODO - START
		
		   if (bunkeFra.erTom()) { 
		        return bunkeFra.taSiste(); 
		    } else {
		        return null; 
		    }
		}
		// TODO - END
	
	
	/**
	 * Metode som leser øverste kortet i til-bunken. Kortet vil fremdeles være
	 * øverst i til-bunken etter at metoden er utført.
	 * 
	 * @return peker/referanse til øverste kortet i til-bunken.
	 */
	public Kort seOversteBunkeTil() {
		
		// TODO - START
		
	    if (bunkeTil.erTom()) { 
	        return bunkeTil.seSiste();
	    } else {
	        return null; 
	    }
	
	}
	
	/**
	 * Når fra-bunken blir tom, tar man vare på kortet pÂ toppen av til-bunken.
	 * Deretter legges alle den andre kortene i til-bunken over i fra-bunken.
	 * Denne stokkes og kortet som man har tatt vare pÂ legges tilbake i
	 * til-bunken. Det vil nå være det eneste kortet i til-bunken.
	 */
	public void snuTilBunken() {

	    if (bunkeFra.erTom() && !bunkeTil.erTom()) { // Sjekk om fra-bunken er tom og til-bunken har kort
	        Kort øversteKort = bunkeTil.taUtSiste(); // Ta vare på kortet på toppen av til-bunken

	        // Flytt alle de andre kortene fra til-bunken over til fra-bunken
	        while (!bunkeTil.erTom()) {
	            Kort kort = bunkeTil.taUtSiste();
	            bunkeFra.leggTilKort(kort);
	        }

	        // Stokk fra-bunken
	        bunkeFra.stokkKortene();

	        // Legg kortet du tok vare på tilbake i til-bunken
	        bunkeTil.leggTilKort(øversteKort);
	    }
	}
		
	/**
	 * Metode som legger et kort i til-bunken. 
	 * 
	 * @param k
	 * 			kort som skal legges ned. 
	 * 	
	 */
	public void leggNedBunkeTil(Kort k) {
		
		// TODO - START
		
		throw new UnsupportedOperationException(TODO.method());
		// TODO - END
				
	}
}
