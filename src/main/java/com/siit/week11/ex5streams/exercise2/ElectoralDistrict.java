package com.siit.week11.ex5streams.exercise2;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.stream.Collectors;

public enum ElectoralDistrict {

    CROYDON("CR"),
    BARKING("BA"),
    HACKNEY("HA"),
    EDMONTON("ED");

    private final String prefix;

    ElectoralDistrict(String prefix) {
        this.prefix = prefix;
    }

    /**
     * Complete this method to pass Exercise_2_Test#setOfVotersInDistrict()
     * 
     * @param district - District to vote in
     * @param voters - voters to filter
     * @return filtered set of registered voters in a district
     */
    public static Set<RegisteredVoter> votersIn(ElectoralDistrict district, Collection<RegisteredVoter> voters) {
        // [your code here]
        Set <RegisteredVoter> set = voters
                .stream()
                .filter(x -> {
                    return x.getElectorId().substring(0, 2).equals(district.getPrefix());
                })
                .collect(Collectors.toSet());
        return Collections.unmodifiableSet(set);

//        return Collections.emptySet();
    }

    /**
     * Complete this method to pass Exercise_2_Test#removeAllSpoiledBallots()
     * 
     * @param ballots - ballots to filter
     * @return filtered set of unspoiled ballots
     */
    public static Set<Ballot> unspoiledBallots(Set<Ballot> ballots) {
        // [your code here]
        Set<Ballot> ballotSet = ballots
                .stream()
                .filter(x -> !x.isSpoiled())
                .collect(Collectors.toSet());
        return ballotSet;

//        return Collections.emptySet();
    }

    public String getPrefix() {
        return prefix;
    }
}

