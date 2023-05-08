/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pmm.semarh.model;

import com.pmm.semarh.converter.LocalDateConverter1;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/**
 *
 * @author ajuliano
 */
@Entity
@Table(name = "cpf_gespes")
public class CpfGespes implements Serializable {

    @Column(name = "DTEXP_CPF")
    
    private LocalDate dtexpCpf;
    @Column(name = "DTUATLZ_CPF")
    
    private LocalDate dtuatlzCpf;
    @Column(name = "DTNSC_CPF")
    
    private LocalDate dtnscCpf;
    @Column(name = "DTEXPRG_CPF")
    
    private LocalDate dtexprgCpf;
    @Column(name = "DTVALIDCNH_CPF")
    
    private LocalDate dtvalidcnhCpf;
    @Column(name = "DTPISPASEP_CPF")
    
    private LocalDate dtpispasepCpf;
    @Column(name = "DATAUSU_CPF")
    
    private LocalDate datausuCpf;
    @Column(name = "DATAIMP_CPF")
    
    private LocalDate dataimpCpf;
    @Column(name = "DTEXPORT_CPF")
    
    private LocalDate dtexportCpf;
    @Column(name = "DTMNT_CPF")
    
    private LocalDate dtmntCpf;
    @Column(name = "DTOBT_CPF")
    
    private LocalDate dtobtCpf;
    
