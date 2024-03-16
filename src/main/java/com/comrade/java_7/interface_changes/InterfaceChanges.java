package com.comrade.java_7.interface_changes;

public interface InterfaceChanges {
	String MONGO_DB_NAME = "ABC_Mongo_Datastore";
	String NEO4J_DB_NAME = "ABC_Neo4J_Datastore";
	String CASSANDRA_DB_NAME = "ABC_Cassandra_Datastore";

	void logInfo(String message);

	void logWarn(String message);

	void logError(String message);

	void logFatal(String message);
}
