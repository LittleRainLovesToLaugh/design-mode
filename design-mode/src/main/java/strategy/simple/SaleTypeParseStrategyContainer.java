package strategy.simple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import strategy.simple.enums.SaleTypeStrEnum;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * @author 谢迪
 * Date 2023年12月16日 15:50:00
 * Description 请参考 https://mp.weixin.qq.com/s/Vt_mdLicWwkZ8phD1rH6UQ
 * @Version: v1.0
 */
@Component
public class SaleTypeParseStrategyContainer {

    public final static Map<SaleTypeStrEnum, SaleTypeParseStrategy> STRATEGY_MAP = new HashMap<>();

    @Autowired
    private List<SaleTypeParseStrategy> parseStrategyList;

    @PostConstruct
    public void init() {
        parseStrategyList.forEach(strategy -> STRATEGY_MAP.put(strategy.support(), strategy));
    }

    public Integer parse(SaleTypeParseContext saleTypeParseContext) {
        return Optional.ofNullable(STRATEGY_MAP.get(saleTypeParseContext.getSaleTypeStr())).map(strategy -> strategy.parse(saleTypeParseContext)).orElse(null);
    }

    /**
     * 注册与发现&责任链
     */
    public Integer parseChain(SaleTypeParseContext saleTypeParseContext) {
        return parseStrategyList.stream()
                .filter(strategy -> strategy.support(saleTypeParseContext))
                // findAny ：返回流中任意一个元素
                .findAny()
                .map(strategy -> strategy.parse(saleTypeParseContext))
                .orElse(null);
    }

}
