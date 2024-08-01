package com.zachary.justonebite.pojo;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @TableName check_in
 */
@Data
public class CheckIn implements Serializable {
    private Integer checkinid;

    private Integer userid;

    private Integer shopid;

    private Date checkintime;

    private String footprintdescription;

    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        CheckIn other = (CheckIn) that;
        return (this.getCheckinid() == null ? other.getCheckinid() == null : this.getCheckinid().equals(other.getCheckinid()))
            && (this.getUserid() == null ? other.getUserid() == null : this.getUserid().equals(other.getUserid()))
            && (this.getShopid() == null ? other.getShopid() == null : this.getShopid().equals(other.getShopid()))
            && (this.getCheckintime() == null ? other.getCheckintime() == null : this.getCheckintime().equals(other.getCheckintime()))
            && (this.getFootprintdescription() == null ? other.getFootprintdescription() == null : this.getFootprintdescription().equals(other.getFootprintdescription()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCheckinid() == null) ? 0 : getCheckinid().hashCode());
        result = prime * result + ((getUserid() == null) ? 0 : getUserid().hashCode());
        result = prime * result + ((getShopid() == null) ? 0 : getShopid().hashCode());
        result = prime * result + ((getCheckintime() == null) ? 0 : getCheckintime().hashCode());
        result = prime * result + ((getFootprintdescription() == null) ? 0 : getFootprintdescription().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", checkinid=").append(checkinid);
        sb.append(", userid=").append(userid);
        sb.append(", shopid=").append(shopid);
        sb.append(", checkintime=").append(checkintime);
        sb.append(", footprintdescription=").append(footprintdescription);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}