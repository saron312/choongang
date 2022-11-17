package com.example.ex2.repository;

import com.example.ex2.entity.Memo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

@SpringBootTest
public class MemoRepositoryTests {
    @Autowired
    MemoRepository memoRepository;

    @Test
    public void testPageDefault(){
        Pageable pageable = PageRequest.of(0,10);

        Page<Memo> result = memoRepository.findAll(pageable);
        System.out.println(result);

        System.out.println("-------------------");
        System.out.println("총 "+result.getTotalPages()+" 페이지");
        System.out.println(+result.getTotalElements()+"현재 페이지 번호");
        System.out.println(result.getNumber()+" 페이지");
        System.out.println("페이지 당 데이터는 "+result.getSize()+"개 입니다.");
        System.out.println("다음 페이지 존재 여부: "+result.hasNext());
        System.out.println("시작 페이지 여부: "+result.isFirst());

        result.stream().forEach(i->{
            System.out.println(i.getMno()+i.getMemoText());
        });
    }



//    @Test
//    public void testPageDefault(){
//        Pageable pageable = PageRequest.of(0,10);
//        Page<Memo> result = memoRepository.findAll(pageable);
//        System.out.println(result);
//    }

    @Test
    public void testQueryMethods5(){
        Long result = memoRepository.countByMemoTextLike("%7%");

        System.out.println(result +"건 나왔습니다.");
    }

    @Test
    public void testQueryMethods4(){
        List<Memo> list = memoRepository.findAllByOrderByMemoTextDesc();

        for(Memo memo : list){
            System.out.println(memo);
        }
    }

    @Test
    public void testQueryMethods3(){
        List<Memo> list = memoRepository.findByMemoTextLike("%7%");

        for(Memo memo : list){
            System.out.println(memo);
        }
    }

    @Test
    public void testQueryMethods2(){
        Pageable pageable = PageRequest.of(3,10);
        Page<Memo> list = memoRepository.findByMnoLessThan(80L,pageable);
        for(Memo memo:list){
            System.out.println(memo);
        }
    }

//    @Test
//    public void testQueryMethods2(){
//        List<Memo> list = memoRepository.findByMnoLessThan(10L);
//        for(Memo memo:list){
//            System.out.println(memo);
//        }
//    }

    @Test
    public void testQueryMethods(){
        List<Memo> list = memoRepository.findByMnoBetweenOrderByMnoDesc(70L,80L);

//        list.stream().forEach(i->{
//            System.out.println(i);
//        });

        for (Memo memo : list){
            System.out.println(memo);
        }
    }

    @Test
    public void testDelete(){
        Long mno = 100L;

        memoRepository.deleteById(mno);
    }

    @Test
    public void testUpdate(){
        Memo memo = Memo.builder().mno(100L).memoText("Update Text").build();
        System.out.print(memoRepository.save(memo));

    }

    @Transactional
    @Test
    public void testSelect2(){
        Long mno = 100L;

        Memo memo = memoRepository.getOne(mno);
        System.out.println("---------------------------");

        System.out.println(memo);
    }

    @Test
    public void testSelect(){
        Long mno = 100L;

        Optional<Memo> result = memoRepository.findById(mno);

        System.out.println("===========================");

        if(result.isPresent()){
            Memo memo = result.get();
            System.out.println(memo);
        }
    }

    @Test
    public void testInsertDummies(){
        IntStream.rangeClosed(1,100).forEach(i->{
            Memo memo = Memo.builder().memoText("샘플..."+i).build();
            memoRepository.save(memo);
        });
    }
}
