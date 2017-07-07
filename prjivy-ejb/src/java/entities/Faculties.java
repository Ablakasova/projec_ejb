/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Gulshat
 */
@Entity
@Table(name = "faculties")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Faculties.findAll", query = "SELECT f FROM Faculties f"),
    @NamedQuery(name = "Faculties.findById", query = "SELECT f FROM Faculties f WHERE f.id = :id"),
    @NamedQuery(name = "Faculties.findByName", query = "SELECT f FROM Faculties f WHERE f.name = :name")})
public class Faculties implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Size(max = 2147483647)
    @Column(name = "name")
    private String name;
    @OneToMany(mappedBy = "idfaculty")
    private Collection<Programs> programsCollection;
    @JoinColumn(name = "unid", referencedColumnName = "id")
    @ManyToOne
    private Universities unid;

    public Faculties() {
    }

    public Faculties(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlTransient
    public Collection<Programs> getProgramsCollection() {
        return programsCollection;
    }

    public void setProgramsCollection(Collection<Programs> programsCollection) {
        this.programsCollection = programsCollection;
    }

    public Universities getUnid() {
        return unid;
    }

    public void setUnid(Universities unid) {
        this.unid = unid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Faculties)) {
            return false;
        }
        Faculties other = (Faculties) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Faculties[ id=" + id + " ]";
    }
    
}
