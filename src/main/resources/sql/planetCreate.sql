create table planet
(
    planet_id serial
        primary key,
    planet_name varchar(255) not null,
    planet_number integer not null,
    system_id integer not null
);

