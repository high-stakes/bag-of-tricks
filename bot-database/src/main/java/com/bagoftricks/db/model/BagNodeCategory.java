package com.bagoftricks.db.model;

import lombok.Data;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the bag_category database table.
 * 
 */
@Entity
@Table(name="bag_node_category")
@Data
public class BagNodeCategory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="bag_node_category_id", unique=true, nullable=false)
	private int categoryId;

	@Column(nullable=false, length=255)
	private String key;

	//bi-directional many-to-one association to BagNode
	@OneToMany(mappedBy="bagNodeCategory")
	private List<BagNode> bagNodes;

	public BagNodeCategory() {
	}
}