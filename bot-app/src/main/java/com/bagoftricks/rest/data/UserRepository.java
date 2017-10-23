package com.bagoftricks.rest.data;

import com.bagoftricks.db.model.User;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource
@CrossOrigin
public interface UserRepository extends PagingAndSortingRepository<User, Long> {


}
