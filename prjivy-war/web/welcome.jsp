<%-- 
    Document   : welcome
    Created on : Jul 7, 2017, 7:05:40 PM
    Author     : Gulshat
--%>

<%@page import="entities.Faculties"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>

        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>${name}</title>

        <!-- Bootstrap Core CSS -->
        <link href="css/bootstrap.min.css" rel="stylesheet">

        <!-- Custom CSS -->
        <link href="css/modern-business.css" rel="stylesheet">

        <!-- Custom Fonts -->
        <link href="font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">

        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
            <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
            <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->

    </head>

    <body>

        <!-- Navigation -->
        <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
            <div class="container">
                <!-- Brand and toggle get grouped for better mobile display -->
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="index.html">Ivy League Universities</a>
                </div>
                <!-- Collect the nav links, forms, and other content for toggling -->
                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                    <ul class="nav navbar-nav navbar-right">
                        <li>
                            <a href="index.html">Home</a>
                        </li>
                        <li>
                            <a href="#about">About</a>
                        </li>
                        <li>
                            <a href="#fac">Faculties&Programs</a>
                        </li>
                        
                         <li>
                            <a href="application.html" class="btn btn-primary btn-lg active" role="button" aria-pressed="true">Apply</a>
                        </li>
                    </ul>
                </div>
                <!-- /.navbar-collapse -->
            </div>
            <!-- /.container -->
        </nav>

        <!-- Header Carousel -->
        <header id="myCarousel" class="carousel slide">
            <!-- Indicators -->
            <ol class="carousel-indicators">
                <li data-target="#myCarousel" data-slide-to="0" class="active"></li>

            </ol>

            <!-- Wrapper for slides -->
            <div class="carousel-inner">
                <div class="item active">
                    <div class="fill" style="background-image:url('${image}');"></div>
                    <div class="carousel-caption">
                        <h2>${name}</h2>
                    </div>
                </div>
            </div>


        </header>

        <!-- Page Content -->
        <div class="container">

            <!-- Marketing Icons Section -->
            <div class="row">
                <div class="col-lg-12">
                    <h1 class="page-header">
                        Welcome to the ${name}'s page
                    </h1>
                </div>
                <div class="col-md-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <h4><i class="fa fa-fw fa-compass"></i>Goal:</h4>
                        </div>
                        <div class="panel-body">
                            <p>${descr}</p>
                        </div>
                    </div>
                </div>
            </div>
            <!-- /.row -->

            <!-- Portfolio Section -->
            <div class="row">
                <div class="col-lg-12">
                    <h2 class="page-header" id="about">About</h2>
                </div>

                <div class="col-md-4 col-sm-6">
                    <dl class="dl-horizontal">
                        <dt>Age</dt>
                        <dd>${age}</dd>
                    </dl>
                </div>


                <div class="col-md-4 col-sm-6">
                    <dl class="dl-horizontal">
                        <dt>Total staff</dt>
                        <dd>${staffNum}</dd>
                    </dl>
                </div>

                <div class="col-md-4 col-sm-6">
                    <dl class="dl-horizontal">
                        <dt>Total of students</dt>
                        <dd>${studNum}</dd>
                    </dl>
                </div>


                <div class="col-md-4 col-sm-6">
                    <dl class="dl-horizontal">
                        <dt>Status</dt>
                        <dd>${status}</dd>
                    </dl>
                </div>



                <div class="col-md-4 col-sm-6">
                    <dl class="dl-horizontal">
                        <dt>International staff</dt>
                        <dd>${iStuff}</dd>
                    </dl>   
                </div>

                <div class="col-md-4 col-sm-6">
                    <dl class="dl-horizontal">
                        <dt>International students</dt>
                        <dd>${interStudNum}</dd>
                    </dl>
                </div>
            </div>
            <!-- /.row -->
            <hr>
            
            
               <div class="row">
                <div class="col-lg-12">
                    <h2 class="page-header" id="fac">Faculties</h2>
                </div>
              <div class="col-md-6 col-sm-6">
                    <dl class="dl-horizontal">
                        <dt>${program0}</dt>
                        <dd>${faculty0}</dd>
                    </dl>   
                </div>
            
                      <div class="col-md-6 col-sm-6">
                    <dl class="dl-horizontal">
                        <dt>${program4}</dt>
                        <dd>${faculty4}</dd>
                    </dl>   
                </div>
            </div>
                    
                 
                    
                <!-- Footer -->
                <footer>
                    <div class="row">
                        <div class="col-lg-12">
                            <p>Copyright &copy; Ablakasova 2017</p>
                        </div>
                    </div>
                </footer>

            </div>
            <!-- /.container -->

            <!-- jQuery -->
            <script src="js/jquery.js"></script>

            <!-- Bootstrap Core JavaScript -->
            <script src="js/bootstrap.min.js"></script>

            <!-- Script to Activate the Carousel -->
            <script>
                $('.carousel').carousel({
                    interval: 5000 //changes the speed
                })
            </script>

    </body>

</html>
