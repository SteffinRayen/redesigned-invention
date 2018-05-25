-- phpMyAdmin SQL Dump
-- version 4.8.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 25, 2018 at 05:43 PM
-- Server version: 10.1.32-MariaDB
-- PHP Version: 7.2.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bankdb`
--

-- --------------------------------------------------------

--
-- Table structure for table `account`
--

CREATE TABLE `account` (
  `account_id` int(11) NOT NULL,
  `account_type` varchar(1) NOT NULL,
  `balance` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `account`
--

INSERT INTO `account` (`account_id`, `account_type`, `balance`) VALUES
(2001, 'S', 1700),
(2002, 'C', 2000),
(2003, 'C', 5500),
(2004, 'S', 2500),
(2005, 'S', 3000),
(2006, 'S', 2500),
(2007, 'S', 5300),
(2008, 'S', 2000),
(2009, 'C', 10886),
(2010, 'C', 4000),
(2011, 'S', 5000),
(2012, 'C', 2000),
(2013, 'S', 1200),
(2014, 'S', 3500),
(2015, 'C', 5500),
(2016, 'S', 2000),
(2017, 'C', 3000),
(2018, 'S', 2000),
(2019, 'C', 2500),
(2020, 'C', 2500);

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `customer_id` int(11) NOT NULL,
  `first_name` varchar(25) NOT NULL,
  `middle_name` varchar(25) NOT NULL,
  `last_name` varchar(25) NOT NULL,
  `street` varchar(25) NOT NULL,
  `city` varchar(25) NOT NULL,
  `state` varchar(25) NOT NULL,
  `zip` varchar(10) NOT NULL,
  `phone` varchar(20) NOT NULL,
  `email` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`customer_id`, `first_name`, `middle_name`, `last_name`, `street`, `city`, `state`, `zip`, `phone`, `email`) VALUES
(1001, 'Satheesh', 'E.', 'Netherstalker', 'Ivory Passage', 'Sevilla', 'Spain', '41101', '43844108', 'satheesh@gmail.com'),
(1002, 'Kasinda', 'E.', 'Mildbane', 'Providence Avenue', 'London', 'UK', 'WX3 6FW', '(617) 555-3267', 'kasinda@gmail.com'),
(1003, 'Sharanan', 'O.', 'Goldsword', 'Marble Street', 'Berlin', 'Germany', '12209', '(171) 555-2222', 'sharanan@gmail.com'),
(1004, 'Vakshajan', 'R.', 'Dewroar', 'Centre Boulevard', 'México D.F.', 'Mexico', '5021', '(100) 555-4822', 'vakshajan@gmail.com'),
(1005, 'Armihan', 'E.', 'Bearblight', 'Commercial Street', 'México D.F.', 'Mexico', '5023', '(313) 555-5735', 'armihan@gmail.com'),
(1006, 'Shasedharan', 'N.', 'Farblight', 'Hind Way', 'London', 'UK', 'WA1 1DP', '(03) 3555-5011', 'shasedharan@gmail.com'),
(1007, 'Harsuthan', 'D.', 'Noseore', 'Vista Row', 'Luleå', 'Sweden', 'S-958 22', '(98) 598 76 54', 'harsuthan@gmail.com'),
(1008, 'Mithushanth', 'D.', 'Fuserider', 'Wellness Row', 'Mannheim', 'Germany', '68306', '(06) 431-7877', 'mithushanth@gmail.com'),
(1009, 'Adalarasen', 'P.', 'Strongkeeper', 'Blossom Avenue', 'Strasbourg', 'France', '67000', '(03) 444-2343', 'adalarasen@gmail.com'),
(1010, 'Nivedhanraj', 'D.', 'Blackbinder', 'Underwood Street', 'Madrid', 'Spain', '28023', '(161) 555-4448', 'nivedhanraj@gmail.com'),
(1011, 'Vaamanan', 'H.', 'Hallowedtree', 'Merchant Avenue', 'Marseille', 'France', '13008', '031-987 65 43', 'vaamanan@gmail.com'),
(1012, 'Nimarshan', 'Y.', 'Cliffheart', 'University Way', 'Tsawassen', 'Canada', 'T2F 8M4', '(11) 555 4640', 'nimarshan@gmail.com'),
(1013, 'Gowsiga', 'I.', 'Tarrenblossom', 'Poplar Way', 'London', 'UK', 'EC2 5NT', '(010) 9984510', 'gowsiga@gmail.com'),
(1014, 'Saimeera', 'F.', 'Covenfeather', 'Amber Boulevard', 'Buenos Aires', 'Argentina', '1010', '(069) 992755', 'saimeera@gmail.com'),
(1015, 'Nithaara', 'W.', 'Featherthorne', 'Congress Street', 'México D.F.', 'Mexico', '5022', '(04721) 8713', 'nithaara@gmail.com'),
(1016, 'Hemavarsini', 'L.', 'Cinderdrifter', 'Chapel Row', 'Bern', 'Switzerland', '3012', '(0544) 60323', 'hemavarsini@gmail.com'),
(1017, 'Barathika', 'W.', 'Bladeroot', 'Palm Street', 'São Paulo', 'Brazil', '05432-043', '(0)2-953010', 'barathika@gmail.com'),
(1018, 'Niyashana', 'A.', 'Slatehelm', 'Clearance Street', 'London', 'UK', 'WX1 6LT', '(503) 555-9931', 'niyashana@gmail.com'),
(1019, 'Sasmitha', 'L.', 'Rapidbasher', 'Duchess Street', 'Aachen', 'Germany', '52066', '08-123 45 67', 'sasmitha@gmail.com'),
(1020, 'Sample', 'Sample', 'Sample', 'Sample', 'Sample', 'Sample', 'Saple', 'Sample', 'Sample');

-- --------------------------------------------------------

--
-- Table structure for table `customer_account`
--

CREATE TABLE `customer_account` (
  `customer_id` int(11) NOT NULL,
  `account_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `customer_account`
