# movies
get all movies details and put the movies details in the database by using spring boot REST API
-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 14, 2023 at 04:42 PM
-- Server version: 10.4.25-MariaDB
-- PHP Version: 7.4.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `film`
--

-- --------------------------------------------------------

--
-- Table structure for table `movies`
--

CREATE TABLE `movies` (
  `tconst` varchar(255) NOT NULL,
  `genres` varchar(255) DEFAULT NULL,
  `primary_title` varchar(255) DEFAULT NULL,
  `runtime_minutes` int(11) NOT NULL,
  `title_type` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `movies`
--

INSERT INTO `movies` (`tconst`, `genres`, `primary_title`, `runtime_minutes`, `title_type`) VALUES
('tconst', 'titleType', 'primaryTitle', 0, 'genres'),
('tt0000001', 'short', 'Carmencita', 1, 'Documentary'),
('tt0000002', 'movie', 'Le clown et ses chiens', 5, 'Animation'),
('tt0000003', 'short', 'Pauvre Pierrot', 4, 'Animation'),
('tt0000004', 'short', 'Un bon bock', 12, 'Animation'),
('tt0000005', 'movie', 'Blacksmith Scene', 1, 'Comedy'),
('tt0000006', 'short', 'Chinese Opium Den', 1, 'Short'),
('tt0000007', 'short', 'Corbett and Courtney Before the Kinetograph', 1, 'Sport'),
('tt0000008', 'movie', 'Edison Kinetoscopic Record of a Sneeze', 1, 'Documentary'),
('tt0000009', 'movie', 'Miss Jerry', 45, 'Romance'),
('tt0000010', 'short', 'Leaving the Factory', 1, 'Action'),
('tt0000011', 'movie', 'Akrobatisches Potpourri', 1, 'Documentary'),
('tt0000012', 'movie', 'The Arrival of a Train', 1, 'Action'),
('tt0000013', 'movie', 'The Photographical Congress Arrives in Lyon', 1, 'Documentary'),
('tt0000014', 'short', 'The Waterer Watered', 1, 'Comedy'),
('tt0000015', 'movie', 'Autour dune cabine', 2, 'Animation'),
('tt0000016', 'short', 'Boat Leaving the Port', 1, 'Action'),
('tt0000017', 'movie', 'Italienischer Bauerntanz', 1, 'Action'),
('tt0000018', 'short', 'Das boxende Känguruh', 1, 'Short'),
('tt0000019', 'short', 'The Clown Barber', 12, 'Comedy'),
('tt0000020', 'short', 'The Derby 1895', 1, 'Documentary'),
('tt0000022', 'short', 'Blacksmith Scene', 1, 'Documentary'),
('tt0000023', 'movie', 'The Sea', 1, 'Documentary'),
('tt0000024', 'short', 'Opening of the Kiel Canal', 34, 'News'),
('tt0000025', 'short', 'The Oxford and Cambridge University Boat Race', 415, 'News'),
('tt0000026', 'short', 'The Messers. Lumière at Cards', 1, 'Documentary'),
('tt0000027', 'short', 'Cordeliers Square in Lyon', 1, 'Action'),
('tt0000028', 'short', 'Fishing for Goldfish', 1, 'Action'),
('tt0000029', 'movie', 'Babys Meal', 1, 'Documentary'),
('tt0000030', 'short', 'Rough Sea at Dover', 1, 'Documentary'),
('tt0000031', 'short', 'Jumping the Blanket', 1, 'Documentary'),
('tt0000032', 'movie', 'Die Serpentintänzerin', 1, 'Short'),
('tt0000033', 'short', 'Horse Trick Riders', 1, 'Documentary'),
('tt0000034', 'short', 'Arrivée dun train gare de Vincennes', 1, 'Documentary'),
('tt0000035', 'short', 'Watering the Flowers', 1, 'Comedy'),
('tt0000036', 'movie', 'Awakening of Rip', 0, 'Drama'),
('tt0000037', 'short', 'Sea Bathing', 1, 'Short'),
('tt0000038', 'movie', 'The Ball Game', 66, 'Documentary'),
('tt0000039', 'movie', 'Barnet Horse Fair', 415, 'Short'),
('tt0000040', 'short', 'Barque sortant du port de Trouville', 78, 'Documentary'),
('tt0000041', 'movie', 'Bataille de neige', 66, 'Comedy'),
('tt0000042', 'short', 'Bateau-mouche sur la Seine', 102, 'Documentary'),
('tt0000043', 'short', 'Batteuse à vapeur', 85, 'Documentary'),
('tt0000044', 'short', 'Le bivouac', 1, 'Short'),
('tt0000045', 'movie', 'Les blanchisseuses', 458, 'Short'),
('tt0000046', 'short', 'Bois de Boulogne', 120, 'Comedy'),
('tt0000047', 'movie', 'Boulevard des Italiens', 444, 'Documentary'),
('tt0000048', 'short', 'The Boxing Kangaroo', 555, 'Short'),
('tt0000049', 'movie', 'Glove Contest', 695, 'Short'),
('tt0000050', 'short', 'Bébé et fillettes', 120, 'Comedy'),
('tt0000051', 'movie', 'The Bohemian Encampment', 654, 'Documentary'),
('tt0000052', 'short', 'Carga de rurales', 222, 'Comedy'),
('tt0000053', 'movie', 'A Chegada do Comboio Inaugural à Estação Central do Porto', 42, 'Documentary'),
('tt0000054', 'movie', 'A Merry-Go-Round', 65, 'Short'),
('tt0000055', 'movie', 'Le chiffonnier', 325, 'Short'),
('tt0000056', 'short', 'Uma Corrida de Touros no Campo Pequeno', 415, 'Short'),
('tt0000057', 'movie', 'Cortège de tzar allant à Versailles', 9621, 'Comedy'),
('tt0000058', 'short', 'Cortège de tzar au Bois de Boulogne', 4745, 'Comedy'),
('tt0000059', 'movie', 'Coronation of a Village Maiden', 456, 'Short'),
('tt0000060', 'movie', 'Dancing Darkies', 78, 'Horror'),
('tt0000061', 'movie', 'Dancing Girls', 445, 'Short'),
('tt0000062', 'movie', 'Danse serpentine', 23, 'Short'),
('tt0000063', 'short', 'Dessinateur express', 456, 'Short'),
('tt0000064', 'short', 'Dessinateur: Chamberlain', 455, 'Horror'),
('tt0000065', 'short', 'Dessinateur: Reine Victoria', 23, 'Short'),
('tt0000066', 'movie', 'Dessinateur: Von Bismark', 12, 'Short'),
('tt0000067', 'movie', 'Conjurer Making Ten Hats in Sixty Seconds', 12, 'Fantasy'),
('tt0000068', 'movie', 'Unloading the Boat', 45, 'Horror'),
('tt0000069', 'short', 'Post No Bills', 1, 'Short'),
('tt0000070', 'movie', 'Demolition of a Wall', 1, 'Documentary'),
('tt0000071', 'short', 'Automobiles Starting a Race', 52, 'Sport'),
('tt0000072', 'movie', 'Officers of French Army Leaving Service', 41, 'Short'),
('tt0000073', 'movie', 'Effets de mer sur les rochers', 85, 'Documentary'),
('tt0000074', 'short', 'Enfants jouant sur la plage', 475, 'Horror'),
('tt0000075', 'movie', 'The Conjuring of a Woman at the House of Robert Houdin', 122, 'Horror'),
('tt0000076', 'short', 'Exit of Rip and the Dwarf', 1, 'Drama'),
('tt0000077', 'movie', 'indien', 457, 'Short'),
('tt0000078', 'short', 'Feira de Gado na Corujeira', 1, 'Documentary'),
('tt0000079', 'movie', 'La gare Saint-Lazare', 123, 'Documentary'),
('tt0000080', 'short', 'Grandes manoeuvres', 65, 'Family'),
('tt0000081', 'movie', 'Towing a Boat on the River', 100, 'Family'),
('tt0000082', 'short', 'A Hard Wash', 45, 'Comedy'),
('tt0000083', 'short', 'Les indiscrets', 121, 'Short'),
('tt0000084', 'short', 'Les ivrognes', 3, 'Short'),
('tt0000085', 'movie', 'Gardener Burning Weeds', 125, 'Short'),
('tt0000086', 'movie', 'Family', 100, 'Family'),
('tt0000087', 'short', 'Life ', 475, 'Documentary'),
('tt0000088', 'short', 'Market Day', 111, 'Family'),
('tt0000089', 'movie', 'Leaving Jerusalem by Railway', 1, 'Documentary'),
('tt0000090', 'short', 'Libération des territoriaux', 859, 'Documentary'),
('tt0000091', 'short', 'The House of the Devil', 3, 'Horror'),
('tt0000092', 'short', 'Marée montante sur Brise-Larmes', 652, 'Documentary'),
('tt0000093', 'movie', 'Melbourne', 653, 'Documentary'),
('tt0000094', 'short', 'Miss de Vere', 22, 'Short'),
('tt0000095', 'movie', 'The Mysterious Paper', 88, 'Short'),
('tt0000096', 'short', 'Place Saint-Augustin', 487, 'Documentary'),
('tt0000097', 'movie', 'Picasso', 965, 'Documentary'),
('tt0000098', 'short', 'alice In Wonderland', 222, 'Fantasy'),
('tt0000099', 'short', 'Pele', 555, 'Documentary'),
('tt0000100', 'movie', 'Ronaldo', 145, 'Fantasy');

-- --------------------------------------------------------

--
-- Table structure for table `ratings`
--

CREATE TABLE `ratings` (
  `tconst` varchar(255) NOT NULL,
  `average_rating` int(11) NOT NULL,
  `num_votes` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `ratings`
--

INSERT INTO `ratings` (`tconst`, `average_rating`, `num_votes`) VALUES
('tconst', 0, 0),
('tt0000001', 6, 1911),
('tt0000002', 6, 257),
('tt0000003', 7, 1716),
('tt0000004', 6, 169),
('tt0000005', 6, 2532),
('tt0000006', 5, 173),
('tt0000007', 5, 790),
('tt0000008', 5, 2054),
('tt0000009', 5, 199),
('tt0000010', 7, 6929),
('tt0000011', 5, 355),
('tt0000012', 7, 11869),
('tt0000013', 6, 1829),
('tt0000014', 7, 5322),
('tt0000015', 6, 1020),
('tt0000016', 6, 1440),
('tt0000017', 5, 314),
('tt0000018', 5, 577),
('tt0000019', 5, 31),
('tt0000020', 5, 345),
('tt0000022', 5, 1061),
('tt0000023', 6, 1387),
('tt0000024', 4, 99),
('tt0000025', 4, 45),
('tt0000026', 6, 1496),
('tt0000027', 6, 1118),
('tt0000028', 5, 1036),
('tt0000029', 6, 3266),
('tt0000030', 5, 820),
('tt0000031', 6, 975),
('tt0000032', 5, 408),
('tt0000033', 6, 992),
('tt0000034', 5, 190),
('tt0000035', 5, 78),
('tt0000036', 4, 594),
('tt0000037', 4, 66),
('tt0000038', 4, 197),
('tt0000039', 3, 30),
('tt0000040', 4, 64),
('tt0000041', 7, 1772),
('tt0000042', 4, 37),
('tt0000043', 4, 32),
('tt0000044', 4, 45),
('tt0000045', 4, 33),
('tt0000046', 4, 34),
('tt0000047', 3, 34),
('tt0000048', 5, 191),
('tt0000049', 5, 49),
('tt0000050', 4, 34),
('tt0000051', 3, 35),
('tt0000052', 4, 97),
('tt0000053', 3, 18),
('tt0000054', 5, 34),
('tt0000055', 3, 30),
('tt0000056', 3, 22),
('tt0000057', 5, 34),
('tt0000058', 4, 33),
('tt0000059', 3, 27),
('tt0000060', 7, 87),
('tt0000061', 4, 24),
('tt0000062', 6, 193),
('tt0000063', 3, 28),
('tt0000064', 3, 29),
('tt0000065', 3, 29),
('tt0000066', 3, 29),
('tt0000067', 6, 62),
('tt0000068', 3, 31),
('tt0000069', 5, 441),
('tt0000070', 6, 2574),
('tt0000071', 4, 29),
('tt0000072', 3, 27),
('tt0000073', 3, 30),
('tt0000074', 4, 31),
('tt0000075', 6, 1866),
('tt0000076', 4, 523),
('tt0000077', 4, 35),
('tt0000078', 4, 76),
('tt0000079', 4, 35),
('tt0000080', 4, 31),
('tt0000081', 4, 32),
('tt0000082', 5, 49),
('tt0000083', 4, 32),
('tt0000084', 4, 30),
('tt0000085', 4, 33),
('tt0000086', 4, 33),
('tt0000087', 4, 37),
('tt0000088', 4, 32),
('tt0000089', 6, 977),
('tt0000090', 4, 31),
('tt0000091', 7, 3479),
('tt0000092', 4, 29),
('tt0000093', 5, 93),
('tt0000094', 5, 32),
('tt0000095', 4, 34),
('tt0000096', 4, 29),
('tt0000097', 5, 33),
('tt0000098', 5, 36),
('tt0000099', 4, 32),
('tt0000100', 5, 53);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `movies`
--
ALTER TABLE `movies`
  ADD PRIMARY KEY (`tconst`);

--
-- Indexes for table `ratings`
--
ALTER TABLE `ratings`
  ADD PRIMARY KEY (`tconst`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `ratings`
--
ALTER TABLE `ratings`
  ADD CONSTRAINT `FKm383r32kv6ybjxg8j3m85d8um` FOREIGN KEY (`tconst`) REFERENCES `movies` (`tconst`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
