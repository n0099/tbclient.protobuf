package tbclient.GetDynamicGiftList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes10.dex */
public final class GiftList extends Message {
    public static final Integer DEFAULT_GIFT_ID = 0;
    public static final String DEFAULT_GIFT_NAME = "";
    @ProtoField(tag = 4)
    public final ConfigInfo config_info;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer gift_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String gift_name;
    @ProtoField(tag = 3)
    public final GiftZip gift_zip;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<GiftList> {
        public ConfigInfo config_info;
        public Integer gift_id;
        public String gift_name;
        public GiftZip gift_zip;

        public Builder() {
        }

        public Builder(GiftList giftList) {
            super(giftList);
            if (giftList == null) {
                return;
            }
            this.gift_id = giftList.gift_id;
            this.gift_name = giftList.gift_name;
            this.gift_zip = giftList.gift_zip;
            this.config_info = giftList.config_info;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GiftList build(boolean z) {
            return new GiftList(this, z);
        }
    }

    public GiftList(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.gift_id;
            if (num == null) {
                this.gift_id = DEFAULT_GIFT_ID;
            } else {
                this.gift_id = num;
            }
            String str = builder.gift_name;
            if (str == null) {
                this.gift_name = "";
            } else {
                this.gift_name = str;
            }
            this.gift_zip = builder.gift_zip;
            this.config_info = builder.config_info;
            return;
        }
        this.gift_id = builder.gift_id;
        this.gift_name = builder.gift_name;
        this.gift_zip = builder.gift_zip;
        this.config_info = builder.config_info;
    }
}
