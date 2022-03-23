package com.lpc.demo1.pojo;

import lombok.Data;

@Data
public class UpdatePassForm {

    String userId;
    String oldPassword;
    String newPassword;

}
