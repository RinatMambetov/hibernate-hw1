create table Director(
    director_id serial primary key,
    "name" varchar(100) not null unique,
    age int check (age > 10)
);


create table Movie(
    movie_id serial primary key,
    director_id int not null references director(director_id) on delete cascade,
    "name" varchar(200) not null,
    year_of_production int check(year_of_production > 1900)
);


insert into Director(name, age)
values
('Quentin Tarantino', 57),
('Martin Scorsese', 78),
('Guy Ritchie', 52),
('Woody Allen', 85),
('David Lynch', 74),
('Christopher Nolan', 50);


insert into Movie(director_id, name, year_of_production)
values
(1, 'Reservoir Dogs', 1992),
(1, 'Pulp Fiction', 1994),
(1, 'The Hateful Eight', 2015),
(1, 'Once Upon a Time in Hollywood', 2019),
(2, 'Taxi Driver', 1976),
(2, 'Goodfellas', 1990),
(2, 'The Wolf of Wall Street', 2013),
(3, 'Lock, Stock and Two Smoking Barrels', 1998),
(3, 'Snatch', 2000),
(4, 'Midnight in Paris', 2011),
(6, 'Inception', 2010);