package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class PbLinkInfo extends Message {
    public static final String DEFAULT_PIC_URL = "";
    public static final String DEFAULT_TITLE = "";
    public static final String DEFAULT_TO_URL = "";
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String pic_url;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String to_url;

    private PbLinkInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.title == null) {
                this.title = "";
            } else {
                this.title = builder.title;
            }
            if (builder.to_url == null) {
                this.to_url = "";
            } else {
                this.to_url = builder.to_url;
            }
            if (builder.pic_url == null) {
                this.pic_url = "";
                return;
            } else {
                this.pic_url = builder.pic_url;
                return;
            }
        }
        this.title = builder.title;
        this.to_url = builder.to_url;
        this.pic_url = builder.pic_url;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<PbLinkInfo> {
        public String pic_url;
        public String title;
        public String to_url;

        public Builder() {
        }

        public Builder(PbLinkInfo pbLinkInfo) {
            super(pbLinkInfo);
            if (pbLinkInfo != null) {
                this.title = pbLinkInfo.title;
                this.to_url = pbLinkInfo.to_url;
                this.pic_url = pbLinkInfo.pic_url;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public PbLinkInfo build(boolean z) {
            return new PbLinkInfo(this, z);
        }
    }
}
