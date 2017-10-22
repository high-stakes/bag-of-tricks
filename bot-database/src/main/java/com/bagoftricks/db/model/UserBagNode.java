package com.bagoftricks.db.model;

import lombok.Data;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the user_bag_node database table.
 * 
 */
@Entity
@Table(name="user_bag_node")
@Data
public class UserBagNode implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private UserBagNodePK id;

	//bi-directional many-to-one association to BagNode
	@ManyToOne
	@JoinColumn(name="bag_id", nullable=false, insertable=false, updatable=false)
	private BagNode bagNode;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="user_id", nullable=false, insertable=false, updatable=false)
	private User user;

	public UserBagNode() {
	}

}