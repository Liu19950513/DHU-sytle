package com.dhu.user.utils;
import com.dhu.user.VO.ResultVO;

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

    public static ResultVO noExist(Object object) {
        ResultVO resultVO = new ResultVO();
        resultVO.setData(object);
        resultVO.setCode(-1);
        resultVO.setMsg("实例不存在");
        return resultVO;
    }
}