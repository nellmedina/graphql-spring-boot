package com.nellmedina.api.graphqlspringboot.repository;

import com.nellmedina.api.graphqlspringboot.model.BlogUser;
import org.springframework.data.repository.CrudRepository;

public interface BlogUserRepository extends CrudRepository<BlogUser, Integer>
{
}
