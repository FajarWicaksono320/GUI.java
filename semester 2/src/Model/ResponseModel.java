package Model;

import javax.xml.stream.events.Comment;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class ResponseModel {
    private String Message;
    private String Status;

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }



    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public String getComments() {
        return Comments;
    }

    public void setComments(String comments) {
        Comments = comments;
    }
    private String Comments;

    public ResponseModel(){

    }
    public ResponseModel(String msg, String stts, String comnt){
        this.Message =msg;
        this.Status = stts;
        this.Comments =comnt;
}
}