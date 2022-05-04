/*
Default Methods Override
Exercise: default methods override

define a tester class with main() method where you:
create 4 new SmartphonePrice objects: 2 for Producer and 2 for Retail
create 2 new Smartphone objects, using the 4 newly created SmartphonePrice objects
print in console all the details of the 2 newly created Smartphone objects
check if the first smartphone is equal to the second smartphone, informing the user
use a try{ ... } catch(Exception exception) { ... } to:
get a new Smartphone object by cloning the second Smartphone
print in console all the details of the newly cloned object
check if the second smartphone is equal to the newly cloned object, informing the user
inside the catch(Exception exception) { ... } scope:
print the stack trace of the exception
inform the user about the error
 */
/**
 * Classe principale per testare le classi Smartphone e SmartphonePrice
 */
public class Tester {
    /**
     * Metodo principale
     * @param args non in uso
     */
    public static void main(String[] args) {
        /**
         * Rappresenta il prezzo di costo di iPhone
         */
        SmartphonePrice producerSmartphone = new SmartphonePrice("Dollar", 570);
        /**
         * Rappresenta il prezzo di vendita di iPhone
         */
        SmartphonePrice retailSmartphone = new SmartphonePrice("Euro", 1189);
        /**
         * Rappresenta il prezzo di costo di Galaxy
         */
        SmartphonePrice producerSmartphone2 = new SmartphonePrice("Won", 1469879.83);
        /**
         * Rappresenta il prezzo di vendita di Galaxy
         */
        SmartphonePrice retailSmartphone2 = new SmartphonePrice("Euro", 1099);

        /**
         * Creazione dell' iPhone
         */
        Smartphone iPhone = new Smartphone("Apple", "iPhone 13 Pro", 3095, producerSmartphone, retailSmartphone);
        /**
         * Creazione del Galaxy
         */
        Smartphone galaxyZ = new Smartphone("Samsung", "Galaxy Z", 4500, producerSmartphone2, retailSmartphone2);

        /**
         * Stampa le caratteristiche dell'iPhone
         * @implNote Override toString di Smartphone e SmartphonePrice
         */
        System.out.println(iPhone);
        /**
         * Stampa le caratteristiche del Galaxy
         * @implNote Override toString di Smartphone e SmartphonePrice
         */
        System.out.println(galaxyZ);

        /**
         * compara i due smartphone
         * @implNote equals di Smartphone e SmartphonePrice
         */
        System.out.printf("The two smartphone is equals: %s%n",iPhone.equals(galaxyZ));


        try {
            /**
             * Clona il Galaxy
             */
            Smartphone cloneGalaxyZ = galaxyZ.clone();
            /**
             * Stampa le caratteristiche del Galaxy
             */
            System.out.println("~CLONE~\n"+cloneGalaxyZ);
            /**
             * Compara l'oggetto Galaxy con il clone creato e stampa il risultato
             */
            System.out.printf("The two smartphone is equals: %s%n",galaxyZ.equals(cloneGalaxyZ));

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            System.out.println("Error in the cloning");
        }


    }
}
