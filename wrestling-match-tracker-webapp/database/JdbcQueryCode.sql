
BEGIN TRANSACTION;
 INSERT INTO matches
 (wrestler_id,opponent, opponent_score, outcome, weight_class, home_score, score_sequence, event, match_date)
 VALUES (1,'Slim Jim', 1, 'W', 285, 16, 'p1: t2 n3 n3 n3 Oe1, t2 p2:(top) n3 - tech', 'Dylan Burley Junior Varsity Virtual Experience Extravaganza', current_timestamp)
 ;
 COMMIT;
 
 
SELECT * 
FROM matches m
        INNER JOIN wrestler w
        ON m.wrestler_id = w.wrestler_id
WHERE w.wrestler_id = 1
;


Select *
FROM matches
;

SELECT outcome, home_score, opponent_score, opponent_school, m.weight_class, event, match_date
FROM matches m
  INNER JOIN wrestler w
  ON m.wrestler_id = w.wrestler_id
WHERE w.wrestler_id = 1
;