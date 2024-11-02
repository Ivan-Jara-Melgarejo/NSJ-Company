create database nsjcompany;
use nsjcompany;
#Con esto se pueden colocar default en los datos de dateTime
	SET SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';
	SET SQL_MODE='ALLOW_INVALID_DATES';
#COn lo de arriba

create table `NSJCompany`.`tipo_usuario` (
`id` int not null auto_increment,
`nombre` varchar(45) not null,
primary key (`id`));

insert into tipo_usuario (nombre) values ("Administrador"),("Usuario");

create table `NSJCompany`.`personal` (
`id` int not null auto_increment,
`nombreUsuario` varchar(45) not null,
`NAtendedor` int null,
`contraseña` varchar(45) not null,
`nombre` varchar(100) not null,
`correo` varchar(45) not null,
`fecha_ingreso` date null default '0000-00-00',
`ultima_sesion` datetime null default '0000-00-00 00:00:00',
`idTipo_usuario` int not null,
`salario` Decimal(3.9) not null,
primary key (`id`),
index `idTipoUsuario_idx` (`idTipo_usuario` asc),
constraint `idTipoUsuario`
foreign key (`idTipo_usuario`)
references `NSJCompany`.`tipo_usuario` (`id`)
on delete no action
on update no action);

CREATE TABLE `categoria` (
  `idCategoria` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  PRIMARY KEY (`idCategoria`)
);

INSERT INTO `categoria` VALUES 
(1,'Bebidas'),
(2,'Congelados'),
(3,'Helados'),
(4,'Galletas'),
(5,'Limpieza'),
(6,'Alimentos ');
update categoria set nombre='Limpieza' where idCategoria=5;

CREATE TABLE `producto` (
  `idProducto` int(11) NOT NULL AUTO_INCREMENT,
  `codigoI`varchar(14) not null,
  `nombre` varchar(50) NOT NULL,
  `precio` int NOT NULL,
  `idCategoria` int(5) NOT NULL,
  `cantidad` int(11) DEFAULT NULL,
  `stock` int(11) null,
  PRIMARY KEY (`idProducto`));
  ALTER TABLE `nsjcompany`.`producto` 
ADD INDEX `idCategoria_fk_idx` (`idCategoria` ASC) VISIBLE;
;
ALTER TABLE `nsjcompany`.`producto` 
ADD CONSTRAINT `idCategoria_fk`
  FOREIGN KEY (`idCategoria`)
  REFERENCES `nsjcompany`.`categoria` (`idCategoria`)
  ON DELETE CASCADE
  ON UPDATE CASCADE;
  
  CREATE TABLE `cliente` (
  idCliente INT(12) NOT NULL PRIMARY KEY AUTO_INCREMENT,
  nombre VARCHAR(50) NOT NULL,
  apellido VARCHAR(50) NOT NULL,
  rut VARCHAR(15) NOT NULL UNIQUE,
  telefono INT(20) NOT NULL,
  correo VARCHAR(80) NOT NULL,
  direccion VARCHAR(100) NOT NULL
);
CREATE TABLE `proveedores` (
  `idProveedores` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  `direccion` varchar(45) not null,
  `numero` int not null,
  `correo` varchar(45) null,
  PRIMARY KEY (`idProveedores`)
);

CREATE TABLE `union_pp` (
  `idUnion_pp` int(11) NOT NULL AUTO_INCREMENT,
  `idProducto` int(11) NOT NULL,
  `idProveedor` int(11) NOT NULL,
  PRIMARY KEY (`idUnion_pp`),
  KEY `idProducto_fk_idx` (`idProducto`),
  KEY `idProveedor_fk_idx` (`idProveedor`),
  CONSTRAINT `idProducto_fk1` 
  FOREIGN KEY (`idProducto`) 
  REFERENCES `producto` (`idProducto`) 
  ON DELETE CASCADE 
  ON UPDATE CASCADE,
  CONSTRAINT `idProveedor_fk` 
  FOREIGN KEY (`idProveedor`) 
  REFERENCES `proveedores` (`idProveedores`) 
  ON DELETE CASCADE 
  ON UPDATE CASCADE
);

select p.codigoI, p.nombre, p.precio, c.nombre as 'Categoria' ,p.cantidad, p.stock  from producto as p
inner join categoria as c on p.idCategoria = c.idCategoria;

CREATE TABLE `nsjcompany`.`tipo_documento` (
  `idtipo_Documento` INT NOT NULL AUTO_INCREMENT,
  `tipo` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idtipo_Documento`));
  
  insert into tipo_documento (tipo) values ("Boleta"),("Factura"),("Cotizacion");
  
CREATE TABLE `nsjcompany`.`detalle_venta` (
  `iddetalle_Venta` INT NOT NULL AUTO_INCREMENT,
  `id_personal` INT NOT NULL,
  `idTipo_Documento` INT NOT NULL,
  `idProducto` INT NOT NULL,
  `idCliente` INT NOT NULL,
  `fecha` datetime null default '0000-00-00 00:00:00',
  `cantidad` INT NOT NULL,
  `precioUnitario` INT NOT NULL,
  `subtotal` INT NOT NULL,
  `descuento` INT NULL,
  `iva` INT NOT NULL,
  `totalPagar` INT NOT NULL,
  Primary key (`iddetalle_Venta`));
  ALTER TABLE `nsjcompany`.`detalle_venta` 
ADD INDEX `idPersonal_fdk_idx` (`id_personal` ASC) VISIBLE,
ADD INDEX `idTipoDocumento_fdk_idx` (`idTipo_Documento` ASC) VISIBLE,
ADD INDEX `idProducto_fdk_idx` (`idProducto` ASC) VISIBLE,
ADD INDEX `idCliente_fdk_idx` (`idCliente` ASC) VISIBLE;

ALTER TABLE `nsjcompany`.`detalle_venta` 
ADD CONSTRAINT `idPersonal_fdk`
  FOREIGN KEY (`id_personal`)
  REFERENCES `nsjcompany`.`personal` (`id`)
  ON DELETE CASCADE
  ON UPDATE CASCADE,
ADD CONSTRAINT `idTipoDocumento_fdk`
  FOREIGN KEY (`idTipo_Documento`)
  REFERENCES `nsjcompany`.`tipo_documento` (`idtipo_Documento`)
  ON DELETE CASCADE
  ON UPDATE CASCADE,
ADD CONSTRAINT `idProducto_fdk`
  FOREIGN KEY (`idProducto`)
  REFERENCES `nsjcompany`.`producto` (`idProducto`)
  ON DELETE CASCADE
  ON UPDATE CASCADE;
ALTER TABLE `nsjcompany`.`detalle_venta` 
ADD CONSTRAINT `idCliente_fdk`
  FOREIGN KEY (`idCliente`)
  REFERENCES `nsjcompany`.`cliente` (`idCliente`)
  ON DELETE CASCADE
  ON UPDATE CASCADE;

use nsjcompany;
select * from personal;
select * from categoria;
select * from tipo_usuario;
select * from producto;
select * from cliente;
select * from proveedores;
select * from tipo_documento;

