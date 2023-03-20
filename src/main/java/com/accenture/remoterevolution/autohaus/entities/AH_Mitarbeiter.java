package com.accenture.remoterevolution.autohaus.entities;

public class AH_Mitarbeiter {

    private Long mitarbeiterId;
    private String mitarbeiterName;
    private String mitarbeiterFamName;
    private String mitarbeiterStrNr;
    private String mitarbeiterTelNr;
    private String mitarbeiterEintrittDat;
    private Long autohausID;

    public Long getMitarbeiterId() {
        return mitarbeiterId;
    }

    public void setMitarbeiterId(Long mitarbeiterId) {
        this.mitarbeiterId = mitarbeiterId;
    }

    public String getMitarbeiterName() {
        return mitarbeiterName;
    }

    public void setMitarbeiterName(String mitarbeiterName) {
        this.mitarbeiterName = mitarbeiterName;
    }

    public String getMitarbeiterFamName() {
        return mitarbeiterFamName;
    }

    public void setMitarbeiterFamName(String mitarbeiterFamName) {
        this.mitarbeiterFamName = mitarbeiterFamName;
    }

    public String getMitarbeiterStrNr() {
        return mitarbeiterStrNr;
    }

    public void setMitarbeiterStrNr(String mitarbeiterStrNr) {
        this.mitarbeiterStrNr = mitarbeiterStrNr;
    }

    public String getMitarbeiterTelNr() {
        return mitarbeiterTelNr;
    }

    public void setMitarbeiterTelNr(String mitarbeiterTelNr) {
        this.mitarbeiterTelNr = mitarbeiterTelNr;
    }

    public String getMitarbeiterEintrittDat() {
        return mitarbeiterEintrittDat;
    }

    public void setMitarbeiterEintrittDat(String mitarbeiterEintrittDat) {
        this.mitarbeiterEintrittDat = mitarbeiterEintrittDat;
    }

    public Long getAutohausID() {
        return autohausID;
    }

    public void setAutohausID(Long autohausID) {
        this.autohausID = autohausID;
    }
}
