/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sl314.control;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ayala-14s
 */
@Entity
@Table(name = "PLAYER")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Player.findAll", query = "SELECT p FROM Player p"),
    @NamedQuery(name = "Player.findByIdPlayer", query = "SELECT p FROM Player p WHERE p.idPlayer = :idPlayer"),
    @NamedQuery(name = "Player.findByName", query = "SELECT p FROM Player p WHERE p.name = :name"),
    @NamedQuery(name = "Player.findByAge", query = "SELECT p FROM Player p WHERE p.age = :age"),
    @NamedQuery(name = "Player.findByPosition", query = "SELECT p FROM Player p WHERE p.position = :position"),
    @NamedQuery(name = "Player.findByStatus", query = "SELECT p FROM Player p WHERE p.status = :status"),
    @NamedQuery(name = "Player.findByNumber", query = "SELECT p FROM Player p WHERE p.number = :number")})
public class Player implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_PLAYER")
    private Integer idPlayer;
    @Size(max = 45)
    @Column(name = "NAME")
    private String name;
    @Column(name = "AGE")
    private Integer age;
    @Size(max = 45)
    @Column(name = "POSITION")
    private String position;
    @Column(name = "STATUS")
    private Boolean status;
    @Column(name = "NUMBER")
    private Integer number;
    @JoinColumn(name = "ID_TEAM", referencedColumnName = "ID_TEAM")
    @ManyToOne(optional = false)
    private Team idTeam;

    public Player() {
    }

    public Player(Integer idPlayer) {
        this.idPlayer = idPlayer;
    }

    public Integer getIdPlayer() {
        return idPlayer;
    }

    public void setIdPlayer(Integer idPlayer) {
        this.idPlayer = idPlayer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Team getIdTeam() {
        return idTeam;
    }

    public void setIdTeam(Team idTeam) {
        this.idTeam = idTeam;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPlayer != null ? idPlayer.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Player)) {
            return false;
        }
        Player other = (Player) object;
        if ((this.idPlayer == null && other.idPlayer != null) || (this.idPlayer != null && !this.idPlayer.equals(other.idPlayer))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sl314.control.Player[ idPlayer=" + idPlayer + " ]";
    }
    
}
