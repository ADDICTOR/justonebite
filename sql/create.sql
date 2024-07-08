CREATE TABLE User
(
    UserID      INT AUTO_INCREMENT PRIMARY KEY,
    Username    VARCHAR(50) NOT NULL,
    PhoneNumber VARCHAR(20),
    WeChatID    VARCHAR(50) NOT NULL
);

CREATE TABLE Shop
(
    ShopID      INT AUTO_INCREMENT PRIMARY KEY,
    ShopName    VARCHAR(100) NOT NULL,
    PhoneNumber VARCHAR(20),
    OwnerWeChat VARCHAR(50),
    Address     VARCHAR(255),
    Latitude    DOUBLE,
    Longitude   DOUBLE
);

CREATE TABLE CheckIn
(
    CheckInID            INT AUTO_INCREMENT PRIMARY KEY,
    UserID               INT,
    ShopID               INT,
    CheckInTime          DATETIME NOT NULL,
    FootprintDescription TEXT,
    FOREIGN KEY (UserID) REFERENCES User (UserID),
    FOREIGN KEY (ShopID) REFERENCES Shop (ShopID)
);

CREATE TABLE Favorite
(
    FavoriteID   INT AUTO_INCREMENT PRIMARY KEY,
    UserID       INT,
    ShopID       INT,
    FavoriteTime DATETIME NOT NULL,
    FOREIGN KEY (UserID) REFERENCES User (UserID),
    FOREIGN KEY (ShopID) REFERENCES Shop (ShopID)
);

CREATE TABLE BrowsingHistory
(
    BrowsingID   INT AUTO_INCREMENT PRIMARY KEY,
    UserID       INT,
    ShopID       INT,
    BrowsingTime DATETIME NOT NULL,
    FOREIGN KEY (UserID) REFERENCES User (UserID),
    FOREIGN KEY (ShopID) REFERENCES Shop (ShopID)
);

CREATE TABLE UserFoodInfo
(
    UserID                 INT PRIMARY KEY,
    VisitedShopCount       INT,
    FavoriteCheckInTime    VARCHAR(50),
    FavoriteFoodStyle      VARCHAR(100),
    FoodSearchingFrequency VARCHAR(50),
    FOREIGN KEY (UserID) REFERENCES User (UserID)
);
