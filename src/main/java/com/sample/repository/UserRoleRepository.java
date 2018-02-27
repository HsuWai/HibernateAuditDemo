package com.sample.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sample.entity.UserRole;

/**
 * @author HsuWaiWaiTun
 *
 */
@Repository
public interface UserRoleRepository extends CrudRepository<UserRole,Long>{
	public UserRole findByRole(String role);
}
