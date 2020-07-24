#### Introduction
I don't remember where I get this code. But it's going to be our first example.

```getTripsByUser(User user)``` returns the trips of given user.

There will be dummy classes just to make this example compilable. But what we will focus on in ```Example.class```
And our solution will be obviously in ```Solution.class```


#### Refactoring Techniques Used

Refactorings are listed in below. More detailed info can be found in related commits. Also if you look at the commits
one by one, you can also see iterations from the beginning to end. 

1. Let's first get rid of this nested if statements. The reason why we want to get rid of it, it makes difficult to 
   understand the code. Also, we get used to read code top-down. When we see an if statement, we also pay attention to
   else scope. But whole logic in the else is throwing an exception. But we always keep the else part in mind while we are
   reading if block. If we used [GuardClause](https://wiki.c2.com/?GuardClause) or [BouncerPattern](https://wiki.c2.com/?BouncerPattern) 
   we would validate ```loggedUser``` before reading if block. So we didn't have to care about it, after the validation.
   - Refactoring we are going to apply is similar to [Replace Nested Conditional with Guard Clauses](https://refactoring.com/catalog/replaceNestedConditionalWithGuardClauses.html)

2. Now, let's focus on the code below. 
  ````java
        if (isFriend) {
            tripList = TripDAO.findTripsByUser(user);
        }

        return tripList;
  ````   
  If ```isFriend``` is true, we overwritte the ````tripList```` and then return it. What we can do is, simplifying into one line
  How ? Instead of assigning to tripList we can just return that value.
  ````java
    return isFriend ? TripDAO.findTripsByUser(user) : tripList
  ```` 

3. Extract loop into method. It's easier to understand read the method rather than loop. Also it will help us to focus 
   more on the core logic instead of loop. 
   - Apply [Extract Function](https://refactoring.com/catalog/extractFunction.html) 
