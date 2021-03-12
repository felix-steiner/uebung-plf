
/**
 * Beschreiben Sie hier die Klasse SelectionSort.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Selectionsort
{
    // Diese Methode erhält ein Zahlen Array und gibt es sortiert wieder zurück
    public int[] selectionsort(int[] zahlen)
    {
        // Für Erklärung der Funktionsweise siehe: https://www.youtube.com/watch?v=y9B2oZV3iUI
        
        // Zuerst durchlaufen wir das Array von der 0ten bis zur vorletzten Stelle
        for (int i = 0; i < zahlen.length - 1; i++) 
        { 
            // Zunächst speichern wir den aktuellen Index in eine neue Variable
            int minimumIndex = i; 
            
            // Danach laufen wir das Array durch (beginnend bei der nächsten Stelle nach i)
            for (int j = i + 1; j < zahlen.length; j++)
            {
                // Jetzt überprüfen wir, ob wir eine kleinere Zahl finden, als die, die an der Stelle i gespeichert ist
                if (zahlen[j] < zahlen[minimumIndex]) 
                {
                    // Falls wir eine kleinere Zahl finden, speichern wir den Index der kleineren Zahl in die Variable minimumIndex
                    minimumIndex = j;   
                }
            }
            // Im Anschluss tauschen wir die Werte (die aktuelle Stelle i wird mit der kleinsten Zahl getauscht)
            int temp = zahlen[minimumIndex]; 
            zahlen[minimumIndex] = zahlen[i]; 
            zahlen[i] = temp; 
        } 
	return zahlen;
    }
}
