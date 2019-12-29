namespace java com.multiplayer.models

include "Enums.thrift"

struct Server{
    1:i64 id;
    2:list<Lobby> lobbies;
}

struct Lobby{
    1: i64 id;
    2: string name;
    3: list<Player> players;
    4: i32 maxPlayersInLobby=8;
    5: i32 minPlayersInLobby=2;
    6: i64 ratingRequired;
}

struct Seance{
     1: i64 id;
     2: string name;
     3: list<Player> players;
     4: Enums.SeanceStatus status;
     5: list<map<Player, Character>> charactersList;
     6: list<map<Bot, Character>> botsList;
     7: string seanceTime;
     8: list<Organization> organizations;
}

struct Character{
      1: i64 id;
      2: Enums.CharacterType type;
      3: Characteristic characteristic;
      4: Enums.Specialization specialization;
      5: list<Quest> questsList;
      6: list<Item> items;
}

struct Quest{
    1: i64 id;
    2: Enums.Quests name;
    3: i64 progress;
}

struct Characteristic {
    1: i32 power;
    2: i32 charisma;
    3: i32 intelligence;
    4: i32 stealth;
    5: i32 discipline;
    6: i32 lvl;

}

struct Bot {
    1: i64 id;
    2: Enums.BotType type;
    3: i32 health;
    4: i32 attack;
    5: string name;
    6: Mission mission;
}

struct Mission{
    1: i64 id;
    2: Enums.Missions mission;
    3: Enums.MissionStatus status;
}

struct Player {
    1: i64 id;
    2: string nickname;
    3: i64 rating;
    4: Enums.Invitation whoCanInvite;
}

struct Organization{
    1: i64 id;
    2: string name;
    3: Player leader;
    4: list<Player> members;
    5: i64 progress;
}

struct Item{
    1: i64 id;
    2: string name;
    3: string reqLvl;
    4: string description;
}


