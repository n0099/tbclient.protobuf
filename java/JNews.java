package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class JNews extends Message {
    public static final String DEFAULT_FROM = "";
    public static final Long DEFAULT_JID = 0L;
    public static final String DEFAULT_URL = "";
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String from;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long jid;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String url;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<JNews> {
        public String from;
        public Long jid;
        public String url;

        public Builder() {
        }

        public Builder(JNews jNews) {
            super(jNews);
            if (jNews == null) {
                return;
            }
            this.jid = jNews.jid;
            this.url = jNews.url;
            this.from = jNews.from;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public JNews build(boolean z) {
            return new JNews(this, z);
        }
    }

    public JNews(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.jid;
            if (l == null) {
                this.jid = DEFAULT_JID;
            } else {
                this.jid = l;
            }
            String str = builder.url;
            if (str == null) {
                this.url = "";
            } else {
                this.url = str;
            }
            String str2 = builder.from;
            if (str2 == null) {
                this.from = "";
                return;
            } else {
                this.from = str2;
                return;
            }
        }
        this.jid = builder.jid;
        this.url = builder.url;
        this.from = builder.from;
    }
}
