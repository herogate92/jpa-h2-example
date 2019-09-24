package com.jpa.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.demo.domain.Customer;

/*
 * 보통 ibatis/MyBatis 등에서 Dao라고 불리는 DB Layer 접근자입니다.
JPA에선 Repository라고 부르며 인터페이스로 생성합니다.
단순히 인터페이스를 생성후, JpaRepository<Entity클래스, PK타입>를 상속하면 기본적인 CRUD 메소드가 자동생성 됩니다.
특별히 @Repository를 추가할 필요도 없습니다.
 */
public interface CustomerRepository extends JpaRepository<Customer, Long>
{
    //비워있어도 잘 작동함.
    // long 이 아니라 Long으로 작성. ex) int => Integer 같이 primitive형식 사용못함
	
	public List<Customer> findByName(String name);
    public List<Customer> findByPhone(String phone);
    //like검색도 가능
    public List<Customer> findByNameLike(String keyword);	
}