package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class LinkConf extends Message {
    public static final String DEFAULT_TEXT = "";
    public static final String DEFAULT_URL = "";
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String text;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String url;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<LinkConf> {
        public String text;
        public String url;

        public Builder() {
        }

        public Builder(LinkConf linkConf) {
            super(linkConf);
            if (linkConf == null) {
                return;
            }
            this.url = linkConf.url;
            this.text = linkConf.text;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public LinkConf build(boolean z) {
            return new LinkConf(this, z);
        }
    }

    public LinkConf(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.url;
            if (str == null) {
                this.url = "";
            } else {
                this.url = str;
            }
            String str2 = builder.text;
            if (str2 == null) {
                this.text = "";
                return;
            } else {
                this.text = str2;
                return;
            }
        }
        this.url = builder.url;
        this.text = builder.text;
    }
}
