
package ca.sait.services;

import ca.servlets.models.User;

public class AccountService {
    
    public AccountService() {
        
    }
    public User login(String username, String password ){
        if ("abe".equals(username)&& "password".equals(password)){
            User user = new User(username, password);
            return user;
        } else if("barb".equals(username) && "password".equals(password)){
            User user = new User(username, password);
            return user;
        } else{ 
            return null;
        }
            
    }
    
}
