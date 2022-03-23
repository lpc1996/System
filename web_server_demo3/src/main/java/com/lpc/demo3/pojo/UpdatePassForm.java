package com.lpc.demo3.pojo;

import lombok.Data;

@Data
public class UpdatePassForm {

    String userId;
    String oldPassword;
    String newPassword;

}
