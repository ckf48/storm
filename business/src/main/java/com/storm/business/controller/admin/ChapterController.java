package com.storm.business.controller.admin;

import com.storm.server.domain.Chapter;
import com.storm.server.dto.ChapterDto;
import com.storm.server.service.ChapterService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author ckf48
 */
@RestController
@RequestMapping("/admin")
public class ChapterController {

    @Resource
    private ChapterService chapterService;

    @RequestMapping("/chapter")
    public List<ChapterDto> chapter() {
        return chapterService.list();
    }
}