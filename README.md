# Blackjack Project

### How it works

So initially, I bit off more than I could chew on this project and had to backtrack
a lot until I had a working project. I thought if I implemented the larger class structure
I had in mind before I started coding that it'd be easier in the long run once I got it
all working together, but I never got it all working together properly, so I apologize for
the messy code and late commit, shouldn't happen again.

The plan was to implement a casino, create a blackjack table in the casino on launch,
and add the user and the dealer to the table.

The way the project currently works is there's several generic classes, Card, Deck, Hand,
and Dealer. The BlackjackApp creates a new Deck, scanner and hands for the user and dealer.
If either player got blackjack from the deal, it prints that and starts with a new hand.

It then asks the player to hit or stand. The computer then decides to hit or stand. If
one of the hands busts, it stops, prints that and restarts the game.

### What I used

The bulk of the code is being controlled with while loops in the blackjack app. Used the
rank and suit classes to create the new decks.

### What I learned

This was my first project where I feel super frustrated and dissatisfied. I spent too
much time dreaming and designing what I thought the project could some day look like
instead of making meaningful differences and growing the project like that. Going forward
I need to learn how to plan and design better and more efficiently. I think if I'd spent less
time of Saturday trying to decide how a casino would work and more time actually writing
blackjack, the app would've been a lot closer to the product I'd actually envisioned.

### What I still need to learn

Encapsulation. Still. Now the issue feels like it's less so deciding what classes go
where and more so which blocks of codes can be written as methods of a class and where
would I put those methods. I think I understand how to create objects properly but
this was the first project I had where I seemed to lose direction because of the different
possibilities for the way I could structure it.

All in all, had a great time, learned a ton. 
