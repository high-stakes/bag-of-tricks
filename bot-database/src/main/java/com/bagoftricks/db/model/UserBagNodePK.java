package com.bagoftricks.db.model;

import lombok.Data;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the user_bag_node database table.
 * 
 */
@Embeddable
@Data
public class UserBagNodePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="bag_id", unique=true, nullable=false)
	private long bagId;

	@Column(name="user_id", unique=true, nullable=false)
	private long userId;

	@Column(name="user_bag_role_cd", unique=true, nullable=false, length=10)
	private String userBagRoleCd;

	public UserBagNodePK() {
	}
}