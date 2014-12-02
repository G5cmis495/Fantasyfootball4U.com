/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author T410
 */
@Entity
@Table(name = "LEAGUE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "League.findAll", query = "SELECT l FROM League l"),
    @NamedQuery(name = "League.findByLeaguename", query = "SELECT l FROM League l WHERE l.leaguename = :leaguename"),
    @NamedQuery(name = "League.findByNumofteam", query = "SELECT l FROM League l WHERE l.numofteam = :numofteam"),
    @NamedQuery(name = "League.findByTeamname", query = "SELECT l FROM League l WHERE l.teamname = :teamname")})
public class League implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "LEAGUENAME")
    private String leaguename;
    @Column(name = "NUMOFTEAM")
    private Integer numofteam;
    @Size(max = 50)
    @Column(name = "TEAMNAME")
    private String teamname;

    public League() {
    }

    public League(String leaguename) {
        this.leaguename = leaguename;
    }

    public String getLeaguename() {
        return leaguename;
    }

    public void setLeaguename(String leaguename) {
        this.leaguename = leaguename;
    }

    public Integer getNumofteam() {
        return numofteam;
    }

    public void setNumofteam(Integer numofteam) {
        this.numofteam = numofteam;
    }

    public String getTeamname() {
        return teamname;
    }

    public void setTeamname(String teamname) {
        this.teamname = teamname;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (leaguename != null ? leaguename.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof League)) {
            return false;
        }
        League other = (League) object;
        if ((this.leaguename == null && other.leaguename != null) || (this.leaguename != null && !this.leaguename.equals(other.leaguename))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Database.League[ leaguename=" + leaguename + " ]";
    }
    
}
