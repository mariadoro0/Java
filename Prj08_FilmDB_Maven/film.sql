-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Creato il: Mag 02, 2024 alle 17:17
-- Versione del server: 10.4.28-MariaDB
-- Versione PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `top_films`
--

-- --------------------------------------------------------

--
-- Struttura della tabella `film`
--

CREATE TABLE `film` (
  `id` int(11) NOT NULL,
  `titolo` varchar(100) NOT NULL,
  `anno` int(6) NOT NULL,
  `rating` int(5) NOT NULL,
  `regista` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dump dei dati per la tabella `film`
--

INSERT INTO `film` (`id`, `titolo`, `anno`, `rating`, `regista`) VALUES
(1, 'The Philadelphia Story', 1940, 100, 'George Cukor'),
(2, '12 Angry Men', 1957, 100, 'Sidney Lumet'),
(3, 'The Adventures of Robin Hood', 1938, 100, 'Michael Curtiz'),
(4, 'Lady Bird', 2017, 99, 'Greta Gerwig'),
(5, 'Paddington 2', 2017, 99, 'Paul King'),
(6, 'The Maltese Falcon', 1941, 99, 'John Huston'),
(7, 'The Third Man', 1949, 99, 'Carol Reed'),
(8, 'The Babadook', 2014, 98, 'Jennifer Kent'),
(9, 'God\'s Own Country', 2017, 98, 'Francis Lee'),
(10, 'All Quiet on the Western Front', 1930, 98, 'Lewis Milestone'),
(11, 'Nothing Like a Dame', 2018, 98, 'Roger Michell'),
(12, 'Strangers on a Train', 1951, 98, 'Alfred Hitchcock'),
(13, 'Bullitt', 1968, 98, 'Peter Yates'),
(14, 'Boyhood', 2014, 97, 'Richard Linklater'),
(15, 'North by Northwest', 1959, 97, 'Alfred Hitchcock'),
(16, 'In This Corner of the World', 2016, 97, 'Sunao Katabuchi'),
(17, 'Bull Durham', 1988, 97, 'Ron Shelton'),
(18, 'A Night at the Opera', 1935, 97, 'Sam Wood'),
(19, 'A Streetcar Named Desire', 1951, 97, 'Elia Kazan'),
(20, 'Unforgiven', 1992, 96, 'Clint Eastwood'),
(21, 'In the Heat of the Night', 1967, 96, 'Norman Jewison'),
(22, 'Mutiny on the Bounty', 1935, 96, 'Frank Lloyd'),
(23, 'A Fish Called Wanda', 1988, 96, 'Charles Crichton'),
(24, 'Forbidden Planet', 1956, 94, 'Fred M. Wilcox'),
(25, 'The Survivalist', 2015, 96, 'Stephen Fingleton'),
(26, 'The Death of Stalin', 2017, 95, 'Armando Iannucci'),
(27, 'Sing Street', 2016, 95, 'John Carney'),
(28, 'The Love Witch', 2016, 95, 'Anna Biller'),
(29, 'Blue Velvet', 1986, 95, 'David Lynch'),
(30, 'Memories of Murder', 2003, 95, 'Bong Joon Ho'),
(31, 'American Graffiti', 1973, 95, 'George Lucas'),
(32, 'Ghost in the Shell', 1995, 95, 'Mamoru Oshii'),
(33, 'City Lights', 1931, 95, 'Charlie Chaplin'),
(34, 'Hamlet', 1996, 95, 'Kenneth Branagh'),
(35, 'Snowpiercer', 2013, 94, 'Bong Joon Ho'),
(36, 'Possessor: Uncut', 2020, 94, 'Brandon Cronenberg'),
(37, 'The Edge of Seventeen', 2016, 94, 'Kelly Fremon Craig'),
(38, 'Memento', 2000, 94, 'Christopher Nolan'),
(39, 'In the Loop', 2009, 94, 'Armando Iannucci'),
(40, 'Away From Her', 2006, 94, 'Sarah Polley'),
(41, 'Mean Streets', 1973, 94, 'Martin Scorsese'),
(42, 'Howards End', 1992, 94, 'James Ivory'),
(43, 'Suspiria', 1977, 94, 'Dario Argento'),
(44, 'The Women', 1939, 94, 'George Cukor'),
(45, 'Us', 2019, 93, 'Jordan Peele'),
(46, 'Amores perros', 2000, 93, 'Alejandro González I'),
(47, 'The Secret of NIMH', 1982, 93, 'Don Bluth'),
(48, 'Wild', 2018, 93, 'Camille Vidal-Naquet'),
(49, 'Heathers', 1989, 93, 'Michael Lehmann'),
(50, 'Klute', 1971, 93, 'Alan J. Pakula'),
(51, 'Precious: Based on the Novel \"Push\" by Sapphire', 2009, 92, 'Lee Daniels'),
(52, 'Shattered Glass', 2003, 92, 'Billy Ray'),
(53, 'The Endless', 2017, 92, 'Aaron Moorhead'),
(54, 'West Side Story', 1961, 92, 'Jerome Robbins'),
(55, 'Tokyo Godfathers', 2003, 92, 'Satoshi Kon'),
(56, 'Moonstruck', 1987, 92, 'Norman Jewison'),
(57, 'No Way Out', 1987, 92, 'Roger Donaldson'),
(58, 'Mandy', 2018, 91, 'Panos Cosmatos'),
(59, 'The Gift', 2015, 91, 'Joel Edgerton'),
(60, 'Hotel Rwanda', 2004, 91, 'Terry George'),
(61, 'Kung Fu Hustle', 2004, 91, 'Stephen Chow'),
(62, 'Whale Rider', 2002, 91, 'Niki Caro'),
(63, 'Fish Tank', 2009, 91, 'Andrea Arnold'),
(64, 'Lone Star', 1996, 91, 'John Sayles'),
(65, 'Bone Tomahawk', 2015, 91, 'S. Craig Zahler'),
(66, 'The Return of the Living Dead', 1985, 91, 'Dan O\'Bannon'),
(67, 'Lolita', 1962, 91, 'Stanley Kubrick'),
(68, 'The Lighthouse', 2019, 90, 'Robert Eggers'),
(69, 'The Imitation Game', 2014, 90, 'Morten Tyldum'),
(70, 'Downfall', 2004, 90, 'Oliver Hirschbiegel'),
(71, 'Bodied', 2017, 90, 'Joseph Kahn'),
(72, 'Reservoir Dogs', 1992, 90, 'Quentin Tarantino'),
(73, 'Stand and Deliver', 1988, 90, 'Ramón Menéndez'),
(74, 'A Raisin in the Sun', 1961, 90, 'Daniel Petrie'),
(75, 'Battle Royale', 2000, 90, 'Kinji Fukasaku'),
(76, 'Dial M for Murder', 1954, 90, 'Alfred Hitchcock'),
(77, 'Mystic River', 2003, 89, 'Clint Eastwood'),
(78, 'Capote', 2005, 89, 'Bennett Miller'),
(79, 'Compliance', 2012, 89, 'Craig Zobel'),
(80, 'Platoon', 1986, 89, 'Oliver Stone'),
(81, 'The Texas Chain Saw Massacre', 1974, 89, 'Tobe Hooper'),
(82, 'Dirty Rotten Scoundrels', 1988, 89, 'Frank Oz'),
(83, 'Zola', 2020, 88, 'Janicza Bravo'),
(84, 'American Animals', 2018, 88, 'Bart Layton'),
(85, 'Blue Is the Warmest Color', 2013, 88, 'Abdel Kechiche'),
(86, 'Bernie', 2011, 88, 'Richard Linklater'),
(87, 'The Passenger', 1975, 88, 'Michelangelo Antonio'),
(88, 'The Sisters Brothers', 2018, 87, 'Jacques Audiard'),
(89, 'The Descent', 2005, 87, 'Neil Marshall'),
(90, 'Arbitrage', 2012, 87, 'Nicholas Jarecki'),
(91, '2046', 2004, 87, 'Kar-Wai Wong'),
(92, 'Donnie Darko', 2001, 87, 'Richard Kelly'),
(93, 'Barry Lyndon', 1975, 87, 'Stanley Kubrick'),
(94, 'Safe', 1995, 87, 'Todd Haynes'),
(95, 'Eight Men Out', 1988, 87, 'John Sayles'),
(96, 'Blow-Up', 1966, 87, 'Michelangelo Antonio'),
(97, 'All That Jazz', 1979, 87, 'Bob Fosse'),
(98, 'The Girl With the Dragon Tattoo', 2011, 86, 'David Fincher'),
(99, 'The Nightingale', 2018, 86, 'Jennifer Kent'),
(100, 'The Master', 2012, 85, 'Paul Thomas Anderson');

--
-- Indici per le tabelle scaricate
--

--
-- Indici per le tabelle `film`
--
ALTER TABLE `film`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT per le tabelle scaricate
--

--
-- AUTO_INCREMENT per la tabella `film`
--
ALTER TABLE `film`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=128;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
