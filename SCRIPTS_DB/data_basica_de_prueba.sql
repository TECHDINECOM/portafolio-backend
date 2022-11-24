/*
SQLyog Community v13.1.9 (64 bit)
MySQL - 8.0.31 : Database - apyoprogramo
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

/*Data for the table `roles` */

insert  into `tbl_roles`(`id`,`txtvisible`,`descripcion`,`rol`) values 
(1,'PROGRAMADOR','Este es el rol definido para los Usuarios que son desarrolladores y tienen los privilegios mas elevados dentro de la app','ROLE_DEVELOPER'),
(2,'ADMINISTRADOR','Este es el rol definido para los usuarios administradores','ROLE_ADMIN'),
(3,'USUARIO','Este es el rol definido para los Usuarios comunes','ROLE_USER');

/*Data for the table `roles_usuario` */

insert  into `tbl_roles_usuario`(`id_usuario`,`id_rol`) values 
(1,1);

/*Data for the table `usuario` */

insert  into `tbl_usuario`(`id`,`dni`,`nombres`,`apellidos`,`telefono`,`email`,`sobremi`,`username`,`password`,`estatus`) values 
(1,95923306,'Ulises José','Hernández Gonzalez','11-21634002','techdinecom@gmail.com','Esto es una prueba','developersys','$2a$12$tf2rnFtHTXrdwkhOGDtJdutAy/M66vaBd1Wrl4z0IVuSjnC1T8abu',1);


/*Ordenarla tabla*/
ALTER TABLE `apyoprogramo`.`tbl_usuario` CHANGE `dni` `dni` BIGINT NOT NULL AFTER `id`, CHANGE `nombres` `nombres` VARCHAR(80) CHARSET utf8mb3 COLLATE utf8mb3_spanish2_ci NOT NULL AFTER `dni`, CHANGE `telefono` `telefono` VARCHAR(11) CHARSET utf8mb3 COLLATE utf8mb3_spanish2_ci NOT NULL AFTER `email`, CHANGE `sobremi` `sobremi` VARCHAR(160) CHARSET utf8mb3 COLLATE utf8mb3_spanish2_ci NULL AFTER `telefono`, CHANGE `username` `username` VARCHAR(16) CHARSET utf8mb3 COLLATE utf8mb3_spanish2_ci NOT NULL AFTER `sobremi`, CHANGE `estatus` `estatus` TINYINT(1) DEFAULT 1 NOT NULL AFTER `password`;


/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
