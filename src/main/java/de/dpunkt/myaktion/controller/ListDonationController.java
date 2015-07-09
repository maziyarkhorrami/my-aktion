package de.dpunkt.myaktion.controller;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;

/**
 * Created by maziyar on 08.07.2015.
 */
@SessionScoped
@Named
public class ListDonationController implements Serializable {
    private static final long serialVersionUID = 5501054983076499452L;
    public String doOK(){
        return Pages.LIST_CAMPAIGNS;
    }
}
