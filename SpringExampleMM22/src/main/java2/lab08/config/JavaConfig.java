package lab08.config;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

	String inFilename="data/SamplePictures.zip";
	String OutFilename="data/SamplePicturesXX.zip";
	 
	
	@Bean
	public File inFile() {
		File f =new File(inFilename);
		return f;
	}
	@Bean
	public File outFile() {
		File f =new File(OutFilename);
		return f;
	}
	
	 @Bean
	 public FileInputStream fis() throws FileNotFoundException {
	  FileInputStream fis = new FileInputStream(inFile());
	  return fis;
	 }
	 
	 @Bean
	 public FileOutputStream fos() throws FileNotFoundException {
	  FileOutputStream fos = new FileOutputStream(outFile());
	  return fos;
	 }
	
	
	
}
