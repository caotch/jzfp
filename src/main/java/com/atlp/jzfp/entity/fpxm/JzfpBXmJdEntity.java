package com.atlp.jzfp.entity.fpxm;

import javax.persistence.*;
import java.sql.Time;

@Entity
@Table(name = "JZFP_B_XM_JD", schema = "JZFP", catalog = "")
public class JzfpBXmJdEntity {
    private String jdid;
    private String xmid;
    private String jdmc;
    private String jsnr;
    private long gzlzb;
    private Time kssj;
    private Time jssj;
    private long jdsx;
    private String sm;
    private String dqzt;
    private Time firsttime;
    private Time lasttime;
    private String yhid;
    private String yhxm;
    private String yhdwid;
    private String yhdwmc;

    @Id
    @Column(name = "JDID")
    public String getJdid() {
        return jdid;
    }

    public void setJdid(String jdid) {
        this.jdid = jdid;
    }

    @Basic
    @Column(name = "XMID")
    public String getXmid() {
        return xmid;
    }

    public void setXmid(String xmid) {
        this.xmid = xmid;
    }

    @Basic
    @Column(name = "JDMC")
    public String getJdmc() {
        return jdmc;
    }

    public void setJdmc(String jdmc) {
        this.jdmc = jdmc;
    }

    @Basic
    @Column(name = "JSNR")
    public String getJsnr() {
        return jsnr;
    }

    public void setJsnr(String jsnr) {
        this.jsnr = jsnr;
    }

    @Basic
    @Column(name = "GZLZB")
    public long getGzlzb() {
        return gzlzb;
    }

    public void setGzlzb(long gzlzb) {
        this.gzlzb = gzlzb;
    }

    @Basic
    @Column(name = "KSSJ")
    public Time getKssj() {
        return kssj;
    }

    public void setKssj(Time kssj) {
        this.kssj = kssj;
    }

    @Basic
    @Column(name = "JSSJ")
    public Time getJssj() {
        return jssj;
    }

    public void setJssj(Time jssj) {
        this.jssj = jssj;
    }

    @Basic
    @Column(name = "JDSX")
    public long getJdsx() {
        return jdsx;
    }

    public void setJdsx(long jdsx) {
        this.jdsx = jdsx;
    }

    @Basic
    @Column(name = "SM")
    public String getSm() {
        return sm;
    }

    public void setSm(String sm) {
        this.sm = sm;
    }

    @Basic
    @Column(name = "DQZT")
    public String getDqzt() {
        return dqzt;
    }

    public void setDqzt(String dqzt) {
        this.dqzt = dqzt;
    }

    @Basic
    @Column(name = "FIRSTTIME")
    public Time getFirsttime() {
        return firsttime;
    }

    public void setFirsttime(Time firsttime) {
        this.firsttime = firsttime;
    }

    @Basic
    @Column(name = "LASTTIME")
    public Time getLasttime() {
        return lasttime;
    }

    public void setLasttime(Time lasttime) {
        this.lasttime = lasttime;
    }

    @Basic
    @Column(name = "YHID")
    public String getYhid() {
        return yhid;
    }

    public void setYhid(String yhid) {
        this.yhid = yhid;
    }

    @Basic
    @Column(name = "YHXM")
    public String getYhxm() {
        return yhxm;
    }

    public void setYhxm(String yhxm) {
        this.yhxm = yhxm;
    }

    @Basic
    @Column(name = "YHDWID")
    public String getYhdwid() {
        return yhdwid;
    }

    public void setYhdwid(String yhdwid) {
        this.yhdwid = yhdwid;
    }

    @Basic
    @Column(name = "YHDWMC")
    public String getYhdwmc() {
        return yhdwmc;
    }

    public void setYhdwmc(String yhdwmc) {
        this.yhdwmc = yhdwmc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        JzfpBXmJdEntity that = (JzfpBXmJdEntity) o;

        if (gzlzb != that.gzlzb) return false;
        if (jdsx != that.jdsx) return false;
        if (jdid != null ? !jdid.equals(that.jdid) : that.jdid != null) return false;
        if (xmid != null ? !xmid.equals(that.xmid) : that.xmid != null) return false;
        if (jdmc != null ? !jdmc.equals(that.jdmc) : that.jdmc != null) return false;
        if (jsnr != null ? !jsnr.equals(that.jsnr) : that.jsnr != null) return false;
        if (kssj != null ? !kssj.equals(that.kssj) : that.kssj != null) return false;
        if (jssj != null ? !jssj.equals(that.jssj) : that.jssj != null) return false;
        if (sm != null ? !sm.equals(that.sm) : that.sm != null) return false;
        if (dqzt != null ? !dqzt.equals(that.dqzt) : that.dqzt != null) return false;
        if (firsttime != null ? !firsttime.equals(that.firsttime) : that.firsttime != null) return false;
        if (lasttime != null ? !lasttime.equals(that.lasttime) : that.lasttime != null) return false;
        if (yhid != null ? !yhid.equals(that.yhid) : that.yhid != null) return false;
        if (yhxm != null ? !yhxm.equals(that.yhxm) : that.yhxm != null) return false;
        if (yhdwid != null ? !yhdwid.equals(that.yhdwid) : that.yhdwid != null) return false;
        if (yhdwmc != null ? !yhdwmc.equals(that.yhdwmc) : that.yhdwmc != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = jdid != null ? jdid.hashCode() : 0;
        result = 31 * result + (xmid != null ? xmid.hashCode() : 0);
        result = 31 * result + (jdmc != null ? jdmc.hashCode() : 0);
        result = 31 * result + (jsnr != null ? jsnr.hashCode() : 0);
        result = 31 * result + (int) (gzlzb ^ (gzlzb >>> 32));
        result = 31 * result + (kssj != null ? kssj.hashCode() : 0);
        result = 31 * result + (jssj != null ? jssj.hashCode() : 0);
        result = 31 * result + (int) (jdsx ^ (jdsx >>> 32));
        result = 31 * result + (sm != null ? sm.hashCode() : 0);
        result = 31 * result + (dqzt != null ? dqzt.hashCode() : 0);
        result = 31 * result + (firsttime != null ? firsttime.hashCode() : 0);
        result = 31 * result + (lasttime != null ? lasttime.hashCode() : 0);
        result = 31 * result + (yhid != null ? yhid.hashCode() : 0);
        result = 31 * result + (yhxm != null ? yhxm.hashCode() : 0);
        result = 31 * result + (yhdwid != null ? yhdwid.hashCode() : 0);
        result = 31 * result + (yhdwmc != null ? yhdwmc.hashCode() : 0);
        return result;
    }
}
