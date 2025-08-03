CREATE DATABASE java5_assignment CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;

-- Chạy chương trình

-- USE DATABASE
USE java5_assignment;

SELECT * FROM java5_assignment.categories;
-- INSERT CATEGORIES (10 loại)
INSERT INTO categories (name) VALUES
('Điện thoại'),
('Laptop'),
('Máy ảnh'),
('Đồng hồ'),
('Tivi'),
('Đồ gia dụng'),
('Thời trang nam'),
('Thời trang nữ'),
('Thể thao'),
('Đồ chơi');

SELECT * FROM java5_assignment.accounts;
-- INSERT ACCOUNTS (5 user + 1 admin)
INSERT INTO accounts (username, password, fullname, email, activated, admin) VALUES
('user1', '123456', 'Nguyễn Văn A', 'user1@example.com', true, false),
('user2', '123456', 'Trần Thị B', 'user2@example.com', true, false),
('user3', '123456', 'Lê Văn C', 'user3@example.com', true, false),
('user4', '123456', 'Phạm Thị D', 'user4@example.com', true, false),
('user5', '123456', 'Hoàng Văn E', 'user5@example.com', true, false),
('admin', 'admin123', 'Admin Root', 'admin@example.com', true, true);

SELECT * FROM java5_assignment.products;
-- INSERT PRODUCTS (200 sản phẩm)
-- Mỗi loại 20 sản phẩm

SELECT * FROM java5_assignment.products
ORDER BY category_id=1;
-- 20 sản phẩm thuộc category_id = 1 (Điện thoại)
INSERT INTO products (name, image, price, available, category_id) VALUES
('iPhone 13', 'iphone13.jpg', 19000000, true, 1),
('iPhone 14', 'iphone14.jpg', 21000000, true, 1),
('Samsung S22', 's22.jpg', 18000000, true, 1),
('Samsung S23', 's23.jpg', 23000000, true, 1),
('Xiaomi Mi 11', 'mi11.jpg', 12000000, true, 1),
('Oppo F11', 'oppo.jpg', 8000000, true, 1),
('Realme C55', 'realme.jpg', 7000000, true, 1),
('iPhone 12 Mini', 'mini12.jpg', 16000000, true, 1),
('Vivo V27', 'vivo.jpg', 9000000, true, 1),
('Asus ROG', 'rog.jpg', 25000000, true, 1),
('Nokia G11', 'nokia.jpg', 5000000, true, 1),
('Pixel 7', 'pixel7.jpg', 17000000, true, 1),
('iPhone XR', 'iphonexr.jpg', 10000000, true, 1),
('iPhone 11', 'iphone11.jpg', 14000000, true, 1),
('Samsung Note 20', 'note20.jpg', 20000000, true, 1),
('iPhone SE', 'iphonese.jpg', 9000000, true, 1),
('Redmi Note 10', 'note10.jpg', 6000000, true, 1),
('Vsmart Joy 4', 'joy4.jpg', 4000000, true, 1),
('Poco X3', 'poco.jpg', 8000000, true, 1),
('Nubia Red Magic', 'nubia.jpg', 18000000, true, 1);

SELECT * FROM java5_assignment.products
ORDER BY category_id=2;
-- 20 sản phẩm thuộc category_id = 2 (Laptop)
INSERT INTO products (name, image, price, available, category_id) VALUES
('MacBook Air M1', 'macbook_air.jpg', 21000000, true, 2),
('MacBook Pro M2', 'macbook_pro.jpg', 32000000, true, 2),
('Dell XPS 13', 'dell_xps.jpg', 28000000, true, 2),
('HP Spectre x360', 'hp_spectre.jpg', 27000000, true, 2),
('Asus ZenBook 14', 'zenbook.jpg', 20000000, true, 2),
('Acer Swift 3', 'acer_swift.jpg', 15000000, true, 2),
('Lenovo ThinkPad X1', 'thinkpad.jpg', 30000000, true, 2),
('MSI Prestige 14', 'msi_prestige.jpg', 25000000, true, 2),
('Gigabyte Aero 15', 'aero.jpg', 29000000, true, 2),
('Huawei MateBook D15', 'matebook.jpg', 16000000, true, 2),
('LG Gram 16', 'lg_gram.jpg', 31000000, true, 2),
('Razer Blade Stealth', 'razer.jpg', 35000000, true, 2),
('Samsung Galaxy Book', 'samsung_book.jpg', 18000000, true, 2),
('Microsoft Surface Laptop 5', 'surface.jpg', 34000000, true, 2),
('Asus TUF Gaming F15', 'tuf.jpg', 22000000, true, 2),
('HP Envy 13', 'hp_envy.jpg', 19000000, true, 2),
('Acer Aspire 7', 'aspire7.jpg', 14000000, true, 2),
('Lenovo IdeaPad 5', 'ideapad.jpg', 13000000, true, 2),
('MSI GF63', 'msi_gf63.jpg', 17000000, true, 2),
('Asus Vivobook', 'vivobook.jpg', 12000000, true, 2);

