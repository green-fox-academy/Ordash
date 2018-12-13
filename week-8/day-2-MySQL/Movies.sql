use Movies;
/* Delete the tables if they already exist */
drop table if exists Movie;
drop table if exists Reviewer;
drop table if exists Rating;

/* Create the schema for our tables */
create table Movie(mID int, title text, year int, director text);
create table Reviewer(rID int, name text);
create table Rating(rID int, mID int, stars int, ratingDate date);

/* Populate the tables with our data */
insert into Movie values(101, 'Gone with the Wind', 1939, 'Victor Fleming');
insert into Movie values(102, 'Star Wars', 1977, 'George Lucas');
insert into Movie values(103, 'The Sound of Music', 1965, 'Robert Wise');
insert into Movie values(104, 'E.T.', 1982, 'Steven Spielberg');
insert into Movie values(105, 'Titanic', 1997, 'James Cameron');
insert into Movie values(106, 'Snow White', 1937, null);
insert into Movie values(107, 'Avatar', 2009, 'James Cameron');
insert into Movie values(108, 'Raiders of the Lost Ark', 1981, 'Steven Spielberg');

insert into Reviewer values(201, 'Sarah Martinez');
insert into Reviewer values(202, 'Daniel Lewis');
insert into Reviewer values(203, 'Brittany Harris');
insert into Reviewer values(204, 'Mike Anderson');
insert into Reviewer values(205, 'Chris Jackson');
insert into Reviewer values(206, 'Elizabeth Thomas');
insert into Reviewer values(207, 'James Cameron');
insert into Reviewer values(208, 'Ashley White');

insert into Rating values(201, 101, 2, '2011-01-22');
insert into Rating values(201, 101, 4, '2011-01-27');
insert into Rating values(202, 106, 4, null);
insert into Rating values(203, 103, 2, '2011-01-20');
insert into Rating values(203, 108, 4, '2011-01-12');
insert into Rating values(203, 108, 2, '2011-01-30');
insert into Rating values(204, 101, 3, '2011-01-09');
insert into Rating values(205, 103, 3, '2011-01-27');
insert into Rating values(205, 104, 2, '2011-01-22');
insert into Rating values(205, 108, 4, null);
insert into Rating values(206, 107, 3, '2011-01-15');
insert into Rating values(206, 106, 5, '2011-01-19');
insert into Rating values(207, 107, 5, '2011-01-20');
insert into Rating values(208, 104, 3, '2011-01-02');

/*Find the titles of all movies directed by Steven Spielberg.*/

SELECT title FROM movie
WHERE director LIKE "Steven Spielberg";

/*Find all years that have a movie that received a rating of 4 or 5, and sort them in increasing order. */

SELECT DISTINCT movie.year
FROM Movie, Rating
WHERE movie.mID = rating.mId
AND (stars = 4 OR stars = 5)
ORDER BY year ASC;

/*Find the titles of all movies that have no ratings.*/

SELECT movie.title
FROM movie
WHERE mID NOT IN (SELECT mID FROM rating);

/*Write a query to return the ratings data in a more readable format: 
reviewer name, movie title, stars, and ratingDate. 
Also, sort the data, first by reviewer name, then by movie title, and lastly by number of stars. */

SELECT reviewer.name, movie.title, rating.stars, rating.ratingDate
FROM rating
JOIN reviewer
ON rating.rID = reviewer.rID
JOIN movie
ON rating.mID = movie.mID
ORDER BY reviewer.name ASC, movie.title ASC, rating.stars ASC;

/*Find the names of all reviewers who rated Gone with the Wind. */

SELECT distinct name
FROM rating
JOIN reviewer
ON rating.rID = reviewer.rID
JOIN movie
ON rating.mID = movie.mID
WHERE title LIKE "Gone with the Wind";

/*For any rating where the reviewer is the same as the director of the movie, 
return the reviewer name, movie title, and number of stars. */

SELECT reviewer.name, movie.title, rating.stars
FROM movie
JOIN rating
ON movie.mID = rating.mID
JOIN reviewer
ON rating.rID = reviewer.rID
WHERE movie.director LIKE reviewer.name;

