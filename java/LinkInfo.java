package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes22.dex */
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

    private LinkInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.desc == null) {
                this.desc = "";
            } else {
                this.desc = builder.desc;
            }
            if (builder.link == null) {
                this.link = "";
            } else {
                this.link = builder.link;
            }
            if (builder.type == null) {
                this.type = "";
                return;
            } else {
                this.type = builder.type;
                return;
            }
        }
        this.desc = builder.desc;
        this.link = builder.link;
        this.type = builder.type;
    }

    /* loaded from: classes22.dex */
    public static final class Builder extends Message.Builder<LinkInfo> {
        public String desc;
        public String link;
        public String type;

        public Builder() {
        }

        public Builder(LinkInfo linkInfo) {
            super(linkInfo);
            if (linkInfo != null) {
                this.desc = linkInfo.desc;
                this.link = linkInfo.link;
                this.type = linkInfo.type;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public LinkInfo build(boolean z) {
            return new LinkInfo(this, z);
        }
    }
}
