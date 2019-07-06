package com.java110.web.smo.notice;

import com.java110.core.context.IPageData;
import org.springframework.http.ResponseEntity;

/**
 * 添加公告接口
 *
 * add by wuxw 2019-06-30
 */
public interface IDeleteNoticeSMO {

    /**
     * 添加公告
     * @param pd 页面数据封装
     * @return ResponseEntity 对象
     */
    ResponseEntity<String> deleteNotice(IPageData pd);
}
