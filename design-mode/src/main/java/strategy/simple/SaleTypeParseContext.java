package strategy.simple;

import lombok.Getter;
import lombok.Setter;
import strategy.simple.enums.SaleTypeStrEnum;

/**
 * @author 谢迪
 * Date 2023年12月16日 15:35:00
 * Description 调用上下文
 * @Version: v1.0
 */
@Setter
@Getter
public class SaleTypeParseContext {


    private SaleTypeStrEnum saleTypeStr;

    private SaleTypeParseStrategy parseStrategy;

    public static Integer parseSaleType(String saleTypeStr) {
        SaleTypeStrEnum saleTypeEnum = SaleTypeStrEnum.getByName(saleTypeStr);
        SaleTypeParseContext context = new SaleTypeParseContext();
        context.setSaleTypeStr(saleTypeEnum);
        switch (saleTypeEnum) {
            // 策略路由
            case JX:
                context.setParseStrategy(new JxSaleTypeParseStrategy());
                break;
            // 继续扩展
            default:
                return null;
        }
        return context.parse();
    }

    public Integer parse() {
        return parseStrategy.parse(this);
    }

}
