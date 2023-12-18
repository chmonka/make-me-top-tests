create table course_mark
(
    explorer_id integer not null
        primary key,
    course_end_date timestamp not null,
    value integer not null
);

create table course_theme_completion
(
    course_theme_completion_id serial
        primary key,
    course_theme_id integer not null,
    explorer_id integer not null,
    mark integer not null
);

