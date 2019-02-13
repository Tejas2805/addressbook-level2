package seedu.addressbook.commands;

import seedu.addressbook.data.person.ReadOnlyPerson;

import java.util.List;

public class TotalCountCommand extends Command {

    public static final String COMMAND_WORD = "total";

    public static final String MESSAGE_USAGE = COMMAND_WORD
            + ": Displays the total number of people in the Address Book.\n"
            + "Example: " + COMMAND_WORD;

    public static final String MESSAGE_SUCCESS = "Contacts found";


    @Override
    public CommandResult execute() {
        int TotalCount = addressBook.total();
        return new CommandResult(TotalCount + "" + MESSAGE_SUCCESS);
    }
}
