package com.nellmedina.api.graphqlspringboot.graphql.types;

import com.nellmedina.api.graphqlspringboot.model.enumeration.OnlineStatus;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class AddBlogUserInput
{
    private String firstName;
    private String lastName;
    private String city;
    private OnlineStatus onlineStatus;
}
