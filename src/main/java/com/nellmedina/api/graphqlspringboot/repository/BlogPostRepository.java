package com.nellmedina.api.graphqlspringboot.repository;

import com.nellmedina.api.graphqlspringboot.model.BlogPost;
import org.springframework.data.repository.CrudRepository;

public interface BlogPostRepository extends CrudRepository<BlogPost, Integer>
{
}
