create table galaxy
(
    galaxy_id serial
        primary key,
    galaxy_description text not null,
    galaxy_name varchar(255) not null
        constraint uk_5mvudpca7fmy9slvy10qcxuiy
            unique
);

create table orbit
(
    orbit_id serial
        primary key,
    galaxy_id integer
        constraint fkgo398wko5og6nwx48sj7u8tkt
            references galaxy,
    orbit_level integer not null,
    system_count integer not null
);

create table star_system
(
    system_id serial
        primary key,
    orbit_id integer
        constraint fkaau2bpo5mjgvnduvbodlfpj3f
            references orbit,
    system_level integer not null,
    system_name varchar(255) not null
        constraint uk_chopaxs5nt835c4rsepwfwp4p
            unique,
    system_position integer not null
);

create table system_dependency
(
    dependency_id serial
        primary key,
    is_alternative boolean not null,
    child_id integer
        constraint fkqv052s3g2yqft5wcpekvxb6f7
            references star_system,
    parent_id integer
        constraint fk847w45nb2e52ixd684vwpl5jk
            references star_system
);