SELECT * FROM java5_assignment.products
ORDER BY category_id=3;
-- 20 sản phẩm thuộc category_id = 3 (Máy ảnh)
INSERT INTO products (name, image, price, available, category_id) VALUES
('Canon EOS R', 'canon.jpg', 19500000, true, 3),
('Sony Alpha ZV-E10', 'sony.jpg', 18500000, true, 3),
('Nikon D3500', 'nikon.jpg', 14500000, true, 3),
('Canon PowerShot G7X', 'canon.jpg', 13500000, true, 3),
('Fujifilm X100V', 'fujifilm.jpg', 22500000, true, 3),
('Sony A6400', 'sony.jpg', 16500000, true, 3),
('Nikon Z50', 'nikon.jpg', 20000000, true, 3),
('Canon M50 Mark II', 'canon.jpg', 17000000, true, 3),
('Olympus OM-D E-M10', 'olympus.jpg', 15500000, true, 3),
('Panasonic Lumix G7', 'panasonic.jpg', 14500000, true, 3),
('G-Shock GA-2100', 'gshock.jpg', 3000000, true, 4),
('Casio MTP-V002', 'casio.jpg', 500000, true, 4),
('Apple Watch SE', 'applewatch.jpg', 7000000, true, 4),
('Samsung Galaxy Watch 5', 'applewatch.jpg', 8000000, true, 4),
('Fossil Gen 6', 'casio.jpg', 6500000, true, 4),
('Garmin Forerunner 55', 'gshock.jpg', 5500000, true, 4),
('Tissot PRX', 'casio.jpg', 9500000, true, 4),
('Citizen Eco-Drive', 'casio.jpg', 5000000, true, 4),
('Xiaomi Mi Watch', 'gshock.jpg', 2500000, true, 4),
('Huawei Watch GT', 'casio.jpg', 4200000, true, 4);

SELECT * FROM java5_assignment.products
ORDER BY category_id=4;
-- 20 sản phẩm thuộc category_id = 4 (Đồng hồ)
INSERT INTO products (name, image, price, available, category_id) VALUES
('G-Shock GA-2100', 'gshock_ga2100.jpg', 3200000, true, 4),
('Casio MTP-V002', 'casio_mtpv002.jpg', 600000, true, 4),
('Apple Watch SE 2', 'applewatch_se2.jpg', 7800000, true, 4),
('Samsung Galaxy Watch 5', 'samsung_watch5.jpg', 8500000, true, 4),
('Garmin Forerunner 55', 'garmin_55.jpg', 5600000, true, 4),
('Fossil Gen 6', 'fossil_gen6.jpg', 6200000, true, 4),
('Tissot PRX Powermatic', 'tissot_prx.jpg', 9800000, true, 4),
('Citizen Eco-Drive BM8180', 'citizen_bm8180.jpg', 5200000, true, 4),
('Seiko 5 SNK809', 'seiko_5.jpg', 4500000, true, 4),
('Orient Bambino', 'orient_bambino.jpg', 4700000, true, 4),
('Xiaomi Mi Watch', 'xiaomi_watch.jpg', 2300000, true, 4),
('Huawei Watch GT 3', 'huawei_gt3.jpg', 4900000, true, 4),
('Amazfit GTR 3', 'amazfit_gtr3.jpg', 3400000, true, 4),
('Skagen Falster Gen 6', 'skagen_gen6.jpg', 6100000, true, 4),
('Daniel Wellington Iconic', 'dw_iconic.jpg', 3100000, true, 4),
('Michael Kors Lexington', 'mk_lexington.jpg', 7200000, true, 4),
('Rolex Submariner', 'rolex_sub.jpg', 250000000, true, 4),
('Omega Seamaster', 'omega_seamaster.jpg', 120000000, true, 4),
('Longines HydroConquest', 'longines_hydro.jpg', 23000000, true, 4),
('Hublot Classic Fusion', 'hublot_fusion.jpg', 180000000, true, 4);

