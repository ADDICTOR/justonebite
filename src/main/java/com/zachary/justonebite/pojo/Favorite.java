package com.zachary.justonebite.pojo;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @TableName favorite
 */
@Data
public class Favorite implements Serializable {
    private Integer favoriteid;

    private Integer userid;

    private Integer shopid;

    private Date favoritetime;

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
        Favorite other = (Favorite) that;
        return (this.getFavoriteid() == null ? other.getFavoriteid() == null : this.getFavoriteid().equals(other.getFavoriteid()))
            && (this.getUserid() == null ? other.getUserid() == null : this.getUserid().equals(other.getUserid()))
            && (this.getShopid() == null ? other.getShopid() == null : this.getShopid().equals(other.getShopid()))
            && (this.getFavoritetime() == null ? other.getFavoritetime() == null : this.getFavoritetime().equals(other.getFavoritetime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getFavoriteid() == null) ? 0 : getFavoriteid().hashCode());
        result = prime * result + ((getUserid() == null) ? 0 : getUserid().hashCode());
        result = prime * result + ((getShopid() == null) ? 0 : getShopid().hashCode());
        result = prime * result + ((getFavoritetime() == null) ? 0 : getFavoritetime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", favoriteid=").append(favoriteid);
        sb.append(", userid=").append(userid);
        sb.append(", shopid=").append(shopid);
        sb.append(", favoritetime=").append(favoritetime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}