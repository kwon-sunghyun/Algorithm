SELECT WAREHOUSE_ID, WAREHOUSE_NAME, ADDRESS, ifnull(freezer_yn, "N") as FREEZER_YN
    FROM FOOD_WAREHOUSE 
        WHERE ADDRESS like ('경기도%')
            ORDER BY WAREHOUSE_ID;