namespace java com.multiplayer.services

include "Models.thrift"
include "Enums.thrift"
include "Exceptions.thrift"


service ServerService{
    list<Models.Lobby> getAllLobbies();
    list<Models.Lobby> getMyLobbies(1: string nickname);
    bool createLobby(1: Models.Lobby lobby) throws (1: Exceptions.LobbyException e);

}

service LobbyService{
    Models.Seance startSeance(1: i64 id);
    void destroyLobby(1: i64 id);
    void swapPlayersSlots(1: string nickname, 2: string nickname); // -swap(player1, player2)
}

service InvitationService{
    bool invitePlayer(1: i64 lobbyId, 2: string nickname);
    void invitePlayersByAvgRating(1: i64 ratingRequired);
    list<Models.Lobby> getLobbiesByRating(1: string nickname);
    void sendInviteResponse(1:bool response);
    void setInvitation(1: Enums.Invitation invitation)//who can invite
}

service SeanceService{
    bool getSeanceStatus();
    string getSeanceName();
    string getSeanceTime();
    Models.Seance getSeance(1: i64 name) throws (1: Exceptions.SeanceException e); //return seance
    Models.Character chooseCharacter(1: string nickname); //push in list<map<Player, Character>>
    void initBotListByDefault();
    Models.Bot createBot(1: Models.Bot bot);
    void deleteBot(1: i64 id);
    Models.Organization createOrganization(1: string name, 2: string leader);
    void removeOrganization(1: string name);
    list<Models.Organization> getOrganizations();
    Models.Organization getOrganization(1: string name);
    Models.Quest getQuest(1: i64 questId);
    list<Models.Quest> checkQuests();
    bool createMission(1: Enums.Missions misson, 2: list<i64> botId); //send bots on mission
    void inviteToOrganization(1: string organizationName, 2: string nickname);
    void removeFromOrganization(1: string organizationName, 2: string nickname);
    Models.Item getItem(1: i64 id);
    void removeItem(1: i64 id);
}

