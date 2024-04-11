insert into airports (airport_name) values ('Mumbai'), ('Delhi'), ('Navi Mumbai'), ('Bangalore');

insert into airlines (airline_name) values ('Air Asia'), ('Air India'), ('Indigo'), ('Emirates');

insert into airplanes (airplane_name, airline_id) values
('D107', 1), ('D235', 1), ('D380', 1), ('D710', 1),
('J130', 2), ('J238', 2), ('J395', 2), ('J725', 2),
('S133', 3), ('S236', 3), ('S390', 3), ('S720', 3),
('U135', 4), ('U238', 4), ('U387', 4), ('U718', 4);

insert into customers (first_name, last_name, email) values
('rituraj', 'roj', 'rituraj@email.com'),
('riya', 'singh', 'riya@email.com'),
('manoj', 'patel', 'manpj@email.com'),
('shyam', 'paleti', 'shyam@email.com'),
('raju', 'raj', 'raju@email.com');

insert into sources (date_time, airport_id) values ('2024-03-13 11:30:34', 1);
insert into destinations (date_time, airport_id) values ('2024-03-13 13:35:56', 2);
insert into flights (flight_code, source_id, destination_id, airplane_id, fare, capacity, status)
values ('1AI1', 1, 1, 1, 45.50, 100, 'ON_TIME');

insert into sources (date_time, airport_id) values ('2020-01-15 9:30:34', 2);
insert into destinations (date_time, airport_id) values ('2020-01-15 13:35:56', 3);
insert into flights (flight_code, source_id, destination_id, airplane_id, fare, capacity, status)
values ('2AI2', 2, 2, 5, 50.75, 50, 'ON_TIME');

insert into sources (date_time, airport_id) values ('2024-03-13 11:30:34', 3);
insert into destinations (date_time, airport_id) values ('2024-03-13 13:35:56', 4);
insert into flights (flight_code, source_id, destination_id, airplane_id, fare, capacity, status)
values ('3AI3', 3, 3, 9, 45.50, 100, 'ON_TIME');

insert into sources (date_time, airport_id) values ('2020-01-15 9:30:34', 4);
insert into destinations (date_time, airport_id) values ('2020-01-15 13:35:56', 1);
insert into flights (flight_code, source_id, destination_id, airplane_id, fare, capacity, status)
values ('4AI4', 4, 4, 13, 50.75, 50, 'ON_TIME');

--

insert into sources (date_time, airport_id) values ('2024-03-13 11:30:34', 2);
insert into destinations (date_time, airport_id) values ('2024-03-13 13:35:56', 4);
insert into flights (flight_code, source_id, destination_id, airplane_id, fare, capacity, status)
values ('5AI5', 5, 5, 2, 55.50, 100, 'ON_TIME');

insert into sources (date_time, airport_id) values ('2020-01-15 9:30:34', 1);
insert into destinations (date_time, airport_id) values ('2020-01-15 13:35:56', 3);
insert into flights (flight_code, source_id, destination_id, airplane_id, fare, capacity, status)
values ('6AI6', 6, 6, 6, 57.75, 50, 'ON_TIME');

insert into sources (date_time, airport_id) values ('2024-03-13 11:30:34', 3);
insert into destinations (date_time, airport_id) values ('2024-03-13 13:35:56', 2);
insert into flights (flight_code, source_id, destination_id, airplane_id, fare, capacity, status)
values ('7AI7', 7, 7, 10, 58.50, 100, 'ON_TIME');

insert into sources (date_time, airport_id) values ('2020-01-15 9:30:34', 4);
insert into destinations (date_time, airport_id) values ('2020-01-15 13:35:56', 1);
insert into flights (flight_code, source_id, destination_id, airplane_id, fare, capacity, status)
values ('8AI8', 8, 8, 14, 54.75, 50, 'ON_TIME');

--

insert into sources (date_time, airport_id) values ('2024-03-13 11:30:34', 4);
insert into destinations (date_time, airport_id) values ('2024-03-13 13:35:56', 3);
insert into flights (flight_code, source_id, destination_id, airplane_id, fare, capacity, status)
values ('9AI9', 9, 9, 3, 68.50, 100, 'ON_TIME');

