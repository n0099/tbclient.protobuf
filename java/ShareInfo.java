package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class ShareInfo extends Message {
    public static final String DEFAULT_CONTENT = "";
    public static final String DEFAULT_IMAGEURL = "";
    public static final String DEFAULT_TITLE = "";
    public static final String DEFAULT_URL = "";
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String content;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String imageurl;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String url;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<ShareInfo> {
        public String content;
        public String imageurl;
        public String title;
        public String url;

        public Builder() {
        }

        public Builder(ShareInfo shareInfo) {
            super(shareInfo);
            if (shareInfo == null) {
                return;
            }
            this.title = shareInfo.title;
            this.content = shareInfo.content;
            this.url = shareInfo.url;
            this.imageurl = shareInfo.imageurl;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ShareInfo build(boolean z) {
            return new ShareInfo(this, z);
        }
    }

    public ShareInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.title;
            if (str == null) {
                this.title = "";
            } else {
                this.title = str;
            }
            String str2 = builder.content;
            if (str2 == null) {
                this.content = "";
            } else {
                this.content = str2;
            }
            String str3 = builder.url;
            if (str3 == null) {
                this.url = "";
            } else {
                this.url = str3;
            }
            String str4 = builder.imageurl;
            if (str4 == null) {
                this.imageurl = "";
                return;
            } else {
                this.imageurl = str4;
                return;
            }
        }
        this.title = builder.title;
        this.content = builder.content;
        this.url = builder.url;
        this.imageurl = builder.imageurl;
    }
}
