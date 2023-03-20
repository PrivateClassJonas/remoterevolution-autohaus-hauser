package com.accenture.remoterevolution.autohaus.entities;

public class AH_Kfz {

    private Long kfzId;
    private String kfzBezeichnung;
    private String kfzMarke;
    private Long kfzMilage;
    private Long autohausId;

    public Long getKfzId() {
        return kfzId;
    }

    public void setKfzId(Long kfzId) {
        this.kfzId = kfzId;
    }

    public String getKfzBezeichnung() {
        return kfzBezeichnung;
    }

    public void setKfzBezeichnung(String kfzBezeichnung) {
        this.kfzBezeichnung = kfzBezeichnung;
    }

    public String getKfzMarke() {
        return kfzMarke;
    }

    public void setKfzMarke(String kfzMarke) {
        this.kfzMarke = kfzMarke;
    }

    public Long getKfzMilage() {
        return kfzMilage;
    }

    public void setKfzMilage(Long kfzMilage) {
        this.kfzMilage = kfzMilage;
    }

    public Long getAutohausId() {
        return autohausId;
    }

    public void setAutohausId(Long autohausId) {
        this.autohausId = autohausId;
    }
}
