package com.sist.main;
/*
 *      5장
 *      -----
 *        118page ==> 클래스 구조
 *          => [접근지정어][제어어] class ClassName => 형식 
 *                       ------ 대부분은 default
 *                       static / abstract / final
 *                                            | 종단 클래스 => 확장 할 수 없는 클래스 (사용빈도(X))
 *                                              => String, System, Math, StringBuffer, Wrapper ...
 *                                 | 추상 클래스 (선언만 된 메소드) => 미완성된 클래스 (메모리 할당을 할 수 없다)
 *                                   => 상속받은 후 구현후 사용 (상속, 오버라이딩) => 7장 
 *                       | 공통으로 사용되는 기능 => 네트워크 (client / server) , 데이터분석
 *                                                      ----------------
 *                                                      | 동시에 사용되는 클래스
 *             --------- public 
 *             --------- 한개의 파일에 클래스를 여러개 만드는 경우 => public은 한번만 사용이 가능
 *             --------- 가급적이면 한개 자바파일에 여러개 클래스는 만들지 않는다
 *             {
 *             	 	   선택사항 
 *                    ---------------------------------
 *                     변수 (멤버변수)
 *                       => 저장해서 관리할 데이터를 메모리에 저장할 목적 (프로그램 종료시까지 메모리 유지)
 *                       => 따로 저장 공간 (인스턴스 변수) => new를 이용해서 메모리 공간을 만들고 저장후 사용
 *                          = 핵심 
 *                       => 1개만 저장 공간 (정적 변수) => static
 *                       => 변수로 사용할 수 있는 것
 *                          1. 기본형 (정수, 실수, 논리, 문자)
 *                          2. 배열 
 *                          3. 클래스 => 포함 클래스 => 데이터형(사용자 정의)
 *                             ----- String 
 *                             Movie[] movies = new Movie[1938]
 *                       => 변수는 외부에서 (다른 클래스에서 변경할 수 없게 보호)
 *                          = 캡슐화 : 변수는 은닉화 / 메소드를 통해서 접근이 가능
 *                                   -----------------------------------
 *                                     | getter/setter (읽기/쓰기) => 기능 추가
 *                          = 설정하는 변수는 private
 *                       1. 출력화면을 보고 데이터 추출 (********)
 *                          --------------------- 안보이는 데이터 => 클래스의 변수 (찾기 => 구분자가 반드시 포함)
 *                      	  => 게시물번호 / 영화번호 / ....
 *                               배열의 인덱스와 매칭
 *                       2. 캡슐화 => 시큐어 코딩의 기본
 *                       ------------------------------  => lombok 
 *                    ---------------------------------
 *                     생성자 : 초기화 => 배열에 값을 채워준다 (파일 읽기, 오라클 연결)
 *                            ** 클래스 블록은 선언만 가능
 *                            ** 선언
 *                                 => 변수 선언   => int a;
 *                                 => 메소드 선언  => public void display();
 *                     초기화 블록에서 구현후 초기화 
 *                     
 *                     ** 인스턴스변수에 대한 초기화 => 생성자
 *                        --------- 사용을 하기 위해서는 생성자가 반드시 호출
 *                        --------- 클래스 객체명 = new 생성자()
 *                                        객체명.변수명
 *                                        ----------
 *                     ** 정적변수(static)변수에 초기화 => static{}
 *                        -------- 생성자 호출이 없어도 사용이 가능
 *                        클래스명.변수명
 *                        
 *                        생성자
 *                        -----
 *                         => 접근지정어는 public (다른 클래스에서 사용 가능)
 *                         => 클래스명과 동일
 *                         => 리턴형이 없다
 *                         => 여러개를 만들 수 있다 : 같은 메소드명으로 여러개 생성해서 사용 => 오버로딩
 *                         => 모든 클래스에 한개 이상 존재
 *                            = 사용을 하지 않는 경우에는 생략이 가능 => 컴파일러가 생성자 1개 지원
 *                                                               ---------------------
 *                                                               매개변수가 없는 생성자 (디폴트 생성자)
 *                       
 *                    ---------------------------------
 *                     메소드 : 멤버변수를 활용하는 기능을 제작 
 *                             ----------
 *                             1. 목록 출력 
 *                             2. 상세보기
 *                             3. 예약(예매) 하기
 *                             4. 추천
 *                             5. 결제
 *                             6. 검색 .....
 *                     => 2개 ( 결과값, 사용자 요청값)
 *                                    ----------- 매개변수 (여러개 사용이 가능)
 *                                                        -------------- 권장사항으로는 3개 이상 초과하지 않는다
 *                                                                                   ----------
 *                                                                                    | 배열 , 클래스 
 *                              ---- 리턴형 (한개만 사용) => 데이터가 많은 경우 배열/클래스
 *                     형식)
 *                          [접근지정어][제어어] 리턴형 메소드명(매개변수리스트) => 선언부
 *                                           -----
 *                                    ------ default(인스턴스 메소드) => 따로 저장 (***)
 *                                    ------ static => 공통으로 사용되는 기능 (한글 변환, 암호화, 복호화, 정렬)
 *                                    ------ 7장 : abstract => 구현이 안된 메소드 => 프로그램에 맞게 구현
 *                                           버튼 클릭 / 마우스 클릭 / 키보드 입력
 *                                           ------------------------------
 *                                           => 메소드는 호출이 가능하게 만든다 .. (구현은 프로그램에 맞게)
 *                                           => 설계만 하는 기능 => 추상 클래스 / 인터페이스 
 *                                                              --------------------
 *                                                              요구사항 분석
 *                          ---------
 *                           public : 메소드는 다른 클래스와 연결할 때 사용 => 공개 
 *                          {
 *                                구현부
 *                                return 전송할 값
 *                                       -------- 같은 데이터형이다
 *                                       ** return은 void일 경우에는 생략이 가능
 *                                                  ------ 메소드 자체에서 처리 (데이터베이스 => 수정,추가,삭제)
 *                          }
 *                          
 *                          => 메소드는 기능별로 나눠서 작업 => 구조적 프로그램
 *                             문장 => 단락을 나눠서 처리
 *                             반복적인 기능이 많은 경우 
 *                             -------------------
 *                             다른 클래스와 연결
 *                          => 재사용이 가능 => 수정 / 추가 ==> 클래스의 핵심
 *                          => 메뉴 / 버튼 / 입력창 / 마우스 클릭
 *                             ----------------------------- 벤치마킹 (여러개) : 프로젝트
 *                             *** 임팩트 
 *                                 영화 : 예매 
 *                                 맛집 : 추천 , 예약
 *                                 여행 : 추천 , 코스 ...
 *                                 쇼핑몰 : 결제 => 아이엠포트 (가상)
 *                                         지도 출력 => 카카오
 *                    ---------------------------------
 *                    ** 메소드는 호출시마다 처음부터 시작
 *                    
 *                     public class A
 *                     {
 *                        public void display()
 *                        {
 *                        }
 *                        public int aaa()
 *                               ----
 *                        {
 *                            return 10
 *                        }
 *                        public A[] bbb(int page)
 *                               ---
 *                        {
 *                            return new A[];
 *                        }
 *                     }
 *                     A aa = new A();
 *                     aa.display() => void
 *                     int a = aaa();
 *                     ---
 *                     A[] arr = aa.bbb(1)
 *                     ---
 *                     
 *             }
 *        122page ==> 객체 생성
 *        1. 클래스 : 설계
 *           public class A
 *           {
 *              int a;
 *              public void disp(){}
 *           }
 *        2. 메모리에 저장
 *           A aa = new A();
 *                  --- ---
 *                      | 변수에 대한 값을 대입  => 생성자는 .으로 사용하는 것이 아니라 => new 생성자()
 *                  설계된 데이터를 모아주는 메모리 생성
 *                       -------------- 데이터 + 메소드
 *             ----> 메모리 주소  => a, disp() => 접근할때 사용 .
 *             
 *             --- aa ---
 *                0x100 => new의 역할 => 동적메모리 할당            
 *             ----------- => 0x100  -----------
 *                                    ---a---
 *                                       0 => 생성자가 하는 역할
 *                                    -------
 *                                    
 *                                    -------
 *                                     disp()
 *                                    -------
 *                                  -----------
 *        3. 객체 활용 (변수 호출, 메소드 호출)
 *           클래스명 객체명 = new 생성자()
 *           객체명.변수 / 객체명.메소드()
 *        123page ==> 객체 사용
 *        ------------------------------------------------------------
 *           설계 ==> 저장 => 활용 => 메모리해제
 *           ---     ---    ---    --------
 *           class   new     .       null => 주소값이 없는 상태 (GC)
 *        ------------------------------------------------------- 객체의 생명주기
 *        127page ==> 접근지정어 
 *         => 클래스와 클래스의 연결할 때 사용
 *         => 변수 => private
 *            [접근지정어] 데이터형 변수명
 *            --------- private로 설정한다 => 캡슐화  => 필요시에는 접근이 가능 (getter/setter)
 *            변수는 기능이 2개 (메모리 저장 / 메모리에 값을 가지고 온다)
 *                                     ------------------ setter
 *                          -------- setter
 *            private : 자신의 클래스에서만 사용이 가능
 *            ------- 정보는 private (영화정보 , 맛집정보, 회원정보)
 *                      private을 사용하지 않는 경우 => public
 *                      --------------------------------
 *                       JButton / JTextField ..... => 라이브러리 클래스 => public  
 *         -------------------
 *         => 클래스
 *            [접근지정어] class ClassName
 *            -------- public
 *         => 메소드
 *            [접근지정어] 리턴형 메소드명(매개변수)
 *            --------- public
 *         => 생성자 
 *            [접근지정어] 클래스명()
 *            -------- public
 *            
 *            *** public은 모든 클래스에 접근이 가능
 *         ------------------- 다른 클래스와 연결 (public)
 *         *** default => 자신의 클래스 / 같은 패키지까지만 접근이 가능
 *                                        ---- 폴더
 *         *** protected => 자신의 클래스 / 같은 패키지까지만 접근이 가능 / 상속을 받은 경우 다른 패키지에서 접근이 가능
 *                                                             ------------
 *             접근 범위
 *             ------
 *              private < default < protected < public
 *              --------------------------------------
 *        132page ==> 패키지 : 폴더 => 한번만 사용이 가능
 *                    ----- 관련된 클래스를 모아서 관리 => 기능별 분리 => 검색이 쉽게
 *                    package 경로명
 *                      => 패키지명은 숫자로 시작하면 안된다 / 키워드를 사용할 수 없다
 *                      => com(org).회사명.구분자 
 *                                       ----
 *                                       오라클 연결 : dao 
 *                                       데이터형   : vo
 *                                       크롤링/OpenApi : manager
 *                                       웹 전송 : survice
 *                      => 클래스 찾기가 쉽다
 *                      => 같은 클래스명을 사용할 수 있다
 *                         ---------
 *        136page ==> import => 패키지를 불러오는 경우 => 여러개 사용이 가능
 *                    ------
 *                    1. 라이브러리 불러오는 경우
 *                    2. 사용자 정의 클래스 불러오기
 *        140page ==> 메소드
 *        152page ==> getter / setter
 *        166page ==> 생성자
 *        -------------------------------
 *      6장 
 *       194page ==> 상속 (웹에서는 사용 빈도가 거의 없다)
 *          샹속 => 목적 / 형식
 *          목적 : 기존의 클래스를 재사용할때 사용 / 수정이 가능 , 추가가 가능
 *                --------------- 사용중에 있기 때문에 => 신뢰성이 뛰어나다
 *                => 상속 => 넘겨주는 내용 
 *                          1. 변수 / 2. 메소드
 *                          ------
 *                          제외 : static => 공통으로 사용할 수 있게 만들어 준다
 *                                private => 상속은 된다 (접근이 불가능 + protected)
 *                  기타 제외 ; 생성자 , 초기화블록
 *           형식 : class A extends B
 *                      ---       ---
 *                                 상속을 내리는 클래스 : 라이브러리 상속을 주로 받는다
 *                                 --------------- 슈퍼클래스 , 부모클래스 , 상위클래스 , 베이스클래스 
 *                      상속을 받는 클래스 : 서브클래스, 자식클래스, 하위클래스, 파생클래스
 *                      ------------- 상속을 받아서 기존의 기능 + 추가기능
 *                                    -------------------------- 확장을 해서 사용한다
 *                      => 상속을 내린 클래스의 소스를 반복할 필요가 없다 
 *                         => 기능이 존재한다는 가정 => 소스 간결하다
 *           class A 
 *           {
 *              ★ ○ ▲
 *           }
 *           class B extends A
 *           {
 *           	//★ ○ ▲ => 따로 할 필요가 없다 (메모리 저장된 상태)
 *           }
 *           
 *           class A 
 *           {
 *              int a;
 *              --------- super.a
 *              void display(){}
 *              ------------------ super.display()
 *           }
 *           class B extends A
 *           {
 *              int c;
 *              // int a; void display(){}
 *                 -----  ----------------
 *                   |            |
 *              this.a         this.display()
 *           }
 *           ** 상속을 받은 클래스는 상속을 내린 클래스의 변수, 메소드에 접근이 가능
 *              상속을 내리는 클래스는 상속을 받은 클래스에 접근이 불가능
 *           ** 자바의 모든 클래스는 Object 클래스의 상속을 받는다
 *                             -----------
 *                             자바에서 가장 큰 데이터형 : Object
 *                             Object o = 10
 *                             o = 10.5
 *                             o = ""
 *                             o = new A()
 *                             -----------
 *                             배열 => 다른 데이터형을 모아서 사용
 *                             Object[] arr = {"", 10m 'A', new A()...} => 자바스크립트의 배열
 *           B b = new B();
 *                 ---
 *           --- b ---
 *           
 *           --------- 0x100 ------------ 
 *                             --super-- 상위 클래스 메모리 할당 super (상속을 내린 클래스 객체)
 *                              ---a---
 *                                 0      => b.a
 *                             ----------
 *                              display()  => b.display()
 *                              ---------
 *                            ------------
 *                            
 *                                                      
 *                              -- this -- 하위 클래스 메모리 할당 (자신 클래스 객체)
 *                                --c--
 *                                  0     ==> b.c
 *                             ----------
 *                            --------------
 *       201page ==> 단일 상속 , 오버라이딩 
 *                   => 자바는 단일 상속만 가능
 *                   => extends 클래스명, 클래스명 => 불가능
 *                   => 두개를 받는 경우 
 *                      class A
 *                      {
 *                         int a
 *                      }
 *                      class B extends A
 *                      {
 *                         int b;
 *                         // int a;
 *                      }
 *                      class C extends B
 *                      {
 *                         int c;
 *                         // int b, int a
 *                      }
 *                      => 다중 상속이 없어서 불편한 점이 있다 (단점)
 *                         -- 인터페이스 (다중 상속) => 7장
 *                      => 상속받은 변수, 메소드가 보이지 않기 때문에 => 수정 , 추가가 불편하다 (가독성)
 *                      => 오라클
 *                      => JSP / MVC / Spring / Spring-Boot => 자바
 *                      
 *                      HTML / CSS / JavaScript  ===> 사용자 요청 처리 (자바)  ==== 오라클 연결
 *                      -----------------------
 *                              |                                            => 사이트에 필요한 데이터 저장소
 *                            브라우저에서 실행
 *                            ** 자바는 브라우저에서 txt
 *                            ** 오라클 연결이나 데이터 처리가 불가능
 *                            ** 화면 출력만 가능
 *                                  |---Full Stack--|
 *                                ----------   --------
 *                       퍼블리셔 == Front-End == Back-End
 *                       -----    ---------    --------- 자바, 오라클, spring, jsp
 *                       HTML/CSS   Vue/React/Node
 *                                  javascript라이브러리
 *                         |
 *                       거의 없다
 *                  ---------------------------------------------------------------------------------
 *       207page ==> 상속시 접근제한 ==> 캡슐화가 깨지는 경향
 *                   -----------
 *                   private (변수) => 상속을 내릴때 반드시 getter/setter 
 *       211page ==> 상속시 생성자
 *       			 디폴트 생성자는 관계없다
 *       			 매개변수가 있는 생성자가 있는 경우에는 반드시 super()를 이용해서 상위 클래스에 생성자를 먼저 호출한다
 *       215page ==> 키워드 (super/this)
 *                   super => 상속을 내린 클래스의 변수, 메소드 호출
 *                   this => 자신의 클래스에 있는 변수, 메소드 호출 사용
 *                   ---------------------------------------
 *                   this => 반드시 정리
 *                   ----
 *                    => 생성자, 멤버메소드에서 사용이 가능
 *                       ------------- 인스턴스 관련 / static관련도 사용이 가능
 *                    => static 메소드에서는 사용이 불가능 => 멤버가 아니다 (공통 => 1개의 메모리)
 *                                                               --- 
 *                        => 사용이 필요한 경우에는 객체생성후에 사용한다
 *               *** final 이 있는 경우
 *               public final void display(){}
 *                      ----- 확장이 안되는 메소드 (기능 변경이 불가능=오버라이딩이 불가능)
 *                      public final class A => 상속을 내리지 못한다 => 고정
 *                       java.lang => final 
 *                       --------- String, Math, Interger, Double , System...
 *       221page ==> 객체 형변환
 *           1. 묵시적인 형변환
 *              double d = 10; => d = 10.0
 *              int i = 'A';   => i = 65
 *              -----
 *              왼쪽이 큰데이터형이면 자동으로 데이터형 변경
 *              
 *              클래스)
 *                    크기 확인
 *                    ------ is-a , has-a
 *                           ----   -----
 *                           상속      포함
 *                    class A
 *                    {
 *                    }
 *                    class B
 *                    {
 *                    }     
 *                    ---------------------- 비교할 수 없다
 *                    
 *                    class A
 *                    {
 *                    }
 *                    class B extends A  ===>  A>B (크기는 상속을 내리는 클래스가 크다)
 *                    {
 *                    }
 *                    
 *                    => 객체 생성
 *                       A aa = new A();
 *                       double d = 10.5
 *                       B bb = new B();
 *                       int i = 10
 *                       A cc = new B(); => 묵시적인 형변환  A>B
 *                       double d = 10
 *                       ----   -------
 *                        => 상속을 내린 클래스가 상속을 받은 클래스를 이용해서 메모리 할당이 가능 
 *                        B dd = new A()
 *                        int i = (int)10.5
 *                        --------------- 오류 발생
 *                        
 *                        class 동물
 *                        {
 *                        }
 *                        class 사람 extends 동물  | 위로 올라갈 수록 크다 
 *                        {
 *                        }
 *                        
 *                        동물 a = new 동물() => is-a관계 => 동물은 동물이다 
 *                        사람 b = new 사람() => 사람은 사람이다 
 *                        동물 c = new 사람() => 사람은 동물이다
 *                        사람 d = new 동물() => 동물은 사람이다  is-a (X) 
 *                        -------------------------------
 *                        A a = new B();
 *                        B b = (B)a;
 *                        ------------------ 객체 형변환 (사용자 정의는 거의 없다 => 라이브러리에서 주로 사용)
 *                                                                         ---------
 *                                                                          | Object
 *                    class a
 *                    {
 *                       display(){}
 *                    }
 *                    class B
 *                    {
 *                       A a = new A(); => 포함 has-a ==> A<B
 *                    }
 *                    => 형변환이 없다
 *                    B b = new B();
 *                    b.a.display()
 *           2. 강제 형변환
 *       		A a = new B();
 *       		B b = (B)a;
 *       		=> 리플렉션 (Spring) => 강제 형변환 
 *       
 *           => 제어어 [접근지정어][제어어] 데이터형 변수
 *                   --------------
 *                            | static : 공통적인 => 모든 객체가 동일하게 사용하는 변수, 메소드
 *                            | final : 마지막인 => 변수 : 상수, 메소드,클래스 : 종단
 *                                                          => 정렬
 *                            | abstract : 추상적인 => 미완성된 
 *                    | private , default , protected, public
 *                      -------                        ------
 *                        | 접근 거부                      | 공개
 *          => 클래스 구성
 *             => private : 변수 => 접근이 가능 setter/getter
 *             => 생성자 , 메소드 => public
 *          => 상속
 *             extends 를 사용한다 => 모든 데이터, 메소드가 넘어 온다 
 *             -------
 *             => 상위클래스 제어 : super
 *             => 자신클래스 제어 : this
 *           => 상속을 내리는 클래스는 자신 변수, 메소드만 사용이 가능
 *              상속을 받은 클래스는 자신 변수, 메소드, 상속 내린 클래스의 변수 , 메소드 사용이 가능
 *              
 *           => 객체 생성
 *              클래스명 객체명 = new 생성자()
 *              ------           ------
 *                               | 메소드는 생성자에 따라 결정
 *              | 변수는 클래스명에 따라 결정
 *              
 *           class A
 *           {
 *              int a = 10;
 *              public void display()
 *              {
 *              }
 *           }
 *           Class B extends A
 *           {
 *              int a = 100;
 *              //오버라이딩
 *              public void display()
 *              {
 *              }
 *           }
 *           
 *           A aa = new A();
 *             aa.a = 10, aa.display() => A:display()
 *           B bb = new B();
 *             bb.a = 100, bb.display() => B:display()
 *           A cc = new B();  // 상속이 있는 경우에만 사용이 가능 
 *           --         ---
 *                      cc.display() => B.display() => 메소드는 오버라이딩된 메소드 호출이 된다
 *           cc.a = 10(A가 가지고 있는 변수를 사용)
 *           
 *           상속이 있는 경우에 => 변수는 선언된 클래스 , 메소드는 생성자 를 따라 간다
 *           ------------------------------------------------------
 *             클래스와 생성자가 다른 경우 
 *           ------------------------------------------------------
 *           
 *           다형성 : 오버로딩 / 오버라이딩 
 *                  ---------------
 *                  오버로딩은 같은 메소드명으로 새로운 기능 추가 => 중복 메소드 정의
 *                  오버라이딩 같은 메소드명으로 기존의 기능 수정 => 재정의 
 *          
 *           
 *           -----------------------------------------
 *                          오버로딩      오버라이딩
 *           ------------------------------------------
 *            상태     같은 클래스 내에서   상속을 받은 경우 
 *           ------------------------------------------
 *            메소드명        동일            동일
 *           -----------------------------------------
 *            리턴형        관계없음           동일
 *           -----------------------------------------
 *            매개변수   갯수, 데이터형이 다르다    동일 
 *           ----------------------------------------
 *            접근지정어     관계없다           확장이 가능
 *                                        --------
 *                                        private < default < protected < public
 *                                                                       ------
 *           ----------------------------------------
 *           객체지향 (OOP)
 *             1. 데이터 보호 => 캡슐화 => 변수는 private : 접근금지 , 사용시에는 메소드를 이용할 수 있게 한다
 *                                                           => 읽기(getter) / 쓰기(setter)
 *             2. 재사용 => 변경해서 사용(상속) , 있는 그대로 사용(포함) 
 *             3. 수정 , 추가가 쉽게
 *                      -- 오버로딩  
 *                --오버라이딩
 *             ==> 형식 :  5장,6장
 *             ==> 구현 : 연산자 (3), 제어문(4)
 *      7장
 *       => 인터페이스 
 *      8장
 *       => 예외처리
 *           = 직접 처리 => try ~ catch
 *           = 간접 처리 => throws Exception
 *      ------------------------------------------- 자바 기본형식 (문법)
 *      9장 ~ : 라이브러리 (필요한 메소드)
 *              Math => random() / ceil()
 *       
 */
class A
{
	//default 생성자는 상관이 없다 => 매개변수가 있는 경우에 super => 극히 드물다 (라이브러리)
	public A(int a)
	{
		System.out.println(a);
	}
}
class B extends A
{
	public B(int a)
	{
		super(a); // 매개변수가 있는 생성자가 있는 경우에 반드시 super()를 호출한다
		// 상위 클래스 호출 => 메모리에 저장 => 하위 클래스 메모리를 저장
	}
}
public class MainClass_01 {

	public MainClass_01 {
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
