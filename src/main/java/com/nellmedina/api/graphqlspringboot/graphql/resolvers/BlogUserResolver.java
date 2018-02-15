package com.nellmedina.api.graphqlspringboot.graphql.resolvers;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.nellmedina.api.graphqlspringboot.model.BlogPost;
import com.nellmedina.api.graphqlspringboot.model.BlogUser;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
public class BlogUserResolver implements GraphQLResolver<BlogUser>
{
    public Set<BlogPost> blogPosts2(BlogUser blogUser)
    {
        return blogUser.getBlogPosts();
    }
}
