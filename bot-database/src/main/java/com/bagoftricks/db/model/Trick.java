package com.bagoftricks.db.model;

import lombok.Data;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the trick database table.
 * 
 */
@Entity
@Table(name="trick")
@Data
public class Trick implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="trick_id", unique=true, nullable=false)
	private long trickId;

	@Column(nullable=false, length=1000)
	private String text;

	//bi-directional many-to-one association to BagNode
	@OneToMany(mappedBy="trick")
	private List<BagNode> bagNodes;

	public Trick() {
	}


}