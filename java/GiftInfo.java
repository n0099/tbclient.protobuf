package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class GiftInfo extends Message {
    public static final String DEFAULT_ICON = "";
    public static final Integer DEFAULT_NUM = 0;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String icon;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer num;

    /* synthetic */ GiftInfo(Builder builder, boolean z, GiftInfo giftInfo) {
        this(builder, z);
    }

    private GiftInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.icon == null) {
                this.icon = "";
            } else {
                this.icon = builder.icon;
            }
            if (builder.num == null) {
                this.num = DEFAULT_NUM;
                return;
            } else {
                this.num = builder.num;
                return;
            }
        }
        this.icon = builder.icon;
        this.num = builder.num;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<GiftInfo> {
        public String icon;
        public Integer num;

        public Builder() {
        }

        public Builder(GiftInfo giftInfo) {
            super(giftInfo);
            if (giftInfo != null) {
                this.icon = giftInfo.icon;
                this.num = giftInfo.num;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GiftInfo build(boolean z) {
            return new GiftInfo(this, z, null);
        }
    }
}
