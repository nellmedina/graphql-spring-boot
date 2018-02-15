
CREATE DATABASE viseo;

CREATE TABLE blog_users
(
  id            SERIAL NOT NULL CONSTRAINT pk_blog_users PRIMARY KEY,
  first_name    VARCHAR(30),
  last_name     VARCHAR(30),
  city          VARCHAR(80),
  online_status VARCHAR(30)
);

CREATE TABLE blog_posts
(
  id 		       SERIAL NOT NULL CONSTRAINT pk_blog_posts PRIMARY KEY,
  title        VARCHAR(30),
  content      VARCHAR(244),
  created_date DATE,
  created_by   INTEGER NOT NULL CONSTRAINT blog_posts_created_by_fkey REFERENCES blog_users
);

CREATE TABLE blog_followers
(
  id 	  SERIAL NOT NULL CONSTRAINT pk_blog_followers PRIMARY KEY,
  name  VARCHAR(50)
);

CREATE TABLE blog_post_followers
(
  blog_post_id     INTEGER NOT NULL CONSTRAINT blog_post_id_fkey REFERENCES blog_posts,
  blog_follower_id INTEGER NOT NULL CONSTRAINT blog_follower_id_fkey REFERENCES blog_followers,
  CONSTRAINT unique_ids UNIQUE (blog_post_id, blog_follower_id)
);



INSERT INTO blog_users (first_name, last_name, city) VALUES ('Siva', 'Malapati', 'Los Angeles');
INSERT INTO blog_users (first_name, last_name, city) VALUES ('Nicholas', 'Wang', 'Beijing');
INSERT INTO blog_users (first_name, last_name, city) VALUES ('Christopher', 'Arumkamar', 'Cleveland');
INSERT INTO blog_users (first_name, last_name, city) VALUES ('Arindam', 'Saravana', 'Boston');

INSERT INTO blog_posts (title, content, created_date, created_by) VALUES ('Title 1', 'Content 1', now(), 3);
INSERT INTO blog_posts (title, content, created_date, created_by) VALUES ('Title 2', 'Content 2', now(), 2);
INSERT INTO blog_posts (title, content, created_date, created_by) VALUES ('Title 3', 'Content 3', now(), 1);
INSERT INTO blog_posts (title, content, created_date, created_by) VALUES ('Title 4', 'Content 4', now(), 1);

INSERT INTO blog_followers (name) VALUES ('David');
INSERT INTO blog_followers (name) VALUES ('Justin');
INSERT INTO blog_followers (name) VALUES ('Simon');
INSERT INTO blog_followers (name) VALUES ('Nicholas');
INSERT INTO blog_followers (name) VALUES ('Maxime');

INSERT INTO blog_post_followers (blog_post_id, blog_follower_id) VALUES (1, 2);
INSERT INTO blog_post_followers (blog_post_id, blog_follower_id) VALUES (1, 1);
INSERT INTO blog_post_followers (blog_post_id, blog_follower_id) VALUES (1, 4);
INSERT INTO blog_post_followers (blog_post_id, blog_follower_id) VALUES (2, 4);
INSERT INTO blog_post_followers (blog_post_id, blog_follower_id) VALUES (2, 1);
INSERT INTO blog_post_followers (blog_post_id, blog_follower_id) VALUES (3, 3);
INSERT INTO blog_post_followers (blog_post_id, blog_follower_id) VALUES (3, 1);
INSERT INTO blog_post_followers (blog_post_id, blog_follower_id) VALUES (4, 4);