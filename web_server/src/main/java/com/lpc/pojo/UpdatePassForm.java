package com.lpc.pojo;

import lombok.Data;

@Data
public class UpdatePassForm {

    String userId;
    String oldPassword;
    String newPassword;

}
