public class RecordTypeUtill {
  public static Id getRecordTypeId(String sobjectName, String recordTypeName) {
    return Schema.SobjectType.sobjectName.getREcordTypeInfosByName().
      get(recordTypeName)
      .getRecordTypeId()
  }
}
