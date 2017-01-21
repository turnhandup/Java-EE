
<html>
<!---METADATA--->
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width,initial-scale=1,maximum-scale = 1.0">
	<meta name="description" content="Great resource which will help you to find your best sport team to play with" />
	<title></title> 
    
    <!---FONTS--->
	<link href='http://fonts.googleapis.com/css?family=Roboto:300,400' rel='stylesheet' type='text/css'>
    <link href="https://fonts.googleapis.com/css?family=Open+Sans+Condensed:300|Playfair+Display|Roboto+Condensed|Ubuntu+Condensed" rel="stylesheet">
    
    <!---CSS--->
     <link rel="stylesheet" href="css/main.css">

    <!--JAVASCRIPT-->
    <script type="text/javascript" src="js/jquery.1.10.2.min.js"></script>
    <script type="text/javascript" src="js/main.js"></script>
    
    <!--BOOTSTRAP-->
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    <!-- Optional theme -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">
    <!-- Latest compiled and minified JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
    
    <!--LESS-->
    <!-- LESS JavaScript компілятор -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/less.js/2.5.3/less.min.js"></script>
    
<body>
<div class="container">
        <div class="card card-container" style="width:300px;margin:auto;">
        	<h1>Hey,admin, you password is 123456</h1>
            <p id="profile-name" class="profile-name-card"></p>
            <form class="form-signin" action="/PoliakovaServletHomework/Authentication" method="POST">
                <span id="reauth-email" class="reauth-email"></span>
                <input type="text" id="inputEmail" class="form-control" placeholder="Username" name="name" required autofocus>
                <input type="password" id="inputPassword" class="form-control" placeholder="Password" name="passwrd" required>
                <button class="btn btn-lg btn-primary btn-block btn-signin" type="submit" action="/PoliakovaServletHomework/Authentication">Sign in</button>
               
                
            </form><!-- /form -->
           
        </div><!-- /card-container -->
    </div><!-- /container -->
</body>
</html>
