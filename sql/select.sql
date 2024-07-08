-- 查询用户的打卡记录
SELECT u.Username, s.ShopName, c.CheckInTime, c.FootprintDescription
FROM CheckIn c
         JOIN User u ON c.UserID = u.UserID
         JOIN Shop s ON c.ShopID = s.ShopID
WHERE u.UserID = 1;

-- 查询用户收藏的店铺
SELECT u.Username, s.ShopName, f.FavoriteTime
FROM Favorite f
         JOIN User u ON f.UserID = u.UserID
         JOIN Shop s ON f.ShopID = s.ShopID
WHERE u.UserID = 1;

-- 查询用户的浏览记录
SELECT u.Username, s.ShopName, b.BrowsingTime
FROM BrowsingHistory b
         JOIN User u ON b.UserID = u.UserID
         JOIN Shop s ON b.ShopID = s.ShopID
WHERE u.UserID = 1;

