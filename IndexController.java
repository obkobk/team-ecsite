package jp.co.internous.cony.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.google.gson.Gson;

import jp.co.internous.cony.model.domain.MstCategory;
import jp.co.internous.cony.model.domain.MstProduct;
import jp.co.internous.cony.model.form.SearchForm;
import jp.co.internous.cony.model.mapper.MstCategoryMapper;
import jp.co.internous.cony.model.mapper.MstProductMapper;
import jp.co.internous.cony.model.session.LoginSession;

@Controller
@RequestMapping("/cony")
public class IndexController {
	
	@Autowired
	private MstCategoryMapper categoryMapper;
	
	@Autowired
	private MstProductMapper productMapper;
	
	@Autowired
	private LoginSession loginSession;
	
	Gson gson = new Gson();

	@RequestMapping( "/")
	public String index(Model m) {
		
		if (!loginSession.getLoginFrag() && loginSession.getTempUserId() == 0) {
			int tmpUserId = (int)(Math.random() * 1000000000 * -1);
			// 仮ユーザーIDが9桁になるまで10倍する
			while (tmpUserId > -100000000) {
				tmpUserId *= 10;
			}
			loginSession.setTempUserId(tmpUserId);
			System.out.println(tmpUserId);
		}
		
		//商品情報を取得
		List<MstProduct> products = productMapper.find();
		//カテゴリを取得
		List<MstCategory> categories = categoryMapper.find();
		
		m.addAttribute("products", products);
		m.addAttribute("categories",  categories);
		m.addAttribute("selected", 0);
		
		// page_header.htmlでsessionの変数を表示させているため、loginSessionも画面に送る。
		m.addAttribute("loginSession",loginSession);
				
		return "index";
	}
	
	@RequestMapping("/searchItem")
	public String index(SearchForm f, Model m) {
		List<MstProduct> products = null;
		
		String keywords = f.getKeywords().replaceAll("　", " ").replaceAll("\\s{2,}", " ").trim();
		
		if(f.getCategory() == 0) {
			//カテゴリー未選択の状態
			products = productMapper.findByProductName(keywords.split(" "));
		} else {
			products = productMapper.findByCategoryAndProductName(f.getCategory(), keywords.split(" "));
		}
		List<MstCategory> categories = categoryMapper.find();
		
		
		
		m.addAttribute("keywords", keywords);
		m.addAttribute("selected", f.getCategory()); 
		m.addAttribute("categories", categories); 
		m.addAttribute("products", products);
		// page_header.htmlでsessionの変数を表示させているため、loginSessionも画面に送る。
		m.addAttribute("loginSession",loginSession);
		
		return "index";
	}
}
