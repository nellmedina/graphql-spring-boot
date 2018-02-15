package com.nellmedina.api.graphqlspringboot.graphql.resolvers;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.google.common.collect.Lists;
import com.nellmedina.api.graphqlspringboot.model.BlogFollower;
import com.nellmedina.api.graphqlspringboot.model.BlogPost;
import com.nellmedina.api.graphqlspringboot.model.BlogUser;
import com.nellmedina.api.graphqlspringboot.repository.BlogFollowerRepository;
import com.nellmedina.api.graphqlspringboot.repository.BlogPostRepository;
import com.nellmedina.api.graphqlspringboot.repository.BlogUserRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Query implements GraphQLQueryResolver
{
    private final BlogUserRepository blogUserRepository;
    private final BlogFollowerRepository blogFollowerRepository;
    private final BlogPostRepository blogPostRepository;

    public Query(BlogUserRepository blogUserRepository,
                 BlogFollowerRepository blogFollowerRepository,
                 BlogPostRepository blogPostRepository)
    {
        this.blogUserRepository = blogUserRepository;
        this.blogFollowerRepository = blogFollowerRepository;
        this.blogPostRepository = blogPostRepository;
    }

    public BlogUser getUser(Integer id)
    {
        return blogUserRepository.findOne(id);
    }

    public List<BlogUser> getUsers()
    {
        return Lists.newArrayList(blogUserRepository.findAll());
    }

    public BlogFollower getFollower(Integer id)
    {
        return blogFollowerRepository.findOne(id);
    }

    public BlogPost getPost(Integer id)
    {
        return blogPostRepository.findOne(id);
    }
}
