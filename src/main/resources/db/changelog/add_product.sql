-- liquibase formatted sql

-- changeset Muzaffar-Ashurov:create-product-table
-- preconditions onFail:MARK_RAN
-- precondition-sql-check expectedResult:0 select count(*) from information_schema.TABLES WHERE TABLE_SCHEMA = 'applemarket' AND TABLE_NAME='product';
CREATE TABLE `applemarket`.`product` (
 `id` BIGINT AUTO_INCREMENT NOT NULL,
 `title` VARCHAR(255) NOT NULL,
 `price` DECIMAL NOT NULL,
 `category_id` BIGINT NOT NULL,
 `image_url` VARCHAR(255) NOT NULL,
 PRIMARY KEY (`id`));