package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes9.dex */
public final class BookSummary extends Message {
    public static final String DEFAULT_COVER = "";
    public static final String DEFAULT_TITLE = "";
    public static final String DEFAULT_URL = "";
    @ProtoField(label = Message.Label.REPEATED, tag = 4)
    public final List<BookInfo> book_list;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String cover;
    @ProtoField(tag = 2, type = Message.Datatype.UINT64)
    public final Long num;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String url;
    public static final Long DEFAULT_NUM = 0L;
    public static final List<BookInfo> DEFAULT_BOOK_LIST = Collections.emptyList();

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<BookSummary> {
        public List<BookInfo> book_list;
        public String cover;
        public Long num;
        public String title;
        public String url;

        public Builder() {
        }

        public Builder(BookSummary bookSummary) {
            super(bookSummary);
            if (bookSummary == null) {
                return;
            }
            this.title = bookSummary.title;
            this.num = bookSummary.num;
            this.url = bookSummary.url;
            this.book_list = Message.copyOf(bookSummary.book_list);
            this.cover = bookSummary.cover;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public BookSummary build(boolean z) {
            return new BookSummary(this, z);
        }
    }

    public BookSummary(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.title;
            if (str == null) {
                this.title = "";
            } else {
                this.title = str;
            }
            Long l = builder.num;
            if (l == null) {
                this.num = DEFAULT_NUM;
            } else {
                this.num = l;
            }
            String str2 = builder.url;
            if (str2 == null) {
                this.url = "";
            } else {
                this.url = str2;
            }
            List<BookInfo> list = builder.book_list;
            if (list == null) {
                this.book_list = DEFAULT_BOOK_LIST;
            } else {
                this.book_list = Message.immutableCopyOf(list);
            }
            String str3 = builder.cover;
            if (str3 == null) {
                this.cover = "";
                return;
            } else {
                this.cover = str3;
                return;
            }
        }
        this.title = builder.title;
        this.num = builder.num;
        this.url = builder.url;
        this.book_list = Message.immutableCopyOf(builder.book_list);
        this.cover = builder.cover;
    }
}
