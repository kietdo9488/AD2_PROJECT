-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1:3306
-- Thời gian đã tạo: Th5 21, 2023 lúc 12:38 PM
-- Phiên bản máy phục vụ: 5.7.40
-- Phiên bản PHP: 8.0.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `ad2_db`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `category`
--

DROP TABLE IF EXISTS `category`;
CREATE TABLE IF NOT EXISTS `category` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `category_name` varchar(255) NOT NULL,
  `category_image` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

--
-- Đang đổ dữ liệu cho bảng `category`
--

INSERT INTO `category` (`id`, `category_name`, `category_image`) VALUES
(1, 'Gia dụng', 'https://cdn.tgdd.vn/2021/11/CookDish/cac-loai-do-gia-dung-hien-dai-cho-can-bep-nha-ban-them-tien-avt-1200x676.jpg'),
(2, 'Điện tử', 'https://phucgia.com.vn/wp-content/uploads/2018/05/Hop_Quy_Nhanh_QCVN-04-PGU.jpg');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `product`
--

DROP TABLE IF EXISTS `product`;
CREATE TABLE IF NOT EXISTS `product` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `product_name` varchar(255) NOT NULL,
  `product_description` varchar(255) NOT NULL,
  `product_price` int(11) NOT NULL,
  `product_image` varchar(255) NOT NULL,
  `category_id` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

--
-- Đang đổ dữ liệu cho bảng `product`
--

INSERT INTO `product` (`id`, `product_name`, `product_description`, `product_price`, `product_image`, `category_id`) VALUES
(1, 'Chổi lau nhà', 'Thùng chứa bằng nhựa PP cao cấp, chịu đựng va đập tốt, độ bền cao theo thời gian. Có tích hợp quai cầm tiện lợi để di chuyển mọi nơi\r\nBông lau bằng Microfiber', 9692000, 'https://lzd-img-global.slatic.net/g/p/844cdcf4176cd2460861a9a65e4c11d8.jpg_200x200q80.jpg_.webp', 1),
(2, 'Máy Ép Chậm Ferroli FSJ-150M', 'Ferroli FSJ-150M là dòng máy ép chậm của thương hiệu Ferroli đến từ Ý. Sản phẩm được làm từ các chất liệu có độ bền cao, an toàn cho sức khỏe người sử dụng.', 1099000, 'https://cdn11.dienmaycholon.vn/filewebdmclnew/DMCL21/Picture//Apro/Apro_product_32227/may-ep-cham-fer_main_563_1020.png.webp', 2),
(3, 'Bàn ủi Comet CM1126 1000W\r\n', 'Với công suất 1000W, bàn ủi khô Comet CM1126 có thể làm phẳng dễ dàng các nếp nhăn khó ủi thường gặp. Sản phẩm có kiểu dáng đẹp, hiện đại, từ cách phối màu sắc đến cách bố trí những nút điều khiển, tất cả toát lên vẻ hiện đại.', 135000, 'https://cdn11.dienmaycholon.vn/filewebdmclnew/DMCL21/Picture//Apro/Apro_product_25836/ban-ui-kho-cm11_main_523_1020.png.webp', 2);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