--

INSERT INTO `customer_account` (`customer_id`, `account_id`) VALUES
(1001,2007),
(1001,2014),
(1001,2019),
(1002,2007),
(1003,2008),
(1004,2015),
(1004,2016),
(1005,2006),
(1005,2008),
(1006,2018),
(1006,2013),
(1006,2017),
(1008,2020),
(1008,2009),
(1008,2010),
(1009,2019),
(1009,2002),
(1012,2016),
(1012,2004),
(1013,2015),
(1013,2006),
(1016,2010),
(1017,2008),
(1017,2006),
(1018,2004),
(1018,2001),
(1020,2003),
(1020,2018),
(1020,2002);

-- --------------------------------------------------------

--
-- Table structure for table `transaction`
--

CREATE TABLE `transaction` (
  `transaction_id` int(11) NOT NULL,
  `account_id` int(11) NOT NULL,
  `time_stamp` date NOT NULL,
  `amount` float NOT NULL,
  `balance` float NOT NULL,
  `description` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `transaction`
--

INSERT INTO `transaction` (`transaction_id`, `account_id`, `time_stamp`, `amount`, `balance`, `description`) VALUES
(3001, 2001, '2018-05-23', 2200, 2200, 'Deposit 100'),
(3002, 2001, '2018-05-23', 200, 2000, 'Withdraw 200');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `account`
--
ALTER TABLE `account`
  ADD PRIMARY KEY (`account_id`);

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`customer_id`);

--
-- Indexes for table `customer_account`
--
ALTER TABLE `customer_account`
  ADD PRIMARY KEY (`customer_id`,`account_id`);

--
-- Indexes for table `transaction`
--
ALTER TABLE `transaction`
  ADD PRIMARY KEY (`transaction_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
