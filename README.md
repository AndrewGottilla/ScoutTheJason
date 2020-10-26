# ScoutTheJason
Scout the Jason (STJ) is a multiplayer RPG-inspired role deduction game. This project was orignally created as my Senior Project for Farmingdale State College.

## Table of Contents
* [About Scout the Jason](#about-stj)
* [Technologies](#technologies)
* [How to play](#how-to-play)
* [Setup](#setup)
* [How it works](#how-it-works)
* [Ideas / Fixes](#ideas-and-fixes)

## About STJ
Scout the Jason (STJ) is an RPG-inspired role deduction game where one of your friends becomes "Jason". They're the murderer! Each player who joins is given a unique role which has a unique ability. The player who is given the Jason role is tasked with eliminating the other members of the group. All other roles, except for one, are considered hero roles. The hero roles have abilities including healing, investigating, and striking another player. The heroes are tasked with eliminating Jason. There's one other role: the witch doctor. The witch doctor has the chance to either win with the heroes or win with Jason. The witch doctor's ability can only be used once per game to either revive a dead player or kill a living player. The witch doctor can choose to either help the heroes, or help Jason. Nobody knows the roles of the other players - not even Jason! Therefore, Jason will have to pull every trick in the book to remain hidden, even lie, while coordinating attacks on the other players. Meanwhile, the heroes will have to communicate with each other to determine who Jason is, then eliminate them before it's too late.

## Technologies
Project created using:

*Java SE Runtime Environment 8u261*
*	https://java.com/en/download/

*JavaFX 11*
*	https://gluonhq.com/products/javafx/

*Mysql-connector 8.0.11*
*	https://downloads.mysql.com/archives/c-j/

## How to play
Each round has three phases - a communication phase, an action phase, and a results phase. After all the players connect and are given their role, the game begins at the communication phase. During the communication phase, each player has an opportunity to send messages to the other members of the group. Currently, each player has a total of 5 messages to send each round. Each player needs to communicate carefully and effectively. Once each player sends all 5 of their messages, it's onto the action phase. During the action phase, each player is prompted to using their role ability against another player (or themselves). Be sure to hit, heal, or kill appropriately based on your role to win. Each action is then processed by the server and the results are sent back to each player. This is called the results phase. Immediately after, the game will determine if a team has won. If not, then the game continues back to the communication phase.

## Setup
### A) Install Java 8:
Please use the appropriate guide for your environment of choice:
* https://java.com/en/download/
### B) Launch server application
One person needs to launch the server application. There are compiled assets inside (/classes/artifacts/) to make this easier. The batch file works with Windows.
![Run server](https://github.com/AndrewGottilla/ScoutTheJason/blob/master/readme/server.PNG?raw=true)
### C) Launch client applications
Each of the 5 players will launch the client application. There are compiled assets inside (/classes/artifacts/) to make this easier. The batch file works with Windows.

**One connected:**
![One connected](https://github.com/AndrewGottilla/ScoutTheJason/blob/master/readme/client1.PNG?raw=true)
**All connected:**
![All connected](https://github.com/AndrewGottilla/ScoutTheJason/blob/master/readme/client5.PNG?raw=true)
### D) Have fun!
Start typing away to your fellow groupmates! If you're Jason, keep your identity hidden and plan your first kill for the second round. If you're a hero, try to keep your role anonymous until you know who to trust. Witch doctor, think about what chaos you could bring upon the group.

![Sneak peek](https://github.com/AndrewGottilla/ScoutTheJason/blob/master/readme/game_on.PNG?raw=true)

## How it works
Scout the Jason works by synchronizing open data streams between server and client applications. The server and client applications are structured to send and receive data iteratively through a set of phases. 

I've planned on creating a video that showcases the logic in greater detail. I urge you to check it out (when it's done)!
![Sneak peek](https://github.com/AndrewGottilla/ScoutTheJason/blob/master/readme/game_on.PNG?raw=true)

## Ideas and fixes
I will talk about some of these in the YouTube video just above, (when it's made,) but here's a general list:
- Utilizing a web server instead of a simple server application
- Player accounts which store information into a database. (ORM)
- Various new roles
- Increased player count
- Better output for game ending
