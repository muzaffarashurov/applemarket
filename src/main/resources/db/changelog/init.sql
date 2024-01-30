-- liquibase formatted sql

-- changeset Muzaffar-Ashurov:create-category-table
-- preconditions onFail:MARK_RAN
-- precondition-sql-check expectedResult:0 select count(*) from information_schema.TABLES WHERE TABLE_SCHEMA = 'applemarket' AND TABLE_NAME='category';
CREATE TABLE `applemarket`.`category` (
    `id` BIGINT NOT NULL AUTO_INCREMENT,
    `name` VARCHAR (255) NOT NULL,
     PRIMARY KEY (id));