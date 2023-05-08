/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pmm.semarh.ws.model;

import com.pmm.semarh.model.CpfGespes;
import java.time.LocalDate;

/**
 *
 * @author ajuliano
 */
public class ModelCpfGespesWs {
    

   // @Column(name = "NOME_CPF")
    private String nomeCpf;
    
    // @Column(name = "DTNSC_CPF")
    private LocalDate dtnscCpf;
    
   // @Column(name = "PAI_CPF")
    private String paiCpf;
    
    // @Column(name = "MAE_CPF")
    private String maeCpf;
    
    // @Column(name = "SEX_CPF")
    private Float sexCpf;

    // @Column(name = "NATURAL_CPF")
    private String naturalCpf;

    // @Column(name = "NACIONALIDADE_CPF")
    private String nacionalidadeCpf;

    // @Column(name = "EC_CPF")
    private String ecCpf;

    //@Column(name = "EMAIL_CPF")
    private String emailCpf;

   // @Column(name = "CPF_CPF")
    private String cpfCpf;
    
//Registro Geral (RG)
    
    //@Column(name = "RG_CPF")
    private String rgCpf;

    //@Column(name = "ORGAORG_CPF")
    private String orgaorgCpf;
    
    //@Column(name = "DTEXPRG_CPF")
    private LocalDate dtexprgCpf;
    
    
 //Carteira de Trabalho
    
    //@Column(name = "CTPS_CPF")
    private String ctpsCpf;

    //@Column(name = "SERIECTPS_CPF")
    private String seriectpsCpf;

    
//Título de Eleitor   
    
    //@Column(name = "TIT_CPF")
    private String titCpf;

    //@Column(name = "ZONATIT_CPF")
    private String zonatitCpf;

    //@Column(name = "SECAOTIT_CPF")
    private String secaotitCpf;
    
    
//Certificado de Reservista
    
    //@Column(name = "RESERV_CPF")
    private String reservCpf;

    //@Column(name = "CATRESERV_CPF")
    private String catreservCpf;

    //@Column(name = "REGRESERV_CPF")
    private String regreservCpf;
    
    
//Carteira Nacional de Habilitação (CNH)
    
    //@Column(name = "CNH_CPF")
    private String cnhCpf;

    //@Column(name = "CATCNH_CPF")
    private String catcnhCpf;
    
    //@Column(name = "DTVALIDCNH_CPF")
    private LocalDate dtvalidcnhCpf;
    
    
/* PIS/PASEP */
    
    //@Column(name = "TPPISPASEP_CPF")
    private Float tppispasepCpf;

    //@Column(name = "PISPASEP_CPF")
    private String pispasepCpf;
    
    //@Column(name = "DTPISPASEP_CPF")
    private LocalDate dtpispasepCpf;

    //@Column(name = "CODBANPISPASEP_CPF")
    private String codbanpispasepCpf;

    public ModelCpfGespesWs() {
    }

    public ModelCpfGespesWs(CpfGespes cpfGespes) {
        this.nomeCpf = cpfGespes.getNomeCpf();
        this.dtnscCpf = cpfGespes.getDtnscCpf();
        this.paiCpf = cpfGespes.getPaiCpf();
        this.maeCpf = cpfGespes.getMaeCpf();
        this.sexCpf = cpfGespes.getSexCpf();
        this.naturalCpf = cpfGespes.getNaturalCpf();
        this.nacionalidadeCpf = cpfGespes.getNacionalidadeCpf();
        this.ecCpf = cpfGespes.getEcCpf();
        this.emailCpf = cpfGespes.getEmailCpf();
        this.cpfCpf = cpfGespes.getCpfCpf();
        this.rgCpf = cpfGespes.getRgCpf();
        this.orgaorgCpf = cpfGespes.getOrgaorgCpf();
        this.dtexprgCpf = cpfGespes.getDtexprgCpf();
        this.ctpsCpf = cpfGespes.getCtpsCpf();
        this.seriectpsCpf = cpfGespes.getSeriectpsCpf();
        this.titCpf = cpfGespes.getTitCpf();
        this.zonatitCpf = cpfGespes.getZonatitCpf();
        this.secaotitCpf = cpfGespes.getSecaotitCpf();
        this.reservCpf = cpfGespes.getReservCpf();
        this.catreservCpf = cpfGespes.getCatreservCpf();
        this.regreservCpf = cpfGespes.getRegreservCpf();
        this.cnhCpf = cpfGespes.getCnhCpf();
        this.catcnhCpf = cpfGespes.getCatcnhCpf();
        this.dtvalidcnhCpf = cpfGespes.getDtvalidcnhCpf();
        this.tppispasepCpf = cpfGespes.getTppispasepCpf();
        this.pispasepCpf = cpfGespes.getPispasepCpf();
        this.dtpispasepCpf = cpfGespes.getDtpispasepCpf();
        this.codbanpispasepCpf = cpfGespes.getCodbanpispasepCpf();
    }
    

    public String getNomeCpf() {
        return nomeCpf;
    }

    public void setNomeCpf(String nomeCpf) {
        this.nomeCpf = nomeCpf;
    }

