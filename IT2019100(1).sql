-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: May 01, 2021 at 04:02 PM
-- Server version: 5.7.26
-- PHP Version: 7.2.18

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dbintake7`
--

-- --------------------------------------------------------

--
-- Table structure for table `contact`
--

DROP TABLE IF EXISTS `contact`;
CREATE TABLE IF NOT EXISTS `contact` (
  `name` varchar(50) NOT NULL,
  `cnumber` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `subject` varchar(50) NOT NULL,
  `message` varchar(50) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `contact`
--

INSERT INTO `contact` (`name`, `cnumber`, `email`, `subject`, `message`) VALUES
('e3e', '', '', '', ''),
('wrwrwr', 'ffw', '', '', ''),
('Thakshila', '00000', 'thakshilan98@gmail.com', 'test', 'This is test one'),
('rrrr', '', '', '', ''),
('Thakshila Navodya', '0710424748', 'thakshilan98@gmail.com', 'testing', 'aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa'),
('thak', '1234567', 'tha@gmail.com', 'test', 'qwertyuiop'),
('adwe', 'we', 'a', '', '');

-- --------------------------------------------------------

--
-- Table structure for table `feedback`
--

DROP TABLE IF EXISTS `feedback`;
CREATE TABLE IF NOT EXISTS `feedback` (
  `name` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `feedback` varchar(50) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `feedback`
--

INSERT INTO `feedback` (`name`, `email`, `feedback`) VALUES
('tt', 'ee', 't4twa'),
('fewfwe', '', ''),
('sdcsd', '', ''),
('[', '', ''),
('ttt', 't', 't'),
('thaksila', 'rrr', 'wqaddad'),
('ww', 'asda', 'qqqqq2'),
('sa', '', ''),
('zsx', 'zczc', 'wwad'),
('yyy', 'uuuu', 'kjjkhhuih'),
('aaaa', 'bbbb', 'cccc'),
('aaasaasda', '', '');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

DROP TABLE IF EXISTS `login`;
CREATE TABLE IF NOT EXISTS `login` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(66) NOT NULL,
  `password` varchar(66) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`id`, `username`, `password`) VALUES
(1, 'thak', '123');

-- --------------------------------------------------------

--
-- Table structure for table `room`
--

DROP TABLE IF EXISTS `room`;
CREATE TABLE IF NOT EXISTS `room` (
  `date` varchar(50) NOT NULL,
  `month` varchar(50) NOT NULL,
  `year` varchar(50) NOT NULL,
  `dated` varchar(50) NOT NULL,
  `monthd` varchar(50) NOT NULL,
  `yeard` varchar(50) NOT NULL,
  `room` varchar(50) NOT NULL,
  `adult` varchar(50) NOT NULL,
  `chil` varchar(50) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `room`
--

INSERT INTO `room` (`date`, `month`, `year`, `dated`, `monthd`, `yeard`, `room`, `adult`, `chil`) VALUES
('1', 'Jan', '2022', '2', 'Jan', '2022', '1 Room', '2 Adults', '1 Children'),
('Date', 'Month', 'Year', 'Date', 'Month', 'Year', '1 Room', '1 Adult', '0 Children'),
('1', 'Jan', '2021', '1', 'Jan', '2021', '1 Room', '1 Adult', '0 Children'),
('Date', 'Month', 'Year', 'Date', 'Month', 'Year', '1 Room', '1 Adult', '0 Children'),
('Date', 'Month', 'Year', 'Date', 'Month', 'Year', '1 Room', '1 Adult', '0 Children'),
('4', 'Jan', '2022', '5', 'Jan', '2022', '1 Room', '1 Adult', '0 Children'),
('Date', 'Month', 'Year', 'Date', 'Month', 'Year', '1 Room', '1 Adult', '0 Children'),
('Date', 'Month', 'Year', 'Date', 'Month', 'Year', '1 Room', '1 Adult', '0 Children'),
('Date', 'Month', 'Year', 'Date', 'Month', 'Year', '1 Room', '1 Adult', '0 Children'),
('7', 'Jun', '2024', '4', 'Apr', '2023', '1 Room', '1 Adult', '0 Children'),
('Date', 'Month', 'Year', 'Date', 'Month', 'Year', '1 Room', '1 Adult', '0 Children'),
('Date', 'Month', 'Year', 'Date', 'Month', 'Year', '1 Room', '1 Adult', '0 Children'),
('2', 'Jan', '2021', '2', 'Jan', '2021', '1 Room', '1 Adult', '0 Children'),
('1', 'Jan', '2021', '2', 'Jan', '2021', '1 Room', '1 Adult', '0 Children'),
('Date', 'Month', 'Year', 'Date', 'Month', 'Year', '1 Room', '1 Adult', '0 Children');

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;
CREATE TABLE IF NOT EXISTS `student` (
  `name` varchar(20) NOT NULL,
  `address` varchar(50) NOT NULL,
  `gender` varchar(50) NOT NULL,
  `age` varchar(50) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`name`, `address`, `gender`, `age`) VALUES
('w', '', 'Male', '15-19');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
