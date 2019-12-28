namespace java com.multiplayer.entitiesAndServices

service AuthenteficationService{
    bool login(1: string login, 2: string password)

    void logout()
}

struct Authentefication{
    1: string login;
    2: string password;
    3: string role;
}





