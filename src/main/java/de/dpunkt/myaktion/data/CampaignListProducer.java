package de.dpunkt.myaktion.data;

import de.dpunkt.myaktion.model.Account;
import de.dpunkt.myaktion.model.Campaign;
import de.dpunkt.myaktion.model.Donation;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by maziyar on 06/07/2015.
 */
@SessionScoped
@Named
public class CampaignListProducer implements Serializable{


    private static final long serialVersionUID = -2485605776831417092L;
    private List<Campaign> campaigns;
    public CampaignListProducer(){
        campaigns = createMockCampaigns();
    }
    public List<Campaign> getCampaigns() {
        return campaigns;
    }
    public List<Campaign> createMockCampaigns(){
        Donation donation1 = new Donation();
        donation1.setDonorName("HeinzSchmidt");
        donation1.setAmount(20d);
        donation1.setRecieptRequest(true);
        donation1.setStatus(Donation.Status.TRANSFERRED);
        donation1.setAccount(new Account(donation1.getDonorName(), "XXX Bank", "DE00000000000000000000"));
        Donation donation2 = new Donation();
        donation2.setDonorName("Karl meier");
        donation2.setAmount(30d);
        donation2.setRecieptRequest(false);
        donation2.setStatus(Donation.Status.IN_PROCESS);
        donation2.setAccount(new Account(donation1.getDonorName(), "YYY Bank", "DE00000000000000000111"));
        List<Donation> spenden = new LinkedList<>();
        spenden.add(donation1);
        spenden.add(donation2);
        Campaign campaign1 = new Campaign();
        campaign1.setName("Trikuts für A-Jungend");
        campaign1.setTargetAmount(1000d);
        campaign1.setAmountDonatedSoFar(258d);
        campaign1.setDonationMinimum(20d);
        campaign1.setId(1L);
        campaign1.setAccount(new Account("Max Mustermann", "ABC Bank", "DE00000000000000000222"));
        campaign1.setDonations(spenden);
        Campaign campaign2 = new Campaign();
        campaign2.setName("Rollstuhl für Maria");
        campaign2.setTargetAmount(2500d);
        campaign2.setAmountDonatedSoFar(742d);
        campaign2.setDonationMinimum(25d);
        campaign2.setId(2L);
        campaign2.setAccount(campaign1.getAccount());
        campaign2.setDonations(spenden);
        List<Campaign> ret = new LinkedList<>();
        ret.add(campaign1);
        ret.add(campaign2);
        return ret;


    }
}
