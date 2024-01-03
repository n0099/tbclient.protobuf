package tbclient.GetGiftList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class UrlTitle extends Message {
    public static final String DEFAULT_NAME = "";
    public static final String DEFAULT_URL = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String name;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String url;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<UrlTitle> {
        public String name;
        public String url;

        public Builder() {
        }

        public Builder(UrlTitle urlTitle) {
            super(urlTitle);
            if (urlTitle == null) {
                return;
            }
            this.name = urlTitle.name;
            this.url = urlTitle.url;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public UrlTitle build(boolean z) {
            return new UrlTitle(this, z);
        }
    }

    public UrlTitle(Builder builder, boolean z) {
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
                return;
            } else {
                this.url = str2;
                return;
            }
        }
        this.name = builder.name;
        this.url = builder.url;
    }
}
