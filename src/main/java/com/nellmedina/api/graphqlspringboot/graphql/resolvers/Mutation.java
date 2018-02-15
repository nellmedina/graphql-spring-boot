package com.nellmedina.api.graphqlspringboot.graphql.resolvers;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.nellmedina.api.graphqlspringboot.graphql.types.AddBlogUserInput;
import com.nellmedina.api.graphqlspringboot.model.BlogUser;
import com.nellmedina.api.graphqlspringboot.repository.BlogUserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class Mutation implements GraphQLMutationResolver
{
    private final BlogUserRepository blogUserRepository;

    public Mutation(BlogUserRepository blogUserRepository)
    {
        this.blogUserRepository = blogUserRepository;
    }

    public BlogUser addBlogUser(AddBlogUserInput addBlogUserInput)
    {
        final BlogUser blogUser = new BlogUser();

        BeanUtils.copyProperties(addBlogUserInput, blogUser);

        blogUserRepository.save(blogUser);

        return blogUser;
    }
}
