package cn.bug.chatgpt.domain.billing;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author 小傅哥，微信：fustack
 * @description 消耗列表数据
 * @github https://github.com/fuzhengwei
 * @Copyright 公众号：bugstack虫洞栈 | 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 */
@Data
public class LineItem {
    /** 模型 */
    private String name;
    /** 金额 */
    private BigDecimal cost;
}
