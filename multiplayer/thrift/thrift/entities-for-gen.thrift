namespace java com.multiplayer.entitiesAndServices

service AuthenteficationService{
    Character login(1: string login, 2: string password)

    void logout()
}

service PlayerService {
    Character create(1: string name)

    bool deletePlayer(1: i64 id)

    bool setCharacter(1: i64 id, 2: Character character);

    bool changeCharacter(1: i64 id, 2: Character character);
}

service PrivateChatService {
    Message sendMessage(1: MessageRequest messageRequest);

    list<Message> getMessages(1: MessagesRequest messagesRequest);
}

struct MessageRequest {
    1: string username;
    2: string message;
}

struct MessagesRequest{
    1: string username;
}

struct Authentefication{
    1: string login;
    2: string password;
    3: string role;
    4: i64 characterId;
}

struct Character{
    1: i64 id;
    2: CharacterType type;
    3: string name;
    4: Characteristic characteristic;
    5: Specialization specialization;
    6: i64 money;
    7: list<Item> items;
    8: i64 rating;
}

struct PrivatMessages{
    1: i64 chatId;
    2: list<Message> messages;
}

struct Message {
    1: string message;
    2: string username;
    3: i64 timestamp;
}

struct Item{
    1: i64 id;
    2: string name;
    3: string reqLvl;
    4: string description;
}

struct Characteristic {
    1: i32 power;
    2: i32 charisma;
    3: i32 intelligence;
    4: i32 stealth;
    5: i32 discipline;
}


enum CharacterType {
    CHARACTER_TYPE_1,
    CHARACTER_TYPE_2,
    CHARACTER_TYPE_3,
    CHARACTER_TYPE_4,
    CHARACTER_TYPE_5
}

enum Specialization {
    SPECIALIZATION_1,
    SPECIALIZATION_2,
    SPECIALIZATION_3,
    SPECIALIZATION_4,
    SPECIALIZATION_5
}

