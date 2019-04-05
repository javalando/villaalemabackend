-- MySQL dump 10.13  Distrib 8.0.15, for Win64 (x86_64)
--
-- Host: localhost    Database: villaalema
-- ------------------------------------------------------
-- Server version	8.0.15

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `mesa`
--

DROP TABLE IF EXISTS `mesa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `mesa` (
  `idmesa` int(11) NOT NULL AUTO_INCREMENT,
  `descricao` varchar(45) DEFAULT NULL,
  `idtipomesa` int(11) DEFAULT NULL,
  PRIMARY KEY (`idmesa`),
  KEY `fktipomesa_idx` (`idtipomesa`),
  CONSTRAINT `fktipomesa` FOREIGN KEY (`idtipomesa`) REFERENCES `tipomesa` (`idtipomesa`)
) ENGINE=InnoDB AUTO_INCREMENT=47 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mesa`
--

LOCK TABLES `mesa` WRITE;
/*!40000 ALTER TABLE `mesa` DISABLE KEYS */;
INSERT INTO `mesa` VALUES (1,'centro',1),(2,'centro',1),(3,'centro',1),(4,'centro',1),(5,'centro',1),(6,'centro',1),(7,'centro',1),(8,'fora',1),(9,'fora',1),(10,'fora',1),(11,'fora',1),(12,'direita',2),(13,'direita',2),(14,'direita',2),(15,'direita',2),(16,'esquerda',2),(17,'esquerda',2),(18,'esquerda',2),(19,'esquerda',2),(20,'esquerda',2),(21,'avulso',2),(22,'avulso',2),(23,'avulso',2),(24,'avulso',2),(25,'avulso',2),(26,'avulso',2),(27,'avulso',2),(28,'avulso',2),(29,'avulso',2),(30,'avulso',2),(31,'avulso',2),(32,'avulso',2),(33,'avulso',2),(34,'avulso',2),(35,'avulso',2),(36,'avulso',2),(37,'avulso',2),(38,'avulso',2),(39,'avulso',2),(40,'avulso',2),(41,'avulso',2),(42,'avulso',2),(43,'avulso',2),(44,'avulso',2),(45,'avulso',2),(46,'avulso',2);
/*!40000 ALTER TABLE `mesa` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-04-05 11:36:49
