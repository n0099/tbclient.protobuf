package tbclient.LiveActivityForHFive;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class GiftInfoForAc extends Message {
    public static final String DEFAULT_GIFT_ICON = "";
    public static final Integer DEFAULT_GIFT_ID = 0;
    public static final String DEFAULT_GIFT_NAME = "";
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String gift_icon;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer gift_id;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String gift_name;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<GiftInfoForAc> {
        public String gift_icon;
        public Integer gift_id;
        public String gift_name;

        public Builder() {
        }

        public Builder(GiftInfoForAc giftInfoForAc) {
            super(giftInfoForAc);
            if (giftInfoForAc == null) {
                return;
            }
            this.gift_id = giftInfoForAc.gift_id;
            this.gift_icon = giftInfoForAc.gift_icon;
            this.gift_name = giftInfoForAc.gift_name;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GiftInfoForAc build(boolean z) {
            return new GiftInfoForAc(this, z);
        }
    }

    public GiftInfoForAc(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.gift_id;
            if (num == null) {
                this.gift_id = DEFAULT_GIFT_ID;
            } else {
                this.gift_id = num;
            }
            String str = builder.gift_icon;
            if (str == null) {
                this.gift_icon = "";
            } else {
                this.gift_icon = str;
            }
            String str2 = builder.gift_name;
            if (str2 == null) {
                this.gift_name = "";
                return;
            } else {
                this.gift_name = str2;
                return;
            }
        }
        this.gift_id = builder.gift_id;
        this.gift_icon = builder.gift_icon;
        this.gift_name = builder.gift_name;
    }
}
