CREATE DATABASE  IF NOT EXISTS `prueba`;
USE `prueba`;

CREATE TABLE `cliente` (
  `id` int(11) NOT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

INSERT INTO `cliente` VALUES (1,'JUAN PEREZ'),(2,'JOSE TORRES'),(3,'PABLO CABEZAS');

CREATE TABLE `sucursal` (
  `id` int(11) NOT NULL,
  `direccion` varchar(100) DEFAULT NULL,
  `id_cliente` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_sucursal_cliente_idx` (`id_cliente`),
  CONSTRAINT `fk_sucursal_cliente` FOREIGN KEY (`id_cliente`) REFERENCES `cliente` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

INSERT INTO `sucursal` VALUES (1,'LOS FRESCOS 356, ARICA',1),(2,'PRIETO NORTE 455, CONCEPCION',2),(3,'LAUTARO 766, CONCEPCION',2),(4,'LAS ROSAS 122, VALDIVIA',3);
