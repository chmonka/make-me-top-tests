create table course_rating
(
    explorer_id integer not null
        primary key,
    rating integer not null
);

create table explorer_feedback
(
    explorer_id integer not null
        primary key,
    comment varchar(1000),
    keeper_id integer not null,
    rating integer not null
);

create table keeper_feedback
(
    explorer_id integer not null
        primary key,
    comment varchar(1000),
    keeper_id integer not null,
    rating integer not null
);

