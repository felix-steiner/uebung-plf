
/**
 * Beschreiben Sie hier die Klasse MainZoo.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class ZooMain
{
    public static void main(String[] args)
    {
        // Zuerst rufen wir die Methode tiereErzeugen auf, um ein befülltes Array vom Typ Tier zu erhalten und speichern diesen Wert in der Variable tiere
        Tier[] tiere = tiereErzeugen();
        
        // Als nächstes rufen wir die Methode tiereAusgeben auf und geben als Parameter unser Tier-Array mit, welches wir gerade erzeugt haben
        tiereAusgeben(tiere);
    }
    
    // diese Methode gibt ein neues Array vom Typ Tier zurück
    public static Tier[] tiereErzeugen()
    {
        // Neues Array der Größe 3 wird angelegt
        Tier[] tiere = new Tier[3];
        
        // Neue Objekte vom Typ Tier werden erzeugt
        Tier t1 = new Tier("Mimi", "Katze", 4.0);
        Tier t2 = new Tier("Bello", "Hund", 8.0);
        Tier t3 = new Tier("Lilo", "Hamster", 0.5);
        
        // Die neuen Tiere werden in das Array gespeichert. Dazu muss man einfach auf die Indizes des Arrays zugreifen (mittels eckigen Klammern)
        tiere[0] = t1;
        tiere[1] = t2;
        tiere[2] = t3;
        
        // Jetzt haben wir ein befülltes Array vom Typ Tier, welches wir jetzt zurückgeben
        return tiere;
        // Wenn wir etwas zurückgeben kann man den zurückgegeben Wert dort speichern, wo man die Methode aufruft (in unserem Fall Zeile 13)
    }
    
    // diese Methode gibt nichts zurück, nimmt aber ein Tier-Array als Parameter um es auszugeben
    public static void tiereAusgeben(Tier[] tiereArray)
    {
        // Neues IO Objekt wird erstellt um etwas auf der Konsole ausgeben zu Können
        IO io = new IO();
        
        io.println("Im Zoo sind folgende Tiere:");
        // Jetzt durchlaufen wir das Array mit Hilfe einer for-Schleife, um auf jedes Element des Arrays einzeln zugreifen zu können
        for(int i = 0; i < tiereArray.length; i++)
        {
            // Wir greifen nun auf das Element an der Stelle i zu und speichern uns das Tier in eine neue Variable
            Tier tier = tiereArray[i];
            
            // Jetzt geben wir die Felder des Tieres auf der Konsole aus
            io.println(tier.tierart + ": " + tier.name + ", " + tier.gewicht);
        }
    }
}
