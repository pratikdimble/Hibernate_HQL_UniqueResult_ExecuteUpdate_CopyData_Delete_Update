# Hibernate_HQL_UniqueResult_ExecuteUpdate_CopyData_Delete_Update

Don't use 'Query.list()' when you really need 'Query.uniqueResult()' in Hibernate.

When we are using hibernate Query to fetch a single instance, Query.uniqueResult() is being used except special scenarios. To use Query.uniqueResult(), we must make sure that query will return a single object.
But some programmers are still used to do it with Query.list() method which can pull your application out into very inconsistency situation and issues which are very hard to discover the reason for failure. 
