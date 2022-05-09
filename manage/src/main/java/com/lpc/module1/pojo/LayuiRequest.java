package com.lpc.module1.pojo;

import com.lpc.module1.model.MyModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NonNull;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.Serializable;
import java.util.Map;

/**
 * @package:com.lpc.module1.pojo
 * @Author:旁观者
 * @Date:2022/5/6-12:44
 * @By:IntelliJ IDEA
 * @FileName:LayuiRequest.java
 */
@Data
@EqualsAndHashCode
public class LayuiRequest <T extends MyModel> implements Serializable {

    private static final long serialVersionUID = 1L;

    private int page;

    private int nums;

    private T searchParams;
}
