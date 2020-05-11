package com.storm.server.service;

import com.storm.server.domain.Chapter;
import com.storm.server.domain.ChapterExample;
import com.storm.server.dto.ChapterDto;
import com.storm.server.mapper.ChapterMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author ckf48
 */
@Service
public class ChapterService {

    @Resource
    private ChapterMapper chapterMapper;

    public List<ChapterDto> list() {
        ChapterExample chapterExample = new ChapterExample();
        List<Chapter> chapters = chapterMapper.selectByExample(null);
        List<ChapterDto> chapterDtos = new ArrayList<>();
        for (Chapter chapter : chapters) {
            ChapterDto chapterDto = new ChapterDto();
            BeanUtils.copyProperties(chapter, chapterDto);
            chapterDtos.add(chapterDto);
        }
        return chapterDtos;
    }
}
