package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class BrandBook extends Message {
    public static final String DEFAULT_EXT = "";
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long book_num;
    @ProtoField(tag = 3, type = Message.Datatype.INT64)
    public final Long end_time;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String ext;
    @ProtoField(tag = 1, type = Message.Datatype.BOOL)
    public final Boolean is_book;
    public static final Boolean DEFAULT_IS_BOOK = Boolean.FALSE;
    public static final Long DEFAULT_BOOK_NUM = 0L;
    public static final Long DEFAULT_END_TIME = 0L;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<BrandBook> {
        public Long book_num;
        public Long end_time;
        public String ext;
        public Boolean is_book;

        public Builder() {
        }

        public Builder(BrandBook brandBook) {
            super(brandBook);
            if (brandBook == null) {
                return;
            }
            this.is_book = brandBook.is_book;
            this.book_num = brandBook.book_num;
            this.end_time = brandBook.end_time;
            this.ext = brandBook.ext;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public BrandBook build(boolean z) {
            return new BrandBook(this, z);
        }
    }

    public BrandBook(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Boolean bool = builder.is_book;
            if (bool == null) {
                this.is_book = DEFAULT_IS_BOOK;
            } else {
                this.is_book = bool;
            }
            Long l = builder.book_num;
            if (l == null) {
                this.book_num = DEFAULT_BOOK_NUM;
            } else {
                this.book_num = l;
            }
            Long l2 = builder.end_time;
            if (l2 == null) {
                this.end_time = DEFAULT_END_TIME;
            } else {
                this.end_time = l2;
            }
            String str = builder.ext;
            if (str == null) {
                this.ext = "";
                return;
            } else {
                this.ext = str;
                return;
            }
        }
        this.is_book = builder.is_book;
        this.book_num = builder.book_num;
        this.end_time = builder.end_time;
        this.ext = builder.ext;
    }
}
