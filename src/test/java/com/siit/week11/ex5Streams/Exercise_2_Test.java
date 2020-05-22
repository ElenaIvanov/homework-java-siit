package com.siit.week11.ex5Streams;

import com.siit.week11.ex5Streams.util.FeatureMatchers;
import com.siit.week11.ex5streams.exercise2.*;
import org.hamcrest.Matcher;
import org.junit.Test;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.asList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

//package com.siit.week11.ex5streams.exercise2;



/**
 * Exercise 2 - Filtering and Collecting
 * <p>
 * Filtering is one of the most popular operations performed on collections. When coupled with mapping/transforming,
 * which we'll learn about shortly, it provides a lot of power.
 * </p>
 * <p>
 * Consider how often you have written code like this:
 * <pre>
 * {@code
 *     List<String> things = new ArrayList<>();
 *     for (String s: otherThings) {
 *         if (satisfiesSomeCondition(s)) {
 *             things.add(s);
 *         }
 *     }
 *     return things;
 * }
 * </pre>
 * </p>
 * <p>
 * This is a common pattern, and it's one that is made more concise with lambdas. The common parts of the pattern are:
 * <ul>
 *     <li>creating an empty, destination collection</li>
 *     <li>iterating over the entire source collection</li>
 *     <li>deciding whether to include each item, according to some test which evaluates to a boolean
 *         <ul>
 *             <li>items which pass the test are copied to the destination collection</li>
 *             <li>items which fail are ignored</li>
 *         </ul>
 *     </li>
 * </ul>
 * </p>
 * <p>
 * These steps will rarely change, but think of how we represent that in pre JDK 8 code. We use a for (or while) loop,
 * and an if statement. Those parts are syntax that until now we couldn't escape, and they're almost always identical.
 * </p>
 * <p>
 * The remaining steps (creating a collection, adding them) do have some variation: which destination collection to
 * create? how should an instance be constructed? which method is used to transfer elements to the new list? These
 * decisions generally lead to code which differs slightly between examples.
 * </p>
 * <p>
 * In post-JDK 8 code, one potential solution which matches the above problem is:
 *
 * <pre>
 * {@code
 *     return otherThings.stream()
 *         .filter(s -> satisfiesSomeCondition(s))
 *         .collect(Collectors.toList());
 * }
 * </pre>
 * </p>
 * <p>
 * In this case, unlike the previous example where we used forEach directly from List, in this case we have to "open up"
 * the Streams API by calling the <code>stream()</code> method defined on Collection. This provides many operations which take
 * advantage of the lambda syntax.
 * </p>
 * <p>
 * One such method available on Stream is <code>filter()</code>. In the first code snippet, we perform our filtering using
 * <code>if (satisfiesSomeCondition(s))</code>. The code inside the if condition can be referred to as a "predicate". That is, a
 * function which takes some input, and returns a boolean. This is how the <code>filter()</code> method is defined: it takes a
 * lambda, which, when given an element from the Stream, returns a boolean. Internally, the filter method has the
 * equivalent semantics of the for loop, and the if statement. It will return a new Stream, containing
 * all the elements which passed the test (or "satisfied the predicate") from the source Stream.
 * </p>
 * <p>
 * The last piece in this snippet of code (<code>.collect(Collectors.toList())</code>) is what takes the place of constructing
 * the initial empty list, and invoking the <code>add()</code> method. The code used in these examples depends on what type of
 * list is best suited for the resultant list, and also, how best to transfer elements from the result Stream into
 * the new list. The very common case, of creating a new ArrayList, and simply calling <code>add()</code> for each element, is
 * fulfilled by Collectors.toList.
 * </p>
 * <p>
 * If you want your result to be a different type of collection, or potentially, something completely outwith the
 * collections library, and you wanted to control over how those elements were transferred, you would write your own
 * collector. In most cases, and in these examples, we'll use only simple, pre-existing collectors, available in the
 * JDK.
 * </p>
 * <p>
 * The tests below can be made to pass using Stream's filter and collect methods. Try to make them pass without using
 * a loop, or an if statement.
 * </p>
 *
 * @see Collection#stream()
 * @see Stream#filter(Predicate)
 * @see Predicate
 * @see Collector
 * @see Collectors
 * @see Collectors#toList()
 *
 * Lambda Tutorial -- Adopt Open JDK
 * @author Graham Allan grundlefleck at gmail dot com
 */
@SuppressWarnings("unchecked")
public class Exercise_2_Test {

    private static final ElectoralDistrict HACKNEY = ;

