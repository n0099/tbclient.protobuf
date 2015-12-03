package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class GiftInfo extends Message {
    public static final String DEFAULT_GIFT_NAME = "";
    public static final String DEFAULT_ICON = "";
    public static final String DEFAULT_LARGE_THUMBNAIL_URL = "";
    public static final String DEFAULT_SENDER_NAME = "";
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer gift_id;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String gift_name;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String icon;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String large_thumbnail_url;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer num;
    @ProtoField(tag = 6, type = Message.Datatype.UINT64)
    public final Long sender_id;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String sender_name;
    public static final Integer DEFAULT_NUM = 0;
    public static final Integer DEFAULT_GIFT_ID = 0;
    public static final Long DEFAULT_SENDER_ID = 0L;

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
            } else {
                this.num = builder.num;
            }
            if (builder.gift_id == null) {
                this.gift_id = DEFAULT_GIFT_ID;
            } else {
                this.gift_id = builder.gift_id;
            }
            if (builder.gift_name == null) {
                this.gift_name = "";
            } else {
                this.gift_name = builder.gift_name;
            }
            if (builder.large_thumbnail_url == null) {
                this.large_thumbnail_url = "";
            } else {
                this.large_thumbnail_url = builder.large_thumbnail_url;
            }
            if (builder.sender_id == null) {
                this.sender_id = DEFAULT_SENDER_ID;
            } else {
                this.sender_id = builder.sender_id;
            }
            if (builder.sender_name == null) {
                this.sender_name = "";
                return;
            } else {
                this.sender_name = builder.sender_name;
                return;
            }
        }
        this.icon = builder.icon;
        this.num = builder.num;
        this.gift_id = builder.gift_id;
        this.gift_name = builder.gift_name;
        this.large_thumbnail_url = builder.large_thumbnail_url;
        this.sender_id = builder.sender_id;
        this.sender_name = builder.sender_name;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<GiftInfo> {
        public Integer gift_id;
        public String gift_name;
        public String icon;
        public String large_thumbnail_url;
        public Integer num;
        public Long sender_id;
        public String sender_name;

        public Builder() {
        }

        public Builder(GiftInfo giftInfo) {
            super(giftInfo);
            if (giftInfo != null) {
                this.icon = giftInfo.icon;
                this.num = giftInfo.num;
                this.gift_id = giftInfo.gift_id;
                this.gift_name = giftInfo.gift_name;
                this.large_thumbnail_url = giftInfo.large_thumbnail_url;
                this.sender_id = giftInfo.sender_id;
                this.sender_name = giftInfo.sender_name;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GiftInfo build(boolean z) {
            return new GiftInfo(this, z, null);
        }
    }
}
