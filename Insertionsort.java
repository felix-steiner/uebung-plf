
/**
 * Beschreiben Sie hier die Klasse InsertionSort.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Insertionsort
{
    // Diese Methode erhält ein Zahlen Array und gibt es sortiert wieder zurück
    public int[] insertionsort(int[] zahlen)
    {
        // Für Erklärung der Funktionsweise siehe: https://studyflix.de/informatik/insertionsort-1321
        
        // Diese Variable wird später verwendet, um Werte von zwei Variablen zu tauschen (dazu muss man einen Wert vorher zwischenspeichern)
        int temp;
        
        // Zuerst durchlaufen wir das Array von der 1ten (index = 1) bis zur letzten Stelle
	for (int i = 1; i < zahlen.length; i++) 
	{
            // Zunächst zwischenspeichern wir die aktuelle Zahl
	    temp = zahlen[i];
	    
	    // Der aktuelle Index wird zwischengespeichert
            int j = i;
            
            // Diese Schleife wird solange ausgeführt bis die neue Zahl an der richtigen Stelles steht
            while (j > 0 && zahlen[j - 1] > temp) 
            {
                // Da die aktuelle Zahl kleiner als die vorhergehende ist (j-1) müssen sie getauscht werden
                zahlen[j] = zahlen[j - 1];
                
                // Jetzt wird j um eins verkleinert, damit die while-Schleife nicht endlos läuft
        	j--;
            }
            // Zum Schluss wird der Wert getauscht
            zahlen[j] = temp;
	}
	// Schlussendlich wird das sortierte Array zurückgegeben
	return zahlen;
    }
}
