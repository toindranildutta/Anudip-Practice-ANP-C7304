CREATE DATABASE anpc7304;
USE anpc7304;

CREATE TABLE Client_Master
(
ClientNo VARCHAR(6) PRIMARY KEY,
Name VARCHAR(20) NOT NULL,
Address1 VARCHAR(30) NOT NULL,
Address2 VARCHAR(30) NOT NULL,
City VARCHAR(15) NOT NULL,
Pincode int(8) NOT NULL,
State VARCHAR(15) NOT NULL,
BalDue int(20) NOT NULL
);

INSERT INTO Client_Master
(ClientNo, Name, Address1, Address2, City, Pincode, State, BalDue)
VALUES
(11, "Indranil", "Kalitala", "Rathtala", "Bankura", 722102, "WB", 8000),
(12, "Sanjay", "Natun", "chati", "Bankura", 722101, "WB", 12000),
(14, "Sneha", "Lal", "Bazar", "Bankura", 722100, "WB", 18000),
(16, "Sapta", "Kendua", "Dihi", "Bankura", 722102, "WB", 10000),
(18, "Mona", "Makur", "Gram", "Bankura", 722105, "WB", 16000);

SELECT Name from Client_Master;

+----------+
| Name     |
+----------+
| Indranil |
| Sanjay   |
| Sneha    |
| Sapta    |
| Mona     |
+----------+

SELECT * from Client_Master;

+----------+----------+----------+----------+---------+---------+-------+--------+
| ClientNo | Name     | Address1 | Address2 | City    | Pincode | State | BalDue |
+----------+----------+----------+----------+---------+---------+-------+--------+
| 11       | Indranil | Kalitala | Rathtala | Bankura |  722102 | WB    |   8000 |
| 12       | Sanjay   | Natun    | chati    | Bankura |  722101 | WB    |  12000 |
| 14       | Sneha    | Lal      | Bazar    | Bankura |  722100 | WB    |  18000 |
| 16       | Sapta    | Kendua   | Dihi     | Bankura |  722102 | WB    |  10000 |
| 18       | Mona     | Makur    | Gram     | Bankura |  722105 | WB    |  16000 |
+----------+----------+----------+----------+---------+---------+-------+--------+

SELECT Name, City, State from Client_Master;

+----------+---------+-------+
| Name     | City    | State |
+----------+---------+-------+
| Indranil | Bankura | WB    |
| Sanjay   | Bankura | WB    |
| Sneha    | Bankura | WB    |
| Sapta    | Bankura | WB    |
| Mona     | Bankura | WB    |
+----------+---------+-------+

DROP TABLE Client_Master;

