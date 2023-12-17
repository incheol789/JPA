package jpabook.jpashop.controller;

import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class BookForm {

	private Long id;

	@NotEmpty(message = "상품 이름을 입력해주세요")
	private String name;

	private int price;
	private int stockQuantity;

	private String author;
	private String isbn;
}
