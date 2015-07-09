package de.dpunkt.myaktion.model;
/**
 * Created by maziyar on 03/07/2015.
 */
public class Account {
    private String name;
    private String nameOfBank;
    private String iban;



    public Account(String name, String nameOfBank, String iban) {
        super();
        this.name = name;
        this.nameOfBank = nameOfBank;
        this.iban = iban;
    }


    public Account() {
        this(null ,null ,null);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameOfBank() {
        return nameOfBank;
    }

    public void setNameOfBank(String nameOfBank) {
        this.nameOfBank = nameOfBank;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }
}
