package com.example.myapplication.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PromotionExample {

@SerializedName("status")
@Expose
private Integer status;
@SerializedName("code")
@Expose
private Integer code;
@SerializedName("result")
@Expose
private List<Result> resultPromo = null;
@SerializedName("message")
@Expose
private String message;

public Integer getStatus() {
return status;
}

public void setStatus(Integer status) {
this.status = status;
}

public Integer getCode() {
return code;
}

public void setCode(Integer code) {
this.code = code;
}

public List<Result> getResultPromo() {
return resultPromo;
}

public void setResult(List<Result> result) {
this.resultPromo = resultPromo;
}

public String getMessage() {
return message;
}

public void setMessage(String message) {
this.message = message;
}

}