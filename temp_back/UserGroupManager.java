// package Splitwise_temp.GROUP;

// import Splitwise_temp.USER.User;

import java.util.List;
import java.util.ArrayList;

public class UserGroupManager {
    private List <UserGroup> groupLists; // all groups are stored in this list

    public UserGroupManager(){
        groupLists = new ArrayList<>();
    }

    //creating a group
    public void createUserGroup(String groupId, String groupName, User createdByUser){
        // new group
        UserGroup group = new UserGroup();
        group.setGroupId(groupId);
        group.setGroupName(groupName);

        group.addUser(createdByUser); // adding User to group list (single group)

        groupLists.add(group); // adding group into groupList
    }

    // searching for particular group in groupList through groupId
    public UserGroup getGroup(String groupId){
        for(UserGroup group : groupLists){
            if(group.getGroupId().equals(groupId)){
                return group;
            }
        }

        return null;
    }
}
