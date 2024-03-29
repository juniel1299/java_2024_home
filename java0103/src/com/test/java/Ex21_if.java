package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex21_if {
	public static void main(String[] args) throws IOException {

		// Ex21_if.java

		// 제어문
		// - 수많은 명령어들의 집합 > 명령어들이 실행되는 순서 > 위 -> 아래
		// 제어의 흐름을 통제하는 도구
		// 조건 제어 , 반복 제어, 분기 제어

		// 1. 조건문
		// 개발자가 조건을 제시한 후 결과에 따라 흐름을 제어
		// a. if
		// b. switch

		// 2. 반복문
		// 특정 코드를 원하는 횟수만큼 반복제어
		// for
		// while
		// do while
		// for

		// 3. 분기문
		// 코드의 흐름을 원하는 곳으로 이동
		// break
		// continue
		// goto(JDK 1.5 폐지)

		// 1. 알고리즘 > 흐름 > 제어문
		// 2. 자료구조 > 퀵 , 스택 , (버블)정렬, 트리, 등등

		m1();
		// m2();
		// m3();
		// m4();
		//m5();
	}// main

	private static void m5() throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		// 성적(0 ~ 100) 입력 > 합격/불합격
		// 유효성 검사

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("성적: ");

		int score = Integer.parseInt(reader.readLine());

		// 1. 합격일때
		// 2. 불합격일때
		// 둘을 분리해야함 (1,2와 3)

		// 3. 잘못 입력(유효성)
		if (score >= 60 && score <= 100) {
			System.out.println("합격");
		} else if (score > 0 && score < 60) {
			System.out.println("불합격");
		} else {
			System.out.println("0~100까지의 수를 넣어주십시오.");
		}

		//중첩 if 문 (코드 관리 차원에서 더 좋은 코드)
		if (score >= 0 && score <= 100) {
			if(score>=60) {
				System.out.println("합격");
			}else {
				System.out.println("불합격");
			}
		} else {
			System.out.println("0~100까지의 수를 넣어주십시오.");
		}

	}

	private static void m4() throws IOException {
		// TODO Auto-generated method stub
		// 심리테스트

		int sum = 0; // 누적 변수
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("1. 어떤 개발툴을 선호합니까?");
		System.out.println("a. 메모장"); // +1
		System.out.println("b. 이클립스"); // +3
		System.out.println("c. 인텔리제이"); // +5

		System.out.print("선택: ");

		String seq = reader.readLine();

		if (seq.equals("a")) {
			sum = 1;
		} else if (seq.equals("b")) {
			sum = 3;
		} else if (seq.equals("c")) {
			sum = 5;
		}
		System.out.println("2. 어떤 프로그래밍 언어를 선호합니까?");
		System.out.println("a. 자바"); // +7
		System.out.println("b. C#"); // +3
		System.out.println("c. Kotlin"); // +2

		System.out.print("선택: ");

		seq = reader.readLine();

		if (seq.equals("a")) {
			sum += 7;
		} else if (seq.equals("b")) {
			sum += 3;
		} else if (seq.equals("c")) {
			sum += 2;
		}
		System.out.println("3. 하루에 얼마나 코딩을 합니까?");
		System.out.println("a. 4시간"); // +7
		System.out.println("b. 2시간"); // +3
		System.out.println("c. 1시간"); // +2

		System.out.print("선택: ");

		seq = reader.readLine();

		if (seq.equals("a")) {
			sum += 7;
		} else if (seq.equals("b")) {
			sum += 3;
		} else if (seq.equals("c")) {
			sum += 2;
		}

		System.out.println("설문이 완료되었습니다.");
		System.out.println("[결과]: ");

		if (sum > 10) {
			System.out.println("당신은 개발자의 자질이 있습니다.");
		} else if (sum > 6) {
			System.out.println("개발자가 되려면 조금 더 노력하세요");
		} else {
			System.out.println("다른거 하세요");
		}

	}

	private static void m3() throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		// 출근 > 기상?

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("기상시간(시): ");

		int hour = Integer.parseInt(reader.readLine());

		if (hour < 6) {
			System.out.println("지하철을 타고 출근한다.");
		} else if (hour < 7) {
			System.out.println("버스를 타고 출근한다");
		} else if (hour < 8) {
			System.out.println("택시를 타고 출근한다.");
		} else {
			System.out.println("병가를 낸다.");
		}

	}

	private static void m2() throws IOException {
		// TODO Auto-generated method stub
		// 나이 입력 > 판단
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("나이를 입력하시오. :\n");

		int age = Integer.parseInt(reader.readLine());
		if (age >= 18) {
			System.out.println("성인");
		} else {
			System.out.println("미성년자");
		}

	}

	private static void m1() {
		// TODO Auto-generated method stub

		// if 문
		// 개발자가 조건을 제시한 후, 결과에 따라 흐름을 통제
		// 조건식 > boolean 값을 가지는 표현식

		// if(조건식) {문장} //if문

		int num = -1;

		if (num > 0) {
			System.out.println("num은 양수입니다.");
		} else if (num < 0) { // 거짓

			System.out.println("num은 음수입니다.");

		} else {
			System.out.println("0을 기입하셨습니다");
		}

		System.out.println("종료");
	}

	/*
	 * 다중 조건문
	 * 
	 * if (조건식){ 문장; } else if (조건식){ 문장;} else { // else만 작성하면 기타 등등 }
	 * 
	 */
}
