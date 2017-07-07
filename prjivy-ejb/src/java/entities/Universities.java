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
@Table(name = "universities")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Universities.findAll", query = "SELECT u FROM Universities u"),
    @NamedQuery(name = "Universities.findById", query = "SELECT u FROM Universities u WHERE u.id = :id"),
    @NamedQuery(name = "Universities.findByName", query = "SELECT u FROM Universities u WHERE u.name = :name"),
    @NamedQuery(name = "Universities.findBySize", query = "SELECT u FROM Universities u WHERE u.size = :size"),
    @NamedQuery(name = "Universities.findByAge", query = "SELECT u FROM Universities u WHERE u.age = :age"),
    @NamedQuery(name = "Universities.findByStatus", query = "SELECT u FROM Universities u WHERE u.status = :status"),
    @NamedQuery(name = "Universities.findByNumofstudents", query = "SELECT u FROM Universities u WHERE u.numofstudents = :numofstudents"),
    @NamedQuery(name = "Universities.findByNumofinternationalstud", query = "SELECT u FROM Universities u WHERE u.numofinternationalstud = :numofinternationalstud"),
    @NamedQuery(name = "Universities.findByStufftotal", query = "SELECT u FROM Universities u WHERE u.stufftotal = :stufftotal"),
    @NamedQuery(name = "Universities.findByStuffinternational", query = "SELECT u FROM Universities u WHERE u.stuffinternational = :stuffinternational"),
    @NamedQuery(name = "Universities.findByDescription", query = "SELECT u FROM Universities u WHERE u.description = :description")})
public class Universities implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Size(max = 2147483647)
    @Column(name = "name")
    private String name;
    @Column(name = "size")
    private Integer size;
    @Column(name = "age")
    private Integer age;
    @Size(max = 2147483647)
    @Column(name = "status")
    private String status;
    @Column(name = "numofstudents")
    private Integer numofstudents;
    @Column(name = "numofinternationalstud")
    private Integer numofinternationalstud;
    @Column(name = "stufftotal")
    private Integer stufftotal;
    @Column(name = "stuffinternational")
    private Integer stuffinternational;
    @Size(max = 2147483647)
    @Column(name = "description")
    private String description;
    @OneToMany(mappedBy = "unid")
    private Collection<Faculties> facultiesCollection;

    public Universities() {
    }

    public Universities(Integer id) {
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

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getNumofstudents() {
        return numofstudents;
    }

    public void setNumofstudents(Integer numofstudents) {
        this.numofstudents = numofstudents;
    }

    public Integer getNumofinternationalstud() {
        return numofinternationalstud;
    }

    public void setNumofinternationalstud(Integer numofinternationalstud) {
        this.numofinternationalstud = numofinternationalstud;
    }

    public Integer getStufftotal() {
        return stufftotal;
    }

    public void setStufftotal(Integer stufftotal) {
        this.stufftotal = stufftotal;
    }

    public Integer getStuffinternational() {
        return stuffinternational;
    }

    public void setStuffinternational(Integer stuffinternational) {
        this.stuffinternational = stuffinternational;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @XmlTransient
    public Collection<Faculties> getFacultiesCollection() {
        return facultiesCollection;
    }

    public void setFacultiesCollection(Collection<Faculties> facultiesCollection) {
        this.facultiesCollection = facultiesCollection;
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
        if (!(object instanceof Universities)) {
            return false;
        }
        Universities other = (Universities) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Universities[ id=" + id + " ]";
    }
    
}
