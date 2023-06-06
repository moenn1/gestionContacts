-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Gegenereerd op: 06 jun 2023 om 13:29
-- Serverversie: 8.0.30
-- PHP-versie: 8.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `gestioncontact`
--

-- --------------------------------------------------------

--
-- Tabelstructuur voor tabel `contact`
--

CREATE TABLE `contact` (
  `id` bigint NOT NULL,
  `adresse` varchar(255) DEFAULT NULL,
  `email_personnel` varchar(255) DEFAULT NULL,
  `email_professionnel` varchar(255) DEFAULT NULL,
  `genre` varchar(255) DEFAULT NULL,
  `nom` varchar(255) DEFAULT NULL,
  `prenom` varchar(255) DEFAULT NULL,
  `telephone1` varchar(255) DEFAULT NULL,
  `telephone2` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Gegevens worden geëxporteerd voor tabel `contact`
--

INSERT INTO `contact` (`id`, `adresse`, `email_personnel`, `email_professionnel`, `genre`, `nom`, `prenom`, `telephone1`, `telephone2`) VALUES
(1, 'Apt. 661 128 Justin Alley, North Solomon, KS 31741-1953', 'jewel@gmail.com', 'jewel.monahan@hotmail.com', 'female', 'Monahan', 'Jewel', '(056) 861-5225', '375.531.4100 x92706'),
(2, '6908 Johnny Curve, Simonisborough, SD 44550-6776', 'evan@yahoo.com', 'evan.pfannerstill@hotmail.com', 'female', 'Pfannerstill', 'Evan', '(290) 490-0761', '567.827.2271'),
(6, 'Apt. 655 318 Ullrich Freeway, South Pattiton, WY 61381', 'cordell@hotmail.com', 'cordell.ryan@yahoo.com', 'male', 'Ryan', 'Cordell', '1-709-210-2060', '1-909-146-1099'),
(18, '64324 Florance Fall, Baumbachside, OK 88011', 'yolanda@yahoo.com', 'yolanda.lakin@yahoo.com', 'female', 'Lakin', 'Yolanda', '208-648-7902', '(872) 357-0934'),
(20, '66292 Francesco Groves, East Darrellport, NM 42248-1925', 'haywood@yahoo.com', 'haywood.hessel@yahoo.com', 'female', 'Hessel', 'Haywood', '238-256-5565', '787.691.6467'),
(21, '69609 Upton Heights, Lake Audriamouth, NV 88363-0609', 'augustine@hotmail.com', 'augustine.pacocha@yahoo.com', 'male', 'Pacocha', 'Augustine', '(098) 257-6330', '1-019-693-4050 x15383'),
(23, 'Suite 653 9267 Tanner Inlet, Port Renaldo, CA 85489', 'lyn@yahoo.com', 'lyn.nicolas@gmail.com', 'male', 'Nicolas', 'Lyn', '(912) 988-5992', '1-009-729-9757'),
(24, '143 Darby Turnpike, Nolanland, KS 77173', 'jarred@gmail.com', 'jarred.tremblay@gmail.com', 'male', 'Tremblay', 'Jarred', '017-289-4726', '1-361-629-6103 x7576'),
(25, 'Apt. 271 90256 D\'Amore Course, Ebertshire, LA 92722', 'loria@gmail.com', 'loria.batz@yahoo.com', 'female', 'Batz', 'Loria', '(001) 347-5575', '861-481-0891'),
(26, 'Apt. 294 9701 Casper Isle, West Yong, NM 31863-3437', 'deandra@gmail.com', 'deandra.o\'keefe@yahoo.com', 'male', 'O\'Keefe', 'Deandra', '380.855.0291', '084.328.0986'),
(27, 'Suite 899 00439 Flatley Viaduct, Waltermouth, IN 77499-9319', 'desmond@yahoo.com', 'desmond.kling@gmail.com', 'female', 'Kling', 'Desmond', '487.859.9289', '920.786.7265 x8867'),
(28, '9390 Gus Spring, Vanesatown, SD 83947-6820', 'allena@gmail.com', 'allena.herman@hotmail.com', 'male', 'Herman', 'Allena', '452.494.5379', '1-908-301-3783 x387'),
(29, '011 McDermott Shores, Nikkifort, NV 86770-4626', 'cary@hotmail.com', 'cary.cassin@gmail.com', 'male', 'Cassin', 'Cary', '(923) 931-6654', '(407) 617-2130 x72632'),
(30, 'Apt. 062 265 Gabriel Canyon, Myeshashire, IA 59407-2631', 'cody@yahoo.com', 'cody.hamill@yahoo.com', 'male', 'Hamill', 'Cody', '(414) 057-3131', '(902) 062-1691 x1293'),
(31, 'Suite 642 62004 Wolf Parks, Youngmouth, RI 98700', 'aldo@gmail.com', 'aldo.schuppe@gmail.com', 'female', 'Schuppe', 'Aldo', '955-108-4632', '(978) 132-7415 x543'),
(32, 'Suite 298 19468 Laticia Lane, Hackettland, AZ 00558', 'randall@hotmail.com', 'randall.krajcik@hotmail.com', 'female', 'Krajcik', 'Randall', '104-697-3840', '117-791-6590'),
(33, '10768 Tomasa Views, Donnellyview, WY 17068-3327', 'wm@gmail.com', 'wm.gorczany@gmail.com', 'male', 'Gorczany', 'Wm', '779.128.9663', '(352) 374-5428 x079'),
(34, 'Suite 492 081 Hilll Station, South Ceola, MT 41644', 'shakira@hotmail.com', 'shakira.becker@yahoo.com', 'female', 'Becker', 'Shakira', '(890) 636-6556', '666-195-4330'),
(35, '836 Prosacco Shore, Zboncakfurt, NV 34481', 'hildred@yahoo.com', 'hildred.kemmer@gmail.com', 'female', 'Kemmer', 'Hildred', '435-827-9248', '531-989-2618'),
(36, 'Apt. 853 138 Jimmie Drive, Lake Isaacberg, IA 52130-1513', 'coralie@hotmail.com', 'coralie.kerluke@gmail.com', 'female', 'Kerluke', 'Coralie', '1-127-317-7085', '332-083-7535 x798'),
(37, 'Suite 325 86244 Reynaldo Loop, South Joy, NH 55514', 'andrew@yahoo.com', 'andrew.beier@gmail.com', 'female', 'Beier', 'Andrew', '(946) 967-4117', '741.046.2391'),
(38, 'Apt. 312 88776 Wiegand Divide, New Mapleshire, MA 74421', 'ellsworth@hotmail.com', 'ellsworth.krajcik@yahoo.com', 'female', 'Krajcik', 'Ellsworth', '403.498.5885', '1-501-050-4682 x0849'),
(39, '320 Dwain Hollow, New See, MT 58794', 'ambrose@gmail.com', 'ambrose.kshlerin@yahoo.com', 'female', 'Kshlerin', 'Ambrose', '763.416.4349', '259-250-5220 x3751'),
(41, 'Apt. 344 28195 Jessie Meadow, West Isidro, MD 67021-5846', 'adam@yahoo.com', 'adam.feil@hotmail.com', 'male', 'Feil', 'Adam', '781-896-5930', '1-520-889-9593'),
(42, 'Suite 565 65383 O\'Reilly Brooks, Daughertystad, UT 02993', 'rusty@hotmail.com', 'rusty.vonrueden@yahoo.com', 'male', 'VonRueden', 'Rusty', '111-301-7114', '202.312.3799'),
(43, '69279 Keneth Plain, North Julimouth, MI 70367-5435', 'adam@yahoo.com', 'adam.hackett@hotmail.com', 'female', 'Hackett', 'Adam', '484-521-8321', '1-565-981-8057 x51083'),
(44, '19763 Conroy Points, Lake Jamieton, LA 57326', 'sang@hotmail.com', 'sang.berge@hotmail.com', 'female', 'Berge', 'Sang', '(752) 380-8140', '084-219-6132 x238'),
(45, '54968 Rene Flat, Charlsieton, AK 42307', 'miyoko@gmail.com', 'miyoko.hansen@hotmail.com', 'male', 'Hansen', 'Miyoko', '015.539.8326', '(132) 049-7765 x064'),
(46, '4145 Lang Vista, East Collene, WV 08049-4940', 'royce@gmail.com', 'royce.walter@yahoo.com', 'male', 'Walter', 'Royce', '1-202-065-2184', '595.637.9258 x09225'),
(47, 'Apt. 545 544 Allan Unions, Kaifurt, WI 70046', 'jeramy@hotmail.com', 'jeramy.blanda@gmail.com', 'female', 'Blanda', 'Jeramy', '(641) 290-3990', '1-386-805-6226 x344'),
(48, '91076 Krajcik Crest, Corrinebury, GA 66062-0416', 'maybelle@gmail.com', 'maybelle.tillman@gmail.com', 'male', 'Tillman', 'Maybelle', '555-356-6997', '1-853-273-7562 x773'),
(49, 'Apt. 725 96887 Garfield Plain, Candiemouth, WV 26996', 'abe@yahoo.com', 'abe.mosciski@gmail.com', 'male', 'Mosciski', 'Abe', '709-154-1571', '(196) 330-5258 x07771'),
(50, '9051 Carson Oval, North Santos, DE 11987-8295', 'stuart@hotmail.com', 'stuart.durgan@gmail.com', 'male', 'Durgan', 'Stuart', '1-097-655-8496', '1-808-741-5234'),
(51, 'Apt. 929 9901 Ferry Estate, Kuvalisville, MN 28457-0380', 'violette@gmail.com', 'violette.grant@hotmail.com', 'female', 'Grant', 'Violette', '280-300-5376', '(030) 135-5115 x897'),
(52, 'Suite 326 10571 Humberto Lock, Port Nolafurt, OR 71380-8196', 'theron@hotmail.com', 'theron.kling@hotmail.com', 'female', 'Kling', 'Theron', '(875) 859-8839', '692.837.0273'),
(53, 'Apt. 392 85940 Baumbach Fall, Josiahshire, NE 85278-7623', 'willodean@gmail.com', 'willodean.pagac@yahoo.com', 'male', 'Pagac', 'Willodean', '937.150.3160', '905.254.3839 x89932'),
(54, '18091 Sammie Prairie, Claudiomouth, UT 08131', 'britney@yahoo.com', 'britney.baumbach@hotmail.com', 'female', 'Baumbach', 'Britney', '1-547-141-9995', '214.409.8549 x520'),
(55, '04556 Fletcher Meadow, West Odelia, MT 98489', 'eloy@gmail.com', 'eloy.johnson@yahoo.com', 'female', 'Johnson', 'Eloy', '017-969-4923', '970-810-7321 x5463'),
(56, '8668 Patrick Mount, Kreigerburgh, NM 30385-7576', 'dwayne@yahoo.com', 'dwayne.witting@gmail.com', 'female', 'Witting', 'Dwayne', '731-009-2303', '1-373-758-0770'),
(57, 'Suite 345 649 Goldner Walks, Hicklemouth, NJ 10931', 'rosie@hotmail.com', 'rosie.zemlak@gmail.com', 'male', 'Zemlak', 'Rosie', '771.514.4365', '(379) 048-1885 x471'),
(58, 'Apt. 131 1321 Keitha Shoal, Barberastad, NH 47212-8853', 'jorge@yahoo.com', 'jorge.carter@hotmail.com', 'male', 'Carter', 'Jorge', '825.601.6620', '116-408-8382'),
(59, 'Apt. 707 6039 Joesph Plain, South Colbyville, NV 07055', 'shirl@yahoo.com', 'shirl.schaden@hotmail.com', 'female', 'Schaden', 'Shirl', '1-377-891-1390', '103-302-5552'),
(60, '6997 Fred Island, Gleichnermouth, NH 45395-4541', 'edwin@hotmail.com', 'edwin.donnelly@hotmail.com', 'male', 'Donnelly', 'Edwin', '839-939-5893', '841-674-9583 x87098'),
(61, '19655 Wisoky Mount, Lake Franklyn, NE 24042', 'ryan@hotmail.com', 'ryan.hills@gmail.com', 'male', 'Hills', 'Ryan', '1-968-547-9108', '(366) 929-3728'),
(62, '0074 Bartell River, East Zenobia, SD 37382-2374', 'raeann@gmail.com', 'raeann.white@hotmail.com', 'female', 'White', 'Raeann', '1-369-613-6348', '321-140-0523 x773'),
(63, 'Apt. 624 55005 Johnie Inlet, Yokoside, NV 06749', 'connie@yahoo.com', 'connie.keebler@gmail.com', 'male', 'Keebler', 'Connie', '(089) 263-7222', '603-544-3916 x958'),
(64, 'Suite 143 7708 Summer Squares, Rutherfordmouth, KY 84057', 'vallie@gmail.com', 'vallie.ebert@gmail.com', 'male', 'Ebert', 'Vallie', '(160) 313-9564', '(480) 464-5595'),
(65, '6449 Rita Brook, Wittingfort, IL 51731', 'cornelius@hotmail.com', 'cornelius.batz@yahoo.com', 'female', 'Batz', 'Cornelius', '043.144.0632', '412-434-2552'),
(66, '98482 Paucek Crossing, South Francesstad, AR 83013', 'orville@gmail.com', 'orville.prosacco@hotmail.com', 'female', 'Prosacco', 'Orville', '(960) 499-0796', '1-049-555-6345 x45318'),
(67, '1077 Larson Parkways, New Derrick, ND 65107', 'isidro@hotmail.com', 'isidro.okuneva@gmail.com', 'male', 'Okuneva', 'Isidro', '835.853.5165', '220-951-8256 x511'),
(68, '7085 Chandra Expressway, Lake Arlenstad, SC 86610-8154', 'lavonne@yahoo.com', 'lavonne.braun@yahoo.com', 'male', 'Braun', 'Lavonne', '1-801-770-0948', '297-740-4130 x4237'),
(69, 'Apt. 677 7759 Sheba Way, New Billieview, AR 49323', 'maxwell@gmail.com', 'maxwell.nicolas@yahoo.com', 'female', 'Nicolas', 'Maxwell', '(090) 237-1441', '(211) 190-8584 x0045'),
(70, '21212 Celeste Ramp, North Quinn, NE 57789-1329', 'noe@hotmail.com', 'noe.wehner@hotmail.com', 'female', 'Wehner', 'Noe', '(793) 614-5896', '(059) 648-3223'),
(71, 'Apt. 016 7602 Rogahn Ports, O\'Reillystad, SC 36811', 'benita@hotmail.com', 'benita.howe@gmail.com', 'male', 'Howe', 'Benita', '(375) 421-9489', '232.508.1244 x9791'),
(72, '770 Waters Greens, Marquardtton, LA 04394-6405', 'brad@yahoo.com', 'brad.spencer@yahoo.com', 'female', 'Spencer', 'Brad', '602.695.2077', '742.092.8391'),
(73, 'Apt. 065 8062 Hagenes Oval, South Shakira, TX 41609', 'azucena@yahoo.com', 'azucena.labadie@gmail.com', 'male', 'Labadie', 'Azucena', '119-419-9934', '944.758.7899 x2037'),
(74, '4338 Prohaska Bypass, Yettaville, NY 58737', 'sally@hotmail.com', 'sally.gleason@hotmail.com', 'male', 'Gleason', 'Sally', '(488) 108-4514', '1-961-094-8247'),
(75, '251 Monahan Mount, Lake Marline, CA 38509-2421', 'freeman@gmail.com', 'freeman.windler@yahoo.com', 'female', 'Windler', 'Freeman', '1-886-233-8090', '009.093.7860'),
(76, '607 Wisoky Land, Santiagoview, MS 33928-5232', 'kermit@gmail.com', 'kermit.mayert@yahoo.com', 'female', 'Mayert', 'Kermit', '1-916-326-2788', '413-530-7855 x683'),
(77, '2774 Stanton Prairie, New Ligia, ME 15703-1676', 'beverly@yahoo.com', 'beverly.reichel@gmail.com', 'female', 'Reichel', 'Beverly', '1-635-287-0991', '1-460-961-8564 x154'),
(78, '31705 Emerson Expressway, Prosaccoborough, LA 98283', 'jamel@yahoo.com', 'jamel.kilback@gmail.com', 'male', 'Kilback', 'Jamel', '411-585-5722', '(878) 742-4404 x490'),
(79, '722 Cameron Lock, Port Takakotown, LA 00446', 'lupe@yahoo.com', 'lupe.witting@yahoo.com', 'male', 'Witting', 'Lupe', '290.230.6239', '1-057-999-4611'),
(80, 'Suite 531 7642 Kenneth Mountain, West Jonathan, UT 96103-9214', 'millard@yahoo.com', 'millard.kutch@hotmail.com', 'female', 'Kutch', 'Millard', '948.898.4804', '1-938-263-9265'),
(81, 'Suite 494 07206 Weimann Pines, Erdmanburgh, VA 07641', 'barton@hotmail.com', 'barton.crooks@yahoo.com', 'male', 'Crooks', 'Barton', '077-168-9776', '892-050-6478'),
(82, '166 Asia Mills, Port Odeliatown, MT 80587', 'danny@yahoo.com', 'danny.boyle@gmail.com', 'female', 'Boyle', 'Danny', '749-689-1685', '1-788-178-9824 x61110'),
(83, 'Suite 981 4164 Bernhard Walk, South Benedictstad, SD 76256', 'rupert@hotmail.com', 'rupert.schinner@yahoo.com', 'male', 'Schinner', 'Rupert', '(552) 410-3405', '(513) 257-8261 x17333'),
(84, '7969 Lizzie Locks, Koeppview, FL 29902-0640', 'jeremiah@gmail.com', 'jeremiah.dare@hotmail.com', 'female', 'Dare', 'Jeremiah', '501.278.6153', '1-007-621-2022 x699'),
(85, '447 Treutel Fort, South Randal, VA 00470', 'lucio@gmail.com', 'lucio.flatley@gmail.com', 'female', 'Flatley', 'Lucio', '500-780-0930', '(164) 135-7781 x311'),
(86, 'Suite 379 212 Glover Mall, Rethaborough, ME 74385-4381', 'mei@hotmail.com', 'mei.lehner@gmail.com', 'male', 'Lehner', 'Mei', '990-424-1646', '1-984-750-2330 x2915'),
(87, '18568 Allene Way, Hudsonshire, KS 25824', 'hong@gmail.com', 'hong.runolfsdottir@gmail.com', 'male', 'Runolfsdottir', 'Hong', '234.628.0373', '983-566-1327 x5560'),
(88, 'Apt. 195 0021 Fritsch Port, North Rhiannonhaven, OK 87946-8165', 'joseph@yahoo.com', 'joseph.shanahan@hotmail.com', 'female', 'Shanahan', 'Joseph', '890-352-9714', '1-836-589-7237 x684'),
(89, 'Suite 221 44278 Marvin Valley, Monahanside, NY 18294-7540', 'miles@hotmail.com', 'miles.morissette@hotmail.com', 'male', 'Morissette', 'Miles', '200-906-3000', '1-088-303-0876 x356'),
(90, '90415 Logan Ferry, Marcotown, UT 28361-0084', 'santa@hotmail.com', 'santa.hoppe@hotmail.com', 'male', 'Hoppe', 'Santa', '498.713.3247', '499-121-2233 x65098'),
(91, 'Apt. 993 58020 Aubrey Villages, Carterhaven, TX 55576-4643', 'rodger@gmail.com', 'rodger.roberts@gmail.com', 'male', 'Roberts', 'Rodger', '978-733-7741', '1-714-350-0973 x25910'),
(92, '805 Gaylord Meadows, West Linoville, AK 95142', 'ezequiel@gmail.com', 'ezequiel.glover@gmail.com', 'female', 'Glover', 'Ezequiel', '622-506-8938', '685-064-2748 x02425'),
(93, '86210 Alexis Ridge, West Felicatown, OR 29419-3800', 'marcel@gmail.com', 'marcel.hayes@gmail.com', 'male', 'Hayes', 'Marcel', '206-070-1483', '820-962-3640 x405'),
(94, '25842 Kirk Knoll, Yongville, MS 05173', 'leonel@hotmail.com', 'leonel.bailey@gmail.com', 'female', 'Bailey', 'Leonel', '538-899-4651', '517-076-9263 x25249'),
(95, '62511 Cremin Spur, Russshire, MS 66852-0838', 'bettye@hotmail.com', 'bettye.quitzon@yahoo.com', 'male', 'Quitzon', 'Bettye', '635-152-6678', '088-218-5948 x9333'),
(96, 'Suite 793 9403 Watsica Motorway, Schneiderfort, MS 04097', 'tuan@gmail.com', 'tuan.bradtke@hotmail.com', 'female', 'Bradtke', 'Tuan', '586.403.3903', '783.129.5975'),
(97, 'Apt. 833 1843 Klein Crossroad, Calebport, ND 62621', 'wendi@hotmail.com', 'wendi.crooks@gmail.com', 'male', 'Crooks', 'Wendi', '470-405-5790', '1-977-968-2121'),
(98, 'Suite 930 0356 Pfannerstill Way, Randellfort, RI 30715-7483', 'riley@gmail.com', 'riley.spinka@yahoo.com', 'male', 'Spinka', 'Riley', '764.562.2608', '1-651-441-5797'),
(107, 'STREET', 'med@mail.com', 'med@mail.be', 'male', 'Ennassibi', 'mohamed', '3457753', '8934759'),
(108, 'STREET', 'badr@mail.com', 'badr@mail.com', 'male', 'Taktour', 'Badr', '3495843798', '9834593875');

-- --------------------------------------------------------

--
-- Tabelstructuur voor tabel `contact_group`
--

CREATE TABLE `contact_group` (
  `contact_id` bigint NOT NULL,
  `group_id` bigint NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Gegevens worden geëxporteerd voor tabel `contact_group`
--

INSERT INTO `contact_group` (`contact_id`, `group_id`) VALUES
(6, 1),
(20, 1),
(25, 1),
(27, 1),
(28, 1),
(30, 1),
(32, 1),
(39, 1),
(46, 1),
(47, 1),
(48, 1),
(61, 1),
(62, 1),
(64, 1),
(65, 1),
(68, 1),
(70, 1),
(71, 1),
(80, 1),
(81, 1),
(84, 1),
(85, 1),
(88, 1),
(91, 1),
(92, 1),
(94, 1),
(2, 2),
(18, 2),
(21, 2),
(23, 2),
(26, 2),
(29, 2),
(33, 2),
(35, 2),
(36, 2),
(37, 2),
(38, 2),
(42, 2),
(43, 2),
(45, 2),
(49, 2),
(50, 2),
(53, 2),
(55, 2),
(56, 2),
(57, 2),
(58, 2),
(60, 2),
(63, 2),
(66, 2),
(69, 2),
(72, 2),
(74, 2),
(75, 2),
(76, 2),
(77, 2),
(78, 2),
(79, 2),
(82, 2),
(86, 2),
(87, 2),
(89, 2),
(90, 2),
(93, 2),
(95, 2),
(96, 2),
(97, 2),
(98, 2),
(1, 3),
(31, 3),
(34, 3),
(41, 3),
(44, 3),
(51, 3),
(52, 3),
(54, 3),
(59, 3),
(67, 3),
(73, 3),
(83, 3);

-- --------------------------------------------------------

--
-- Tabelstructuur voor tabel `group_table`
--

CREATE TABLE `group_table` (
  `id` bigint NOT NULL,
  `name` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Gegevens worden geëxporteerd voor tabel `group_table`
--

INSERT INTO `group_table` (`id`, `name`) VALUES
(1, 'Family'),
(2, 'Friends'),
(3, 'Work');

--
-- Indexen voor geëxporteerde tabellen
--

--
-- Indexen voor tabel `contact`
--
ALTER TABLE `contact`
  ADD PRIMARY KEY (`id`);

--
-- Indexen voor tabel `contact_group`
--
ALTER TABLE `contact_group`
  ADD PRIMARY KEY (`contact_id`,`group_id`),
  ADD KEY `FK5hlctfq3dryid2h5unb9hn81c` (`group_id`);

--
-- Indexen voor tabel `group_table`
--
ALTER TABLE `group_table`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `name` (`name`);

--
-- AUTO_INCREMENT voor geëxporteerde tabellen
--

--
-- AUTO_INCREMENT voor een tabel `contact`
--
ALTER TABLE `contact`
  MODIFY `id` bigint NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=109;

--
-- AUTO_INCREMENT voor een tabel `group_table`
--
ALTER TABLE `group_table`
  MODIFY `id` bigint NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- Beperkingen voor geëxporteerde tabellen
--

--
-- Beperkingen voor tabel `contact_group`
--
ALTER TABLE `contact_group`
  ADD CONSTRAINT `FK5hlctfq3dryid2h5unb9hn81c` FOREIGN KEY (`group_id`) REFERENCES `group_table` (`id`),
  ADD CONSTRAINT `FKmd9fhbx9w8uvkf44yqmxo3eav` FOREIGN KEY (`contact_id`) REFERENCES `contact` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
