package com.bagoftricks.db.model;

import lombok.Data;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the bag_node database table.
 * 
 */
@Entity
@Table(name="bag_node")
@Data
public class BagNode implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="bag_node_id", unique=true, nullable=false)
	private long bagNodeId;

	@Column(name="bag_node_type_cd", nullable=false, length=10)
	private String bagNodeTypeCd;

	@Column(nullable=false, length=20)
	private String name;

	//bi-directional many-to-one association to BagNodeCategory
	@ManyToOne
	@JoinColumn(name="bag_node_category_id")
	private BagNodeCategory bagNodeCategory;

	//bi-directional many-to-one association to Trick
	@ManyToOne
	@JoinColumn(name="trick_id")
	private Trick trick;

	//bi-directional many-to-many association to BagNode
	@ManyToMany
	@JoinTable(
		name="bag_node_reference"
		, joinColumns={
			@JoinColumn(name="bag_node_child_id", nullable=false)
			}
		, inverseJoinColumns={
			@JoinColumn(name="bag_node_parent_id", nullable=false)
			}
		)
	private List<BagNode> bagNodes;

	//bi-directional many-to-one association to UserBagNode
	@OneToMany(mappedBy="bagNode")
	private List<UserBagNode> userBagNodes;

	public BagNode() {
	}
}