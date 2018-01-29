-- phpMyAdmin SQL Dump
-- version 4.7.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 20-10-2017 a las 18:47:32
-- Versión del servidor: 10.1.25-MariaDB
-- Versión de PHP: 7.1.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `mydb`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE IF NOT EXISTS `usuarios` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `usuario` varchar(45) NOT NULL,
  `pass` varchar(45)  NOT NULL,
  `rol_id` int(11) NOT NULL,
  `instructor_id` int(11) NOT NULL,
  `activo` int(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id`)

) ENGINE=InnoDB DEFAULT CHARSET=utf8;
 
INSERT INTO `usuarios` (`id`,`usuario`,`pass`,`rol_id`,`instructor_id`,`activo`) VALUES
('1','admin','admin','1','1','1');

--
-- Estructura de tabla para la tabla `roles`
--

CREATE TABLE IF NOT EXISTS `roles` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `rol` varchar(45),
   PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `roles` (`id`,`rol`) VALUES
('1','admin'),
('2','instructor'),
('3','finanzas'), 
('4','ambos');

--
-- Estructura de tabla para la tabla `instructor`
--

CREATE TABLE IF NOT EXISTS `instructores` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  `a_paterno` varchar(45) NOT NULL,
  `a_materno` varchar(45),
  `fecha_nacimiento` date,
  `direccion` varchar(200) NOT NULL,
  `celular` varchar (10) NOT NULL,
  `escuela_id` int(11) NOT NULL,
  `activo` int(1) NOT NULL DEFAULT '1', 
   PRIMARY KEY (`id`)

) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Estructura de tabla para la tabla `alumnos`
--

CREATE TABLE IF NOT EXISTS `alumnos` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  `a_paterno` varchar(45) NOT NULL,
  `a_materno` varchar(45),
  `fecha_nacimiento` date,
  `peso` float(5,2) NOT NULL,
  `t_sangre` varchar(4) NOT NULL,
  `altura` float(4,2) NOT NULL,
  `direccion` varchar(200) NOT NULL,
  `cinta` varchar(15) NOT NULL,
  `nombre_tutor` varchar(75) NOT NULL,
  `parentesco` varchar(20) NOT NULL,
  `tutor_celular` varchar(14), 
  `alrgias` varchar(50) ,
  `enfermedades` varchar(50),
  `deportes` varchar(50),
  `instructor_id` int(11) NOT NULL,
  `escuela_id` int(11) NOT NULL,
  `activo` int(1) NOT NULL DEFAULT '1', 
   PRIMARY KEY (`id`)

) ENGINE=InnoDB DEFAULT CHARSET=utf8;


--
-- Estructura de tabla para la tabla `escuelas`
--

CREATE TABLE IF NOT EXISTS `escuelas` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  `direccion` varchar(100)  NOT NULL,
  `activo` int(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id`)

) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `escuelas` (`id`,`nombre`,`direccion`) VALUES
('1','Escuela Central','Panteon de oriente 289 Colonia del maestro'),
('2','Escuela Oriente','Gamboa 20 Colonia Octavio Paz'),
('3','Escuela Villareal','Villareal 12 Fraccionameinto Gamlizo');

--
-- Estructura de tabla para la tabla `huellas_alumnos`
--

CREATE TABLE IF NOT EXISTS `huellas_alumnos` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `huella` BLOB NOT NULL,
  `alumno_id` int(11)  NOT NULL,
  `activo` int(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id`)

) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Estructura de tabla para la tabla `huellas_instructores`
--

CREATE TABLE IF NOT EXISTS `huellas_instructores` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `huella` BLOB NOT NULL,
  `instructor_id` int(11)  NOT NULL,
  `activo` int(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id`)

) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Estructura de tabla para la tabla `asistencias_alumnos`
--

CREATE TABLE IF NOT EXISTS `asistencias_alumnos` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `alumno_id` int(11)  NOT NULL,
  `fecha` date NOT NULL,
  `instructor_id` int (11) NOT NULL,
  `activo` int(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id`)

) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Estructura de tabla para la tabla `asistencias_instructores`
--

CREATE TABLE IF NOT EXISTS `asistencias_instructores` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `instructor_id` int(11)  NOT NULL,
  `fecha` date NOT NULL,
  `activo` int(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id`)

) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Estructura de tabla para la tabla `Tickets`
--

CREATE TABLE IF NOT EXISTS `tickets` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `alumno_id` int(11)  NOT NULL,
  `fecha` date NOT NULL,
  `monto_total` float (11,2) NOT NULL,
  `monto_pendiente` float (11,2) NOT NULL,
  `activo` int(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id`)

) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Estructura de tabla para la tabla `Ticket_detalles`
--

CREATE TABLE IF NOT EXISTS `ticket_detalles` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `ticket_id` int(11)  NOT NULL,
  `nombre_producto` varchar(30)  NOT NULL,
  `cantidad` int (3) NOT NULL,
  `precio` float (11,2) NOT NULL,
  `activo` int(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id`)

) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Estructura de tabla para la tabla `salarios`
--

CREATE TABLE IF NOT EXISTS `salarios` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `instructor_id` int(11)  NOT NULL,
  `fecha_pago` date NOT NULL,
  `pago` float (11,2) NOT NULL,
  `activo` int(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id`)

) ENGINE=InnoDB DEFAULT CHARSET=utf8;


--
-- Estructura de tabla para la tabla `mensaulidades`
--

CREATE TABLE IF NOT EXISTS `mensualidades` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `alumno_id` int(11)  NOT NULL,
  `escuela_id` int(11)  NOT NULL,
  `fecha_pago` date NOT NULL,
  `ultimo_pago` date NOT NULL,
  `activo` int(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id`)

) ENGINE=InnoDB DEFAULT CHARSET=utf8;




COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
