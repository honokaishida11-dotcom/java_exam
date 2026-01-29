package exam;

import dao.MemberDao;
import dto.Member;

public class LoadMain {

    public static void main(String[] args) {
        MemberDao dao = new MemberDao();

        Member m = dao.load(2);

        if (m != null) {
            System.out.println(
                m.getId() + " " +
                m.getName() + " " +
                m.getAge() + " " +
                m.getDepId()
            );
        }
    }
}
