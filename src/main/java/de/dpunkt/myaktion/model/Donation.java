package de.dpunkt.myaktion.model;

/**
 * Created by maziyar on 03/07/2015.
 */
public class Donation {
    private Double amount;
    private String donorName;
    private Boolean recieptRequest;
    private Status status;
    private Account account;

    public Donation() {
        this.account = new Account();
    }


    public enum Status {
        TRANSFERRED, IN_PROCESS,
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getDonorName() {
        return donorName;
    }

    public void setDonorName(String donorName) {
        this.donorName = donorName;
    }

    public Boolean getRecieptRequest() {
        return recieptRequest;
    }

    public void setRecieptRequest(Boolean recieptRequest) {
        this.recieptRequest = recieptRequest;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
