package cn.springlcoud.gray.event;

import cn.springcloud.gray.model.GrayInstance;
import lombok.Data;

/**
 * @author saleson
 * @date 2020-02-03 09:38
 */
@Data
public class GrayInstanceEvent extends GrayEvent<GrayInstance> {


    @Override
    public String getSourceId() {
        return getSource().getInstanceId();
    }

}
