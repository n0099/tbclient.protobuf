package tbclient.GetBookDownloadInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class BookZipInfo extends Message {
    public static final String DEFAULT_MD5 = "";
    public static final String DEFAULT_NAME = "";
    public static final String DEFAULT_SIZE = "";
    public static final String DEFAULT_URL = "";
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String md5;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String name;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String size;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String url;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<BookZipInfo> {
        public String md5;
        public String name;
        public String size;
        public String url;

        public Builder() {
        }

        public Builder(BookZipInfo bookZipInfo) {
            super(bookZipInfo);
            if (bookZipInfo == null) {
                return;
            }
            this.name = bookZipInfo.name;
            this.url = bookZipInfo.url;
            this.size = bookZipInfo.size;
            this.md5 = bookZipInfo.md5;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public BookZipInfo build(boolean z) {
            return new BookZipInfo(this, z);
        }
    }

    public BookZipInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.name;
            if (str == null) {
                this.name = "";
            } else {
                this.name = str;
            }
            String str2 = builder.url;
            if (str2 == null) {
                this.url = "";
            } else {
                this.url = str2;
            }
            String str3 = builder.size;
            if (str3 == null) {
                this.size = "";
            } else {
                this.size = str3;
            }
            String str4 = builder.md5;
            if (str4 == null) {
                this.md5 = "";
                return;
            } else {
                this.md5 = str4;
                return;
            }
        }
        this.name = builder.name;
        this.url = builder.url;
        this.size = builder.size;
        this.md5 = builder.md5;
    }
}
