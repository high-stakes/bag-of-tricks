package com.bagoftricks.db.model;

import lombok.Data;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the user database table.
 * 
 */
@Entity
@Table(name="user")
@Data
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="user_id", unique=true, nullable=false)
	private long userId;

	@Column(length=255)
	private String email;

	@Column(name="github_username", length=45)
	private String githubUsername;

	@Column(name="password_hash", length=50)
	private String passwordHash;

	@Column(name="password_salt", nullable=false, length=50)
	private String passwordSalt;

	@Column(nullable=false, length=16)
	private String username;

	//bi-directional many-to-one association to UserBagNode
	@OneToMany(mappedBy="user")
	private List<UserBagNode> userBagNodes;

	public User() {
	}

}