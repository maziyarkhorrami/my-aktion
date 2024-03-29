package de.dpunkt.myaktion.data;

import de.dpunkt.myaktion.model.Campaign;
import javax.ejb.LocalBean;
import javax.enterprise.context.SessionScoped;
import javax.enterprise.inject.Default;
import javax.inject.Named;
import java.io.Serializable;

/**
 * Created by maziyar on 07/07/2015.
 */
@SessionScoped
@Named
public class CampaignProducer implements Serializable {
    private static final long serialVersionUID = -6106851383905320473L;
    private enum Mode{
        EDIT,ADD;
    }
    private Campaign campaign;
    private Mode mode;
    public Campaign getSelectedCampaign(){
        return campaign;
    }
    public void setSelectedCampaign(Campaign campaign){
        this.campaign = campaign;
    }
    public boolean isAddMode(){
        return mode == Mode.ADD;
    }
    public void prepareAddCampaign(){
        this.campaign = new Campaign();
        this.mode = Mode.ADD;
    }
    public void prepareEditCampaign(Campaign campaign){
        this.campaign = campaign;
        this.mode = Mode.EDIT;
    }

}
