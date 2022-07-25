-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 25-07-2022 a las 10:03:46
-- Versión del servidor: 10.4.21-MariaDB
-- Versión de PHP: 7.4.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `spacecrafts_app`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `spacecrafts`
--

CREATE TABLE `spacecrafts` (
  `id_spacecraft` int(7) NOT NULL,
  `name` varchar(280) NOT NULL,
  `type` varchar(280) NOT NULL,
  `thrust` decimal(10,2) NOT NULL,
  `weight` decimal(10,2) NOT NULL,
  `application` varchar(280) NOT NULL,
  `country` varchar(50) NOT NULL,
  `date` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `spacecrafts`
--

INSERT INTO `spacecrafts` (`id_spacecraft`, `name`, `type`, `thrust`, `weight`, `application`, `country`, `date`) VALUES
(1, 'Saturn V', 'launch vehicle', '3500.00', '2900.00', 'launch a payload', 'USA', '1967-1973'),
(2, 'Energy', 'launch vehicle', '3060.00', '2400.00', 'study celestial object', 'Russia', '1987-1988'),
(3, 'Ariane V', 'launch vehicle', '5.70', '6.90', 'carry repairman', 'Europe', '1996-Act.'),
(4, 'H IIA', 'launch vehicle', '2.20', '285.00', 'study celestial object', 'Japan', '2001-Act.'),
(5, 'Long March 3B', 'launch vehicle', '1.00', '0.20', 'launch a payload', 'China', '1996-Act.'),
(6, 'Messenger', 'uncrewed spacecraft', '0.07', '1.09', 'study celestial object', 'USA', '2004-Act.'),
(7, 'Sputnik', 'uncrewed spacecraft', '3.00', '0.08', 'study celestial object', 'Russia', '1957-1958'),
(8, 'ATV', 'uncrewed spacecraft', '0.02', '20.00', 'study celestial object', 'Europe', '2008-Act.'),
(9, 'Skylab', 'crewed spacecraft', '1.00', '77.00', 'carry repairman', 'USA', '1973-1979'),
(10, 'Salyut', 'crewed spacecraft', '0.40', '19.80', 'study celestial object', 'Russia', '1998-Act'),
(11, 'Shenzou', 'crewed spacecraft', '0.01', '7.84', 'carry repairman', 'China', '1999-Act.');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `spacecrafts`
--
ALTER TABLE `spacecrafts`
  ADD PRIMARY KEY (`id_spacecraft`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `spacecrafts`
--
ALTER TABLE `spacecrafts`
  MODIFY `id_spacecraft` int(7) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
