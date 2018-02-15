package com.nellmedina.api.graphqlspringboot.repository;

import com.nellmedina.api.graphqlspringboot.model.BlogFollower;
import org.springframework.data.repository.CrudRepository;

public interface BlogFollowerRepository extends CrudRepository<BlogFollower, Integer>
{
}
