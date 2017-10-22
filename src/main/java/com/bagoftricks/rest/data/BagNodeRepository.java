package com.bagoftricks.rest.data;

import com.bagoftricks.db.model.BagNode;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface BagNodeRepository extends PagingAndSortingRepository<BagNode, Long>{
}
