CREATE DATABASE IF NOT EXISTS DataTypes;
USE DataTypes;

DROP TABLE IF EXISTS ENTITY;
CREATE TABLE ENTITY (
    # Standard SQL numeric data types.
    # Exact numeric data types (INT -> INTEGER, DEC/FIXED -> DECIMAL)
                        aBool  BOOLEAN,   # BOOL, BIT(1)
                        aByte  TINYINT,   # BIT(1) to BIT(8)
                        aShort SMALLINT,  # BIT(1) to BIT(16), YEAR
                        aInt   INT,
                        aLong  BIGINT,
    #=============
                        aFloat  FLOAT(10,2),  # FLOAT
                        aDouble DOUBLE(10,2), # DOUBLE
    #=============
                        aBigDecimal DECIMAL(10,2), # NUMERIC(10,2)
                        aBigInteger DECIMAL(5),    # NUMERIC(5)
    #=============
                        aString1 VARCHAR(255), # TINYTEXT, TEXT(size), MEDIUMTEXT, LONGTEXT
    #=============
                        binaryData  MEDIUMBLOB # TINYBLOB, MEDIUMBLOB (16MB), LONGBLOB (4,3GB)
);

INSERT INTO ENTITY (aBool, aByte, aShort, aInt, aLong, aFloat, aDouble,
                    aBigDecimal, aBigInteger, aString1, binaryData)
VALUES (1, 127, 32767, 5646131, 6541321, 23.5, 5546.87, 65461153.454, 16125, 'Hallo', null);



SELECT * FROM ENTITY;