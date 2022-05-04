/*
Default Methods Override
Exercise: default methods override

define a SmartphonePrice class that implements Cloneable and has:
2 attributes:
a string priceType
a double priceInEuros
[using IntelliJ] an override of the clone() method (that will have to be public) where:
a clonedSmartphonePrice is generated using super.clone()
the return value is a SmartphonePrice object
[using IntelliJ] an override of the toString() method for returning an informative String about the 2 SmartphonePrice attributes
[using IntelliJ] an override of the equals() method that check the 2 attributes to establish if two SmartphonePrice objects are equal
[using IntelliJ] an override of the hashCode(), using the 2 attributes
a constructor method that accepts 2 params (type, price) and assign the right values to the object
 */
import java.util.Objects;

/**
 * Classe per la definizione dei prezzi dello smartphone.Importa il package Objects e implementa l'interfaccia Cloneable
 */
public class SmartphonePrice implements Cloneable{
    /**
     * Tipo di valuta utilizzata
     */
    String priceType;
    /**
     * prezzo
     */
    double priceInEuros;

    /**
     * Override del metodo clone della classe Object.
     * Viene richiamato dall'override del metodo clone() della classe Smartphone.
     * @return Un oggetto identico nei parametri ma non nell'indirizzamento alla memoria
     * @throws CloneNotSupportedException
     */
    @Override
    public SmartphonePrice clone() throws CloneNotSupportedException {
        SmartphonePrice clonedSmartphonePrice = (SmartphonePrice) super.clone();
        return clonedSmartphonePrice;
    }

    /**
     * Override del metodo toString della classe Object
     * @return Una String di con scritto il tipo di valuta e il prezzo con i rispettivi valori.
     */
    @Override
    public String toString() {
        return  " Type='" + priceType + '\'' +
                ", Price=" + priceInEuros;
    }

    /**
     * Override del metodo equals della classe Object
     * @param o l'oggetto da comparare
     * @return true se i parametri dell'oggetto in comparazione sono uguali altrimenti false
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SmartphonePrice that = (SmartphonePrice) o;
        return Double.compare(that.priceInEuros, priceInEuros) == 0 && Objects.equals(priceType, that.priceType);
    }

    /**
     * @hidden Non utilizzato. Per eventuale implementazione futura.
     * @return Un valore di codice hash per l'oggetto
     */
    @Override
    public int hashCode() {
        return Objects.hash(priceType, priceInEuros);
    }

    /**
     * Costruttore
     * @param type tipo di valuta utilizzata
     * @param price prezzo
     */
    public SmartphonePrice(String type, double price) {
        this.priceType = type;
        this.priceInEuros = price;
    }
}