    /**
     * Use <code>Stream.filter()</code> to produce a list containing only those 
     * Persons eligible to vote.
     *
     * @see Person#getAge()
     */
    @Test
    public void getAllPersonsEligibleToVote() {
        List<Person> potentialVoters =
                new ArrayList<>(asList(new Person("Tom", 24), new Person("Dick", 75), new Person("Harry", 17)));

        int legalAgeOfVoting = 18;
        List<Person> eligibleVoters = VotingRules.eligibleVoters(potentialVoters, legalAgeOfVoting);

        assertThat(eligibleVoters, hasSize(2));
        assertThat(eligibleVoters, containsInAnyOrder(aPersonNamed("Tom"), aPersonNamed("Dick")));

        // ensure we haven't modified the original collection
        assertThat(potentialVoters, hasSize(3));
        assertThat(potentialVoters, containsInAnyOrder(aPersonNamed("Tom"), aPersonNamed("Dick"), aPersonNamed("Harry")));
    }

    /**
     * <p>
     * Use Stream.filter() to find all the voters residing in a given district.
     * </p>
     * <p>
     * The resulting collection is to be used for quick lookups to find if a given
     * voter resides in a district. Performance measurements indicate we should
     * prefer the result to be a java.util.Set. Use Stream.collect() to produce a
     * Set containing the result, rather than a List.
     * </p>
     * <p>
     * HINT: sometimes type inference is "not there yet", in either the IDE or javac, 
     * help out the compiler with explicit generic arguments if you have to.
     * </p>
     * @see Stream#collect(Collector)
     * @see Collectors#toSet()
     *
     * @see ElectoralDistrict#getPrefix()
     * @see RegisteredVoter#getElectorId()
     */
    @Test public void setOfVotersInDistrict() {
        List<RegisteredVoter> allVoters = new ArrayList<>(asList(
            new RegisteredVoter("CR2345"),
            new RegisteredVoter("HA7654"),
            new RegisteredVoter("HA2213"),
            new RegisteredVoter("BA9987"),
            new RegisteredVoter("CR6203"),
            new RegisteredVoter("ED9876")
            // ... and many more
        ));

        Set<RegisteredVoter> votersInHackney = ElectoralDistrict.votersIn(HACKNEY, allVoters);

        assertThat(votersInHackney, hasSize(2));
        assertThat(votersInHackney, containsInAnyOrder(aVoterWithId("HA7654"), aVoterWithId("HA2213")));
    }

    /**
     * Use Stream.filter() to remove all the ballots that have been spoiled.
     *
     * @see ElectoralDistrict#unspoiledBallots(Set)
     * @see Ballot#isSpoiled
     */
    @Test public void removeAllSpoiledBallots() {
        Set<Ballot> votes = new HashSet<>(asList(
                Ballot.voteFor(Party.LABOUR),
                Ballot.voteFor(Party.CONSERVATIVE),
                Ballot.spoiled(),
                Ballot.voteFor(Party.MONSTER_RAVING_LOONY_PARTY),
                Ballot.voteFor(Party.LIBERAL_DEMOCRATS),
                Ballot.spoiled(),
                Ballot.voteFor(Party.GREEN_PARTY),
                Ballot.voteFor(Party.GREEN_PARTY)
                // ... and many more
        ));

        Set<Ballot> unspoiledBallots = ElectoralDistrict.unspoiledBallots(votes);

        assertThat(unspoiledBallots, hasSize(6));
        assertThat(unspoiledBallots, everyItem(is(not(spoiled()))));
    }

    /**
     * <p>
     * Ensure that the Set returned cannot be modified by callers by wrapping the result
     * in Collections.unmodifiableSet().
     * </p>
     * @throws ClassNotFoundException If the lambdas binary build no longer contains the class
     * @see Stream#collect(Collector)
     * @see Collectors#collectingAndThen(Collector, Function)
     * @see Collectors#toSet()
     * @see Collections#unmodifiableSet(Set)
     */
    @Test public void setOfVotersInDistrictInUnmodifiableSet() throws ClassNotFoundException {
        List<RegisteredVoter> allVoters = new ArrayList<>(asList(
            new RegisteredVoter("CR2345"),
            new RegisteredVoter("HA7654"),
            new RegisteredVoter("HA2213"),
            new RegisteredVoter("BA9987"),
            new RegisteredVoter("CR6203"),
            new RegisteredVoter("ED9876")
            // ... and many more
        ));

        Set<RegisteredVoter> votersInHackney = ElectoralDistrict.votersIn(HACKNEY, allVoters);

        assertThat(votersInHackney, instanceOf(Class.forName("java.util.Collections$UnmodifiableSet")));
    }

    // Test helpers

    private static Matcher<Person> aPersonNamed(String name) {
        return FeatureMatchers.from(is(name), "a person", "name", person -> person.getName());
    }

    private static Matcher<RegisteredVoter> aVoterWithId(String name) {
        return FeatureMatchers.from(is(name), "a voter", "electorId", voter -> voter.getElectorId());
    }

    private static Matcher<Ballot> spoiled() {
        return FeatureMatchers.from(equalTo(Boolean.TRUE), "a spoiled ballot", "isSpoiled", ballot -> ballot.isSpoiled());
    }

}
