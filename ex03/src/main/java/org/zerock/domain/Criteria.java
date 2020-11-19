package org.zerock.domain;

import org.springframework.web.util.UriComponentsBuilder;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString    // 페이지를 만드는 가장 기본값
public class Criteria {

	private int pageNum; // 페이지번호
	private int amount; // 몇장
	
	  private String type;
	  private String keyword;
	
	public Criteria() {
		// 다른 생성자 메소드로 호출
		this(1,10);
	}
	// 생성자메소드
	public Criteria(int pageNum, int amount) {
		this.pageNum=pageNum;
		this.amount=amount;
	}
	
	  public String[] getTypeArr() {
		    
	    return type == null? new String[] {}: type.split("");
	  }
	  
	  public String getListLink() {
		  UriComponentsBuilder builder=UriComponentsBuilder.fromPath("")
				  											.queryParam("pageNum", this.pageNum)
				  											.queryParam("amount", this.getAmount())
				  											.queryParam("type", this.getType())
				  											.queryParam("keyword", this.getKeyword());
		  return builder.toUriString();
				  											
	  }
	  
	  
}
