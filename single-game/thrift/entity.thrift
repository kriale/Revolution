namespace java com.rev.thriftentity

service BotService {
    Bot create(1: BotType type)

    bool deleteBot(1: i64 id)

    bool changeDrawState(1: i64 id, 2: DrawState currentState);
}

service PlayerService {
    Player create(1: string name)

    bool deletePlayer(1: i64 id)

    bool setCharacter(1: i64 id, 2: Character character);

    bool changeCharacter(1: i64 id, 2: Character character);
}

service CharacterService {
    Character create(1: string type, 2: string name)

    bool deleteCharacter(1: i64 id)

    bool changeDrawState(1: i64 id, 2: DrawState currentState);
}

struct Bot {
    1: i64 id;
    2: BotType type;
    3: i32 health;
    4: i32 attack;
    5: string name;
}

struct Player {
    1: i64 id;
    2: string name;
    3: Character character;
    4: i32 level;
}

struct Character {
    1: i64 id;
    2: CharacterType type;
    3: string name;
    4: Characteristic characteristic;
    5: Specialization specialization;
}

struct Characteristic {
    1: i32 power;
    2: i32 charisma;
    3: i32 intelligence;
    4: i32 stealth;
    5: i32 discipline;
}

struct DrawState {
    1: bool spriteDraw;
    2: bool spriteUpdate;
    3: bool spriteVisible;
}

enum BotType {
    BOT_TYPE_1,
    BOT_TYPE_2,
    BOT_TYPE_3,
    BOT_TYPE_4,
    BOT_TYPE_5
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