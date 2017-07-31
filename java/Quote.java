package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class Quote extends Message {
    public static final String DEFAULT_CONTENT = "";
    public static final String DEFAULT_IP = "";
    public static final Long DEFAULT_POST_ID = 0L;
    public static final Long DEFAULT_USER_ID = 0L;
    public static final String DEFAULT_USER_NAME = "";
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String content;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String ip;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long post_id;
    @ProtoField(tag = 3, type = Message.Datatype.INT64)
    public final Long user_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String user_name;

    private Quote(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.post_id == null) {
                this.post_id = DEFAULT_POST_ID;
            } else {
                this.post_id = builder.post_id;
            }
            if (builder.user_name == null) {
                this.user_name = "";
            } else {
                this.user_name = builder.user_name;
            }
            if (builder.user_id == null) {
                this.user_id = DEFAULT_USER_ID;
            } else {
                this.user_id = builder.user_id;
            }
            if (builder.ip == null) {
                this.ip = "";
            } else {
                this.ip = builder.ip;
            }
            if (builder.content == null) {
                this.content = "";
                return;
            } else {
                this.content = builder.content;
                return;
            }
        }
        this.post_id = builder.post_id;
        this.user_name = builder.user_name;
        this.user_id = builder.user_id;
        this.ip = builder.ip;
        this.content = builder.content;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<Quote> {
        public String content;
        public String ip;
        public Long post_id;
        public Long user_id;
        public String user_name;

        public Builder() {
        }

        public Builder(Quote quote) {
            super(quote);
            if (quote != null) {
                this.post_id = quote.post_id;
                this.user_name = quote.user_name;
                this.user_id = quote.user_id;
                this.ip = quote.ip;
                this.content = quote.content;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Quote build(boolean z) {
            return new Quote(this, z);
        }
    }
}
