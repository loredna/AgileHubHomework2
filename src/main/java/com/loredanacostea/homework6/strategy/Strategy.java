package com.loredanacostea.homework6.strategy;

import java.util.function.Function;

public class Strategy {

    public enum FindFirstStrategy {

        FIRST_NAME_FIRST(Strategy::getFirstNameFirst),
        LAST_NAME_FIRST(Strategy::getLastNameFirst),
        NOT_VALID(Strategy::getInvalidMessage);

        private Function<Filter, String> messageWithFilter;

        FindFirstStrategy(Function<Filter, String> messageWithFilter) {
            this.messageWithFilter = messageWithFilter;
        }

        public Function<Filter, String> getMessageWithFilter() {
            return messageWithFilter;
        }
    }

    public static String getFirstNameFirst(Filter filter) {
        return filter.firstName() + " " + filter.lastName();
    }

    public static String getLastNameFirst(Filter filter) {
        return filter.lastName() + " " + filter.firstName();
    }

    public static String getInvalidMessage(Filter filter) {
        return "Not a valid strategy";
    }
}
