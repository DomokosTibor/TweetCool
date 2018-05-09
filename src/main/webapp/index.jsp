<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<head>
	<title>TweetCool</title>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-2">
	<meta name="content-language" content="English">
	<meta http-equiv="content-language" content="en">
	<meta name="charset" content="ISO-8859-2">
	<meta name="theme-color" content="#ADD8E6">

	<link rel="shortcut icon" type="image/icon" href="images/favicon.ico">

	<link rel="stylesheet" type="text/css" href="index.css">
</head>

<html>
	<body>
          <h1>TweetCool</h1>
          <div class="content">
               <div class="new-tweet">
                <form action="new-tweet" method="post">
                         <input type="text" name="name" placeholder="Your name" value=""><br>
                         <textarea name="message" placeholder="Your message goes here."></textarea>
                         <br>
                         <input type="submit" value="Submit">
                </form>
                <div class="error_message">${error_message}</div>
               </div>
          </div>
	</body>
</html>