insert into sources (date_time, airport_id) values ('2020-01-15 9:30:34', 3);
insert into destinations (date_time, airport_id) values ('2020-01-15 13:35:56', 1);
insert into flights (flight_code, source_id, destination_id, airplane_id, fare, capacity, status)
values ('10AI', 10, 10, 7, 69.75, 50, 'ON_TIME');

insert into sources (date_time, airport_id) values ('2024-03-13 11:30:34', 1);
insert into destinations (date_time, airport_id) values ('2024-03-13 13:35:56', 2);
insert into flights (flight_code, source_id, destination_id, airplane_id, fare, capacity, status)
values ('11AI', 11, 11, 11, 67.50, 100, 'ON_TIME');

insert into sources (date_time, airport_id) values ('2020-01-15 9:30:34', 2);
insert into destinations (date_time, airport_id) values ('2020-01-15 13:35:56', 4);
insert into flights (flight_code, source_id, destination_id, airplane_id, fare, capacity, status)
values ('12AI', 12, 12, 15, 68.75, 50, 'ON_TIME');

--

insert into sources (date_time, airport_id) values ('2024-03-13 11:30:34', 1);
insert into destinations (date_time, airport_id) values ('2024-03-13 13:35:56', 4);
insert into flights (flight_code, source_id, destination_id, airplane_id, fare, capacity, status)
values ('13AI', 13, 13, 4, 90.00, 100, 'ON_TIME');

insert into sources (date_time, airport_id) values ('2020-01-15 9:30:34', 2);
insert into destinations (date_time, airport_id) values ('2020-01-15 13:35:56', 3);
insert into flights (flight_code, source_id, destination_id, airplane_id, fare, capacity, status)
values ('14AI', 14, 14, 8, 94.25, 50, 'ON_TIME');

insert into sources (date_time, airport_id) values ('2024-03-13 11:30:34', 3);
insert into destinations (date_time, airport_id) values ('2024-03-13 13:35:56', 1);
insert into flights (flight_code, source_id, destination_id, airplane_id, fare, capacity, status)
values ('15AI', 15, 15, 12, 93.99, 100, 'ON_TIME');

insert into sources (date_time, airport_id) values ('2020-01-15 9:30:34', 4);
insert into destinations (date_time, airport_id) values ('2020-01-15 13:35:56', 2);
insert into flights (flight_code, source_id, destination_id, airplane_id, fare, capacity, status)
values ('16AI', 16, 16, 16, 91.75, 50, 'ON_TIME');

--

insert into reservations (date_time, status, customer_id, flight_id) values
('2024-03-13 15:20:23', 'ACTIVE', 1, 1),
('2024-03-13 15:20:23', 'ACTIVE', 1, 2),
('2024-03-13 15:20:23', 'CANCELLED', 1, 3),
('2024-03-13 15:20:23', 'CANCELLED', 1, 4),

('2024-03-13 15:20:23', 'ACTIVE', 2, 3),
('2024-03-13 15:20:23', 'ACTIVE', 2, 4),
('2024-03-13 15:20:23', 'CANCELLED', 2, 1),
('2024-03-13 15:20:23', 'CANCELLED', 2, 2),

('2024-03-13 15:20:23', 'ACTIVE', 3, 5),
('2024-03-13 15:20:23', 'ACTIVE', 3, 6),
('2024-03-13 15:20:23', 'CANCELLED', 3, 7),
('2024-03-13 15:20:23', 'CANCELLED', 3, 8),

('2024-03-13 15:20:23', 'ACTIVE', 4, 7),
('2024-03-13 15:20:23', 'ACTIVE', 4, 8),
('2024-03-13 15:20:23', 'CANCELLED', 4, 5),
('2024-03-13 15:20:23', 'CANCELLED', 4, 6);

insert into customers_flights (flight_id, customer_id) values (3, 2)