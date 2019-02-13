package seedu.addressbook.commands;

import seedu.addressbook.data.person.ReadOnlyPerson;
import java.util.ArrayList;
import java.util.List;

   /**
    *Lists top 10 people in the addressBook
    */

public class TopTenCommand extends Command {

    public static final String COMMAND_WORD = "topTen";

    public static final String MESSAGE_USAGE = COMMAND_WORD
            + ": Displays first 10 people in the Address Book as a list.\n"
            + "Example: " + COMMAND_WORD;

    @Override
    public CommandResult execute() {
        List<ReadOnlyPerson> allPersons = addressBook.getAllPersons().immutableListView();
        int size = allPersons.size();
        if (size < 10) {
            return new CommandResult(getMessageForPersonListShownSummary(allPersons), allPersons);
        } else {
            List<ReadOnlyPerson> toShow = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                toShow.add(i, allPersons.get(i));
            }
            return new CommandResult(getMessageForPersonListShownSummary(toShow), toShow);
        }
    }
}


