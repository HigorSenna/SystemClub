CREATE DATABASE  IF NOT EXISTS `sistema_clube` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `sistema_clube`;
-- MySQL dump 10.13  Distrib 5.6.23, for Win64 (x86_64)
--
-- Host: localhost    Database: sistema_clube
-- ------------------------------------------------------
-- Server version	5.6.24-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `associado_titular`
--

DROP TABLE IF EXISTS `associado_titular`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `associado_titular` (
  `id_associado` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) NOT NULL,
  `CPF` varchar(14) NOT NULL,
  `RG` varchar(13) NOT NULL,
  `telefone` varchar(13) NOT NULL DEFAULT '',
  `endereco` varchar(45) NOT NULL,
  `senhaClube` varchar(20) NOT NULL,
  `CPF_dependente` varchar(14) DEFAULT NULL,
  `numConta` int(11) NOT NULL,
  `numCB` int(11) NOT NULL,
  PRIMARY KEY (`id_associado`,`telefone`),
  KEY `FK_associ_dep_idx` (`CPF_dependente`),
  KEY `FK_associ_banco_idx` (`numConta`),
  KEY `FK_associ_bar_idx` (`numCB`),
  CONSTRAINT `FK_associ_banco` FOREIGN KEY (`numConta`) REFERENCES `conta_bancaria` (`numero`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_associ_bar` FOREIGN KEY (`numCB`) REFERENCES `contabar` (`numContaBar`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_associ_dep` FOREIGN KEY (`CPF_dependente`) REFERENCES `dependente` (`CPF_Dep`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `associado_titular`
--

LOCK TABLES `associado_titular` WRITE;
/*!40000 ALTER TABLE `associado_titular` DISABLE KEYS */;
/*!40000 ALTER TABLE `associado_titular` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `conta_bancaria`
--

DROP TABLE IF EXISTS `conta_bancaria`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `conta_bancaria` (
  `numero` int(11) NOT NULL,
  `banco` varchar(14) NOT NULL,
  `agencia` varchar(3) NOT NULL,
  `saldo` decimal(5,2) DEFAULT '0.00',
  PRIMARY KEY (`numero`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `conta_bancaria`
--

LOCK TABLES `conta_bancaria` WRITE;
/*!40000 ALTER TABLE `conta_bancaria` DISABLE KEYS */;
/*!40000 ALTER TABLE `conta_bancaria` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `contabar`
--

DROP TABLE IF EXISTS `contabar`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `contabar` (
  `numContaBar` int(11) NOT NULL,
  `tipo` varchar(20) NOT NULL DEFAULT 'Comum',
  `saldo` decimal(5,2) DEFAULT '0.00',
  PRIMARY KEY (`numContaBar`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `contabar`
--

LOCK TABLES `contabar` WRITE;
/*!40000 ALTER TABLE `contabar` DISABLE KEYS */;
/*!40000 ALTER TABLE `contabar` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dependente`
--

DROP TABLE IF EXISTS `dependente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `dependente` (
  `CPF_Dep` varchar(14) NOT NULL,
  `nome` varchar(45) NOT NULL,
  `endereco` varchar(45) NOT NULL,
  `telefone` varchar(15) DEFAULT 'nao possui',
  PRIMARY KEY (`CPF_Dep`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dependente`
--

LOCK TABLES `dependente` WRITE;
/*!40000 ALTER TABLE `dependente` DISABLE KEYS */;
/*!40000 ALTER TABLE `dependente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `produto`
--

DROP TABLE IF EXISTS `produto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `produto` (
  `nome` varchar(45) NOT NULL,
  `quantidade` int(11) NOT NULL,
  `notaFiscal` int(11) NOT NULL,
  PRIMARY KEY (`notaFiscal`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `produto`
--

LOCK TABLES `produto` WRITE;
/*!40000 ALTER TABLE `produto` DISABLE KEYS */;
/*!40000 ALTER TABLE `produto` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-11-11 16:43:24
