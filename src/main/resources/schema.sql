CREATE TABLE users (
                         "id" int PRIMARY KEY unique ,
                         "email" varchar unique,
                         "username" varchar unique,
                         "password" varchar,
                         "country" int
);

CREATE TABLE countries (
                             "id" int PRIMARY KEY unique ,
                             "country" varchar unique,
                             "code" varchar unique,
                             "region" varchar unique
);

CREATE TABLE route (
                         "id" int PRIMARY KEY unique,
                         "grade" varchar,
                         "countryCode" varchar,
                         "users" varchar,
                        "numberOfsavedRoutes" varchar
);

CREATE TABLE grades (
                          "id" int PRIMARY KEY unique,
                          "grading" varchar,
                          "gradesystem" varchar
);

CREATE TABLE gradestyle (
    "id" int PRIMARY KEY unique,
    "Name" varchar
);
CREATE TABLE region (
                          "id" int,
                          "reigon" varchar unique
);

CREATE TABLE SavedRoutes (
                               "id" int PRIMARY KEY,
                               "userID" int unique ,
                               "route" varchar
);

ALTER TABLE users ADD FOREIGN KEY ("country") REFERENCES "countries" ("id");

ALTER TABLE route ADD FOREIGN KEY ("grade") REFERENCES "grades" ("grading"); --check this one

ALTER TABLE route ADD FOREIGN KEY ("countryCode") REFERENCES "countries" ("code"); --needs to be uniqe

ALTER TABLE users ADD FOREIGN KEY ("username") REFERENCES "route" ("users");

ALTER TABLE countries ADD FOREIGN KEY ("region") REFERENCES "region" ("reigon");

ALTER TABLE SavedRoutes ADD FOREIGN KEY ("userID") REFERENCES "users" ("id");

CREATE TABLE route_SavedRoutes (
                                     "route_id" int PRIMARY KEY ,
                                     "SavedRoutes_route" varchar

);

ALTER TABLE route_SavedRoutes ADD FOREIGN KEY ("route_id") REFERENCES "route" ("id");



