//package Quiz;
//
//import java.util.ArrayList;
//
//public class Quiz04 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		// 회원리스트 생성
//				ArrayList<Member> list = new ArrayList<>();
//				
//				Member member1 = new Member(1001, "둘리");
//				Member member2 = new Member(1002, "또치");
//				Member member3 = new Member(1003, "도우너");
//				Member member4 = new Member(1004, "고길동");
//				
//				list.add(member1);
//				list.add(member2);
//				list.add(member3);
//				list.add(member4);
//
//				System.out.println("MemberArrayList를 생성하고 4명의 회원을 추가하세요!");
//				System.out.println(list.get(0)); // 회원꺼내기
//				System.out.println(list.get(1));
//				System.out.println(list.get(2));
//				System.out.println(list.get(3));
//				
//				System.out.println("MemberArrayList에 1004번 회원이 있으면 삭제하세요!");
//				System.out.println("1004번 회원을 삭제 하였습니다.");
//				list.remove(3);
//				System.out.println(list);
//	}
//
//}
//
//
////쇼핑몰 회원
//class Member {
//	
//	int memberId; //회원아이디
//	String memberName; // 회원이름
//	public Member(int memberId, String memberName) {
//		super();
//		this.memberId = memberId;
//		this.memberName = memberName;
//	}
//	@Override
//	public String toString() {
//		return "Member [memberId=" + memberId + ", memberName=" + memberName + "]";
//	}
//}



package Quiz;

import java.util.ArrayList;

//쇼핑몰 회원
class Member {
    int memberId; //회원아이디
    String memberName; // 회원이름

    public Member(int memberId, String memberName) {
        this.memberId = memberId;
        this.memberName = memberName;
    }

    @Override
    public String toString() {
        return "Member [memberId=" + memberId + ", memberName=" + memberName + "]";
    }
}

public class Quiz04 {

    public static void main(String[] args) {
        // 회원리스트 생성
        ArrayList<Member> list = new ArrayList<>();

        // 회원 추가
        Member member1 = new Member(1001, "둘리");
        Member member2 = new Member(1002, "또치");
        Member member3 = new Member(1003, "도우너");
        Member member4 = new Member(1004, "고길동");

        // 회원 리스트에 추가
        list.add(member1);
        list.add(member2);
        list.add(member3);
        list.add(member4);

        // 회원 리스트 출력
        System.out.println("MemberArrayList를 생성하고 4명의 회원을 추가하세요!");
        for (Member member : list) {
            System.out.println(member);
        }

        System.out.println("MemberArrayList에 1004번 회원이 있으면 삭제하세요!");
        deleteMember(list, 1004);

		System.out.println("1004번 회원을 삭제 하였습니다.");
        for (Member member : list) {
            System.out.println(member);
        }
    }

    // 회원 삭제 메소드
    public static void deleteMember(ArrayList<Member> list, int memberId) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).memberId == memberId) {
                list.remove(i);
                return;
            }
        }
        System.out.println("해당 ID를 가진 회원이 존재하지 않습니다.");
    }
}