import java.util.ArrayList;

public class MemberInfo {
    public static void main(String[] args) {
        ClubMembers clubMembers = new ClubMembers();
        clubMembers.addMembers(new String[]{"Dillon", "Matteus"}, 2026);
        clubMembers.addMembers(new String[]{"Oli", "Bruno"}, 2027);
    }
    private String name;
    private int gradYear;
    private boolean hasGoodStanding;

    public MemberInfo(String name, int gradYear, boolean hasGoodStanding) {
        this.name = name;
        this.gradYear = gradYear;
        this.hasGoodStanding = hasGoodStanding;
    }

    public int getGradYear() {
        return gradYear;
    }

    public boolean inGoodStanding() {
        return hasGoodStanding;
    }
}

class ClubMembers {
    private ArrayList<MemberInfo> memberList = new ArrayList<MemberInfo>();

    public void addMembers(String[] names, int gradYear) {
        for (String name : names) {
            MemberInfo newMember = new MemberInfo(name, gradYear, true);
            memberList.add(newMember);
        }
    }

    public ArrayList<MemberInfo> removeMembers(int year) {
        ArrayList<MemberInfo> graduatedMembers = new ArrayList<>();
        ArrayList<MemberInfo> remainingMembers = new ArrayList<>();

        for (MemberInfo member : memberList) {
            if (member.getGradYear() <= year) {
                if (member.inGoodStanding()) {
                    graduatedMembers.add(member);
                }
            } else {
                remainingMembers.add(member);
            }
        }

        memberList = remainingMembers; // Update memberList

        return graduatedMembers;
    }
}
