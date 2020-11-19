package org.zerock.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.BoardVO;
import org.zerock.domain.Criteria;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardMapperTests {
	
	@Setter(onMethod_ = @Autowired)
	private BoardMapper mapper;
	
	
	/*
	 * @Test public void testPaging() { Criteria cri = new Criteria(); // 10장씩 3페이지
	 * // 페이지 수 cri.setPageNum(3); // 목록 수 cri.setAmount(10); List<BoardVO> list =
	 * mapper.getListWithPaging(cri); list.forEach(board->log.info(board)); }
	 */
	
	
	/*
	 * @Test public void testGetList() { BoardVO board = new BoardVO();
	 * board.setTitle("100번째 테스트 게시물!!"); board.setContent("100번째 게시물 내용 입니다");
	 * board.setWriter("user1");
	 * 
	 * mapper.getList(); log.info(board);
	 * 
	 * }
	 */
	/*
	 * @Test public void testInsert() {
	 * 
	 * BoardVO board = new BoardVO(); board.setTitle("korea 새로 작성하는 글");
	 * board.setContent("korea새로 작성하는 내용"); board.setWriter("korea");
	 * 
	 * mapper.insert(board);
	 * 
	 * log.info(board); }
	 */
	
	 
	/*
	 * @Test public void insertTest() throws Exception{ for(int i = 1; i <= 3000;
	 * i++){ BoardVO vo = new BoardVO(); vo.setTitle(i + "번째 테스트 게시물!!");
	 * vo.setContent(i + "번째 게시물내용입니다~~~"); vo.setWriter("user" + i);
	 * mapper.insert(vo); log.info(vo); } }
	 */
	/*
	 * @Test public void testInsertKey() {
	 * 
	 * BoardVO board = new BoardVO(); board.setTitle("새로 작성하는 글 select key");
	 * board.setContent("새로 작성하는 내용 select key"); board.setWriter("newbie");
	 * 
	 * mapper.insertSelectKey(board);
	 * 
	 * log.info(board); }
	 
	*/
	@Test
	public void testRead() {
		
		//존재하는 게시물 번호로 테스트
		BoardVO board = mapper.read(100L); //long타입
		
		log.info(board);
		
	}
	
	
	/*
	 * @Test public void testDelete() { log.info("DELETE COUNT: " +
	 * mapper.delete(8L)); }
	 
		*/
	/*
	 * @Test public void testUpdate() {
	 * 
	 * BoardVO board = new BoardVO();
	 * 
	 * board.setBno(1L); board.setTitle("글 제목 수정"); board.setContent("글 내용 수정");
	 * board.setWriter("user1");
	 * 
	 * int count = mapper.update(board); log.info("UPDATE COUNT: " + count); }
	 */
}
