package tbclient.GetMoreMsg;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes21.dex */
public final class MsgContent extends Message {
    public static final String DEFAULT_ID = "";
    public static final String DEFAULT_SRC = "";
    public static final String DEFAULT_TEXT = "";
    public static final String DEFAULT_TITLE = "";
    public static final String DEFAULT_URL = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String id;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String src;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String text;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String url;

    private MsgContent(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.id == null) {
                this.id = "";
            } else {
                this.id = builder.id;
            }
            if (builder.title == null) {
                this.title = "";
            } else {
                this.title = builder.title;
            }
            if (builder.url == null) {
                this.url = "";
            } else {
                this.url = builder.url;
            }
            if (builder.text == null) {
                this.text = "";
            } else {
                this.text = builder.text;
            }
            if (builder.src == null) {
                this.src = "";
                return;
            } else {
                this.src = builder.src;
                return;
            }
        }
        this.id = builder.id;
        this.title = builder.title;
        this.url = builder.url;
        this.text = builder.text;
        this.src = builder.src;
    }

    /* loaded from: classes21.dex */
    public static final class Builder extends Message.Builder<MsgContent> {
        public String id;
        public String src;
        public String text;
        public String title;
        public String url;

        public Builder() {
        }

        public Builder(MsgContent msgContent) {
            super(msgContent);
            if (msgContent != null) {
                this.id = msgContent.id;
                this.title = msgContent.title;
                this.url = msgContent.url;
                this.text = msgContent.text;
                this.src = msgContent.src;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public MsgContent build(boolean z) {
            return new MsgContent(this, z);
        }
    }
}
