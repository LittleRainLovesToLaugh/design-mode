package strategy.simple;

import strategy.simple.enums.SaleTypeStrEnum;

/**
 * @author 谢迪
 * Date 2023年12月16日 15:34:00
 * Description 策略模式-简单实现 {https://mp.weixin.qq.com/s/Vt_mdLicWwkZ8phD1rH6UQ}
 * @Version: v1.0
 */
public interface SaleTypeParseStrategy {
    Integer parse(SaleTypeParseContext saleTypeParseContext);


    /**
     * 注册与发现&策略工厂-Spring容器
     */
    SaleTypeStrEnum support();

    /**
     * 用于判断是否支持( 注册与发现&责任链)
     */
    boolean support(SaleTypeParseContext saleTypeParseContext);

}
