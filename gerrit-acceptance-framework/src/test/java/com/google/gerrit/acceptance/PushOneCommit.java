import com.google.gerrit.server.project.NoSuchChangeException;
        throws OrmException, NoSuchChangeException {
        throws OrmException, NoSuchChangeException {
      Iterable<Account.Id> actualIds = approvalsUtil
          .getReviewers(db, notesFactory.createChecked(db, c))
          .values();