   /* @OneToMany(cascade = CascadeType.ALL, mappedBy = "cpfGespes")
    private Collection<BlocosValidados> blocosValidadosCollection;*/

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "COD_CPF")
    private String codCpf;
    
    
    @Column(name = "TP_CPF")
    private Float tpCpf;

    @Column(name = "NOME_CPF")
    private String nomeCpf;
    
    
    @Column(name = "PAI_CPF")
    private String paiCpf;
    
    @Column(name = "COR_CPF")
    private Float corCpf;

    @Column(name = "MAE_CPF")
    private String maeCpf;
    
    @Column(name = "SEX_CPF")
    private Float sexCpf;

    @Column(name = "NATURAL_CPF")
    private String naturalCpf;

    @Column(name = "NACIONALIDADE_CPF")
    private String nacionalidadeCpf;

    @Column(name = "EC_CPF")
    private String ecCpf;

    @Column(name = "CODLOG_CPF")
    private String codlogCpf;

    @Column(name = "ENDERECO_CPF")
    private String enderecoCpf;

    @Column(name = "NOMEBRR_CPF")
    private String nomebrrCpf;

    @Column(name = "NOMEUFMU_CPF")
    private String nomeufmuCpf;

    @Column(name = "UFUFMU_CPF")
    private String ufufmuCpf;

    @Column(name = "CEP_CPF")
    private String cepCpf;

    @Column(name = "TEL_CPF")
    private String telCpf;

    @Column(name = "CEL_CPF")
    private String celCpf;

    @Column(name = "TRABTEL_CPF")
    private String trabtelCpf;
    
    @Column(name = "TPRESID_CPF")
    private Float tpresidCpf;

    @Column(name = "EMAIL_CPF")
    private String emailCpf;

    @Column(name = "CPF_CPF")
    private String cpfCpf;

    @Column(name = "RG_CPF")
    private String rgCpf;

    @Column(name = "ORGAORG_CPF")
    private String orgaorgCpf;
    

    @Column(name = "CTPS_CPF")
    private String ctpsCpf;

    @Column(name = "SERIECTPS_CPF")
    private String seriectpsCpf;

    @Column(name = "TIT_CPF")
    private String titCpf;

    @Column(name = "ZONATIT_CPF")
    private String zonatitCpf;

    @Column(name = "SECAOTIT_CPF")
    private String secaotitCpf;

    @Column(name = "RESERV_CPF")
    private String reservCpf;

    @Column(name = "CATRESERV_CPF")
    private String catreservCpf;

    @Column(name = "REGRESERV_CPF")
    private String regreservCpf;

    @Column(name = "CNH_CPF")
    private String cnhCpf;

    @Column(name = "CATCNH_CPF")
    private String catcnhCpf;
    
    
    @Column(name = "TPPISPASEP_CPF")
    private Float tppispasepCpf;

    @Column(name = "PISPASEP_CPF")
    private String pispasepCpf;
    

    @Column(name = "CODBANPISPASEP_CPF")
    private String codbanpispasepCpf;

    @Column(name = "BANCO_CPF")
    private String bancoCpf;

    @Column(name = "AGENCIA_CPF")
    private String agenciaCpf;

    @Column(name = "CONTA_CPF")
    private String contaCpf;

    @Column(name = "CODGRA_CPF")
    private String codgraCpf;

    @Column(name = "CODCRS01_CPF")
    private String codcrs01Cpf;

    @Column(name = "CODCRS02_CPF")
    private String codcrs02Cpf;

    @Column(name = "CODCRS03_CPF")
    private String codcrs03Cpf;

    @Column(name = "OUTROSCRS_CPF")
    private String outroscrsCpf;
   
    @Column(name = "AFOMCRS_CPF")
    private String afomcrsCpf;
    
    @Column(name = "STATUS_CPF")
    private Float statusCpf;

    @Column(name = "DEFICIENCIA_CPF")
    private String deficienciaCpf;

    @Column(name = "CODCRS04_CPF")
    private String codcrs04Cpf;

    @Column(name = "CODCRS05_CPF")
    private String codcrs05Cpf;

    @Column(name = "CODCRS06_CPF")
    private String codcrs06Cpf;

    @Column(name = "APOSENTA_CPF")
    private String aposentaCpf;

    @Column(name = "CARGOAPOSENTA_CPF")
    private String cargoaposentaCpf;

    @Column(name = "MATAPOSENTA_CPF")
    private String mataposentaCpf;

    @Column(name = "VNCAPOSENTA_CPF")
    private String vncaposentaCpf;

    @Column(name = "RGJAPOSENTA_CPF")
    private String rgjaposentaCpf;

    @Column(name = "CODUSU_CPF")
    private String codusuCpf;
    

    @Column(name = "HORAUSU_CPF")
    private String horausuCpf;
    
    @Column(name = "PPLANO_CPF")
    private Float pplanoCpf;
    
    @Column(name = "APLANO_CPF")
    private Float aplanoCpf;

    @Column(name = "IMPORTACAO_CPF")
    private String importacaoCpf;
    
    
    @Column(name = "OBS_CPF")
    private String obsCpf;
    
    @Column(name = "PDF_CPF")
    private Float pdfCpf;

    @Column(name = "ENTRA_CPF")
    private String entraCpf;

    @Column(name = "SAI_CPF")
    private String saiCpf;
    

    @Column(name = "HORAEXPORT_CPF")
    private String horaexportCpf;
    
  
    @Column(name = "HORAMNT_CPF")
    private String horamntCpf;

    @Column(name = "CODPRNTRO_CPF")
    private String codprntroCpf;

    @Column(name = "CODDPSTRO_CPF")
    private String coddpstroCpf;

    @Column(name = "OBT_CPF")
    private String obtCpf;
    

    public CpfGespes() {
    }

    public CpfGespes(String codCpf) {
        this.codCpf = codCpf;
    }

    public LocalDate getDtexpCpf() {
        return dtexpCpf;
    }

    public void setDtexpCpf(LocalDate dtexpCpf) {
        this.dtexpCpf = dtexpCpf;
    }

    public LocalDate getDtuatlzCpf() {
        return dtuatlzCpf;
    }

    public void setDtuatlzCpf(LocalDate dtuatlzCpf) {
        this.dtuatlzCpf = dtuatlzCpf;
    }

    public LocalDate getDtnscCpf() {
        return dtnscCpf;
    }

    public void setDtnscCpf(LocalDate dtnscCpf) {
        this.dtnscCpf = dtnscCpf;
    }

    public LocalDate getDtexprgCpf() {
        return dtexprgCpf;
    }

    public void setDtexprgCpf(LocalDate dtexprgCpf) {
        this.dtexprgCpf = dtexprgCpf;
    }

    public LocalDate getDtvalidcnhCpf() {
        return dtvalidcnhCpf;
    }

    public void setDtvalidcnhCpf(LocalDate dtvalidcnhCpf) {
        this.dtvalidcnhCpf = dtvalidcnhCpf;
    }

    public LocalDate getDtpispasepCpf() {
        return dtpispasepCpf;
    }

    public void setDtpispasepCpf(LocalDate dtpispasepCpf) {
        this.dtpispasepCpf = dtpispasepCpf;
    }

    public LocalDate getDatausuCpf() {
        return datausuCpf;
    }

    public void setDatausuCpf(LocalDate datausuCpf) {
        this.datausuCpf = datausuCpf;
    }

    public LocalDate getDataimpCpf() {
        return dataimpCpf;
    }

    public void setDataimpCpf(LocalDate dataimpCpf) {
        this.dataimpCpf = dataimpCpf;
    }

    public LocalDate getDtexportCpf() {
        return dtexportCpf;
    }

    public void setDtexportCpf(LocalDate dtexportCpf) {
        this.dtexportCpf = dtexportCpf;
    }

    public LocalDate getDtmntCpf() {
        return dtmntCpf;
    }

    public void setDtmntCpf(LocalDate dtmntCpf) {
        this.dtmntCpf = dtmntCpf;
    }

    public LocalDate getDtobtCpf() {
        return dtobtCpf;
    }

    public void setDtobtCpf(LocalDate dtobtCpf) {
        this.dtobtCpf = dtobtCpf;
    }

    public String getCodCpf() {
        return codCpf;
    }

    public void setCodCpf(String codCpf) {
        this.codCpf = codCpf;
    }

    public Float getTpCpf() {
        return tpCpf;
    }

    public void setTpCpf(Float tpCpf) {
        this.tpCpf = tpCpf;
    }

    public String getNomeCpf() {
        return nomeCpf;
    }

    public void setNomeCpf(String nomeCpf) {
        this.nomeCpf = nomeCpf;
    }

    public String getPaiCpf() {
        return paiCpf;
    }

    public void setPaiCpf(String paiCpf) {
        this.paiCpf = paiCpf;
    }

    public Float getCorCpf() {
        return corCpf;
    }

    public void setCorCpf(Float corCpf) {
        this.corCpf = corCpf;
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

    public String getCodlogCpf() {
        return codlogCpf;
    }

    public void setCodlogCpf(String codlogCpf) {
        this.codlogCpf = codlogCpf;
    }

    public String getEnderecoCpf() {
        return enderecoCpf;
    }

    public void setEnderecoCpf(String enderecoCpf) {
        this.enderecoCpf = enderecoCpf;
    }

    public String getNomebrrCpf() {
        return nomebrrCpf;
    }

    public void setNomebrrCpf(String nomebrrCpf) {
        this.nomebrrCpf = nomebrrCpf;
    }

    public String getNomeufmuCpf() {
        return nomeufmuCpf;
    }

    public void setNomeufmuCpf(String nomeufmuCpf) {
        this.nomeufmuCpf = nomeufmuCpf;
    }

    public String getUfufmuCpf() {
        return ufufmuCpf;
    }

    public void setUfufmuCpf(String ufufmuCpf) {
        this.ufufmuCpf = ufufmuCpf;
    }

    public String getCepCpf() {
        return cepCpf;
    }

    public void setCepCpf(String cepCpf) {
        this.cepCpf = cepCpf;
    }

    public String getTelCpf() {
        return telCpf;
    }

    public void setTelCpf(String telCpf) {
        this.telCpf = telCpf;
    }

    public String getCelCpf() {
        return celCpf;
    }

    public void setCelCpf(String celCpf) {
        this.celCpf = celCpf;
    }

    public String getTrabtelCpf() {
        return trabtelCpf;
    }

    public void setTrabtelCpf(String trabtelCpf) {
        this.trabtelCpf = trabtelCpf;
    }

    public Float getTpresidCpf() {
        return tpresidCpf;
    }

    public void setTpresidCpf(Float tpresidCpf) {
        this.tpresidCpf = tpresidCpf;
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

    public String getCodbanpispasepCpf() {
        return codbanpispasepCpf;
    }

    public void setCodbanpispasepCpf(String codbanpispasepCpf) {
        this.codbanpispasepCpf = codbanpispasepCpf;
    }

    public String getBancoCpf() {
        return bancoCpf;
    }

    public void setBancoCpf(String bancoCpf) {
        this.bancoCpf = bancoCpf;
    }

    public String getAgenciaCpf() {
        return agenciaCpf;
    }

    public void setAgenciaCpf(String agenciaCpf) {
        this.agenciaCpf = agenciaCpf;
    }

    public String getContaCpf() {
        return contaCpf;
    }

    public void setContaCpf(String contaCpf) {
        this.contaCpf = contaCpf;
    }

    public String getCodgraCpf() {
        return codgraCpf;
    }

    public void setCodgraCpf(String codgraCpf) {
        this.codgraCpf = codgraCpf;
    }

    public String getCodcrs01Cpf() {
        return codcrs01Cpf;
    }

    public void setCodcrs01Cpf(String codcrs01Cpf) {
        this.codcrs01Cpf = codcrs01Cpf;
    }

    public String getCodcrs02Cpf() {
        return codcrs02Cpf;
    }

    public void setCodcrs02Cpf(String codcrs02Cpf) {
        this.codcrs02Cpf = codcrs02Cpf;
    }

    public String getCodcrs03Cpf() {
        return codcrs03Cpf;
    }

    public void setCodcrs03Cpf(String codcrs03Cpf) {
        this.codcrs03Cpf = codcrs03Cpf;
    }

    public String getOutroscrsCpf() {
        return outroscrsCpf;
    }

    public void setOutroscrsCpf(String outroscrsCpf) {
        this.outroscrsCpf = outroscrsCpf;
    }

    public String getAfomcrsCpf() {
        return afomcrsCpf;
    }

    public void setAfomcrsCpf(String afomcrsCpf) {
        this.afomcrsCpf = afomcrsCpf;
    }

    public Float getStatusCpf() {
        return statusCpf;
    }

    public void setStatusCpf(Float statusCpf) {
        this.statusCpf = statusCpf;
    }

    public String getDeficienciaCpf() {
        return deficienciaCpf;
    }

    public void setDeficienciaCpf(String deficienciaCpf) {
        this.deficienciaCpf = deficienciaCpf;
    }

    public String getCodcrs04Cpf() {
        return codcrs04Cpf;
    }

    public void setCodcrs04Cpf(String codcrs04Cpf) {
        this.codcrs04Cpf = codcrs04Cpf;
    }

    public String getCodcrs05Cpf() {
        return codcrs05Cpf;
    }

    public void setCodcrs05Cpf(String codcrs05Cpf) {
        this.codcrs05Cpf = codcrs05Cpf;
    }

    public String getCodcrs06Cpf() {
        return codcrs06Cpf;
    }

    public void setCodcrs06Cpf(String codcrs06Cpf) {
        this.codcrs06Cpf = codcrs06Cpf;
    }

    public String getAposentaCpf() {
        return aposentaCpf;
    }

    public void setAposentaCpf(String aposentaCpf) {
        this.aposentaCpf = aposentaCpf;
    }

    public String getCargoaposentaCpf() {
        return cargoaposentaCpf;
    }

    public void setCargoaposentaCpf(String cargoaposentaCpf) {
        this.cargoaposentaCpf = cargoaposentaCpf;
    }

    public String getMataposentaCpf() {
        return mataposentaCpf;
    }

    public void setMataposentaCpf(String mataposentaCpf) {
        this.mataposentaCpf = mataposentaCpf;
    }

    public String getVncaposentaCpf() {
        return vncaposentaCpf;
    }

    public void setVncaposentaCpf(String vncaposentaCpf) {
        this.vncaposentaCpf = vncaposentaCpf;
    }

    public String getRgjaposentaCpf() {
        return rgjaposentaCpf;
    }

    public void setRgjaposentaCpf(String rgjaposentaCpf) {
        this.rgjaposentaCpf = rgjaposentaCpf;
    }

    public String getCodusuCpf() {
        return codusuCpf;
    }

    public void setCodusuCpf(String codusuCpf) {
        this.codusuCpf = codusuCpf;
    }

    public String getHorausuCpf() {
        return horausuCpf;
    }

    public void setHorausuCpf(String horausuCpf) {
        this.horausuCpf = horausuCpf;
    }

    public Float getPplanoCpf() {
        return pplanoCpf;
    }

    public void setPplanoCpf(Float pplanoCpf) {
        this.pplanoCpf = pplanoCpf;
    }

    public Float getAplanoCpf() {
        return aplanoCpf;
    }

    public void setAplanoCpf(Float aplanoCpf) {
        this.aplanoCpf = aplanoCpf;
    }

    public String getImportacaoCpf() {
        return importacaoCpf;
    }

    public void setImportacaoCpf(String importacaoCpf) {
        this.importacaoCpf = importacaoCpf;
    }

    public String getObsCpf() {
        return obsCpf;
    }

    public void setObsCpf(String obsCpf) {
        this.obsCpf = obsCpf;
    }

    public Float getPdfCpf() {
        return pdfCpf;
    }

    public void setPdfCpf(Float pdfCpf) {
        this.pdfCpf = pdfCpf;
    }

    public String getEntraCpf() {
        return entraCpf;
    }

    public void setEntraCpf(String entraCpf) {
        this.entraCpf = entraCpf;
    }

    public String getSaiCpf() {
        return saiCpf;
    }

    public void setSaiCpf(String saiCpf) {
        this.saiCpf = saiCpf;
    }

    public String getHoraexportCpf() {
        return horaexportCpf;
    }

    public void setHoraexportCpf(String horaexportCpf) {
        this.horaexportCpf = horaexportCpf;
    }

    public String getHoramntCpf() {
        return horamntCpf;
    }

    public void setHoramntCpf(String horamntCpf) {
        this.horamntCpf = horamntCpf;
    }

    public String getCodprntroCpf() {
        return codprntroCpf;
    }

    public void setCodprntroCpf(String codprntroCpf) {
        this.codprntroCpf = codprntroCpf;
    }

    public String getCoddpstroCpf() {
        return coddpstroCpf;
    }

    public void setCoddpstroCpf(String coddpstroCpf) {
        this.coddpstroCpf = coddpstroCpf;
    }

    public String getObtCpf() {
        return obtCpf;
    }

    public void setObtCpf(String obtCpf) {
        this.obtCpf = obtCpf;
    }

    
}
