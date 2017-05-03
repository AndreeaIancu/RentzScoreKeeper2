# RentzScoreKeeper2
ScoreKeeperApp

Hi everyone,

Here is my second Project - Rentz Score Keeper:

This app is designed to accompany the card game named Rentz and help the players keep track of their score.

Rules for playing RENTZ:

Rentz can be played with 3-6 players with a standard cards set.
From the standard card set you pic 8 cards for each player (24 for 3 players, 32 for 4 players, etc.) starting from the higher value cards.

The game consists in 7 different subgames (5 negative and 2 pozitive), each player having the right, 
when his turn comes, to pick one of the 7 subgames (as long as he did not pick it previously). 
As such, one can play 7 x "number of players" rounds of Rentz (ex: with 3 players you play 21 rounds of games).

The 7 subgames:

Negative:

1. King of hearts: players have to avoid taking the king of hearts. Score = -100 points.
2. Queens: players have to avoid taking the queens. Score: -25 points/queen.
3. Diamonds: players have to avoid taking diamonds. Score: -20/diamond.
4. Hands: players have to avoid taking hands of cards. Score: -10/hand.
5. Total minus: players have to avoid taking the king of hearts, queens, diamonds, hands (all the negative points). 
    Score is obtained by adding up the points as per individual cards. Queen of diamonds is counted as a queen plus 
    a diamond having a value of -45 points.

Positive:

6. Total plus: the opposite of Total minus. Players have to accumulate all the cards. 
    Score is obtained by adding up the points as per individual cards but having a positive value. 
    Queen of diamonds is counted as a queen plus a diamond having a value of 45 points.

7. RENTZ: the objective of this subgame is to finish all the cards in your hands before the other players do.
    Score is 500 points for the player that finishes first, 400 points for the player that finishes second, a.s.o , 
    100 points for the player who finishes 5th.
    
The score for the specific round can be doubled if the player, at the moment of choosing on of the subgames to play, 
chooses to play the subgame blind (not looking at his cards before picking the next subgame to be played).
