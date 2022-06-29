/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SpringWebMVC.ES2.DAL;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * @author diogo
 */
@Entity
@Table(name = "CASTA")
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = "Casta.findAll", query = "SELECT c FROM Casta c"),
        @NamedQuery(name = "Casta.findByIdCasta", query = "SELECT c FROM Casta c WHERE c.idCasta = :idCasta"),
        @NamedQuery(name = "Casta.findByTipoCasta", query = "SELECT c FROM Casta c WHERE c.tipoCasta = :tipoCasta")})
public class Casta implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID_CASTA")
    private BigDecimal idCasta;
    @Column(name = "TIPO_CASTA")
    private String tipoCasta;
    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCasta")
    private List<Plantacao> plantacaoList;

    public Casta() {
    }

    public Casta(BigDecimal idCasta) {
        this.idCasta = idCasta;
    }

    public BigDecimal getIdCasta() {
        return idCasta;
    }

    public void setIdCasta(BigDecimal idCasta) {
        this.idCasta = idCasta;
    }

    public String getTipoCasta() {
        return tipoCasta;
    }

    public void setTipoCasta(String tipoCasta) {
        this.tipoCasta = tipoCasta;
    }

    @XmlTransient
    public List<Plantacao> getPlantacaoList() {
        return plantacaoList;
    }

    public void setPlantacaoList(List<Plantacao> plantacaoList) {
        this.plantacaoList = plantacaoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCasta != null ? idCasta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Casta)) {
            return false;
        }
        Casta other = (Casta) object;
        return (this.idCasta != null || other.idCasta == null) && (this.idCasta == null || this.idCasta.equals(other.idCasta));
    }

    @Override
    public String toString() {
        return "SpringWebMVC.ES2.DAL.Casta[ idCasta=" + idCasta + " ]";
    }

}
