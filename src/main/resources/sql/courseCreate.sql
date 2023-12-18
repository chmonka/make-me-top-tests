create table course
(
    course_id integer not null
        primary key,
    creation_date timestamp not null,
    description varchar(255) not null,
    last_modified timestamp not null,
    title varchar(255) not null
);

create table course_theme
(
    course_theme_id integer not null
        primary key,
    content text not null,
    course_id integer
        constraint fk9bcrejcfpxmbie1i2geihx1pb
            references course,
    course_theme_number integer not null,
    description varchar(255) not null,
    last_modified timestamp not null,
    title varchar(255) not null
);

