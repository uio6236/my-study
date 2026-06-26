package com.kh.model.dao;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDAO {
	public boolean checkName(String file) {
		File f = new File(file);
		return f.exists();
	}
	public void fileSave(String file, String s) {
		try (BufferedWriter bw = new BufferedWriter(
				new FileWriter(file))) {
			bw.write(s);
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public String fileOpen(String file) {
		// * 해당 파일이 존재하는지 확인, 존재하지 않으면 "파일이 존재하지 않습니다." 리턴
		if (!checkName(file)) {return "파일이 존재하지 않습니다.";}
		String contents = "";;
		try (BufferedReader br = new BufferedReader(new FileReader(file))){
			while(true) {
				String line = br.readLine();
				if (line == null) {break;}
				contents += line + "\n";
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return contents;
	}
	public void fileEdit(String file, String s) {
		try(BufferedWriter bw = new BufferedWriter(
				new FileWriter(file, true))) {
			bw.write(s);
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}