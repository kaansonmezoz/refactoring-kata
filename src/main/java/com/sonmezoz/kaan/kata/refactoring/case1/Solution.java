package com.sonmezoz.kaan.kata.refactoring.case1;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Trip> getTripsByUser(User user) throws UserNotLoggedInException {
        User loggedUser = UserSession.getInstance().getLoggedUser();
        boolean isFriend = false;

        validateLoggedUser(loggedUser);

        for (User friend : user.getFriends()) {
            if (friend.equals(loggedUser)) {
                isFriend = true;
                break;
            }
        }

        return isFriend ? TripDAO.findTripsByUser(user) : new ArrayList<Trip>();
    }

    private void validateLoggedUser(User loggedUser) throws UserNotLoggedInException {
        if (loggedUser == null) {
            throw new UserNotLoggedInException();
        }
    }
}
