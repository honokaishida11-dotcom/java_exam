package exam;

import dao.MemberDao;
import dto.Member;

import java.util.List;

public class FindAllMain {

    public static void main(String[] args) {
        MemberDao dao = new MemberDao();

        List<Member> list = dao.findAll();
        
        for (Member m : list) {
            System.out.println(
                m.getId() + " " +
                m.getName() + " " +
                m.getAge() + " " +
                m.getDepId()
            );
        }
    }
}
