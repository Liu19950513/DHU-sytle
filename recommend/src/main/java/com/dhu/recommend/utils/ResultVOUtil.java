package com.dhu.recommend.utils;
import com.dhu.recommend.VO.ResultVO;

/**
 * creater: LIUYING
 * date:2018/8/15 19:23
 */
public class ResultVOUtil {

    public static ResultVO success(Object object) {
        ResultVO resultVO = new ResultVO();
        resultVO.setData(object);
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        return resultVO;
    }
}