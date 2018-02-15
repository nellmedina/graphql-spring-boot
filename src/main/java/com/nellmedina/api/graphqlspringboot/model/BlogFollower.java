package com.nellmedina.api.graphqlspringboot.model;

import com.nellmedina.api.graphqlspringboot.model.common.NamedEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "blog_followers")
@Getter
@Setter
@NoArgsConstructor
public class BlogFollower extends NamedEntity
{
}
