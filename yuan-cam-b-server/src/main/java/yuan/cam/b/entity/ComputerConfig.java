package yuan.cam.b.entity;

import lombok.Data;
import yuan.cam.b.ContentConst;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Table(name = ContentConst.COMPUTER_CONFIG)
public class ComputerConfig {
    /**
     * 主键id
     */
    @Id
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    /**
     * 商品名称
     */
    @Column(name = "brand")
    private String brand;

    /**
     * 商品类型
     */
    @Column(name = "type")
    private String type;

    /**
     * 商品名称
     */
    @Column(name = "name")
    private String name;

    /**
     * 商品价格
     */
    @Column(name = "price")
    private Double price;

    /**
     * 底价
     */
    @Column(name = "floor_Price")
    private Double floorPrice;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Integer createTime;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Integer updateTime;
}
