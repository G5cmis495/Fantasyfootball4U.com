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
@Table(name = "TEAM")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Team.findAll", query = "SELECT t FROM Team t"),
    @NamedQuery(name = "Team.findByTeamname", query = "SELECT t FROM Team t WHERE t.teamname = :teamname"),
    @NamedQuery(name = "Team.findByQb1", query = "SELECT t FROM Team t WHERE t.qb1 = :qb1"),
    @NamedQuery(name = "Team.findByQb2", query = "SELECT t FROM Team t WHERE t.qb2 = :qb2"),
    @NamedQuery(name = "Team.findByQb3", query = "SELECT t FROM Team t WHERE t.qb3 = :qb3"),
    @NamedQuery(name = "Team.findByQb4", query = "SELECT t FROM Team t WHERE t.qb4 = :qb4"),
    @NamedQuery(name = "Team.findByRb1", query = "SELECT t FROM Team t WHERE t.rb1 = :rb1"),
    @NamedQuery(name = "Team.findByRb2", query = "SELECT t FROM Team t WHERE t.rb2 = :rb2"),
    @NamedQuery(name = "Team.findByRb3", query = "SELECT t FROM Team t WHERE t.rb3 = :rb3"),
    @NamedQuery(name = "Team.findByRb4", query = "SELECT t FROM Team t WHERE t.rb4 = :rb4"),
    @NamedQuery(name = "Team.findByRb5", query = "SELECT t FROM Team t WHERE t.rb5 = :rb5"),
    @NamedQuery(name = "Team.findByRb6", query = "SELECT t FROM Team t WHERE t.rb6 = :rb6"),
    @NamedQuery(name = "Team.findByRb7", query = "SELECT t FROM Team t WHERE t.rb7 = :rb7"),
    @NamedQuery(name = "Team.findByRb8", query = "SELECT t FROM Team t WHERE t.rb8 = :rb8"),
    @NamedQuery(name = "Team.findByWr1", query = "SELECT t FROM Team t WHERE t.wr1 = :wr1"),
    @NamedQuery(name = "Team.findByWr2", query = "SELECT t FROM Team t WHERE t.wr2 = :wr2"),
    @NamedQuery(name = "Team.findByWr3", query = "SELECT t FROM Team t WHERE t.wr3 = :wr3"),
    @NamedQuery(name = "Team.findByWr4", query = "SELECT t FROM Team t WHERE t.wr4 = :wr4"),
    @NamedQuery(name = "Team.findByWr5", query = "SELECT t FROM Team t WHERE t.wr5 = :wr5"),
    @NamedQuery(name = "Team.findByWr6", query = "SELECT t FROM Team t WHERE t.wr6 = :wr6"),
    @NamedQuery(name = "Team.findByWr7", query = "SELECT t FROM Team t WHERE t.wr7 = :wr7"),
    @NamedQuery(name = "Team.findByWr8", query = "SELECT t FROM Team t WHERE t.wr8 = :wr8"),
    @NamedQuery(name = "Team.findByTe1", query = "SELECT t FROM Team t WHERE t.te1 = :te1"),
    @NamedQuery(name = "Team.findByTe2", query = "SELECT t FROM Team t WHERE t.te2 = :te2"),
    @NamedQuery(name = "Team.findByTe3", query = "SELECT t FROM Team t WHERE t.te3 = :te3"),
    @NamedQuery(name = "Team.findByK1", query = "SELECT t FROM Team t WHERE t.k1 = :k1"),
    @NamedQuery(name = "Team.findByK2", query = "SELECT t FROM Team t WHERE t.k2 = :k2"),
    @NamedQuery(name = "Team.findByK3", query = "SELECT t FROM Team t WHERE t.k3 = :k3"),
    @NamedQuery(name = "Team.findByD1", query = "SELECT t FROM Team t WHERE t.d1 = :d1"),
    @NamedQuery(name = "Team.findByD2", query = "SELECT t FROM Team t WHERE t.d2 = :d2"),
    @NamedQuery(name = "Team.findByD3", query = "SELECT t FROM Team t WHERE t.d3 = :d3"),
    @NamedQuery(name = "Team.findBySt1", query = "SELECT t FROM Team t WHERE t.st1 = :st1"),
    @NamedQuery(name = "Team.findBySt2", query = "SELECT t FROM Team t WHERE t.st2 = :st2"),
    @NamedQuery(name = "Team.findBySt3", query = "SELECT t FROM Team t WHERE t.st3 = :st3"),
    @NamedQuery(name = "Team.findByLeaguename", query = "SELECT t FROM Team t WHERE t.leaguename = :leaguename")})
