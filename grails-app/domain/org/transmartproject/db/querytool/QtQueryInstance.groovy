package org.transmartproject.db.querytool

class QtQueryInstance {

    String          userId
    String          groupId
    String          batchMode
    Date            startDate
    Date            endDate
    String          deleteFlag = 'N'
    Integer         statusTypeId
    String          message
    QtQueryMaster   queryMaster

	static hasMany = [queryResults: QtQueryResultInstance]
	static belongsTo = QtQueryMaster

	static mapping = {
		id column: "query_instance_id", generator: "identity"

        queryMaster column: 'query_master_id'
		version false
	}

	static constraints = {
        userId         maxSize:    50
        groupId        maxSize:    50
        batchMode      nullable:   true,   maxSize:   50
        endDate        nullable:   true
        deleteFlag     nullable:   true,   maxSize:   3
        statusTypeId   nullable:   true
        message        nullable:   true
	}
}
