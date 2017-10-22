package com.bagoftricks.rest.data;

import com.bagoftricks.db.model.BagNode;
import com.bagoftricks.db.model.Trick;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface TrickRepository extends PagingAndSortingRepository<Trick, Long> {
}
