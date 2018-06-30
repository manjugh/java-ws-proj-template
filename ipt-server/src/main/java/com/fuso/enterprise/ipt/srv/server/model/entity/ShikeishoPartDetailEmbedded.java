
package com.fuso.enterprise.ipt.srv.server.model.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Embeddable
public class ShikeishoPartDetailEmbedded implements Serializable {

    private static final long serialVersionUID = 6240921362647414653L;

    @Fetch(FetchMode.SELECT)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "shikeisho_no")
    private ShikeishoDetail shikeishoDetail;

    @Column(name = "part_no")
    private String partNo;

    @Column(name = "eo_no")
    private String eoNo;

    public ShikeishoDetail getShikeishoDetail() {
        return shikeishoDetail;
    }

    public void setShikeishoDetail(ShikeishoDetail shikeishoDetail) {
        this.shikeishoDetail = shikeishoDetail;
    }

    public String getPartNo() {
        return partNo;
    }

    public void setPartNo(String partNo) {
        this.partNo = partNo;
    }

    public String getEoNo() {
        return eoNo;
    }

    public void setEoNo(String eoNo) {
        this.eoNo = eoNo;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((eoNo == null) ? 0 : eoNo.hashCode());
        result = prime * result + ((partNo == null) ? 0 : partNo.hashCode());
        result = prime * result + ((shikeishoDetail == null) ? 0 : shikeishoDetail.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ShikeishoPartDetailEmbedded other = (ShikeishoPartDetailEmbedded) obj;
        if (eoNo == null) {
            if (other.eoNo != null)
                return false;
        } else if (!eoNo.equals(other.eoNo))
            return false;
        if (partNo == null) {
            if (other.partNo != null)
                return false;
        } else if (!partNo.equals(other.partNo))
            return false;
        if (shikeishoDetail == null) {
            if (other.shikeishoDetail != null)
                return false;
        } else if (!shikeishoDetail.equals(other.shikeishoDetail))
            return false;
        return true;
    }

}
