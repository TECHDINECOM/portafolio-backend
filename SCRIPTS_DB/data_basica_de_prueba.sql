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
(1,'ADMINISTRADOR','Este es el rol definido para los administradores','ROLE_ADMIN'),
(2,'USUARIO','Este es el rol definido para los Usuarios comunes','ROLE_USER'),
(3,'ALUMNO','Este es el rol definido para los Usuarios que son Estudiantes','ROLE_ALUMNO'),
(4,'PROFESOR','Este es el rol definido para los Usuarios que son Profesores','ROLE_PROFESOR');

/*Data for the table `roles_usuario` */

insert  into `tbl_roles_usuario`(`id_usuario`,`id_rol`) values 
(1,1),
(2,2),
(3,1),
(4,3),
(5,1),
(6,3),
(7,4),
(8,3),
(9,2),
(10,2),
(11,2),
(12,4);

/*Data for the table `usuario` */

insert  into `tbl_usuario`(`id`,`dni`,`nombres`,`apellidos`,`telefono`,`email`,`sobremi`,`username`,`password`,`estatus`) values 
(1,95923306,'Ulises José','Hernández Gonzalez','11-21634002','techdinecom@gmail.com','Esto es una prueba','techdinecom','$2a$12$tf2rnFtHTXrdwkhOGDtJdutAy/M66vaBd1Wrl4z0IVuSjnC1T8abu',1),
(2,95937627,'Belkis Josefina','Garcia de Hernández','11-55875124','belkisg17@gmail.com','Esto es una prueba','belkis','$2a$12$vWjZJr1vyqobqEOYEQHiNOOgpuGUEDFnE59.CJb.5VTF.aAoNWYhq',1),
(3,17642111,'Maria','Del Barrio','1121634002','maria2020@gmail.com','Prueba de perfil texto nuevo para ver que tal','Maria2020','$2a$12$Kw3VjjWi1OJx01ieUXCfVOAlpDC4v3oyEaMIcps3KthYV8kYH5f6u',0),
(4,57236985,'Beljamín Abdiel','Hernández Gonzalez','1121634002','benjamin.2020@gmail.com','Probando para editar datos de un usuario. Ya está funcionando correctamente la edición de usuarios.','Benja-2020','$2a$12$4dJJal/kVnKSeX9C6p6tneGHPPg6GFihFtVW3YbfcL2D3MVjv5RVu',1),
(5,17719654,'Josefina','Garcia','1155556666','josefina.garcia@gmail.com','Prueba de carga de datos con Josefina','Josefina2020','$2a$12$nSAPD2c7iD6.BXcYwSSeLegibbVLpuJiXp.Y0XM4HkkWmp6SzU0VK',1),
(6,213213123,'Amanda','Pietri','1125289696','amanda.232@gmail.com','Prueba de Amanda hoy 2020','Amanda2020','$2a$12$n0DJsnwkVWiTQiS8bj7YMulldDUfeyZnpliJKKIfqKXp1RQJ1iCwe',0),
(7,13131332,'Paco','Morales','1123654789','venga.paco@gmail.com','Prueba con Paco Morales tipo profesor. Que bien ya se editó.','Paco2020','$2a$12$9kN7.TYj2LnXbZ0I4tzRIerIauZHki7QOzyFwjDfiwwd9kOa0CIUG',1),
(8,96325874,'Petra','Petronila','1145632589','petra.petronila@outlook.com','Acabo de cambiar el viejo formulario por una tarjeta y estoy probandolo.','Petranila','$2a$12$K.pqocgAU.1Z6NwCx3qGz.27uN92p8iXyhY/Kr25c1z6sDy0gRFxa',0),
(9,95965874,'Pablo Agustin','Morales Parra','1125455853','pablito.clavo@gmail.com','Mensaje para Pablo Morales','Pablo-2020','$2a$12$EuKqYez4pSQD6AEvl3k1mOFdPaHjd/jG7fe0knhvD36ejYjRB8Pre',1),
(10,7458523,'Maria Macarena','Dolores de Cabeza','1124527412','maria.dolores@gmail.com','Maria me da dolores de cabeza','Maria-2020','$2a$12$m31Yt8JwklU0gWKU/btM7.JvBDoaUWT1vqXedDyvcHdNxrB8EIo2e',1),
(11,85754333,'Daniel','Mora','1125289696','dani.mora@gmail.com','zxcxzc sa asdajsdsañjáñsfasas   sañjasdjaskdj','Danielm','$2a$12$sIMRRnFsZ5X8KI6iUTr1melsObD5V81FBhviScAHk2y6PWKm/GgN.',0),
(12,95999999,'Pablo','Real','1142255221','obispo.tramposo@gmail.com','das dasjdjasldjaskdjask ñdjskadj asklñdjñsakdjasdñklsajd','Pabloreal','$2a$12$bycLGn9XzMcyB8/BolC/lemSqmhQHSoLo81CqF5/zk3dKjonl8ji6',1);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
