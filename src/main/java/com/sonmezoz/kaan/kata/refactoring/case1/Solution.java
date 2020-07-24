package com.sonmezoz.kaan.kata.refactoring.case1;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Trip> getTripsByUser(User user) throws UserNotLoggedInException {
        User loggedUser = UserSession.getInstance().getLoggedUser();

        validateLoggedUser(loggedUser);

        return isFriendOf(user, loggedUser) ? TripDAO.findTripsByUser(user) : new ArrayList<Trip>();
    }

    private void validateLoggedUser(User loggedUser) throws UserNotLoggedInException {
        if (loggedUser == null) {
            throw new UserNotLoggedInException();
        }
    }

    private boolean isFriendOf(User user, User loggedUser) {
        return user.getFriends().contains(loggedUser);
    }
}
