package strategy.simple;

import strategy.simple.enums.SaleTypeIntEnum;
import strategy.simple.enums.SaleTypeStrEnum;

/**
 * @author 谢迪
 * Date 2023年12月16日 15:37:00
 * Description   策略实现
 * @Version: v1.0
 */
public class JxSaleTypeParseStrategy implements SaleTypeParseStrategy {
    @Override
    public Integer parse(SaleTypeParseContext saleTypeParseContext) {
        return SaleTypeIntEnum.JX.getCode();
    }

    @Override
    public SaleTypeStrEnum support() {
        return SaleTypeStrEnum.JX;
    }

    @Override
    public boolean support(SaleTypeParseContext saleTypeParseContext) {
        return SaleTypeStrEnum.JX.equals(saleTypeParseContext.getSaleTypeStr());
    }

}

