package com.zachary.justonebite.pojo;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @TableName browsing_history
 */
@Data
public class BrowsingHistory implements Serializable {
    private Integer browsingid;

    private Integer userid;

    private Integer shopid;

    private Date browsingtime;

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
        BrowsingHistory other = (BrowsingHistory) that;
        return (this.getBrowsingid() == null ? other.getBrowsingid() == null : this.getBrowsingid().equals(other.getBrowsingid()))
            && (this.getUserid() == null ? other.getUserid() == null : this.getUserid().equals(other.getUserid()))
            && (this.getShopid() == null ? other.getShopid() == null : this.getShopid().equals(other.getShopid()))
            && (this.getBrowsingtime() == null ? other.getBrowsingtime() == null : this.getBrowsingtime().equals(other.getBrowsingtime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getBrowsingid() == null) ? 0 : getBrowsingid().hashCode());
        result = prime * result + ((getUserid() == null) ? 0 : getUserid().hashCode());
        result = prime * result + ((getShopid() == null) ? 0 : getShopid().hashCode());
        result = prime * result + ((getBrowsingtime() == null) ? 0 : getBrowsingtime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", browsingid=").append(browsingid);
        sb.append(", userid=").append(userid);
        sb.append(", shopid=").append(shopid);
        sb.append(", browsingtime=").append(browsingtime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}