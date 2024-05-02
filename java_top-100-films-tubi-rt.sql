-- MySQL dump 10.13  Distrib 8.0.36, for Win64 (x86_64)
--
-- Host: localhost    Database: java
-- ------------------------------------------------------
-- Server version	8.0.37

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `top-100-films-tubi-rt`
--

DROP TABLE IF EXISTS `top-100-films-tubi-rt`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `top-100-films-tubi-rt` (
  `titolo` text,
  `anno` text,
  `rating` text,
  `regista` text
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `top-100-films-tubi-rt`
--

LOCK TABLES `top-100-films-tubi-rt` WRITE;
/*!40000 ALTER TABLE `top-100-films-tubi-rt` DISABLE KEYS */;
INSERT INTO `top-100-films-tubi-rt` VALUES ('The Philadelphia Story','(1940)','100%','George Cukor'),('12 Angry Men','(1957)','100%','Sidney Lumet'),('The Adventures of Robin Hood','(1938)','100%','Michael Curtiz'),('Lady Bird','(2017)','99%','Greta Gerwig'),('Paddington 2','(2017)','99%','Paul King'),('The Maltese Falcon','(1941)','99%','John Huston'),('The Third Man','(1949)','99%','Carol Reed'),('The Babadook','(2014)','98%','Jennifer Kent'),('God\'s Own Country','(2017)','98%','Francis Lee'),('All Quiet on the Western Front','(1930)','98%','Lewis Milestone'),('Nothing Like a Dame','(2018)','98%','Roger Michell'),('Strangers on a Train','(1951)','98%','Alfred Hitchcock'),('Bullitt','(1968)','98%','Peter Yates'),('Boyhood','(2014)','97%','Richard Linklater'),('North by Northwest','(1959)','97%','Alfred Hitchcock'),('In This Corner of the World','(2016)','97%','Sunao Katabuchi'),('Bull Durham','(1988)','97%','Ron Shelton'),('A Night at the Opera','(1935)','97%','Sam Wood'),('A Streetcar Named Desire','(1951)','97%','Elia Kazan'),('Unforgiven','(1992)','96%','Clint Eastwood'),('In the Heat of the Night','(1967)','96%','Norman Jewison'),('Mutiny on the Bounty','(1935)','96%','Frank Lloyd'),('A Fish Called Wanda','(1988)','96%','Charles Crichton'),('Forbidden Planet','(1956)','94%','Fred M. Wilcox'),('The Survivalist','(2015)','96%','Stephen Fingleton'),('The Death of Stalin','(2017)','95%','Armando Iannucci'),('Sing Street','(2016)','95%','John Carney'),('The Love Witch','(2016)','95%','Anna Biller'),('Blue Velvet','(1986)','95%','David Lynch'),('Memories of Murder','(2003)','95%','Bong Joon Ho'),('American Graffiti','(1973)','95%','George Lucas'),('Ghost in the Shell','(1995)','95%','Mamoru Oshii'),('City Lights','(1931)','95%','Charlie Chaplin'),('Hamlet','(1996)','95%','Kenneth Branagh'),('Snowpiercer','(2013)','94%','Bong Joon Ho'),('Possessor: Uncut','(2020)','94%','Brandon Cronenberg'),('The Edge of Seventeen','(2016)','94%','Kelly Fremon Craig'),('Memento','(2000)','94%','Christopher Nolan'),('In the Loop','(2009)','94%','Armando Iannucci'),('Away From Her','(2006)','94%','Sarah Polley'),('Mean Streets','(1973)','94%','Martin Scorsese'),('Howards End','(1992)','94%','James Ivory'),('Suspiria','(1977)','94%','Dario Argento'),('The Women','(1939)','94%','George Cukor'),('Us','(2019)','93%','Jordan Peele'),('Amores perros','(2000)','93%','Alejandro González Iñárritu'),('The Secret of NIMH','(1982)','93%','Don Bluth'),('Wild','(2018)','93%','Camille Vidal-Naquet'),('Heathers','(1989)','93%','Michael Lehmann'),('Klute','(1971)','93%','Alan J. Pakula'),('Precious: Based on the Novel \"Push\" by Sapphire','(2009)','92%','Lee Daniels'),('Shattered Glass','(2003)','92%','Billy Ray'),('The Endless','(2017)','92%','Aaron Moorhead'),('West Side Story','(1961)','92%','Jerome Robbins'),('Tokyo Godfathers','(2003)','92%','Satoshi Kon'),('Moonstruck','(1987)','92%','Norman Jewison'),('No Way Out','(1987)','92%','Roger Donaldson'),('Mandy','(2018)','91%','Panos Cosmatos'),('The Gift','(2015)','91%','Joel Edgerton'),('Hotel Rwanda','(2004)','91%','Terry George'),('Kung Fu Hustle','(2004)','91%','Stephen Chow'),('Whale Rider','(2002)','91%','Niki Caro'),('Fish Tank','(2009)','91%','Andrea Arnold'),('Lone Star','(1996)','91%','John Sayles'),('Bone Tomahawk','(2015)','91%','S. Craig Zahler'),('The Return of the Living Dead','(1985)','91%','Dan O\'Bannon'),('Lolita','(1962)','91%','Stanley Kubrick'),('The Lighthouse','(2019)','90%','Robert Eggers'),('The Imitation Game','(2014)','90%','Morten Tyldum'),('Downfall','(2004)','90%','Oliver Hirschbiegel'),('Bodied','(2017)','90%','Joseph Kahn'),('Reservoir Dogs','(1992)','90%','Quentin Tarantino'),('Stand and Deliver','(1988)','90%','Ramón Menéndez'),('A Raisin in the Sun','(1961)','90%','Daniel Petrie'),('Battle Royale','(2000)','90%','Kinji Fukasaku'),('Dial M for Murder','(1954)','90%','Alfred Hitchcock'),('Mystic River','(2003)','89%','Clint Eastwood'),('Capote','(2005)','89%','Bennett Miller'),('Compliance','(2012)','89%','Craig Zobel'),('Platoon','(1986)','89%','Oliver Stone'),('The Texas Chain Saw Massacre','(1974)','89%','Tobe Hooper'),('Dirty Rotten Scoundrels','(1988)','89%','Frank Oz'),('Zola','(2020)','88%','Janicza Bravo'),('American Animals','(2018)','88%','Bart Layton'),('Blue Is the Warmest Color','(2013)','88%','Abdel Kechiche'),('Bernie','(2011)','88%','Richard Linklater'),('The Passenger','(1975)','88%','Michelangelo Antonioni'),('The Sisters Brothers','(2018)','87%','Jacques Audiard'),('The Descent','(2005)','87%','Neil Marshall'),('Arbitrage','(2012)','87%','Nicholas Jarecki'),('2046','(2004)','87%','Kar-Wai Wong'),('Donnie Darko','(2001)','87%','Richard Kelly'),('Barry Lyndon','(1975)','87%','Stanley Kubrick'),('Safe','(1995)','87%','Todd Haynes'),('Eight Men Out','(1988)','87%','John Sayles'),('Blow-Up','(1966)','87%','Michelangelo Antonioni'),('All That Jazz','(1979)','87%','Bob Fosse'),('The Girl With the Dragon Tattoo','(2011)','86%','David Fincher'),('The Nightingale','(2018)','86%','Jennifer Kent'),('The Master','(2012)','85%','Paul Thomas Anderson');
/*!40000 ALTER TABLE `top-100-films-tubi-rt` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-05-02 16:42:39
