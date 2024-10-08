package org.hbrs.se1.ws24.exercises.uebung1.view;
import com.sun.java.accessibility.util.Translator;
import org.hbrs.se1.ws24.exercises.uebung1.control.GermanTranslator;

public class Client {

		/**
		 * Methode zur Ausgabe einer Zahl auf der Console
		 * (auch bezeichnet als CLI, Terminal)
		 *
		 */
		 void display( int aNumber ){
			Object a = aNumber;
			 GermanTranslator translator = (GermanTranslator) a;


			 System.out.println("Das Ergebnis der Berechnung: " + translator.translateNumber((Integer) a));


		 }
}




