-- crear tabla users
CREATE TABLE users (
  id INT PRIMARY KEY,
  name VARCHAR(255),
  email VARCHAR(255)
);

-- populate
INSERT INTO users (id, name, email) VALUES (1, 'Constanza Lopez', 'constanza.vlm@hotmail.com');
INSERT INTO users (id, name, email) VALUES (2, 'luffy', 'luffy.d.m.example@domainexample.com');

-- crear tabla musica
CREATE TABLE music_style (
  id INT PRIMARY KEY,
  name VARCHAR(255),
  vote_count INT
);
-- populate
INSERT INTO music_style (id, name, vote_count) VALUES (1, 'Rock', 1);
INSERT INTO music_style (id, name, vote_count) VALUES (2, 'Jazz', 1);
INSERT INTO music_style (id, name, vote_count) VALUES (3, 'Pop', 0);
INSERT INTO music_style (id, name, vote_count) VALUES (4, 'Clásica', 0);
INSERT INTO music_style (id, name, vote_count) VALUES (5, 'K-pop', 1);
INSERT INTO music_style (id, name, vote_count) VALUES (6, 'Hip-Hop', 0);
INSERT INTO music_style (id, name, vote_count) VALUES (7, 'Metal', 0);

-- crear tabla votos
CREATE TABLE votes (
  id INT PRIMARY KEY,
  user_id INT,
  music_style_id INT,
  FOREIGN KEY (user_id) REFERENCES users (id), 
  created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  FOREIGN KEY (music_style_id) REFERENCES music_style (id)
);

-- populate
INSERT INTO votes (id, user_id, music_style_id) VALUES (1, 1, 1);
INSERT INTO votes (id, user_id, music_style_id) VALUES (2, 1, 2);
INSERT INTO votes (id, user_id, music_style_id) VALUES (3, 2, 5);


