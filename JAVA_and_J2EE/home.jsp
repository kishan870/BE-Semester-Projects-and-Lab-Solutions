<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
input[type=text]{
width:1465px;
box-sizing:content-box;
border:0.2em solid grey;
border-radius:20px;
font-size:16px;
background-image:url('serach.png');
backgound-color:white;
background-position:10px 5px;
background-repeat:no-repeat;
padding:8px 8px 12px 40px;
}
body {
    font-family: "Lato", sans-serif;
    transition: background-color .2s;
}
.sidenav {
    height: 100%;
    width: 0;
    position: fixed;
    z-index: 1;
    top: 0;
    left: 0;
    background-color: #111;
    overflow-x: hidden;
    transition: 0.5s;
    padding-top: 60px;
}
.sidenav a {
    padding: 8px 8px 8px 32px;
    text-decoration: none;
    font-size: 25px;
    color: #818181;
    display: block;
    transition: 0.3s;
}
.sidenav a:hover, .offcanvas a:focus{
    color: #f1f1f1;
}
.sidenav .closebtn {
    position: absolute;
    top: 0;
    right: 25px;
    font-size: 36px;
    margin-left: 50px;
}
#main {
    transition: margin-left .5s;
    padding: 16px;
}
@media screen and (max-height: 450px) {
  .sidenav {padding-top: 15px;}
  .sidenav a {font-size: 18px;}
}
ul {
    list-style-type: none;
    margin: 0;
    padding: 0;
    overflow: hidden;
    background-color: #333;
}
li {
    float: left;
}
li a,.dropbtn {
    display: block;
    color: white;
    text-align: center;
    padding: 18px 40px;
    text-decoration: none;
}
li a:hover,.dropdown:hover {
    background-color: green
}
li.dropdown{
display:inline-block;
}
.dropdown-content{
	display: none;
    position: absolute;
    background-color: #f9f9f9;
    min-width: 160px;
    box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
    z-index: 1;
}
.dropdown-content a{
	color: black;
    padding: 12px 16px;
    text-decoration: none;
    display: block;
    text-align: left;
}
.dropdown-content a:hover{
background-color:#f1f1f1;
}
.dropdown:hover .dropdown-content{
display:block;
}
.pagination {
    display: inline-block;
}
.pagination a {
    color: black;
    float: left;
    padding: 8px 16px;
    text-decoration: none;
    transition: background-color .3s;
}
.pagination a.active {
    background-color: #00FF00;
    color: white;
    }
.pagination a:hover:not(.active) {background-color:rgb(69,203,92);}
    div.sroll{
    background-color:#000FFFF;
    width:800px;
    height:800px;
    overflow-x:scroll;
    -webkit-overflow-scrolling:touch;
    -ms-overflow-style:-ms-autohiding-scrollbar;
    }
body {
    font-family: "Lato", sans-serif;
    transition:background-color .5s;
}
h3{
position:absolute;
right:100px;
top:80px;
color:white;
font-size:80%
}
</style>
</head>
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<body>
<h3>
 <%String s1=session.getAttribute("name").toString();
 out.println("Welcome "+s1);%>
</h3>
<div id="mySidenav" class="sidenav">
  <a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&times;</a>
  <a href="aboutus.html">About Us</a>
  <a href="aboutus.html">Contact</a>
  <a href="login1.html">Logout</a>
  <a href="aboutus.html">Help</a>
</div>
<div id="main">
<span style="font-size:30px;cursor:pointer" onclick="openNav()">&#9776;</span>
</div>
<script>
function openNav() {
    document.getElementById("mySidenav").style.width = "250px";
    document.getElementById("main").style.marginLeft = "250px";
    document.body.style.backgroundColor = "rgba(0,0,0,0.4)";
}
function closeNav() {
    document.getElementById("mySidenav").style.width = "0";
    document.getElementById("main").style.marginLeft = "0";
    document.body.style.backgroundColor = "white";
} 
</script>
<div class="w3 container">
<ul>
  <li><a href="english.html">English</a></li>
  <li><a href="hindi.html">Hindi</a></li>
  <li class="dropdown">
  <a href="javascript:void(0)" class="dropbtn">Regional</a>
  <div class="dropdown-content">
  <a href="regional.html">Kannada</a>
  <a href="regional.html">Telagu</a>
  <a href="regional.html">Tamil</a>
  </div>
  </li>
  
