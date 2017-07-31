package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class BookTag extends Message {
    public static final String DEFAULT_TITLE = "";
    public static final String DEFAULT_URL = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String url;

    private BookTag(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.title == null) {
                this.title = "";
            } else {
                this.title = builder.title;
            }
            if (builder.url == null) {
                this.url = "";
                return;
            } else {
                this.url = builder.url;
                return;
            }
        }
        this.title = builder.title;
        this.url = builder.url;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<BookTag> {
        public String title;
        public String url;

        public Builder() {
        }

        public Builder(BookTag bookTag) {
            super(bookTag);
            if (bookTag != null) {
                this.title = bookTag.title;
                this.url = bookTag.url;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public BookTag build(boolean z) {
            return new BookTag(this, z);
        }
    }
}
