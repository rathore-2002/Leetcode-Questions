class Solution {
    public int bulbSwitch(int n) {
    
        return (int)Math.floor(Math.sqrt(n));
    }
}

/*
Each bulb is initially switched OFF.
After the first round, "every first bulb" (i.e. each bulb) is toggled and thus switched ON.
After the second round, every second bulb is toggled.
.
.
.
After the ith round, every ith bulb is toggled.

So, for example, the 20th bulb is toggled in the following rounds : 1,2,4,5,10,20.
The 25th bulb is toggled every 1st,5th and in the 25th round.

Notice that the number of times each bulb is toggled is equal to the number of its factors.
Also notice that if we toggle a bulb even number of times, it goes back to its original OFF state.

Since every number,except perfect squares, has an even number of factors, the number of bulbs in the ON state after n toggles will be equal to the number of perfect squares <= n.

}*/