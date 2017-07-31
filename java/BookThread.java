package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class BookThread extends Message {
    public static final String DEFAULT_BOOK_ID = "";
    public static final Integer DEFAULT_BOOK_TYPE = 0;
    public static final Long DEFAULT_CHAPTER_ID = 0L;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String book_id;
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer book_type;
    @ProtoField(tag = 3, type = Message.Datatype.UINT64)
    public final Long chapter_id;

    private BookThread(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.book_id == null) {
                this.book_id = "";
            } else {
                this.book_id = builder.book_id;
            }
            if (builder.book_type == null) {
                this.book_type = DEFAULT_BOOK_TYPE;
            } else {
                this.book_type = builder.book_type;
            }
            if (builder.chapter_id == null) {
                this.chapter_id = DEFAULT_CHAPTER_ID;
                return;
            } else {
                this.chapter_id = builder.chapter_id;
                return;
            }
        }
        this.book_id = builder.book_id;
        this.book_type = builder.book_type;
        this.chapter_id = builder.chapter_id;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<BookThread> {
        public String book_id;
        public Integer book_type;
        public Long chapter_id;

        public Builder() {
        }

        public Builder(BookThread bookThread) {
            super(bookThread);
            if (bookThread != null) {
                this.book_id = bookThread.book_id;
                this.book_type = bookThread.book_type;
                this.chapter_id = bookThread.chapter_id;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public BookThread build(boolean z) {
            return new BookThread(this, z);
        }
    }
}
