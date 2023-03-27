package exception23;

public class email {

    private String email;

    public email(String email) {
      
        String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
        // if(email.contains("@"))
        if(email.matches(regex)){
            this.email = email;
        }
        else{
            throw new IllegalEmailException("Invalid Email inputed");
        }
        
    }

    public email() {

    }

    public String getemail() {
        return email;
    }

    public void setemail(String email) {
        this.email = email;
    }


}