    public LocalDate getDtnscCpf() {
        return dtnscCpf;
    }

    public void setDtnscCpf(LocalDate dtnscCpf) {
        this.dtnscCpf = dtnscCpf;
    }

    public String getPaiCpf() {
        return paiCpf;
    }

    public void setPaiCpf(String paiCpf) {
        this.paiCpf = paiCpf;
    }

    public String getMaeCpf() {
        return maeCpf;
    }

    public void setMaeCpf(String maeCpf) {
        this.maeCpf = maeCpf;
    }

    public Float getSexCpf() {
        return sexCpf;
    }

    public void setSexCpf(Float sexCpf) {
        this.sexCpf = sexCpf;
    }

    public String getNaturalCpf() {
        return naturalCpf;
    }

    public void setNaturalCpf(String naturalCpf) {
        this.naturalCpf = naturalCpf;
    }

    public String getNacionalidadeCpf() {
        return nacionalidadeCpf;
    }

    public void setNacionalidadeCpf(String nacionalidadeCpf) {
        this.nacionalidadeCpf = nacionalidadeCpf;
    }

    public String getEcCpf() {
        return ecCpf;
    }

    public void setEcCpf(String ecCpf) {
        this.ecCpf = ecCpf;
    }

    public String getEmailCpf() {
        return emailCpf;
    }

    public void setEmailCpf(String emailCpf) {
        this.emailCpf = emailCpf;
    }

    public String getCpfCpf() {
        return cpfCpf;
    }

    public void setCpfCpf(String cpfCpf) {
        this.cpfCpf = cpfCpf;
    }

    public String getRgCpf() {
        return rgCpf;
    }

    public void setRgCpf(String rgCpf) {
        this.rgCpf = rgCpf;
    }

    public String getOrgaorgCpf() {
        return orgaorgCpf;
    }

    public void setOrgaorgCpf(String orgaorgCpf) {
        this.orgaorgCpf = orgaorgCpf;
    }

    public LocalDate getDtexprgCpf() {
        return dtexprgCpf;
    }

    public void setDtexprgCpf(LocalDate dtexprgCpf) {
        this.dtexprgCpf = dtexprgCpf;
    }

    public String getCtpsCpf() {
        return ctpsCpf;
    }

    public void setCtpsCpf(String ctpsCpf) {
        this.ctpsCpf = ctpsCpf;
    }

    public String getSeriectpsCpf() {
        return seriectpsCpf;
    }

    public void setSeriectpsCpf(String seriectpsCpf) {
        this.seriectpsCpf = seriectpsCpf;
    }

    public String getTitCpf() {
        return titCpf;
    }

    public void setTitCpf(String titCpf) {
        this.titCpf = titCpf;
    }

    public String getZonatitCpf() {
        return zonatitCpf;
    }

    public void setZonatitCpf(String zonatitCpf) {
        this.zonatitCpf = zonatitCpf;
    }

    public String getSecaotitCpf() {
        return secaotitCpf;
    }

    public void setSecaotitCpf(String secaotitCpf) {
        this.secaotitCpf = secaotitCpf;
    }

    public String getReservCpf() {
        return reservCpf;
    }

    public void setReservCpf(String reservCpf) {
        this.reservCpf = reservCpf;
    }

    public String getCatreservCpf() {
        return catreservCpf;
    }

    public void setCatreservCpf(String catreservCpf) {
        this.catreservCpf = catreservCpf;
    }

    public String getRegreservCpf() {
        return regreservCpf;
    }

    public void setRegreservCpf(String regreservCpf) {
        this.regreservCpf = regreservCpf;
    }

    public String getCnhCpf() {
        return cnhCpf;
    }

    public void setCnhCpf(String cnhCpf) {
        this.cnhCpf = cnhCpf;
    }

    public String getCatcnhCpf() {
        return catcnhCpf;
    }

    public void setCatcnhCpf(String catcnhCpf) {
        this.catcnhCpf = catcnhCpf;
    }

    public LocalDate getDtvalidcnhCpf() {
        return dtvalidcnhCpf;
    }

    public void setDtvalidcnhCpf(LocalDate dtvalidcnhCpf) {
        this.dtvalidcnhCpf = dtvalidcnhCpf;
    }

    public Float getTppispasepCpf() {
        return tppispasepCpf;
    }

    public void setTppispasepCpf(Float tppispasepCpf) {
        this.tppispasepCpf = tppispasepCpf;
    }

    public String getPispasepCpf() {
        return pispasepCpf;
    }

    public void setPispasepCpf(String pispasepCpf) {
        this.pispasepCpf = pispasepCpf;
    }

    public LocalDate getDtpispasepCpf() {
        return dtpispasepCpf;
    }

    public void setDtpispasepCpf(LocalDate dtpispasepCpf) {
        this.dtpispasepCpf = dtpispasepCpf;
    }

    public String getCodbanpispasepCpf() {
        return codbanpispasepCpf;
    }

    public void setCodbanpispasepCpf(String codbanpispasepCpf) {
        this.codbanpispasepCpf = codbanpispasepCpf;
    }

   
    
}
