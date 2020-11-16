package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes21.dex */
public final class TailInfo extends Message {
    public static final String DEFAULT_CONTENT = "";
    public static final String DEFAULT_ICON_LINK = "";
    public static final String DEFAULT_ICON_URL = "";
    public static final Integer DEFAULT_TAIL_TYPE = 0;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String content;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String icon_link;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String icon_url;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer tail_type;

    private TailInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.tail_type == null) {
                this.tail_type = DEFAULT_TAIL_TYPE;
            } else {
                this.tail_type = builder.tail_type;
            }
            if (builder.icon_url == null) {
                this.icon_url = "";
            } else {
                this.icon_url = builder.icon_url;
            }
            if (builder.icon_link == null) {
                this.icon_link = "";
            } else {
                this.icon_link = builder.icon_link;
            }
            if (builder.content == null) {
                this.content = "";
                return;
            } else {
                this.content = builder.content;
                return;
            }
        }
        this.tail_type = builder.tail_type;
        this.icon_url = builder.icon_url;
        this.icon_link = builder.icon_link;
        this.content = builder.content;
    }

    /* loaded from: classes21.dex */
    public static final class Builder extends Message.Builder<TailInfo> {
        public String content;
        public String icon_link;
        public String icon_url;
        public Integer tail_type;

        public Builder() {
        }

        public Builder(TailInfo tailInfo) {
            super(tailInfo);
            if (tailInfo != null) {
                this.tail_type = tailInfo.tail_type;
                this.icon_url = tailInfo.icon_url;
                this.icon_link = tailInfo.icon_link;
                this.content = tailInfo.content;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public TailInfo build(boolean z) {
            return new TailInfo(this, z);
        }
    }
}