</ul>
<form action="music">
<input type="text" name="search" placeholder="Search here....">
</form>
<p><center><font size="6">Weekly Top 15</font></center></p>

<div class="pagination" >
  <a href="#">&laquo;</a>
  <a href="home?name=despacito"><img src="despacito.jpg" style="width:200px;height:150px"></a>
  <a href="home?name=imtheone"><img src="djkhaled.jpg" style="width:200px;height:150px"></a>
  <a href="home?name=shapeofyou"><img src="shapeofyou.jpeg" style="width:200px;height:150px"></a>
  <a href="home?name=closer"><img src="closer.jpg" style="width:200px;height:150px"></a>
  <a href="home?name=letme"><img src="letme.jpg" style="width:200px;height:150px"></a>
  <a href="home?name=Came-Here-For-Love"><img src="Came-Here-For-Love.jpg" style="width:200px;height:150px"></a>
  <a href="music.html">&raquo;</a>
</div>
<p><center><font size="6">English latest hits</font></center></p>

<div class="pagination" >
  <a href="#">&laquo;</a>
  <a href="home?name=shapeofyou"><img src="shapeofyou.jpeg" style="width:200px;height:150px"></a>
  <a href="home?name=imtheone"><img src="djkhaled.jpg" style="width:200px;height:150px"></a>
  <a href="home?name=complicated"><img src="complicated.jpg" style="width:200px;height:150px"></a>
  <a href="home?name=closer"><img src="closer.jpg" style="width:200px;height:150px"></a>
  <a href="home?name=letme"><img src="letme.jpg" style="width:200px;height:150px"></a>
  <a href="home?name=Came-Here-For-Love"><img src="Came-Here-For-Love.jpg" style="width:200px;height:150px"></a>
  <a href="home">&raquo;</a>
</div>
<p><center><font size="6">Hindi latest hits</font></center></p>
<div class="pagination" >
  <a href="#">&laquo;</a>
  <a href="home?name=Baarish"><img src="h1.jpeg" style="width:200px;height:150px"></a>
  <a href="home?name=Phir Bhi"><img src="h2.jpg" style="width:200px;height:150px"></a>
  <a href="home?name=Baby Marvake Manage"><img src="h3.jpg" style="width:200px;height:150px"></a>
  <a href="home?name=Radha"><img src="h4.jpg" style="width:200px;height:150px"></a>
  <a href="home?name=Naach meri jhaan"><img src="h5.jpg" style="width:200px;height:150px"></a>
  <a href="home?name=Ullu ka patha"><img src="h6.jpg" style="width:200px;height:150px"></a>
  <a href="home">&raquo;</a>
</div>
<p><center><font size="6">Regional latest hits</font></center></p>
<div class="pagination" >
  <a href="#">&laquo;</a>
  <a href="music.html"><img src="r1.jpg" style="width:200px;height:150px"></a>
  <a href="music.html"><img src="r2.jpg" style="width:200px;height:150px"></a>
  <a href="music.html"><img src="r3.jpg" style="width:200px;height:150px"></a>
  <a href="music.html"><img src="r4.jpg" style="width:200px;height:150px"></a>
  <a href="music.html"><img src="r5.jpg" style="width:200px;height:150px"></a>
  <a href="music.html"><img src="r6.jpg" style="width:200px;height:150px"></a>
  <a href="music.html">&raquo;</a>
</div>
</div>
</form>
</body>
</html>
