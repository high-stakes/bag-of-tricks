package com.bagoftricks.rest.data;

import com.bagoftricks.db.model.User;
import com.bagoftricks.db.model.UserBagNode;
import com.bagoftricks.db.model.UserBagNodePK;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface UserBagNodeRepository extends PagingAndSortingRepository<UserBagNode, UserBagNodePK> {


}
