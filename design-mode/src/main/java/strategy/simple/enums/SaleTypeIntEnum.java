package strategy.simple.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author 谢迪
 * Date 2023年12月16日 15:38:00
 * Description
 * @Version: v1.0
 */
@AllArgsConstructor
@Getter
public enum SaleTypeIntEnum {
    JX(1),
    // OTHERS
    ;
    private final Integer code;
}
