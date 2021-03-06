package org.kontext.cassandra.documents;

import java.util.Date;
import java.util.List;

import org.kontext.cassandra.documents.exception.DocumentRepositoryException;

import com.datastax.driver.core.ResultSet;

public interface DocumentRepository {
	
	/**
	 * Get all the rows for a given partition. 
	 * TODO Right now, partitions have not been defined.
	 * 
	 * @return
	 */
    ResultSet read(Date partition);
    
    /**
	 * Get a 'limited' number of the rows for a given partition. 
	 * TODO Right now, partitions have not been defined.
	 * 
	 * @return
	 */
    ResultSet read(Date partition, int limit);
    
    /**
     * Purge all items by partition
     * 
     */
    void purge(Date partition);
    
    /**
     * Add documents to a partition
     * 
     * @param html
     * @param text
     * @param linkCount
     */
    void storeDocument(String html, String text, int linkCount);
    
    /**
     * Get the count of the training set under consideration.
     * 
     * @return
     */
    long count(Date partition) throws DocumentRepositoryException;

    /**
     * Returns all the partition identifiers pertaining to document repository
     * 
     * @return list of all partition identifiers
     */
    List<Date> getAllPartitions(); 
}