public class Team implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "TEAMNAME")
    private String teamname;
    @Size(max = 50)
    @Column(name = "QB1")
    private String qb1;
    @Size(max = 50)
    @Column(name = "QB2")
    private String qb2;
    @Size(max = 50)
    @Column(name = "QB3")
    private String qb3;
    @Size(max = 50)
    @Column(name = "QB4")
    private String qb4;
    @Size(max = 50)
    @Column(name = "RB1")
    private String rb1;
    @Size(max = 50)
    @Column(name = "RB2")
    private String rb2;
    @Size(max = 50)
    @Column(name = "RB3")
    private String rb3;
    @Size(max = 50)
    @Column(name = "RB4")
    private String rb4;
    @Size(max = 50)
    @Column(name = "RB5")
    private String rb5;
    @Size(max = 50)
    @Column(name = "RB6")
    private String rb6;
    @Size(max = 50)
    @Column(name = "RB7")
    private String rb7;
    @Size(max = 50)
    @Column(name = "RB8")
    private String rb8;
    @Size(max = 50)
    @Column(name = "WR1")
    private String wr1;
    @Size(max = 50)
    @Column(name = "WR2")
    private String wr2;
    @Size(max = 50)
    @Column(name = "WR3")
    private String wr3;
    @Size(max = 50)
    @Column(name = "WR4")
    private String wr4;
    @Size(max = 50)
    @Column(name = "WR5")
    private String wr5;
    @Size(max = 50)
    @Column(name = "WR6")
    private String wr6;
    @Size(max = 50)
    @Column(name = "WR7")
    private String wr7;
    @Size(max = 50)
    @Column(name = "WR8")
    private String wr8;
    @Size(max = 50)
    @Column(name = "TE1")
    private String te1;
    @Size(max = 50)
    @Column(name = "TE2")
    private String te2;
    @Size(max = 50)
    @Column(name = "TE3")
    private String te3;
    @Size(max = 50)
    @Column(name = "K1")
    private String k1;
    @Size(max = 50)
    @Column(name = "K2")
    private String k2;
    @Size(max = 50)
    @Column(name = "K3")
    private String k3;
    @Size(max = 50)
    @Column(name = "D1")
    private String d1;
    @Size(max = 50)
    @Column(name = "D2")
    private String d2;
    @Size(max = 50)
    @Column(name = "D3")
    private String d3;
    @Size(max = 50)
    @Column(name = "ST1")
    private String st1;
    @Size(max = 50)
    @Column(name = "ST2")
    private String st2;
    @Size(max = 50)
    @Column(name = "ST3")
    private String st3;
    @Size(max = 40)
    @Column(name = "LEAGUENAME")
    private String leaguename;

    public Team() {
    }

    public Team(String teamname) {
        this.teamname = teamname;
    }

    public String getTeamname() {
        return teamname;
    }

    public void setTeamname(String teamname) {
        this.teamname = teamname;
    }

    public String getQb1() {
        return qb1;
    }

    public void setQb1(String qb1) {
        this.qb1 = qb1;
    }

    public String getQb2() {
        return qb2;
    }

    public void setQb2(String qb2) {
        this.qb2 = qb2;
    }

    public String getQb3() {
        return qb3;
    }

    public void setQb3(String qb3) {
        this.qb3 = qb3;
    }

    public String getQb4() {
        return qb4;
    }

    public void setQb4(String qb4) {
        this.qb4 = qb4;
    }

    public String getRb1() {
        return rb1;
    }

    public void setRb1(String rb1) {
        this.rb1 = rb1;
    }

    public String getRb2() {
        return rb2;
    }

    public void setRb2(String rb2) {
        this.rb2 = rb2;
    }

    public String getRb3() {
        return rb3;
    }

    public void setRb3(String rb3) {
        this.rb3 = rb3;
    }

    public String getRb4() {
        return rb4;
    }

    public void setRb4(String rb4) {
        this.rb4 = rb4;
    }

    public String getRb5() {
        return rb5;
    }

    public void setRb5(String rb5) {
        this.rb5 = rb5;
    }

    public String getRb6() {
        return rb6;
    }

    public void setRb6(String rb6) {
        this.rb6 = rb6;
    }

    public String getRb7() {
        return rb7;
    }

    public void setRb7(String rb7) {
        this.rb7 = rb7;
    }

    public String getRb8() {
        return rb8;
    }

    public void setRb8(String rb8) {
        this.rb8 = rb8;
    }

    public String getWr1() {
        return wr1;
    }

    public void setWr1(String wr1) {
        this.wr1 = wr1;
    }

    public String getWr2() {
        return wr2;
    }

    public void setWr2(String wr2) {
        this.wr2 = wr2;
    }

    public String getWr3() {
        return wr3;
    }

    public void setWr3(String wr3) {
        this.wr3 = wr3;
    }

    public String getWr4() {
        return wr4;
    }

    public void setWr4(String wr4) {
        this.wr4 = wr4;
    }

    public String getWr5() {
        return wr5;
    }

    public void setWr5(String wr5) {
        this.wr5 = wr5;
    }

    public String getWr6() {
        return wr6;
    }

    public void setWr6(String wr6) {
        this.wr6 = wr6;
    }

    public String getWr7() {
        return wr7;
    }

    public void setWr7(String wr7) {
        this.wr7 = wr7;
    }

    public String getWr8() {
        return wr8;
    }

    public void setWr8(String wr8) {
        this.wr8 = wr8;
    }

    public String getTe1() {
        return te1;
    }

    public void setTe1(String te1) {
        this.te1 = te1;
    }

    public String getTe2() {
        return te2;
    }

    public void setTe2(String te2) {
        this.te2 = te2;
    }

    public String getTe3() {
        return te3;
    }

    public void setTe3(String te3) {
        this.te3 = te3;
    }

    public String getK1() {
        return k1;
    }

    public void setK1(String k1) {
        this.k1 = k1;
    }

    public String getK2() {
        return k2;
    }

    public void setK2(String k2) {
        this.k2 = k2;
    }

    public String getK3() {
        return k3;
    }

    public void setK3(String k3) {
        this.k3 = k3;
    }

    public String getD1() {
        return d1;
    }

    public void setD1(String d1) {
        this.d1 = d1;
    }

    public String getD2() {
        return d2;
    }

    public void setD2(String d2) {
        this.d2 = d2;
    }

    public String getD3() {
        return d3;
    }

    public void setD3(String d3) {
        this.d3 = d3;
    }

    public String getSt1() {
        return st1;
    }

    public void setSt1(String st1) {
        this.st1 = st1;
    }

    public String getSt2() {
        return st2;
    }

    public void setSt2(String st2) {
        this.st2 = st2;
    }

    public String getSt3() {
        return st3;
    }

    public void setSt3(String st3) {
        this.st3 = st3;
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
        hash += (teamname != null ? teamname.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Team)) {
            return false;
        }
        Team other = (Team) object;
        if ((this.teamname == null && other.teamname != null) || (this.teamname != null && !this.teamname.equals(other.teamname))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Database.Team[ teamname=" + teamname + " ]";
    }
    
}
