package com.sadiki.tparticle;

import com.sadiki.tparticle.domain.Article;
import com.sadiki.tparticle.repository.ArticleRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.File;
import java.io.FileInputStream;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TpArticleApplicationTests {
	@Autowired
	ArticleRepository articleRepository;
	@Test
	public void contextLoads() {
		Article article=new Article("artcile1","desc",null,true);
		try {
			File file = new File("D:\\Etude\\GLSID\\workspace\\tp-article\\src\\main\\resources\\static\\cat.jpg");
			byte[] picInBytes = new byte[(int) file.length()];
			FileInputStream fileInputStream = new FileInputStream(file);
			fileInputStream.read(picInBytes);
			fileInputStream.close();
			article.setPhoto(picInBytes);
			articleRepository.save(article);
		}catch (Exception ex){
			System.out.println(ex.getMessage());
		}
	}
}
