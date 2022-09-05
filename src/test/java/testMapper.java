import com.github.pagehelper.PageHelper;
import com.vinay.crud.bean.Dept;
import com.vinay.crud.bean.Stu;
import com.vinay.crud.dao.DeptMapper;
import com.vinay.crud.dao.StuMapper;
import com.vinay.crud.service.StuService;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class testMapper {

    @Test
    public void mapperTest(){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        DeptMapper deptMapper= context.getBean(DeptMapper.class);
        StuMapper bean = context.getBean(StuMapper.class);
        StuService bean1 = context.getBean(StuService.class);
        System.out.println(bean1.getAllStu());
        deptMapper.insertSelective(new Dept(null,"study"));
        SqlSession sqlSession = context.getBean("sqlSession", SqlSession.class);
        StuMapper stuMapper= sqlSession.getMapper(StuMapper.class);
//        insert 1000 data
        for(int i=0;i<1000;i++){
            String uuid= UUID.randomUUID().toString().substring(0,5)+i;
            stuMapper.insertSelective(new Stu(null,uuid,"12345@qq.com",1,1));
        }
        PageHelper.startPage(4,5);
        System.out.println(stuMapper.selectByExampleWithDept(null));
    }

    @Test
    public void deleteTest(){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        StuService stuService= context.getBean(StuService.class);
        List<Integer> integers=new ArrayList<>();
        integers.add(1);
        integers.add(2);
        stuService.deleteBatch(integers);
    }
}
