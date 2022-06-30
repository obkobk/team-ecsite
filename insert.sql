USE conydb;

INSERT INTO mst_category
 (category_name, category_description) VALUES ('赤', '赤色の宝石');
 INSERT INTO mst_category
 (category_name, category_description) VALUES ('緑', '緑色の宝石');
 INSERT INTO mst_category
 (category_name, category_description) VALUES ('青', '青色の宝石');
 INSERT INTO mst_category
 (category_name, category_description) VALUES ('紫', '紫色の宝石');
 INSERT INTO mst_category
 (category_name, category_description) VALUES ('白', '白色の宝石');

 INSERT INTO mst_product 
 (product_name, product_name_kana, category_id, price, release_company, release_date, image_full_path, product_description)
 VALUES ('ルビー', 'るびー', 1, 8000, 'Cony株式会社', '2022/06/30', '/img/ruby.jpg', 
 '四大宝石の一つである貴石。古くからパワー、愛、ロマンスを呼び起こすといわれ、7月の誕生日。');
 INSERT INTO mst_product 
 (product_name, product_name_kana, category_id, price, release_company, release_date, image_full_path, product_description)
 VALUES ('ガーネット', 'がーねっと', 1, 10000, 'Aony株式会社', '2022/06/29', '/img/garnet.jpg', 
 '宝石言葉は友愛や真実。1月の誕生日石で深い紅色が特徴。');
 INSERT INTO mst_product 
 (product_name, product_name_kana, category_id, price, release_company, release_date, image_full_path, product_description)
 VALUES ('エメラルド', 'えめらるど', 2, 15000, 'Bony株式会社', '2022/06/28', '/img/emerald.jpg', 
 '4大宝石の一つで、5月の誕生石。クレオパトラが最も愛した宝石としても有名である。');
  INSERT INTO mst_product 
 (product_name, product_name_kana, category_id, price, release_company, release_date, image_full_path, product_description)
 VALUES ('ペリドット', 'ぺりどっと', 2, 2000, 'Dony株式会社', '2022/06/27', '/img/peridot.jpg', 
 '8月の誕生石。夜の照明の下でも美しく輝き「イブニングエメラルド」とも称され、古代エジプトでは「太陽の宝石」と呼ばれていた。');
  INSERT INTO mst_product 
 (product_name, product_name_kana, category_id, price, release_company, release_date, image_full_path, product_description)
 VALUES ('サファイア', 'さふぁいあ', 3, 30000, 'Eony株式会社', '2022/06/26', '/img/sapphire.jpg', 
 '9月の誕生石であるサファイアは、ラテン語で青を意味する「サフィルス」という語がその名の由来。一日のうちのいろいろな空の色をしていることから「天の宝石」、「空の宝石」と呼ばれることもある。');
  INSERT INTO mst_product 
 (product_name, product_name_kana, category_id, price, release_company, release_date, image_full_path, product_description)
 VALUES ('アクアマリン', 'あくあまりん', 3, 20000, 'Fony株式会社', '2022/06/25', '/img/aquamarine.jpg', 
 '3月の誕生石であるアクアマリンは、ラテン語で「海の水」という言葉が由来。その名の通り透き通った海の清らかさのような色合い。
心を落ち着かせる力があることで知られ、その色合いはさわやかな海の風を思い起こさせる。 ');
 INSERT INTO mst_product 
 (product_name, product_name_kana, category_id, price, release_company, release_date, image_full_path, product_description)
 VALUES ('アメシスト', 'あめしすと', 4, 22000, 'Gony株式会社', '2022/06/24', '/img/amethyst.jpg', 
 '2月の誕生石。「アメテュストス(お酒に酔わない)」がその名の由来。');
 INSERT INTO mst_product 
 (product_name, product_name_kana, category_id, price, release_company, release_date, image_full_path, product_description)
 VALUES ('チャロアイト', 'ちゃろあいと', 4, 15000, 'Cony株式会社', '2022/06/23', '/img/charoite.jpg', 
 '世界３大ヒーリングストーンの１つ。ロシアのムルン山脈でのみ産出されるための希少性価値が高く人気がある。');
 INSERT INTO mst_product 
 (product_name, product_name_kana, category_id, price, release_company, release_date, image_full_path, product_description)
 VALUES ('ダイヤモンド', 'だいあもんど', 5, 100000, 'Hony株式会社', '2022/06/22', '/img/diamond.jpg', 
 '4月の誕生石、高度は10で宝石の中で最も硬い。');
 INSERT INTO mst_product 
 (product_name, product_name_kana, category_id, price, release_company, release_date, image_full_path, product_description)
 VALUES ('パール', 'ぱーる', 5, 9000, 'Iony株式会社', '2022/06/21', '/img/pearl.jpg', 
 '6月の誕生石。貝の中で形成される宝石。');
