package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes22.dex */
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

    private JNews(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.jid == null) {
                this.jid = DEFAULT_JID;
            } else {
                this.jid = builder.jid;
            }
            if (builder.url == null) {
                this.url = "";
            } else {
                this.url = builder.url;
            }
            if (builder.from == null) {
                this.from = "";
                return;
            } else {
                this.from = builder.from;
                return;
            }
        }
        this.jid = builder.jid;
        this.url = builder.url;
        this.from = builder.from;
    }

    /* loaded from: classes22.dex */
    public static final class Builder extends Message.Builder<JNews> {
        public String from;
        public Long jid;
        public String url;

        public Builder() {
        }

        public Builder(JNews jNews) {
            super(jNews);
            if (jNews != null) {
                this.jid = jNews.jid;
                this.url = jNews.url;
                this.from = jNews.from;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public JNews build(boolean z) {
            return new JNews(this, z);
        }
    }
}
