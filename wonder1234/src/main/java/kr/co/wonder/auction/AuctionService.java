package kr.co.wonder.auction;

import java.util.List;
import java.util.Map;

import org.springframework.web.multipart.MultipartFile;

public interface AuctionService {
//	//경매 리스트 페이징
//	public List<AuctionBoardDTO>listPage(int page) throws Exception;
//	//경매 상품 목록보기 메소드
//	//public List<AuctionBoardDTO> list() throws Exception;
//	public List<AuctionBoardDTO> list(AuctionPageVO pag) throws Exception;
	//경매 목록 읽기 메소드
	public AuctionBoardDTO auctionproductdetail(String ab_id) throws Exception;
	public AuctionBoardDTO auctionproductdetail2(String ab_id) throws Exception;
	
	//경매 상품 등록 메소드
	public int auctionaddproduct(AuctionBoardDTO auctionBoardDTO) throws Exception;
	//경매 상품 수정 메소드
	public int auctionproductupdate(AuctionBoardDTO auctionBoardDTO) throws Exception;
	//경매 상품 삭제 메소드
	public int auctionproductdelete(String ab_id) throws Exception;
	//업로드
	public String uploadFile(MultipartFile[] upload) throws Exception;
//	//댓글 목록
//	public List<AuctionBoardReplyDTO> auctionproductdetail1(String ab_id) throws Exception;
//	//댓글 쓰기
	
	//댓글 읽기
	//댓글 수정
	//댓글 삭제

	//경매 카테고리별 목록
	//경매 상품 등록 메소드
	
	//경매 상품 등록 확인 메소드
	//경매 상품 입찰 메소드
	public int pricecheck(String ab_id) throws Exception;
	public int updatebid(AuctionBid auctionBid) throws Exception;

	//경매 상품 입찰 확인 메소드
	//경매 상품 삭제 메소드
	//경매 상품 신고하기 메소드
	//경매 페이징1
	public List<AuctionBoardDTO> listAll() throws Exception;
	public List<AuctionBoardDTO> listPage(int page) throws Exception;
	public List<AuctionBoardDTO> listAuctionPageMaker(AuctionPageVO pag) throws Exception;
	//경매 totalCount
	public int contPaging(AuctionPageVO pag) throws Exception;
}
