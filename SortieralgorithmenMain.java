
/**
 * Beschreiben Sie hier die Klasse SortieralgorithmenMain.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class SortieralgorithmenMain
{
    public static void main(String[] args)
    {
        // Neues IO Objekt wird erstellt, um auf die Konsole schreiben zu können
        IO io = new IO();
        
        io.println("Zufaellige Zahlen werden erstellt...");
        // Die Methode zahlenErstellen mit dem Parameter 5 wird aufgerufen, um ein Zahlen-Array der Länge 5 zu erhalten
        int[] zahlen = zahlenErstellen(5);
        
        io.println("Zahlen:");
        // Um das oben erstellte Zahlen-Array auszugeben verwenden wir die Methode zahlenAusgeben
        zahlenAusgeben(zahlen);
        
        
        io.println("Bubblesort");
        // Es wird ein neues Objekt von der Klasse Bubblesort erzeugt um auf die bubblesort-Methode zugreifen zu können
        Bubblesort bs = new Bubblesort();
        // Jetzt rufen wir die bubblesort-Methode auf und speichern den Rückgabewert
        int[] sortierteZahlenBS = bs.bubblesort(zahlen);
        // Zum Schluss geben wir den gespeicherten Rückgabewert der Methode bubblesort, sprich das sortierte Array, auf der Konsole aus
        zahlenAusgeben(sortierteZahlenBS);
        
        
        io.println("Selectionsort");
        // Es wird ein neues Objekt von der Klasse Selectionsort erzeugt um auf die selectionsort-Methode zugreifen zu können
        Selectionsort ss = new Selectionsort();
        // Jetzt rufen wir die selectionsort-Methode auf und speichern den Rückgabewert
        int[] sortierteZahlenSS = ss.selectionsort(zahlen);
        // Zum Schluss geben wir den gespeicherten Rückgabewert der Methode selectionsort, sprich das sortierte Array, auf der Konsole aus
        zahlenAusgeben(sortierteZahlenSS);
        
        
        
        io.println("Insertionsort");
        // Es wird ein neues Objekt von der Klasse Insertionsort erzeugt um auf die insertionsort-Methode zugreifen zu können
        Insertionsort is = new Insertionsort();
        // Jetzt rufen wir die selectionsort-Methode auf und speichern den Rückgabewert
        int[] sortierteZahlenIS = is.insertionsort(zahlen);
        // Zum Schluss geben wir den gespeicherten Rückgabewert der Methode selectionsort, sprich das sortierte Array, auf der Konsole aus
        zahlenAusgeben(sortierteZahlenIS);
    }
    
    // Diese Methode erstellt ein neues Array der Länge "laenge", befüllt es mit zufälligen Zahlen zwischen 1 und 10 und gibt es zurück
    public static int[] zahlenErstellen(int laenge)
    {
        // Ein neues int-Array wird erstellt
        int[] zahlen = new int[laenge];
        
        // Jetzt durchlaufen wir das Array, um an jeder Stelle einzeln etwas hineinzuspeichern
        for(int i = 0; i < zahlen.length; i++)
        {
            // Eine zufällige Zahl wird erstellt
            // Math.random() gibt einen double-Wert zwischen 0 und 1 zurück. Das heißt mal 10 und plus 1 gibt Werte zwischen 1 und 10 zurück
            int zufaelligeZahl = (int)(Math.random()*10+1);
            
            // Im Anschluss speichern wir die zufällige Zahl an der aktuellen Stelle i in das Array
            zahlen[i] = zufaelligeZahl;
        }
        // Zum Schluss geben wir das befüllte Array zurück
        return zahlen;
    }
    
    public static void zahlenAusgeben(int[] zahlen)
    {
        // Neues IO Objekt wird erstellt, um auf die Konsole schreiben zu können
        IO io = new IO();
        
        // Um die Inhalte eines Arrays ausgeben zu können muss es immer durchlaufen werden!
        for(int i = 0; i < zahlen.length; i++)
        {
            // Jetzt geben wir die Zahl an der aktuellen Stelle i auf der Konsole aus 
            io.println(zahlen[i]);
        }
    }
}
