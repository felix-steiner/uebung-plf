
/**
 * Beschreiben Sie hier die Klasse ParkplatzMain.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class ParkplatzMain
{
    public static void main(String[] args)
    {
        // Die Methode zum Fahrzeuge erzeugen aufrufen
        Fahrzeug[] fahrzeuge = fahrzeugeErzeugen();
        
        // Die Fahrzeuge auf der Konsole ausgeben
        fahrzeugeAusgeben(fahrzeuge);
    }
    
    // Diese Methode gibt ein Array mit Fahrzeugen zurück
    public static Fahrzeug[] fahrzeugeErzeugen()
    {
        // Neues Array vom Typ Fahrzeug mit der Größe 10 erzeugen
        Fahrzeug[] fahrzeuge = new Fahrzeug[10];
        
        // Neue Objekte von der Klasse Fahrzeug erstellen
        Fahrzeug f1 = new Fahrzeug("Audi", "schwarz", 150);
        Fahrzeug f2 = new Fahrzeug("BMW", "blau", 120);
        Fahrzeug f3 = new Fahrzeug("Mercedes", "grau", 180);
        
        // Die erstellten Fahrzeug-Objekte in das Array speichern
        fahrzeuge[0] = f1;
        fahrzeuge[1] = f2;
        fahrzeuge[2] = f3;
        
        // Das befüllte Array wird nun zurückgegeben
        return fahrzeuge;
    }
    
    // Diese Methode gibt ein Array vom Typ Fahrzeug auf der Konsole aus
    public static void fahrzeugeAusgeben(Fahrzeug[] fahrzeuge)
    {
        // Neues Objekt vom Typ IO anlegen, um etwas auf der Konsole ausgeben zu können
        IO io = new IO();
        for (int i = 0; i < fahrzeuge.length; i++)
        {
            // Fahrzeug an der aktuellen zwischenspeichern
            Fahrzeug fahrzeug = fahrzeuge[i];
            
            // Überprüfen, ob das Element an der aktuellen Stelle leer ist
            if (fahrzeug == null)
            {
                io.println("Kein Fahrzeug geparkt");
            }
            else
            {
                // Falls das aktuelle Element nicht leer ist, wird es auf der Konsole
                io.println(i +": " + fahrzeug.marke + " in der Farbe " + fahrzeug.farbe + " mit " + fahrzeug.ps + " PS");      
            }
        }
    }
}
