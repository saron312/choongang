package com.example.ex2.repository;

import com.example.ex2.entity.Memo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface MemoRepository extends JpaRepository<Memo,Long> {
    List<Memo> findByMnoBetweenOrderByMnoDesc(Long from,Long to);
//    List<Memo> findByMnoLessThan(long from);

    Page<Memo> findByMnoLessThan(long from, Pageable pageable);

    List<Memo> findByMemoTextLike (String txt);
    List<Memo> findAllByOrderByMemoTextDesc();
    Long countByMemoTextLike(String txt);
}