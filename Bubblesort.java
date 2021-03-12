
/**
 * Beschreiben Sie hier die Klasse BubbleSort.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Bubblesort
{
    // Diese Methode erhält ein Zahlen Array und gibt es sortiert wieder zurück
    public int[] bubblesort(int[] zahlen)
    {   
        // Für Erklärung der Funktionsweise siehe: https://www.youtube.com/watch?v=qtXb0QnOceY
        
        // Diese Variable wird später verwendet, um Werte von zwei Variablen zu tauschen (dazu muss man einen Wert vorher zwischenspeichern)
        int temp;
	for (int i = 1; i < zahlen.length; i++) 
	{
            for (int j = 0; j < zahlen.length - i; j++)
            {
                // Es wird überprüft, ob die Zahl aktuelle Zahl größer ist als die nächste
                if (zahlen[j] > zahlen[j+1])
                {
                    // Falls dies der Fall ist werden die beiden Zahlen getauscht, damit sie aufsteigend sortiert sind
                    
                    // Um die Werte tauschen zu können, speichern wir zunächst den Wert der aktuellen Zahl
                    temp = zahlen[j];
                    // Danach weisen wir der aktuellen Zahl den Wert der nächsten Zahl zu (tauschen)
                    zahlen[j] = zahlen[j+1];
                    // Zum Schluss weisen wir der nächsten Zahl den Wert der aktuellen Zahl zu
                    // Achtung: Jetzt müssen wir die Variable temp dazu verwenden, da der Wert der aktuellen Zahl in Zeile 29 schon getauscht wurde
                    zahlen[j+1] = temp;
                }
            }
	}
	// Schlussendlich geben wir das sortierte Array zurück
	return zahlen;
    }
}
