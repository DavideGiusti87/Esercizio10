/*
Default Methods Override
Exercise: default methods override

define a Smartphone class that implements Cloneable and has:
5 attributes:
a string brandName
a string modelName
an int batterymAh
an attribute producerPrice of type SmartphonePrice
an attribute retailPrice of type SmartphonePrice
[using IntelliJ] an override of the toString() method in order to print all the attributes of a Smartphone object
[using IntelliJ] an override of the equals() method that check all the 5 attributes to establish if two Smartphone objects are equal
[using IntelliJ] an override of the hashCode(), using all the 5 attributes
[using IntelliJ] an override of the clone() method (that will have to be public) where:
a clonedSmartphone is generated using super.clone()
there's an assignment to the clonedSmartphone.producerPrice
there's an assignment to the clonedSmartphone.retailPrice
the return value is a Smartphone object
a constructor method that accepts 5 params (brand, model, battery, prodP, retailP) and assign the right values to the object
 */
import java.util.Objects;

/**
 * Classe per la creazione di smartphone.Importa il package Objects e implementa l'interfaccia Cloneable
 */
public class Smartphone implements Cloneable{
    /**
     * Nome della casa di produzione
     */
    String brandName;
    /**
     * Nome del modello
     */
    String modelName;
    /**
     * Amperaggio della batteria
     */
    int batterymAh;
    /**
     * Prezzo di costo dal produttore
     */
    SmartphonePrice producerPrice ;
    /**
     * Prezzo alla vendita
     */
    SmartphonePrice retailPrice;

    /**
     * Override del metodo toString della classe Object
     * @return una stringa con la descrizione delle variabili e le rispettive caratteristiche
     */
    @Override
    public String toString() {
        return "~Smartphone~\n" +
                "Brand Name:'" + brandName + '\'' +
                ", Model Name:'" + modelName + '\'' +
                ", Battery mAh:" + batterymAh +
                ", Producer Price:" + producerPrice +
                ", Retail Price:" + retailPrice;
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
        Smartphone that = (Smartphone) o;
        return batterymAh == that.batterymAh && Objects.equals(brandName, that.brandName) && Objects.equals(modelName, that.modelName) && Objects.equals(producerPrice, that.producerPrice) && Objects.equals(retailPrice, that.retailPrice);
    }

    /**
     * @hidden Non utilizzato. Per eventuale implementazione futura.
     * @return Un valore di codice hash per l'oggetto
     */
    @Override
    public int hashCode() {
        return Objects.hash(brandName, modelName, batterymAh, producerPrice, retailPrice);
    }

    /**
     * Override del metodo clone della classe Object.
     * @implNote Override SmartphonePrice clone()
     * @return Un oggetto identico nei parametri ma non nell'indirizzamento alla memoria
     * @throws CloneNotSupportedException
     */
    @Override
    public Smartphone clone() throws CloneNotSupportedException {
        Smartphone clonedSmartphone = (Smartphone)super.clone();
        clonedSmartphone.producerPrice = this.producerPrice.clone();
        clonedSmartphone.retailPrice = this.retailPrice.clone();
        return clonedSmartphone;
    }

    /**
     * Costruttore
     * @param brand Nome della casa di produzione
     * @param model Nome del modello
     * @param battery Amperaggio della batteria
     * @param prodP Prezzo di costo dal produttore
     * @param retailP Prezzo alla vendita
     */
    public Smartphone(String brand, String model, int battery, SmartphonePrice prodP, SmartphonePrice retailP) {
        this.brandName = brand;
        this.modelName = model;
        this.batterymAh = battery;
        this.producerPrice = prodP;
        this.retailPrice = retailP;
    }
}