SELECT * FROM java5_assignment.products
ORDER BY category_id=5;
-- 20 sản phẩm thuộc category_id = 5 (Tivi)
INSERT INTO products (name, image, price, available, category_id) VALUES
('Samsung Smart TV 43 inch 4K', 'samsung_43.jpg', 7500000, true, 5),
('LG OLED TV 55 inch', 'lg_oled_55.jpg', 21500000, true, 5),
('Sony Bravia 50 inch', 'sony_bravia_50.jpg', 17900000, true, 5),
('TCL Android TV 40 inch', 'tcl_40.jpg', 6200000, true, 5),
('Panasonic TV 32 inch', 'panasonic_32.jpg', 4500000, true, 5),
('Sharp Aquos 42 inch', 'sharp_42.jpg', 6700000, true, 5),
('Asanzo 32 inch TV', 'asanzo_32.jpg', 3500000, true, 5),
('Casper 43 inch Smart TV', 'casper_43.jpg', 5990000, true, 5),
('Samsung Neo QLED 65 inch', 'samsung_qled.jpg', 39900000, true, 5),
('LG NanoCell 50 inch', 'lg_nanocell_50.jpg', 18500000, true, 5),
('Sony 4K TV 55 inch', 'sony_4k_55.jpg', 22000000, true, 5),
('TCL 65 inch Google TV', 'tcl_65.jpg', 16000000, true, 5),
('Vsmart 43 inch TV', 'vsmart_43.jpg', 5200000, true, 5),
('Skyworth 50 inch', 'skyworth_50.jpg', 7400000, true, 5),
('Xiaomi Mi TV P1 43 inch', 'xiaomi_p1.jpg', 6200000, true, 5),
('Samsung Frame TV 55 inch', 'samsung_frame.jpg', 27000000, true, 5),
('LG QNED MiniLED 65 inch', 'lg_qned.jpg', 38000000, true, 5),
('Sony XR OLED 65 inch', 'sony_oled.jpg', 45000000, true, 5),
('Toshiba Smart TV 43 inch', 'toshiba_43.jpg', 6900000, true, 5),
('Hitachi 32 inch', 'hitachi_32.jpg', 3300000, true, 5);

SELECT * FROM java5_assignment.products
ORDER BY category_id=6;
-- 20 sản phẩm thuộc category_id = 6 (Đồ gia dụng)
INSERT INTO products (name, image, price, available, category_id) VALUES
('Máy hút bụi Electrolux Z1231', 'electrolux_z1231.jpg', 1800000, true, 6),
('Máy lọc không khí Xiaomi 4 Pro', 'xiaomi_air.jpg', 4000000, true, 6),
('Bình đun siêu tốc Philips HD9306', 'philips_hd9306.jpg', 590000, true, 6),
('Máy xay sinh tố Panasonic MX-V310', 'panasonic_mxv310.jpg', 1250000, true, 6),
('Quạt đứng Mitsubishi LV16', 'mitsubishi_lv16.jpg', 1350000, true, 6),
('Máy giặt LG Inverter 9kg', 'lg_washer.jpg', 7800000, true, 6),
('Lò vi sóng Sharp R-G272VN', 'sharp_microwave.jpg', 1850000, true, 6),
('Bếp hồng ngoại Sunhouse SHD6017', 'sunhouse_shd6017.jpg', 890000, true, 6),
('Máy hút mùi Electrolux EFT6510X', 'electrolux_hood.jpg', 2250000, true, 6),
('Máy sấy tóc Panasonic EH-ND11', 'panasonic_hair.jpg', 350000, true, 6),
('Nồi chiên không dầu Lock&Lock EJF351', 'lock_airfryer.jpg', 1900000, true, 6),
('Máy ép chậm Kuvings EVO820', 'kuvings_evo820.jpg', 6200000, true, 6),
('Bàn ủi hơi nước Philips GC5039', 'philips_gc5039.jpg', 2900000, true, 6),
('Máy rửa chén Bosch SMS46MI05E', 'bosch_dishwasher.jpg', 15500000, true, 6),
('Tủ lạnh Toshiba Inverter 226L', 'toshiba_fridge.jpg', 7200000, true, 6),
('Máy pha cà phê Tiross TS621', 'tiross_ts621.jpg', 1450000, true, 6),
('Máy xay thịt Bluestone CHB-5139', 'bluestone_chb5139.jpg', 890000, true, 6),
('Quạt điều hòa Midea AC100-U', 'midea_ac100u.jpg', 3600000, true, 6),
('Lò nướng Sanaky VH-509N2D', 'sanaky_vh509.jpg', 1300000, true, 6),
('Máy nước nóng Ariston 15L', 'ariston_water.jpg', 2800000, true, 6);

