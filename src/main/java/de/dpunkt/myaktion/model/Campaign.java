package de.dpunkt.myaktion.model;

import java.util.List;

/**
 * Created by maziyar on 03/07/2015.
 */
public class Campaign {
    private String name;
    private Double targetAmount;
    private Double donationMinimum;
    private double amountDonatedSoFar;
    private Account account;
    private Long id;
    private List<Donation> donations;

    public double getAmountDonatedSoFar() {
        return amountDonatedSoFar;
    }

    public void setAmountDonatedSoFar(double amountDonatedSoFar) {
        this.amountDonatedSoFar = amountDonatedSoFar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getTargetAmount() {
        return targetAmount;
    }

    public void setTargetAmount(Double targetAmount) {
        this.targetAmount = targetAmount;
    }

    public Double getDonationMinimum() {
        return donationMinimum;
    }

    public void setDonationMinimum(Double donationMinimum) {
        this.donationMinimum = donationMinimum;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Donation> getDonations() {
        return donations;
    }

    public void setDonations(List<Donation> donations) {
        this.donations = donations;
    }

    public Campaign() {
        account = new Account();
    }

}
