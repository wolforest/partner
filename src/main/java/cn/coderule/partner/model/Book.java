package cn.coderule.partner.model;

import java.io.Serializable;
import lombok.Data;

@Data
public class Book implements Serializable {
    private int chapterNumber;
    private int pageNumber;
    private int wordNumber;
}
