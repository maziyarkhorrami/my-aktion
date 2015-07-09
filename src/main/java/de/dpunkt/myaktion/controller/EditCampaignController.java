package de.dpunkt.myaktion.controller;

import de.dpunkt.myaktion.data.CampaignProducer;
import de.dpunkt.myaktion.data.CampaignListProducer;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

/**
 * Created by maziyar on 07/07/2015.
 */
@Named
@SessionScoped
public class EditCampaignController implements Serializable {
    private static final long serialVersionUID = -5499385909551980540L;

    @Inject
    private CampaignListProducer campaignListProducer;
    @Inject
    private CampaignProducer CampaignProducer;

    public String doSave(){
        if(CampaignProducer.isAddMode()){
            campaignListProducer.getCampaigns().add(CampaignProducer.getSelectedCampaign());
        }
        return Pages.LIST_CAMPAIGNS;
    }
    public String doCancel(){
        return Pages.LIST_CAMPAIGNS;
    }
}
