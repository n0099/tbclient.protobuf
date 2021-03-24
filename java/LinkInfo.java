package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class LinkInfo extends Message {
    public static final String DEFAULT_DESC = "";
    public static final String DEFAULT_LINK = "";
    public static final String DEFAULT_TYPE = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String desc;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String link;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String type;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<LinkInfo> {
        public String desc;
        public String link;
        public String type;

        public Builder() {
        }

        public Builder(LinkInfo linkInfo) {
            super(linkInfo);
            if (linkInfo == null) {
                return;
            }
            this.desc = linkInfo.desc;
            this.link = linkInfo.link;
            this.type = linkInfo.type;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public LinkInfo build(boolean z) {
            return new LinkInfo(this, z);
        }
    }

    public LinkInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.desc;
            if (str == null) {
                this.desc = "";
            } else {
                this.desc = str;
            }
            String str2 = builder.link;
            if (str2 == null) {
                this.link = "";
            } else {
                this.link = str2;
            }
            String str3 = builder.type;
            if (str3 == null) {
                this.type = "";
                return;
            } else {
                this.type = str3;
                return;
            }
        }
        this.desc = builder.desc;
        this.link = builder.link;
        this.type = builder.type;
    }
}
