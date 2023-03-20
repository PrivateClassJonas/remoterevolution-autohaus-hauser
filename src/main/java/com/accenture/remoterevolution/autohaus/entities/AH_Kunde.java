package com.accenture.remoterevolution.autohaus.entities;

public class AH_Kunde {

    private Long kundenId;
    private String kundenName;
    private String kundenFamName;
    private String kundenTelNr;
    private String kundenEintrittDat;
    private String kundenEmail;
    private Long autohausId;

    public Long getKundenId() {
        return kundenId;
    }

    public void setKundenId(Long kundenId) {
        this.kundenId = kundenId;
    }

    public String getKundenName() {
        return kundenName;
    }

    public void setKundenName(String kundenName) {
        this.kundenName = kundenName;
    }

    public String getKundenFamName() {
        return kundenFamName;
    }

    public void setKundenFamName(String kundenFamName) {
        this.kundenFamName = kundenFamName;
    }

    public String getKundenTelNr() {
        return kundenTelNr;
    }

    public void setKundenTelNr(String kundenTelNr) {
        this.kundenTelNr = kundenTelNr;
    }

    public String getKundenEintrittDat() {
        return kundenEintrittDat;
    }

    public void setKundenEintrittDat(String kundenEintrittDat) {
        this.kundenEintrittDat = kundenEintrittDat;
    }

    public String getKundenEmail() {
        return kundenEmail;
    }

    public void setKundenEmail(String kundenEmail) {
        this.kundenEmail = kundenEmail;
    }

    public Long getAutohausId() {
        return autohausId;
    }

    public void setAutohausId(Long autohausId) {
        this.autohausId = autohausId;
    }
}
