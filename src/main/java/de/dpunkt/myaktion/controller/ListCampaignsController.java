package de.dpunkt.myaktion.controller;

import com.sun.org.apache.xerces.internal.impl.dtd.models.CMAny;
import de.dpunkt.myaktion.data.CampaignProducer;
import de.dpunkt.myaktion.model.Campaign;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

/**
 * Created by maziyar on 06/07/2015.
 */
@SessionScoped
@Named
public class ListCampaignsController implements Serializable {

    private static final long serialVersionUID = 8303685327734112257L;
    @Inject
    private CampaignProducer campaignProducer;

    private Campaign campaignToDelete;

    public void doDeleteCampaign(Campaign campaign){
        this.campaignToDelete = campaign;
        System.out.println("Aktion zum löschen vorgemerkt");
    }

    public void commitDeleteCampaign(){
        System.out.println("Aktion köschen noch nicht implementiert");
    }

    public String doAddCampaign(){
        campaignProducer.prepareAddCampaign();
        return Pages.EDIT_CAMPAIGN;
    }
    public String doEditCampaign(Campaign campaign){
        campaignProducer.prepareEditCampaign(campaign);
        return Pages.EDIT_CAMPAIGN;
    }
    public String doEditDonationForm(Campaign campaign){
        campaignProducer.setSelectedCampaign(campaign);
        return Pages.EDIT_DONATION_FORM;
    }
    public String doListDonations(Campaign campaign){
        campaignProducer.setSelectedCampaign(campaign);
        return Pages.LIST_DONATIONS;
    }
}
