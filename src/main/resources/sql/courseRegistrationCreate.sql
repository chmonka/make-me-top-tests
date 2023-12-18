create table course_registration_request_keeper_status
(
    status_id serial
        primary key,
    status varchar(255) not null
        constraint uk_7cct86djqls9hyjkmh5g0adoj
            unique
);

create table course_registration_request_status
(
    status_id serial
        primary key,
    status varchar(255) not null
        constraint uk_jojtk5ixj8q625hq58vbvxmqv
            unique
);

create table course_registration_request
(
    request_id serial
        primary key,
    course_id integer not null,
    person_id integer not null,
    request_date timestamp not null,
    status_id integer
        constraint fk266x24v0euqo7hsy95oi46yqh
            references course_registration_request_status
);

create table course_registration_request_keeper
(
    response_id serial
        primary key,
    keeper_id integer not null,
    request_id integer
        constraint fkooefg0ue6t2hsg2hjhx1xyyoq
            references course_registration_request,
    response_date timestamp not null,
    status_id integer
        constraint fktafgndp4c6o1mer0j8apch9ss
            references course_registration_request_keeper_status
);

create table rejection_reason
(
    reason_id serial
        primary key,
    name varchar(255) not null
        constraint uk_2wqoj8hpd8o6cc42476wnopq9
            unique
);

create table keeper_rejection
(
    response_id integer not null
        primary key
        constraint fkcooyxrdtu226lhfkjrq2c15jx
            references course_registration_request_keeper,
    reason_id integer
        constraint fkpu3uo4dhxxceuhfr8rh3rlp2x
            references rejection_reason
);

