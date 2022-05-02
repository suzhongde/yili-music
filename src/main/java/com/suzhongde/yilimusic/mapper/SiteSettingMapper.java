package com.suzhongde.yilimusic.mapper;

import com.suzhongde.yilimusic.dto.SiteSettingDto;
import com.suzhongde.yilimusic.vo.SiteSettingVo;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SiteSettingMapper {
    SiteSettingVo toVo(SiteSettingDto siteSettingDto);
}