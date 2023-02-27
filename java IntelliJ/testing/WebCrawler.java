package testing;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.*;
import java.util.regex.Pattern;

public class WebCrawler {

    // This set is used to keep track of visited URLs
    private Set<String> visitedUrls = new HashSet<String>();

    // This queue is used to store URLs that still need to be visited
    private Queue<String> urlsToVisit = new LinkedList<String>();

    // This method extracts all URLs from a web page and adds them to the queue
    public void extractUrls(String url) throws IOException {
        HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
        connection.setRequestMethod("GET");

        // Only parse HTML pages
        if (connection.getContentType().startsWith("text/html")) {
            Scanner scanner = new Scanner(connection.getInputStream());
            String regex = "<a\\s+href\\s*=\\s*\"(\\S+)\"";
            Pattern pattern = Pattern.compile(regex);
            while (scanner.findWithinHorizon(pattern, 0) != null) {
                String newUrl = scanner.match().group(1);
                // Ignore URLs that are not within the same website
                if (newUrl.startsWith("http") && !newUrl.startsWith(url))
                    continue;
                // Remove any anchors from the URL
                if(newUrl.split("#").length > 0) newUrl = newUrl.split("#")[0];

                // Add the URL to the queue if it has not been visited yet
                if (!visitedUrls.contains(newUrl)) {
                    urlsToVisit.offer(newUrl);
                    visitedUrls.add(newUrl);
                }
            }
            scanner.close();
        }
    }

    // This method visits each URL in the queue and extracts any relevant information
    public void crawl(String startingUrl) throws IOException {
        urlsToVisit.offer(startingUrl);
        visitedUrls.add(startingUrl);

        while (!urlsToVisit.isEmpty()) {
            String url = urlsToVisit.poll();
            extractUrls(url);
            // Add code here to extract any relevant information from the page
        }
    }

    // Example usage
    public static void main(String[] args) throws IOException {
        WebCrawler crawler = new WebCrawler();
        crawler.crawl("https://en.wikipedia.org/wiki/Java_(programming_language)");
    }

}
