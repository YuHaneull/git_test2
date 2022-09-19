package git_test2;

public class Hello {
<<<<<<< HEAD
    
    String message = "안녕하세요";
=======

    String message;

    public Hello() {
        this("안녕하세요");
    }

    public Hello(String message) {
        this.message = message;
    }
>>>>>>> 4430ce80cf45fad6a5b4b1424fffd2bf3344474b

    public String say() {
        return message;
    }

}


<<<<<<< HEAD



=======
>>>>>>> 4430ce80cf45fad6a5b4b1424fffd2bf3344474b
