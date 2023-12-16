package strategy.simple.enums;


import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author 谢迪
 * Date 2023年12月16日 15:36:00
 * Description
 * @Version: v1.0
 */
@AllArgsConstructor
@Getter
public enum SaleTypeStrEnum {
    JX(1),
    // OTHERS
    ;
    /**
     * 预热转换关系到内存
     */
    private static final Map<String, SaleTypeStrEnum> NAME_MAP = Arrays.stream(SaleTypeStrEnum.values()).collect(Collectors.toMap(SaleTypeStrEnum::name, Function.identity()));
    private final Integer code;

    public static SaleTypeStrEnum getByName(String saleTypeStr) {
        return NAME_MAP.get(saleTypeStr);
    }

}
