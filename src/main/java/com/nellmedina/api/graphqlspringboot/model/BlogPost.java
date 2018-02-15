package com.nellmedina.api.graphqlspringboot.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "blog_posts")
@Getter
@Setter
@NoArgsConstructor
public class BlogPost
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Integer id;

    @Column(name = "title")
    @NotEmpty
    protected String title;

    @Column(name = "content")
    @NotEmpty
    protected String content;

    @Column(name = "created_date")
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(pattern = "yyyy/MM/dd")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy/MM/dd")
    private Date createdDate;

    @ManyToOne
    @JoinColumn(name = "created_by")
    private BlogUser createdBy;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "blog_post_followers", joinColumns = @JoinColumn(name = "blog_post_id"),
            inverseJoinColumns = @JoinColumn(name = "blog_follower_id"))
    private Set<BlogFollower> blogFollowers;
}
