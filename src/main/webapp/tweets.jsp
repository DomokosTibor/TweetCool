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

               <c:forEach items="${tweetList}" var="tweet">
                   <div class="post">
                        <div class="info">
                             ${tweet.getName()}<br>
                             <small>${tweet.getDate()}</small>
                        </div>
                        <div class="message"><div class="arrow"><div class="arrow_inner"></div></div>${tweet.getMessage()}</div>
                   </div>
               </c:forEach>

               <a href="index.jsp">New Tweet</a>

          </div>
	</body>
</html>
