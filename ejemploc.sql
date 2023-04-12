-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 11-04-2023 a las 03:22:47
-- Versión del servidor: 10.4.24-MariaDB
-- Versión de PHP: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `ejemploc`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `persona`
--

CREATE TABLE `persona` (
  `id` int(11) NOT NULL,
  `codigo_secretaria` varchar(255) DEFAULT NULL,
  `expe` varchar(255) DEFAULT NULL,
  `via_id` int(11) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `persona`
--

INSERT INTO `persona` (`id`, `codigo_secretaria`, `expe`, `via_id`, `nombre`) VALUES
(21, '123', '2 años', 6, 'Camilo'),
(24, '123', '1 año', 7, 'juan'),
(25, '123', '1 año', 5, 'sergio'),
(26, '123', '2 años', 6, 'Camilo'),
(27, '123', '2 años', 3, 'Camilo'),
(39, '123', '2 años', 5, 'Camilo'),
(40, '123', '1 año', 8, 'Camilo'),
(41, '123', '1 año', 5, 'juan');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `via`
--

CREATE TABLE `via` (
  `id` int(11) NOT NULL,
  `congestion` varbinary(255) DEFAULT NULL,
  `numero` int(11) NOT NULL,
  `tipo` varchar(255) DEFAULT NULL,
  `tvia` varchar(255) DEFAULT NULL,
  `coc` varchar(255) DEFAULT NULL,
  `persona_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `via`
--

INSERT INTO `via` (`id`, `congestion`, `numero`, `tipo`, `tvia`, `coc`, `persona_id`) VALUES
(3, 0x3935, 200, 'Autopista', 'calle', 'Carrera', NULL),
(5, 0x3430, 72, 'carretera principal', 'carrera', 'Carrera', 21),
(6, 0x3435, 83, 'autopista', 'carrera', 'Calle', NULL),
(7, 0x3730, 123, 'autopista', NULL, 'Carrera', 21),
(8, 0x3830, 129, 'autopista', NULL, 'Carrera', 25),
(10, 0x3130, 100, 'carretera principal', NULL, 'Calle', NULL);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `persona`
--
ALTER TABLE `persona`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKqherdcstfmd9a6hixkd1eytq1` (`via_id`);

--
-- Indices de la tabla `via`
--
ALTER TABLE `via`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK27v8wckjdpquonsoem08fsitg` (`persona_id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `persona`
--
ALTER TABLE `persona`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=45;

--
-- AUTO_INCREMENT de la tabla `via`
--
ALTER TABLE `via`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `persona`
--
ALTER TABLE `persona`
  ADD CONSTRAINT `FKqherdcstfmd9a6hixkd1eytq1` FOREIGN KEY (`via_id`) REFERENCES `via` (`id`);

--
-- Filtros para la tabla `via`
--
ALTER TABLE `via`
  ADD CONSTRAINT `FK27v8wckjdpquonsoem08fsitg` FOREIGN KEY (`persona_id`) REFERENCES `persona` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
