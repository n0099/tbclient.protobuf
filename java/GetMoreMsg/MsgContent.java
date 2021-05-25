package tbclient.GetMoreMsg;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes8.dex */
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

    /* loaded from: classes8.dex */
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
            if (msgContent == null) {
                return;
            }
            this.id = msgContent.id;
            this.title = msgContent.title;
            this.url = msgContent.url;
            this.text = msgContent.text;
            this.src = msgContent.src;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public MsgContent build(boolean z) {
            return new MsgContent(this, z);
        }
    }

    public MsgContent(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.id;
            if (str == null) {
                this.id = "";
            } else {
                this.id = str;
            }
            String str2 = builder.title;
            if (str2 == null) {
                this.title = "";
            } else {
                this.title = str2;
            }
            String str3 = builder.url;
            if (str3 == null) {
                this.url = "";
            } else {
                this.url = str3;
            }
            String str4 = builder.text;
            if (str4 == null) {
                this.text = "";
            } else {
                this.text = str4;
            }
            String str5 = builder.src;
            if (str5 == null) {
                this.src = "";
                return;
            } else {
                this.src = str5;
                return;
            }
        }
        this.id = builder.id;
        this.title = builder.title;
        this.url = builder.url;
        this.text = builder.text;
        this.src = builder.src;
    }
}
