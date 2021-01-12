package tbclient.GetGiftListByCategoryId;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes8.dex */
public final class PresentGiftListByCategoryId1 extends Message {
    public static final String DEFAULT_GIFT_DESC = "";
    public static final String DEFAULT_GIFT_NAME = "";
    public static final String DEFAULT_MARK_URL = "";
    public static final String DEFAULT_THUMBNAIL_URL = "";
    @ProtoField(tag = 7, type = Message.Datatype.UINT32)
    public final Integer activity_type;
    @ProtoField(tag = 9, type = Message.Datatype.UINT32)
    public final Integer begin_time;
    @ProtoField(tag = 16, type = Message.Datatype.UINT32)
    public final Integer currency_unit;
    @ProtoField(tag = 11, type = Message.Datatype.UINT32)
    public final Integer discount;
    @ProtoField(tag = 10, type = Message.Datatype.UINT32)
    public final Integer end_time;
    @ProtoField(tag = 15, type = Message.Datatype.UINT32)
    public final Integer gift_count;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String gift_desc;
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer gift_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String gift_name;
    @ProtoField(tag = 12, type = Message.Datatype.UINT32)
    public final Integer ios_discount;
    @ProtoField(tag = 5, type = Message.Datatype.UINT32)
    public final Integer ios_price;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String mark_url;
    @ProtoField(tag = 14, type = Message.Datatype.UINT32)
    public final Integer pitch_on;
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer price;
    @ProtoField(tag = 13, type = Message.Datatype.UINT32)
    public final Integer proportion;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String thumbnail_url;
    public static final Integer DEFAULT_GIFT_ID = 0;
    public static final Integer DEFAULT_PRICE = 0;
    public static final Integer DEFAULT_IOS_PRICE = 0;
    public static final Integer DEFAULT_ACTIVITY_TYPE = 0;
    public static final Integer DEFAULT_BEGIN_TIME = 0;
    public static final Integer DEFAULT_END_TIME = 0;
    public static final Integer DEFAULT_DISCOUNT = 0;
    public static final Integer DEFAULT_IOS_DISCOUNT = 0;
    public static final Integer DEFAULT_PROPORTION = 0;
    public static final Integer DEFAULT_PITCH_ON = 0;
    public static final Integer DEFAULT_GIFT_COUNT = 0;
    public static final Integer DEFAULT_CURRENCY_UNIT = 0;

    private PresentGiftListByCategoryId1(Builder builder, boolean z) {
        super(builder);
        if (z) {
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
            if (builder.price == null) {
                this.price = DEFAULT_PRICE;
            } else {
                this.price = builder.price;
            }
            if (builder.thumbnail_url == null) {
                this.thumbnail_url = "";
            } else {
                this.thumbnail_url = builder.thumbnail_url;
            }
            if (builder.ios_price == null) {
                this.ios_price = DEFAULT_IOS_PRICE;
            } else {
                this.ios_price = builder.ios_price;
            }
            if (builder.gift_desc == null) {
                this.gift_desc = "";
            } else {
                this.gift_desc = builder.gift_desc;
            }
            if (builder.activity_type == null) {
                this.activity_type = DEFAULT_ACTIVITY_TYPE;
            } else {
                this.activity_type = builder.activity_type;
            }
            if (builder.mark_url == null) {
                this.mark_url = "";
            } else {
                this.mark_url = builder.mark_url;
            }
            if (builder.begin_time == null) {
                this.begin_time = DEFAULT_BEGIN_TIME;
            } else {
                this.begin_time = builder.begin_time;
            }
            if (builder.end_time == null) {
                this.end_time = DEFAULT_END_TIME;
            } else {
                this.end_time = builder.end_time;
            }
            if (builder.discount == null) {
                this.discount = DEFAULT_DISCOUNT;
            } else {
                this.discount = builder.discount;
            }
            if (builder.ios_discount == null) {
                this.ios_discount = DEFAULT_IOS_DISCOUNT;
            } else {
                this.ios_discount = builder.ios_discount;
            }
            if (builder.proportion == null) {
                this.proportion = DEFAULT_PROPORTION;
            } else {
                this.proportion = builder.proportion;
            }
            if (builder.pitch_on == null) {
                this.pitch_on = DEFAULT_PITCH_ON;
            } else {
                this.pitch_on = builder.pitch_on;
            }
            if (builder.gift_count == null) {
                this.gift_count = DEFAULT_GIFT_COUNT;
            } else {
                this.gift_count = builder.gift_count;
            }
            if (builder.currency_unit == null) {
                this.currency_unit = DEFAULT_CURRENCY_UNIT;
                return;
            } else {
                this.currency_unit = builder.currency_unit;
                return;
            }
        }
        this.gift_id = builder.gift_id;
        this.gift_name = builder.gift_name;
        this.price = builder.price;
        this.thumbnail_url = builder.thumbnail_url;
        this.ios_price = builder.ios_price;
        this.gift_desc = builder.gift_desc;
        this.activity_type = builder.activity_type;
        this.mark_url = builder.mark_url;
        this.begin_time = builder.begin_time;
        this.end_time = builder.end_time;
        this.discount = builder.discount;
        this.ios_discount = builder.ios_discount;
        this.proportion = builder.proportion;
        this.pitch_on = builder.pitch_on;
        this.gift_count = builder.gift_count;
        this.currency_unit = builder.currency_unit;
    }

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<PresentGiftListByCategoryId1> {
        public Integer activity_type;
        public Integer begin_time;
        public Integer currency_unit;
        public Integer discount;
        public Integer end_time;
        public Integer gift_count;
        public String gift_desc;
        public Integer gift_id;
        public String gift_name;
        public Integer ios_discount;
        public Integer ios_price;
        public String mark_url;
        public Integer pitch_on;
        public Integer price;
        public Integer proportion;
        public String thumbnail_url;

        public Builder() {
        }

        public Builder(PresentGiftListByCategoryId1 presentGiftListByCategoryId1) {
            super(presentGiftListByCategoryId1);
            if (presentGiftListByCategoryId1 != null) {
                this.gift_id = presentGiftListByCategoryId1.gift_id;
                this.gift_name = presentGiftListByCategoryId1.gift_name;
                this.price = presentGiftListByCategoryId1.price;
                this.thumbnail_url = presentGiftListByCategoryId1.thumbnail_url;
                this.ios_price = presentGiftListByCategoryId1.ios_price;
                this.gift_desc = presentGiftListByCategoryId1.gift_desc;
                this.activity_type = presentGiftListByCategoryId1.activity_type;
                this.mark_url = presentGiftListByCategoryId1.mark_url;
                this.begin_time = presentGiftListByCategoryId1.begin_time;
                this.end_time = presentGiftListByCategoryId1.end_time;
                this.discount = presentGiftListByCategoryId1.discount;
                this.ios_discount = presentGiftListByCategoryId1.ios_discount;
                this.proportion = presentGiftListByCategoryId1.proportion;
                this.pitch_on = presentGiftListByCategoryId1.pitch_on;
                this.gift_count = presentGiftListByCategoryId1.gift_count;
                this.currency_unit = presentGiftListByCategoryId1.currency_unit;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public PresentGiftListByCategoryId1 build(boolean z) {
            return new PresentGiftListByCategoryId1(this, z);
        }
    }
}
