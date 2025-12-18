package cn.coderule.partner.model;

import java.io.Serializable;
import lombok.Data;

@Data
public class Article implements Serializable {
    private int draftNumber;
    private int paragraphNumber;
    private int wordNumber;
}
