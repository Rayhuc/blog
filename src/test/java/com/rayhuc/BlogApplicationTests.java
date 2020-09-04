package com.rayhuc;

import com.rayhuc.mapper.TagMapper;
import com.rayhuc.domain.Tag;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class BlogApplicationTests {

    @Autowired
    private TagMapper tagMapper;

    private List<Long> convertToList(String ids) {
        List<Long> list = new ArrayList<>();
        if (!"".equals(ids) && ids != null) {
            String[] idarray = ids.split(",");
            for (int i=0; i < idarray.length;i++) {
                list.add(new Long(idarray[i]));
            }
        }
        return list;
    }

    @Test
    void contextLoads() {

        String str = "qiqi-dasdas";
        System.out.println(str);
        List<Long> longs = convertToList("1,2,3,");
        List<Tag> tags = new ArrayList<>();
        for (Long aLong : longs) {
            tags.add(tagMapper.getById(aLong));
        }
        for (Tag tag : tags) {
            System.out.println(tag);
        }
    }

}