SELECT * FROM java5_assignment.products
ORDER BY category_id=7;
-- 20 sản phẩm thuộc category_id = 7 (Thời trang nam)
INSERT INTO products (name, image, price, available, category_id) VALUES
('Áo sơ mi nam trắng dài tay Uniqlo', 'uniqloshirt.jpg', 490000, true, 7),
('Quần jean nam Levis 501 xanh', 'levis501.jpg', 890000, true, 7),
('Áo khoác bomber nam Zara đen', 'zarabomber.jpg', 1190000, true, 7),
('Áo thun nam cổ tròn H&M basic', 'hmshirt.jpg', 250000, true, 7),
('Quần short kaki nam Routine', 'routinekaki.jpg', 350000, true, 7),
('Áo vest nam Titishop slimfit', 'vesttitishop.jpg', 1550000, true, 7),
('Quần tây nam Owen đen', 'owenpant.jpg', 720000, true, 7),
('Áo polo nam Aristino xanh navy', 'poloaristino.jpg', 460000, true, 7),
('Giày sneaker nam Converse trắng', 'conversewhite.jpg', 1250000, true, 7),
('Giày lười nam da bò Hải Nancy', 'loafernancy.jpg', 950000, true, 7),
('Áo hoodie nam local brand đen', 'hoodieblack.jpg', 590000, true, 7),
('Áo khoác jeans nam Pull&Bear', 'pulljeans.jpg', 870000, true, 7),
('Bộ vest nam The Blues cao cấp', 'vestblues.jpg', 3200000, true, 7),
('Quần jogger nam Coolmate', 'cooljogger.jpg', 390000, true, 7),
('Áo khoác gió nam Adidas', 'adidasjacket.jpg', 1190000, true, 7),
('Thắt lưng da nam Pedro', 'pedrobelt.jpg', 790000, true, 7),
('Áo ba lỗ thể thao Nike', 'nikebalo.jpg', 270000, true, 7),
('Áo len nam cổ lọ Mango', 'mangolen.jpg', 820000, true, 7),
('Quần short thể thao Puma', 'pumashort.jpg', 360000, true, 7),
('Giày boots nam Timberland cổ cao', 'timberland.jpg', 3200000, true, 7);

SELECT * FROM java5_assignment.products
ORDER BY category_id=8;
-- 20 sản phẩm thuộc category_id = 8 (Thời trang nữ)
INSERT INTO products (name, image, price, available, category_id) VALUES
('Váy maxi hoa nhí Mango', 'mango_maxi.jpg', 890000, true, 8),
('Đầm suông công sở Elise', 'elise_suong.jpg', 1250000, true, 8),
('Áo thun nữ cổ tròn Uniqlo', 'uniqlo_wtee.jpg', 290000, true, 8),
('Chân váy chữ A H&M', 'hm_skirt.jpg', 490000, true, 8),
('Áo sơ mi nữ trắng dài tay Ivy Moda', 'ivy_white.jpg', 610000, true, 8),
('Áo khoác dạ nữ Mango dáng dài', 'mango_khoac.jpg', 1750000, true, 8),
('Áo blazer nữ Zara xám', 'zara_blazer.jpg', 1320000, true, 8),
('Quần jean nữ skinny Levis', 'levis_wjeans.jpg', 980000, true, 8),
('Giày cao gót nữ Vascara đen', 'vascara_black.jpg', 790000, true, 8),
('Túi xách nữ Charles & Keith mini', 'ck_bag.jpg', 1250000, true, 8),
('Đầm tiệc body GUMAC đỏ', 'gumac_red.jpg', 650000, true, 8),
('Áo cardigan len nữ Coolmate', 'cool_cardigan.jpg', 410000, true, 8),
('Chân váy dài K&K Fashion', 'kk_skirt.jpg', 530000, true, 8),
('Set đồ thể thao nữ Adidas', 'adidas_wset.jpg', 1390000, true, 8),
('Giày sneaker nữ MLB trắng', 'mlb_white.jpg', 1550000, true, 8),
('Áo hoodie nữ form rộng Local Brand', 'local_whoodie.jpg', 470000, true, 8),
('Áo ba lỗ croptop thời trang nữ', 'croptop.jpg', 220000, true, 8),
('Giày sandal nữ Pedro quai mảnh', 'pedro_sandal.jpg', 950000, true, 8),
('Quần baggy nữ Routine đen', 'routine_baggy.jpg', 590000, true, 8),
('Áo hai dây nữ thun lạnh basic', 'tanktop.jpg', 180000, true, 8);

