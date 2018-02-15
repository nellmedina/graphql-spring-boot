package com.nellmedina.api.graphqlspringboot.model;

import com.nellmedina.api.graphqlspringboot.model.enumeration.OnlineStatus;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "blog_users")
@Getter
@Setter
@NoArgsConstructor
public class BlogUser
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "first_name")
    @NotEmpty
    private String firstName;

    @Column(name = "last_name")
    @NotEmpty
    private String lastName;

    @Column(name = "city")
    @NotEmpty
    private String city;

    @Enumerated(EnumType.STRING)
    @Column(name = "online_status")
    private OnlineStatus onlineStatus;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "createdBy", fetch = FetchType.EAGER)
    private Set<BlogPost> blogPosts;

    @Transient
    private Set<BlogPost> blogPosts2;
}
