/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author T410
 */
@Entity
@Table(name = "STARTINGLINEUP")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Startinglineup.findAll", query = "SELECT s FROM Startinglineup s"),
    @NamedQuery(name = "Startinglineup.findByWeekno", query = "SELECT s FROM Startinglineup s WHERE s.weekno = :weekno"),
    @NamedQuery(name = "Startinglineup.findByTeamname", query = "SELECT s FROM Startinglineup s WHERE s.teamname = :teamname"),
    @NamedQuery(name = "Startinglineup.findByStartingqb", query = "SELECT s FROM Startinglineup s WHERE s.startingqb = :startingqb"),
    @NamedQuery(name = "Startinglineup.findByStartingrb1", query = "SELECT s FROM Startinglineup s WHERE s.startingrb1 = :startingrb1"),
    @NamedQuery(name = "Startinglineup.findByStartingrb2", query = "SELECT s FROM Startinglineup s WHERE s.startingrb2 = :startingrb2"),
    @NamedQuery(name = "Startinglineup.findByStartingf", query = "SELECT s FROM Startinglineup s WHERE s.startingf = :startingf"),
    @NamedQuery(name = "Startinglineup.findByStartingwr1", query = "SELECT s FROM Startinglineup s WHERE s.startingwr1 = :startingwr1"),
    @NamedQuery(name = "Startinglineup.findByStartingwr2", query = "SELECT s FROM Startinglineup s WHERE s.startingwr2 = :startingwr2"),
    @NamedQuery(name = "Startinglineup.findByStartingte", query = "SELECT s FROM Startinglineup s WHERE s.startingte = :startingte"),
    @NamedQuery(name = "Startinglineup.findByStartingstd", query = "SELECT s FROM Startinglineup s WHERE s.startingstd = :startingstd"),
    @NamedQuery(name = "Startinglineup.findByStartingk", query = "SELECT s FROM Startinglineup s WHERE s.startingk = :startingk"),
    @NamedQuery(name = "Startinglineup.findByLeaguename", query = "SELECT s FROM Startinglineup s WHERE s.leaguename = :leaguename")})
public class Startinglineup implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "WEEKNO")
    @Temporal(TemporalType.DATE)
    private Date weekno;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "TEAMNAME")
    private String teamname;
    @Size(max = 50)
    @Column(name = "STARTINGQB")
    private String startingqb;
    @Size(max = 50)
    @Column(name = "STARTINGRB1")
    private String startingrb1;
    @Size(max = 50)
    @Column(name = "STARTINGRB2")
    private String startingrb2;
    @Size(max = 50)
    @Column(name = "STARTINGF")
    private String startingf;
    @Size(max = 50)
    @Column(name = "STARTINGWR1")
    private String startingwr1;
    @Size(max = 50)
    @Column(name = "STARTINGWR2")
    private String startingwr2;
    @Size(max = 50)
    @Column(name = "STARTINGTE")
    private String startingte;
    @Size(max = 50)
    @Column(name = "STARTINGSTD")
    private String startingstd;
    @Size(max = 50)
    @Column(name = "STARTINGK")
    private String startingk;
    @Size(max = 40)
    @Column(name = "LEAGUENAME")
    private String leaguename;

    public Startinglineup() {
    }

    public Startinglineup(Date weekno) {
        this.weekno = weekno;
    }

    public Startinglineup(Date weekno, String teamname) {
        this.weekno = weekno;
        this.teamname = teamname;
    }

    public Date getWeekno() {
        return weekno;
    }

    public void setWeekno(Date weekno) {
        this.weekno = weekno;
    }

    public String getTeamname() {
        return teamname;
    }

    public void setTeamname(String teamname) {
        this.teamname = teamname;
    }

    public String getStartingqb() {
        return startingqb;
    }

    public void setStartingqb(String startingqb) {
        this.startingqb = startingqb;
    }

    public String getStartingrb1() {
        return startingrb1;
    }

    public void setStartingrb1(String startingrb1) {
        this.startingrb1 = startingrb1;
    }

    public String getStartingrb2() {
        return startingrb2;
    }

    public void setStartingrb2(String startingrb2) {
        this.startingrb2 = startingrb2;
    }

    public String getStartingf() {
        return startingf;
    }

    public void setStartingf(String startingf) {
        this.startingf = startingf;
    }

    public String getStartingwr1() {
        return startingwr1;
    }

    public void setStartingwr1(String startingwr1) {
        this.startingwr1 = startingwr1;
    }

    public String getStartingwr2() {
        return startingwr2;
    }

    public void setStartingwr2(String startingwr2) {
        this.startingwr2 = startingwr2;
    }

    public String getStartingte() {
        return startingte;
    }

    public void setStartingte(String startingte) {
        this.startingte = startingte;
    }

    public String getStartingstd() {
        return startingstd;
    }

    public void setStartingstd(String startingstd) {
        this.startingstd = startingstd;
    }

    public String getStartingk() {
        return startingk;
    }

    public void setStartingk(String startingk) {
        this.startingk = startingk;
    }

    public String getLeaguename() {
        return leaguename;
    }

    public void setLeaguename(String leaguename) {
        this.leaguename = leaguename;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (weekno != null ? weekno.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Startinglineup)) {
            return false;
        }
        Startinglineup other = (Startinglineup) object;
        if ((this.weekno == null && other.weekno != null) || (this.weekno != null && !this.weekno.equals(other.weekno))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Database.Startinglineup[ weekno=" + weekno + " ]";
    }
    
}
