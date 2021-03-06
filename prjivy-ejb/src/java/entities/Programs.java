/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Gulshat
 */
@Entity
@Table(name = "programs")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Programs.findAll", query = "SELECT p FROM Programs p"),
    @NamedQuery(name = "Programs.findById", query = "SELECT p FROM Programs p WHERE p.id = :id"),
    @NamedQuery(name = "Programs.findByName", query = "SELECT p FROM Programs p WHERE p.name = :name")})
public class Programs implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Size(max = 2147483647)
    @Column(name = "name")
    private String name;
    @JoinColumn(name = "idfaculty", referencedColumnName = "id")
    @ManyToOne
    private Faculties idfaculty;

    public Programs() {
    }

    public Programs(Integer id) {
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

    public Faculties getIdfaculty() {
        return idfaculty;
    }

    public void setIdfaculty(Faculties idfaculty) {
        this.idfaculty = idfaculty;
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
        if (!(object instanceof Programs)) {
            return false;
        }
        Programs other = (Programs) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Programs[ id=" + id + " ]";
    }
    
}
