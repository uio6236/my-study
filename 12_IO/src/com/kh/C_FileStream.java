package com.kh;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.kh.model.Person;

public class C_FileStream {
	public static void main(String[] args) {
		//fileSave();
		//fileRead();
		//objectSave();
		ObjectRead();
	}
	// 파일 출력: 프로그램 ---> 파일
	public static void fileSave() {
		// * 기반 스트림 : FileWriter. 파일을 직접적으로 연결하여 2바이트씩 출력하는 스트림
		// * 보조 스트림 : BufferedWriter. 속도 향상을 도와주는 보조스트림
		System.out.println(" ***** fileSave ***** ");
		/*
		BufferedWriter bw = null;
		try {
			// 1. 기반 스트림 생성
			FileWriter fw = new FileWriter("file1.txt");
			// 2. 보조 스트림 생성
			bw = new BufferedWriter(fw);
			// 3. 파일에 데이터 쓰기(출력)
			bw.write("파일에 데이터 쓰기");
			bw.write("ㅇㄹ");
			bw.newLine(); // 줄바꿈 처리
			bw.write("즐거운 금요일 ~");
			bw.flush();
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (bw != null) {
					bw.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		*/
		// ** try~with~resources 구문 변경해보기 **
		try (FileWriter fw = new FileWriter("file1.txt");
				BufferedWriter bw = new BufferedWriter(fw);){
			bw.write("파일에 데이터 쓰기");
			bw.write("ㅇㄹㅇㄹ");
			bw.newLine(); // 줄바꿈 처리
			bw.write("즐거운 금요일 ~");
			bw.flush();
			//bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	// 파일 입력 : 프로그램 파일 <--- 파일
	public static void fileRead() {
		// * 기반 스트림 : FileReader
		// * 보조 스트림 : BufferReader. 한 줄씩 데이터를 읽어오도록 도와줌!
		System.out.println(" **** fileRead **** ");
		try (FileReader fr = new FileReader("file1.txt");
				BufferedReader br = new BufferedReader(fr)){
			// * 파일 내용 읽어오기
			/*
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			*/
			// => 읽어올 내용이 없을 땐 null을 반환!
			/*
			while(true) {
				String line = br.readLine();
				if (line == null) {break;}
				System.out.println(line);
			}
			*/
			String line;
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e){
			e.printStackTrace();
		}
	}
	// 파일 출력 : 프로그램 ---> 파일. 객체에 저장된 데이터.
	public static void objectSave() {
		// * 객체 데이터 생성 (출력할 데이터)
		Person p1 = new Person("박고산", 26, 176.5);
		Person p2 = new Person("김태수", 26, 180.5);
		Person p3 = new Person("전웅배", 26, 182.5);
		// 파일에 데이터 저장
		// * 보조 스트림 : ObjectOutputStream. 객체 단위로 출력을 도와주는 스트림.
		// * 기반 스트림 : FileOutputStream. 1바이트 단위로 파일에 출력하는 스트림.
		try (ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream("file2.txt"))) {
			oos.writeObject(p1);
			oos.writeObject(p2);
			oos.writeObject(p3);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	// 객체 데이터 입력: 프로그램 <-- 파일
	public static void ObjectRead() {
		// * 보조 스트림 : ObjectInputStream
		// * 기반 스트림 : FileInputStream
		try(ObjectInputStream ois = new ObjectInputStream(
				new FileInputStream("file2.txt"))) {
			System.out.println(ois.readObject());
			System.out.println(ois.readObject());
			System.out.println(ois.readObject());
			System.out.println(ois.readObject());
		} catch (EOFException e) {
			System.out.println(" -- 데이터 로드 완료 -- ");
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
			/*
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		*/
	}
}
