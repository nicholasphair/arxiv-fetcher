package io.github.nicholasphair.arxiv;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import io.github.nicholasphair.arxiv.api.DefaultApi;
import io.github.nicholasphair.arxiv.model.Feed;

import java.util.List;

/**
 * Fetch papers from arxiv.
 *
 * TODO (nphair): Parameterize queries.
 * TODO (nphair): Higher level api with pagination and date ranges.
 * TODO (nphair): Write out the results.
 */
public class Fetcher
{
    public static void main( String[] args ) {
        String searchQuery = "ti:\"electron thermal conductivity\"";
        List<String> idList = null;
        Integer start = 0;
        Integer maxResults = 100;
        String sortBy = "lastUpdatedDate";
        String sortOrder = "ascending";

        DefaultApi api = new DefaultApi();
        XmlMapper xmlMapper = new XmlMapper();
        api.getApiClient().setObjectMapper(xmlMapper);

        try{
            for(int page = 0;; page++) {
                Feed response = api.apiQueryGet(searchQuery, idList, start, maxResults, sortBy, sortOrder);
                // TODO: Write out the repo

                if(page*maxResults >= Integer.parseInt(response.getTotalResults())) {
                    break;
                }

                // NB (nphair): Be respectful of the api.
                // https://arxiv.org/help/api/user-manual#3112-start-and-max95results-paging
                Thread.sleep(3000);
            }
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
