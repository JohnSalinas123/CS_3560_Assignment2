package src;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import Visitor.SysEntryVisitor;

public class Group implements SysEntry {

    private UUID ID;
    private String groupName;

    private List<SysEntry> listOfSysEntry;

    // A3: add date of creation
    long creationTime;

    public Group(String groupName) {
        this.groupName = groupName;
        this.listOfSysEntry = new ArrayList<SysEntry>();
        this.creationTime = System.currentTimeMillis();

    }

    public void addUser(User user) {
        this.listOfSysEntry.add(user);
    }

    public String getName() {
        return this.groupName;
    }

    @Override
    public Boolean isGroup() {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public String getID() {
        // TODO Auto-generated method stub
        return this.ID.toString();
    }

    @Override
    public int accept(SysEntryVisitor visitor) {
        // TODO Auto-generated method stub

        return 0;

    }

}
