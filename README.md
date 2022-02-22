# Point*
<p>Point*: An interpreted turing-complete programming language built using Java.</p>
<a href="https://www.java.com/en/"> <img src="https://img.shields.io/badge/Java-831299?style=for-the-badge&logo=java&logoColor=white"></a>
<a href="https://www.jetbrains.com/idea"> <img src="https://img.shields.io/badge/IntelliJ-lightblue?style=for-the-badge&logo=intellij&logoColor=darkblue"></a>

<img src="https://github.com/prabhav-pandya/point-star/blob/master/logo.png" height="200px">

<p>
Users can either write code directly in the terminal or pass a text file address as an argument while running the main file. 
The language supports basic functionalities like variable declaration, print, loops(for & while) and functions.<br>
The code goes through the following steps:
<ol>
  <li>Lexical Analysis</li>
  <li>Parsing</li>
  <li>AST Generation</li>
  <li>Evaluation</li>
</ol>
</p>
<br>
<p>Here's a basic Point* program code:</p>

```
def fib(n) {
  if (n <= 1) return n;
  return fib(n - 2) + fib(n - 1);
}

var a = 1;
var b = a<2;

if(b){
  print "Condition satisfied";
  for (var i = 0; i < 20; i = i + 1) {
    print fib(i);
  }
}
```
<br>
Reference taken from: <a href="http://www.craftinginterpreters.com/">Crafting Interpreters</p>
