namespace java thrift.java

struct Location {
    1: required double latitude;
    2: required double longitude;
}

struct User {
        1: required i64 id;
        2: required string username;
        3: required string firstname;
        4: required string lastname;
        5: required string email;
        6: optional i32 userStatus;
        7: optional Location loc;
}

struct ShopItem {
        1: required i64 id;
        1: required string name;
        2: required string description;
        3: required i64 price;
        4: required string type;
        5: optional string stock;
}

struct CreditCard {
        1: required i64 number;
        2: required string name;
        3: required i64 month;
        4: required i64 year;
        5: required i64 cvc;
}

typedef list<ShopItem> ItemList

strutct ItemSearchResult {
    1: ItemList item;
}

exception UserAlreadyExists {
    1: string message;
}

exception InvalidUserDataSupplied {
    1: string message;
}

exception AddExistingItem {
    1: string message;
}


exception InvalidCardDataSupplied {
    1: string message;
}
// Сервис покупок
service PayService {
    void ping(),

    bool buyItem(
            1: string name,
            2: CreditCard card,
    ) throws (1: InvalidCardDataSupplied message),

    oneway void zip()
}

// Сервис пользователей
service UserService {
    void ping(),

    bool createUser(
            1: string username,
            2: string firstname,
            3: string lastname,
            4: string email,
    ) throws (1: UserAlreadyExists message),

    bool loginUser(
            1: string username,
            2: string email,
    ) throws (1: InvalidUserDataSupplied message),

    void logoutUser(1: i64 id),

    User getUser(1: string username),

    bool updateUser(
        1: string username,
        2: string type,
        3: string updateValue
        ) throws (1: InvalidUserDataSupplied message),

    bool deleteUser(1: string username, 2: string email) throws (1: InvalidUserDataSupplied message),

    oneway void zip()
}

// Сервис магазина
service ShopService {
    void ping(),

    bool addNewItemToTheShop (1: ShopItem item) throws (1: AddExistingItem),

    ItemSearchResult findListOfItemsByType(1: string type),

    ShopItem findItem(1: string itemname),

    bool deleteItem(1: string itemname)

    oneway void zip()
}






service SearchItemService{
        list<string> searchitem(1:string name),
}
