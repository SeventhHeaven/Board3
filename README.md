# Board3  
Getting Started Programming Series 3  

「プログラム事始め」シリーズ　その3です。  
Javaです。  

ただただボードゲーム風に画面にボタンを並べるだけです。  
今どきJavaのSwingのGUIの需要がどのくらいあるかわかりませんが、  
オブジェクト指向プログラミングの雰囲気を勉強するには、  
なかなかいい題材ではないかと。  
なんとなくオセロっぽく見えませんか？（見えないか）  

JDKがあればLinuxでもWindowsでも。  
（Linuxの場合はX-Window環境が必要）  
javac Board3.java  
でコンパイル、  
java Board3  
で実行です。  

表示するボタンの数は、  
>   private final int tate = 8;  
>   private final int yoko = 8;  

のtate, yokoを変えて再コンパイルです。  
Board1, Board2もそうでしたが、  
そのような変更の際に、定数の変更だけで  
対応する工夫がプログラムには必要です。  
プログラム保守を効率化できるだけではなく、  
なにより修正漏れなどによるバグを防ぐことができます。  
