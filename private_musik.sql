-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 29 Apr 2018 pada 19.15
-- Versi Server: 10.1.30-MariaDB
-- PHP Version: 7.2.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `private_musik`
--
CREATE DATABASE IF NOT EXISTS `private_musik` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `private_musik`;

-- --------------------------------------------------------

--
-- Struktur dari tabel `alat_musik`
--

DROP TABLE IF EXISTS `alat_musik`;
CREATE TABLE `alat_musik` (
  `Id_Alat_Musik` varchar(4) NOT NULL,
  `Nama_Alat_Musik` varchar(15) NOT NULL,
  `Biaya` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `alat_musik`
--

INSERT INTO `alat_musik` VALUES('0', 'Gitar', '500000');
INSERT INTO `alat_musik` VALUES('1', 'Piano', '750000');
INSERT INTO `alat_musik` VALUES('2', 'Bass', '400000');
INSERT INTO `alat_musik` VALUES('3', 'Drum', '750000');
INSERT INTO `alat_musik` VALUES('4', 'Saxophone', '450000');
INSERT INTO `alat_musik` VALUES('5', 'Biola', '400000');

-- --------------------------------------------------------

--
-- Struktur dari tabel `jadwal`
--

DROP TABLE IF EXISTS `jadwal`;
CREATE TABLE `jadwal` (
  `Id_Jadwal` varchar(4) NOT NULL,
  `Hari` varchar(20) NOT NULL,
  `Jam` time NOT NULL,
  `Id_Pengajar` varchar(4) NOT NULL,
  `Id_Siswa` varchar(4) NOT NULL,
  `Id_Alat_Musik` varchar(4) NOT NULL,
  `Id_Ruangan` varchar(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `jadwal`
--

INSERT INTO `jadwal` VALUES('001', 'Senin', '19:00:00', 'P001', 'A001', '0', 'G001');
INSERT INTO `jadwal` VALUES('002', 'Selasa', '19:00:00', 'P002', 'A002', '1', 'K001');
INSERT INTO `jadwal` VALUES('003', 'Rabu', '19:00:00', 'P003', 'A003', '2', 'B001');
INSERT INTO `jadwal` VALUES('004', 'Kamis', '19:00:00', 'P004', 'A004', '3', 'D001');
INSERT INTO `jadwal` VALUES('005', 'Jumat', '19:00:00', 'P005', 'A005', '4', 'S001');
INSERT INTO `jadwal` VALUES('006', 'Sabtu', '19:00:00', 'P006', 'A006', '5', 'L001');
INSERT INTO `jadwal` VALUES('007', 'Kamis', '19:00:00', 'P004', 'A007', '3', 'D001');
INSERT INTO `jadwal` VALUES('008', 'Senin', '19:00:00', 'P001', 'A008', '0', 'G001');
INSERT INTO `jadwal` VALUES('009', 'Sabtu', '19:00:00', 'P006', 'A009', '5', 'L001');
INSERT INTO `jadwal` VALUES('010', 'Senin', '19:00:00', 'P001', 'A003', '0', 'G001');

-- --------------------------------------------------------

--
-- Struktur dari tabel `pengajar`
--

DROP TABLE IF EXISTS `pengajar`;
CREATE TABLE `pengajar` (
  `Id_Pengajar` varchar(4) NOT NULL,
  `Nama_Pengajar` varchar(25) NOT NULL,
  `Jenis_Kelamin` varchar(10) NOT NULL,
  `Alamat` varchar(50) NOT NULL,
  `Id_Alat_Musik` varchar(4) NOT NULL,
  `Username` varchar(25) NOT NULL,
  `Password` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `pengajar`
--

INSERT INTO `pengajar` VALUES('P001', 'Ronaldo', 'Laki-Laki', 'Tanjung Senang', '0', 'ronaldo98', 'presisi98');
INSERT INTO `pengajar` VALUES('P002', 'Ravi Prayoga', 'Laki-Laki', 'Tanjung Karang', '1', 'ravi123', 'yoga123');
INSERT INTO `pengajar` VALUES('P003', 'Yusuf Firmansyah', 'Laki-Laki', 'Korpri', '2', 'yfwp10', 'firman123');
INSERT INTO `pengajar` VALUES('P004', 'Helmud Panggabean', 'Laki-Laki', 'Way Huwi', '3', 'helmud97', 'helnoob');
INSERT INTO `pengajar` VALUES('P005', 'Oktri Saputra', 'Laki-Laki', 'Way Kandis', '4', 'oktri15', 'oktri15');
INSERT INTO `pengajar` VALUES('P006', 'Dea Annisa', 'Perempuan', 'Korpri', '5', 'deaimut96', 'deaimut96');

-- --------------------------------------------------------

--
-- Struktur dari tabel `ruangan`
--

DROP TABLE IF EXISTS `ruangan`;
CREATE TABLE `ruangan` (
  `Id_Ruangan` varchar(4) NOT NULL,
  `Nama_Ruangan` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `ruangan`
--

INSERT INTO `ruangan` VALUES('B001', 'Kelas_Bass');
INSERT INTO `ruangan` VALUES('D001', 'Kelas_Drum');
INSERT INTO `ruangan` VALUES('G001', 'Kelas_Gitar');
INSERT INTO `ruangan` VALUES('K001', 'Kelas_Piano');
INSERT INTO `ruangan` VALUES('L001', 'Kelas_Biola');
INSERT INTO `ruangan` VALUES('S001', 'Kelas_Saxophone');

-- --------------------------------------------------------

--
-- Struktur dari tabel `siswa`
--

DROP TABLE IF EXISTS `siswa`;
CREATE TABLE `siswa` (
  `Id_Siswa` varchar(4) NOT NULL,
  `Nama_Siswa` varchar(25) NOT NULL,
  `Jenis_Kelamin` varchar(10) NOT NULL,
  `Alamat` varchar(50) NOT NULL,
  `Username` varchar(25) NOT NULL,
  `Password` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `siswa`
--

INSERT INTO `siswa` VALUES('A001', 'Juli Manurung', 'Perempuan', 'Tanjung Seneng', 'juli12', 'juli12');
INSERT INTO `siswa` VALUES('A002', 'Rizki Ramadhan', 'Laki-Laki', 'Way Halim', 'rizki98', 'rizki98');
INSERT INTO `siswa` VALUES('A003', 'Daniel Bintara', 'Laki-Laki', 'Tanjung Karang', 'daniel12', 'daniel12');
INSERT INTO `siswa` VALUES('A004', 'Dias Natalia', 'Perempuan', 'Tanjung Karang', 'dias145', 'dias123');
INSERT INTO `siswa` VALUES('A005', 'Hadi Mulyono', 'Laki-Laki', 'Antasari', 'hadim', 'yono');
INSERT INTO `siswa` VALUES('A006', 'Prillia', 'Perempuan', 'Sukabumi', 'prillia', 'prilli123');
INSERT INTO `siswa` VALUES('A007', 'Marhayati', 'Perempuan', 'Tanjung Senang', 'mar1999', 'mar1999');
INSERT INTO `siswa` VALUES('A008', 'Surya Van', 'Perempuan', 'Jatimulyo', 'surya98', 'surya123');
INSERT INTO `siswa` VALUES('A009', 'Laudeweek', 'Laki-Laki', 'Way Huwi', 'laude45', 'laude45');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `alat_musik`
--
ALTER TABLE `alat_musik`
  ADD PRIMARY KEY (`Id_Alat_Musik`);

--
-- Indexes for table `jadwal`
--
ALTER TABLE `jadwal`
  ADD PRIMARY KEY (`Id_Jadwal`),
  ADD KEY `Id_Pengajar` (`Id_Pengajar`),
  ADD KEY `Id_Siswa` (`Id_Siswa`),
  ADD KEY `Id_Alat_Musik` (`Id_Alat_Musik`),
  ADD KEY `Id_Ruangan` (`Id_Ruangan`);

--
-- Indexes for table `pengajar`
--
ALTER TABLE `pengajar`
  ADD PRIMARY KEY (`Id_Pengajar`,`Username`);

--
-- Indexes for table `ruangan`
--
ALTER TABLE `ruangan`
  ADD PRIMARY KEY (`Id_Ruangan`);

--
-- Indexes for table `siswa`
--
ALTER TABLE `siswa`
  ADD PRIMARY KEY (`Id_Siswa`,`Username`);

--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `jadwal`
--
ALTER TABLE `jadwal`
  ADD CONSTRAINT `jadwal_ibfk_1` FOREIGN KEY (`Id_Pengajar`) REFERENCES `pengajar` (`Id_Pengajar`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `jadwal_ibfk_2` FOREIGN KEY (`Id_Siswa`) REFERENCES `siswa` (`Id_Siswa`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `jadwal_ibfk_3` FOREIGN KEY (`Id_Alat_Musik`) REFERENCES `alat_musik` (`Id_Alat_Musik`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `jadwal_ibfk_4` FOREIGN KEY (`Id_Ruangan`) REFERENCES `ruangan` (`Id_Ruangan`) ON DELETE CASCADE ON UPDATE CASCADE;


--
-- Metadata
--
USE `phpmyadmin`;

--
-- Metadata for table alat_musik
--

--
-- Metadata for table jadwal
--

--
-- Metadata for table pengajar
--

--
-- Metadata for table ruangan
--

--
-- Metadata for table siswa
--

--
-- Metadata for database private_musik
--
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
