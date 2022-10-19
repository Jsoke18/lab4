
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">

        <title>Login</title>
    </head>
    <body>
        
        <div class="p-3 mb-2 bg-white text-dark"> 

 <div class="card text-bg-info mb-3" style="max-width: 18rem;">
  <div class="card-header">Sokes Software</div>
  <div class="card-body">
    <p class="card-text">Example login page completed In Java, HTML and CSS</p>
 

       <div class="container"> 
           <div class="row"> 
                  <div class="col-12">      
                      <h1 class="my-5">Login</h1>

        <form action="login" method="post"> 
            
          
            <div class="form-floating mb-3">
                <input type="text" class="form-control" id="floatingInput" name="username">
                    <label for="password">Username</label>
            </div>
            <div class="form-floating">
                 <input type="password" class="form-control" id="floatingPassword" name="password">
                 <p> 
                 
                 </p>
 <button type="submit" class="btn btn-warning">submit</button>

                    <label for="password">Password</label>
            </div>
                    
                        </form>
                    <p>${message}</p>

            </div>
           </div> 
         </div> 
        </div>
        </div>
                    </div>
                    
           </div>
</div>
 
    </body>
</html>
