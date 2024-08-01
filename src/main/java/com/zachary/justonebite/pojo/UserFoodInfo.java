package com.zachary.justonebite.pojo;

import java.io.Serializable;
import lombok.Data;

/**
 * @TableName user_food_info
 */
@Data
public class UserFoodInfo implements Serializable {
    private Integer userid;

    private Integer visitedshopcount;

    private String favoritecheckintime;

    private String favoritefoodstyle;

    private String foodsearchingfrequency;

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
        UserFoodInfo other = (UserFoodInfo) that;
        return (this.getUserid() == null ? other.getUserid() == null : this.getUserid().equals(other.getUserid()))
            && (this.getVisitedshopcount() == null ? other.getVisitedshopcount() == null : this.getVisitedshopcount().equals(other.getVisitedshopcount()))
            && (this.getFavoritecheckintime() == null ? other.getFavoritecheckintime() == null : this.getFavoritecheckintime().equals(other.getFavoritecheckintime()))
            && (this.getFavoritefoodstyle() == null ? other.getFavoritefoodstyle() == null : this.getFavoritefoodstyle().equals(other.getFavoritefoodstyle()))
            && (this.getFoodsearchingfrequency() == null ? other.getFoodsearchingfrequency() == null : this.getFoodsearchingfrequency().equals(other.getFoodsearchingfrequency()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserid() == null) ? 0 : getUserid().hashCode());
        result = prime * result + ((getVisitedshopcount() == null) ? 0 : getVisitedshopcount().hashCode());
        result = prime * result + ((getFavoritecheckintime() == null) ? 0 : getFavoritecheckintime().hashCode());
        result = prime * result + ((getFavoritefoodstyle() == null) ? 0 : getFavoritefoodstyle().hashCode());
        result = prime * result + ((getFoodsearchingfrequency() == null) ? 0 : getFoodsearchingfrequency().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userid=").append(userid);
        sb.append(", visitedshopcount=").append(visitedshopcount);
        sb.append(", favoritecheckintime=").append(favoritecheckintime);
        sb.append(", favoritefoodstyle=").append(favoritefoodstyle);
        sb.append(", foodsearchingfrequency=").append(foodsearchingfrequency);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}