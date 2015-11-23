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
  `nome` varchar(45) DEFAULT NULL,
  `CPF` varchar(14) DEFAULT NULL,
  `RG` varchar(13) DEFAULT NULL,
  `telefone` varchar(13) DEFAULT NULL,
  `endereco` varchar(45) DEFAULT NULL,
  `senhaClube` varchar(20) DEFAULT NULL,
  `CPF_dependente` varchar(14) DEFAULT NULL,
  `numConta` int(11) DEFAULT NULL,
  `numCB` int(11) DEFAULT NULL,
  `tipo_associado` varchar(45) DEFAULT NULL,
  `num_historico` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_associado`),
  KEY `FK_associ_dep_idx` (`CPF_dependente`),
  KEY `FK_associ_banco_idx` (`numConta`),
  KEY `FK_associ_bar_idx` (`numCB`),
  KEY `FK_historico_associ_idx` (`num_historico`),
  CONSTRAINT `FK_associ_banco` FOREIGN KEY (`numConta`) REFERENCES `conta_bancaria` (`numero`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_associ_bar` FOREIGN KEY (`numCB`) REFERENCES `contabar` (`numContaBar`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_associ_dep` FOREIGN KEY (`CPF_dependente`) REFERENCES `dependente` (`CPF_Dep`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_historico_associ` FOREIGN KEY (`num_historico`) REFERENCES `historico` (`id_historico`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `associado_titular`
--

LOCK TABLES `associado_titular` WRITE;
/*!40000 ALTER TABLE `associado_titular` DISABLE KEYS */;
INSERT INTO `associado_titular` VALUES (12,'aaaa\'','aaaaa','aaaa','aaaa','aaaa','aaa',NULL,569,NULL,NULL,NULL),(13,'Higor Senna','079.968.856-78','GH-50.569.897','(85)9896-8969','Vale do Silício','123456',NULL,369,NULL,NULL,NULL),(14,'Admin','admin','admin','admin','admin','admin',NULL,11,NULL,'admin',NULL);
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
INSERT INTO `conta_bancaria` VALUES (11,'admin','11',100.00),(369,'BB','381',500.00),(569,'gg','568',200.00);
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
-- Table structure for table `funcionario`
--

DROP TABLE IF EXISTS `funcionario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `funcionario` (
  `id_funcionario` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) NOT NULL,
  `login` varchar(20) NOT NULL,
  `senha` varchar(20) NOT NULL,
  PRIMARY KEY (`id_funcionario`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `funcionario`
--

LOCK TABLES `funcionario` WRITE;
/*!40000 ALTER TABLE `funcionario` DISABLE KEYS */;
INSERT INTO `funcionario` VALUES (1,'Teste','a','a'),(4,'TesteModificado','aa','aa');
/*!40000 ALTER TABLE `funcionario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `historico`
--

DROP TABLE IF EXISTS `historico`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `historico` (
  `id_historico` int(11) NOT NULL,
  `entrada` varchar(20) DEFAULT NULL,
  `nome_associado` varchar(45) DEFAULT NULL,
  `produtos_consumidos` varchar(400) DEFAULT NULL,
  `divida_paga` varchar(45) DEFAULT NULL,
  `saida` varchar(20) DEFAULT NULL,
  `total_gastos` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id_historico`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `historico`
--

LOCK TABLES `historico` WRITE;
/*!40000 ALTER TABLE `historico` DISABLE KEYS */;
/*!40000 ALTER TABLE `historico` ENABLE KEYS */;
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

-- Dump completed on 2015-11-23 16:41:47
