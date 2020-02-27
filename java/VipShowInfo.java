package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class VipShowInfo extends Message {
    public static final String DEFAULT_CONTENT = "";
    public static final String DEFAULT_LINK = "";
    public static final String DEFAULT_TITLE = "";
    public static final String DEFAULT_VIP_ICON = "";
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String content;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String link;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String vip_icon;

    private VipShowInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.vip_icon == null) {
                this.vip_icon = "";
            } else {
                this.vip_icon = builder.vip_icon;
            }
            if (builder.content == null) {
                this.content = "";
            } else {
                this.content = builder.content;
            }
            if (builder.link == null) {
                this.link = "";
            } else {
                this.link = builder.link;
            }
            if (builder.title == null) {
                this.title = "";
                return;
            } else {
                this.title = builder.title;
                return;
            }
        }
        this.vip_icon = builder.vip_icon;
        this.content = builder.content;
        this.link = builder.link;
        this.title = builder.title;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<VipShowInfo> {
        public String content;
        public String link;
        public String title;
        public String vip_icon;

        public Builder() {
        }

        public Builder(VipShowInfo vipShowInfo) {
            super(vipShowInfo);
            if (vipShowInfo != null) {
                this.vip_icon = vipShowInfo.vip_icon;
                this.content = vipShowInfo.content;
                this.link = vipShowInfo.link;
                this.title = vipShowInfo.title;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public VipShowInfo build(boolean z) {
            return new VipShowInfo(this, z);
        }
    }
}