SELECT * FROM java5_assignment.products
ORDER BY category_id=9;
-- 20 sản phẩm thuộc category_id = 9 (Thể thao)
INSERT INTO products (name, image, price, available, category_id) VALUES
('Giày chạy bộ nam Nike Air Zoom', 'nike_airzoom.jpg', 2800000, true, 9),
('Áo thể thao nam Adidas Climalite', 'adidas_climalite.jpg', 590000, true, 9),
('Quần short gym nam Under Armour', 'ua_short.jpg', 490000, true, 9),
('Bóng đá tiêu chuẩn FIFA Molten', 'molten_ball.jpg', 650000, true, 9),
('Vợt cầu lông Yonex Nanoray', 'yonex_nanoray.jpg', 1100000, true, 9),
('Dây kháng lực tập gym nữ', 'resistance_band.jpg', 120000, true, 9),
('Áo bra thể thao nữ Coolmate', 'bra_coolmate.jpg', 350000, true, 9),
('Thảm tập yoga Reebok 8mm', 'reebok_yogamat.jpg', 590000, true, 9),
('Tạ tay cao su 5kg', 'dumbbell_5kg.jpg', 320000, true, 9),
('Bình nước thể thao Lock&Lock', 'locknlock_bottle.jpg', 150000, true, 9),
('Găng tay tập gym nam Adidas', 'adidas_glove.jpg', 260000, true, 9),
('Áo thể thao nữ Puma Fit', 'puma_fit.jpg', 420000, true, 9),
('Giày đá bóng sân cỏ nhân tạo Kamito', 'kamito_shoes.jpg', 890000, true, 9),
('Máy đếm bước đi thông minh Mi Band 8', 'miband8.jpg', 950000, true, 9),
('Áo khoác thể thao nam The North Face', 'tnf_jacket.jpg', 1750000, true, 9),
('Bóng rổ Spalding NBA Replica', 'spalding_ball.jpg', 720000, true, 9),
('Xe đạp thể thao địa hình Giant ATX', 'giant_bike.jpg', 7500000, true, 9),
('Quần jogger thể thao nam Nike', 'nike_jogger.jpg', 780000, true, 9),
('Mũ lưỡi trai thể thao Adidas', 'adidas_cap.jpg', 240000, true, 9),
('Đồng hồ đo nhịp tim Garmin', 'garmin_watch.jpg', 3900000, true, 9);

SELECT * FROM java5_assignment.products
ORDER BY category_id=10;
-- 20 sản phẩm thuộc category_id = 10 (Đồ chơi)
INSERT INTO products (name, image, price, available, category_id) VALUES
('Bộ xếp hình LEGO Classic 11005', 'lego_classic.jpg', 990000, true, 10),
('Ô tô điều khiển từ xa Drift Storm', 'rc_car.jpg', 750000, true, 10),
('Búp bê Barbie công chúa tóc dài', 'barbie_princess.jpg', 550000, true, 10),
('Bộ nấu ăn đồ chơi cho bé gái', 'toy_kitchen.jpg', 320000, true, 10),
('Máy bay điều khiển từ xa Mini Drone', 'mini_drone.jpg', 1250000, true, 10),
('Bộ tô màu Crayola cho bé', 'crayola_set.jpg', 180000, true, 10),
('Gấu bông Brown Line Friends 50cm', 'brown_teddy.jpg', 420000, true, 10),
('Bảng vẽ cảm ứng LCD 12inch cho bé', 'lcd_board.jpg', 270000, true, 10),
('Xe scooter trẻ em 3 bánh', 'scooter.jpg', 790000, true, 10),
('Bộ lắp ráp Gundam RX-78-2', 'gundam.jpg', 990000, true, 10),
('Mô hình khủng long ăn pin', 'dino_electric.jpg', 390000, true, 10),
('Bộ đồ chơi bác sĩ cho bé trai', 'doctor_set.jpg', 310000, true, 10),
('Đồ chơi đất nặn Play-Doh 20 màu', 'playdoh.jpg', 350000, true, 10),
('Đàn piano đồ chơi cho bé 37 phím', 'toy_piano.jpg', 870000, true, 10),
('Mô hình xe buýt Tayo Bus', 'tayo.jpg', 190000, true, 10),
('Bộ ghép hình 3D Puzzle Taj Mahal', '3d_puzzle.jpg', 520000, true, 10),
('Bộ thẻ học thông minh Flashcard', 'flashcard.jpg', 210000, true, 10),
('Trò chơi lắp ráp nam châm Magformers', 'magformers.jpg', 650000, true, 10),
('Mô hình siêu nhân Ultraman', 'ultraman.jpg', 430000, true, 10),
('Đồng hồ trẻ em chơi nước chống nước', 'toy_watch.jpg', 290000, true, 10);
