package config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
	
	private static Logger Log =LoggerFactory.getLogger(WebAppInitializer.class);
	
	
	
	//跟其他系統共用的Bean
	@Override
	protected Class<?>[] getRootConfigClasses() {
			//ingo 準備類型
		Log.info("準備執行getRootConfigClasses()");
		return null;
	}
	//	本應用系統專屬的Bean
	@Override
	protected Class<?>[] getServletConfigClasses() {
		Log.info("getServletConfigClasses()");
		return null;
	}
	//哪些請求要交給分派器處理
	@Override
	protected String[] getServletMappings() {
		Log.info("準備執行getServletMappings()");
		//要傳回一格字串陣列 
		//{"/"};這樣寫是所有請求交給分派器處理
		return new String[] {"/"};
	}

}
