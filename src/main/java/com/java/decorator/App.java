package com.java.decorator;

public class App {
    private static boolean enabledSpamFilter = true;
    private static boolean enabledTrimming = true;

    public static void main(String[] args) {
        CommentService commentService = new DefaultCommentService();

        if(enabledSpamFilter) {
            commentService = new SpamFilteringCommentDecorator(commentService);
        }

        if(enabledTrimming) {
            commentService = new TrimmingCommentDecorator(commentService);
        }

        Client client = new Client(commentService);
        client.writerComment("댓글1빠");
        client.writerComment("댓글2222...");
        client.writerComment("http://www.naver.com");
    }
}
