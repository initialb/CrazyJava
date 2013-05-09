
DROP DATABASE IF EXISTS `BOOK_SYSTEM`;

-- ����DATABASE
CREATE DATABASE BOOK_SYSTEM;
-- ʹ��BOOK_SYSTEM
USE BOOK_SYSTEM;

-- �û���
CREATE TABLE IF NOT EXISTS `T_USER` (
    `ID` int AUTO_INCREMENT NOT NULL,
    `USER_NAME` varchar(20),
    `USER_PASSWORD` varchar(20),
    PRIMARY KEY (`ID`)
);

INSERT INTO `T_USER` VALUES ('1', 'crazyit', 'crazyit');

-- ������
CREATE TABLE IF NOT EXISTS `T_BOOK_TYPE` (
    `ID` int AUTO_INCREMENT NOT NULL, -- �������ɲ���Ϊ�Զ�����
    `TYPE_NAME` varchar(50), -- ��������
    `TYPE_INTRO` varchar(200), -- ������
    PRIMARY KEY (`ID`)
);

-- ������
CREATE TABLE IF NOT EXISTS `T_PUBLISHER` (
    `ID` int AUTO_INCREMENT NOT NULL, -- �������ɲ���Ϊ�Զ�����
    `PUB_NAME` varchar(50), -- ����������
    `PUB_TEL` varchar(50), -- ��ϵ�绰
    `PUB_LINK_MAN` varchar(50), -- ��ϵ��
    `PUB_INTRO` varchar(200), -- ���
    PRIMARY KEY (`ID`) -- ��������
);

-- ��
CREATE TABLE IF NOT EXISTS `T_BOOK` (
    `ID` int AUTO_INCREMENT NOT NULL, -- ID�ֶΣ�����
    `BOOK_NAME` varchar(50), -- ������
    `BOOK_INTRO` varchar(200), -- ����
	`BOOK_PRICE` double, -- ��ĵ���
    `TYPE_ID_FK` int NOT NULL, -- �������
    `PUB_ID_FK` int NOT NULL, -- ���������
	`IMAGE_URL` varchar(200), -- ����ͼURL
	`AUTHOR` varchar(200), -- ����
    `REPERTORY_SIZE` bigint(10), -- �������
    FOREIGN KEY (`TYPE_ID_FK`) REFERENCES `T_BOOK_TYPE` (`ID`), -- ������������
    FOREIGN KEY (`PUB_ID_FK`) REFERENCES `T_PUBLISHER` (`ID`), -- �������������
    PRIMARY KEY (`ID`)
);

-- ���׼�¼��, һ�����׼�¼�������������ۼ�¼, һ�ν��׿����ж౾��
CREATE TABLE IF NOT EXISTS `T_SALE_RECORD` (
    `ID` int AUTO_INCREMENT NOT NULL,
    `RECORD_DATE` datetime,-- ��������
    PRIMARY KEY (`ID`)
);

-- ������ۼ�¼, һ����¼��Ӧһ����
CREATE TABLE IF NOT EXISTS `T_BOOK_SALE_RECORD` (
    `ID` int AUTO_INCREMENT NOT NULL,
    `BOOK_ID_FK` int, -- ���۵���
    `T_SALE_RECORD_ID_FK` int, -- ��������ۼ�¼����Ӧ�Ľ��׼�¼
    `TRADE_SUM` int(10), -- ��������
    FOREIGN KEY (`BOOK_ID_FK`) REFERENCES `T_BOOK` (`ID`),
    FOREIGN KEY (`T_SALE_RECORD_ID_FK`) REFERENCES `T_SALE_RECORD` (`ID`),
    PRIMARY KEY (`ID`)
);

-- ����¼��, һ��������౾��
CREATE TABLE IF NOT EXISTS `T_IN_RECORD` (
    `ID` int AUTO_INCREMENT NOT NULL,
    `RECORD_DATE` datetime, -- �������
    PRIMARY KEY (`ID`)
);

-- �������¼
CREATE TABLE IF NOT EXISTS `T_BOOK_IN_RECORD` (
    `ID` int AUTO_INCREMENT NOT NULL, -- ID����
    `BOOK_ID_FK` int, -- ������
    `T_IN_RECORD_ID_FK` int, -- ��Ӧ������¼
    `IN_SUM` int(10), -- �������
    FOREIGN KEY (`BOOK_ID_FK`) REFERENCES `T_BOOK` (`ID`), -- ����������
    FOREIGN KEY (`T_IN_RECORD_ID_FK`) REFERENCES `T_IN_RECORD` (`ID`), -- ��������¼���
    PRIMARY KEY (`ID`)
);