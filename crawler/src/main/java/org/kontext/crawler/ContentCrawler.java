package org.kontext.crawler;

import java.util.Collection;

public interface ContentCrawler {

	/**
	 * Crawls a given crawlable and produces a crawled object which has the associated data.
	 * The content shall be persisted into a datasource.
	 * 
	 * @param crawlable
	 */
	void crawl(Crawlable crawlable);
	
	/**
	 * Crawls a given collection of crawlables, retrieves crawled content and persists into the
	 * datasource.
	 * 
	 * @param crawlables
	 */
	void crawl(Collection<? extends Crawlable> crawlables);
}
