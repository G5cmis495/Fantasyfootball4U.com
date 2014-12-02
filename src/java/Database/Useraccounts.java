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
@Table(name = "USERACCOUNTS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Useraccounts.findAll", query = "SELECT u FROM Useraccounts u"),
    @NamedQuery(name = "Useraccounts.findByUsername", query = "SELECT u FROM Useraccounts u WHERE u.username = :username"),
    @NamedQuery(name = "Useraccounts.findByPassword", query = "SELECT u FROM Useraccounts u WHERE u.password = :password"),
    @NamedQuery(name = "Useraccounts.findByLeaguename", query = "SELECT u FROM Useraccounts u WHERE u.leaguename = :leaguename"),
    @NamedQuery(name = "Useraccounts.findByTeamname", query = "SELECT u FROM Useraccounts u WHERE u.teamname = :teamname")})
public class Useraccounts implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "USERNAME")
    private String username;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "PASSWORD")
    private String password;
    @Size(max = 40)
    @Column(name = "LEAGUENAME")
    private String leaguename;
    @Size(max = 50)
    @Column(name = "TEAMNAME")
    private String teamname;

    public Useraccounts() {
    }

    public Useraccounts(String username) {
        this.username = username;
    }

    public Useraccounts(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLeaguename() {
        return leaguename;
    }

    public void setLeaguename(String leaguename) {
        this.leaguename = leaguename;
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
        hash += (username != null ? username.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Useraccounts)) {
            return false;
        }
        Useraccounts other = (Useraccounts) object;
        if ((this.username == null && other.username != null) || (this.username != null && !this.username.equals(other.username))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Database.Useraccounts[ username=" + username + " ]";
    }
    
}
