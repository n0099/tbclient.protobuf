package tbclient.PlaceOrder;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class DataRes extends Message {
    public static final String DEFAULT_GOODS_NAME = "";
    public static final String DEFAULT_GOODS_PIC = "";
    public static final String DEFAULT_GOODS_UNIT = "";
    public static final String DEFAULT_ORDER_ID = "";
    @ProtoField(tag = 18, type = Message.Datatype.UINT32)
    public final Integer currency;
    @ProtoField(tag = 17, type = Message.Datatype.UINT32)
    public final Integer gift_count;
    @ProtoField(tag = 13, type = Message.Datatype.UINT32)
    public final Integer goods_duration;
    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public final String goods_name;
    @ProtoField(tag = 5, type = Message.Datatype.UINT32)
    public final Integer goods_num;
    @ProtoField(tag = 14, type = Message.Datatype.STRING)
    public final String goods_pic;
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer goods_price;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String goods_unit;
    @ProtoField(tag = 12, type = Message.Datatype.UINT32)
    public final Integer goods_user_level;
    @ProtoField(tag = 16, type = Message.Datatype.UINT64)
    public final Long open_id;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String order_id;
    @ProtoField(tag = 6, type = Message.Datatype.UINT32)
    public final Integer pay_type;
    @ProtoField(tag = 11, type = Message.Datatype.UINT32)
    public final Integer scene_id;
    @ProtoField(tag = 8, type = Message.Datatype.UINT32)
    public final Integer tb_timestamp;
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer tdou_num;
    @ProtoField(tag = 15, type = Message.Datatype.UINT32)
    public final Integer terminal;
    @ProtoField(tag = 9, type = Message.Datatype.UINT32)
    public final Integer timestamp;
    @ProtoField(tag = 7, type = Message.Datatype.UINT64)
    public final Long user_id;
    public static final Integer DEFAULT_TDOU_NUM = 0;
    public static final Integer DEFAULT_GOODS_PRICE = 0;
    public static final Integer DEFAULT_GOODS_NUM = 0;
    public static final Integer DEFAULT_PAY_TYPE = 0;
    public static final Long DEFAULT_USER_ID = 0L;
    public static final Integer DEFAULT_TB_TIMESTAMP = 0;
    public static final Integer DEFAULT_TIMESTAMP = 0;
    public static final Integer DEFAULT_SCENE_ID = 0;
    public static final Integer DEFAULT_GOODS_USER_LEVEL = 0;
    public static final Integer DEFAULT_GOODS_DURATION = 0;
    public static final Integer DEFAULT_TERMINAL = 0;
    public static final Long DEFAULT_OPEN_ID = 0L;
    public static final Integer DEFAULT_GIFT_COUNT = 0;
    public static final Integer DEFAULT_CURRENCY = 0;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public Integer currency;
        public Integer gift_count;
        public Integer goods_duration;
        public String goods_name;
        public Integer goods_num;
        public String goods_pic;
        public Integer goods_price;
        public String goods_unit;
        public Integer goods_user_level;
        public Long open_id;
        public String order_id;
        public Integer pay_type;
        public Integer scene_id;
        public Integer tb_timestamp;
        public Integer tdou_num;
        public Integer terminal;
        public Integer timestamp;
        public Long user_id;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes == null) {
                return;
            }
            this.order_id = dataRes.order_id;
            this.goods_unit = dataRes.goods_unit;
            this.tdou_num = dataRes.tdou_num;
            this.goods_price = dataRes.goods_price;
            this.goods_num = dataRes.goods_num;
            this.pay_type = dataRes.pay_type;
            this.user_id = dataRes.user_id;
            this.tb_timestamp = dataRes.tb_timestamp;
            this.timestamp = dataRes.timestamp;
            this.goods_name = dataRes.goods_name;
            this.scene_id = dataRes.scene_id;
            this.goods_user_level = dataRes.goods_user_level;
            this.goods_duration = dataRes.goods_duration;
            this.goods_pic = dataRes.goods_pic;
            this.terminal = dataRes.terminal;
            this.open_id = dataRes.open_id;
            this.gift_count = dataRes.gift_count;
            this.currency = dataRes.currency;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }

    public DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.order_id;
            if (str == null) {
                this.order_id = "";
            } else {
                this.order_id = str;
            }
            String str2 = builder.goods_unit;
            if (str2 == null) {
                this.goods_unit = "";
            } else {
                this.goods_unit = str2;
            }
            Integer num = builder.tdou_num;
            if (num == null) {
                this.tdou_num = DEFAULT_TDOU_NUM;
            } else {
                this.tdou_num = num;
            }
            Integer num2 = builder.goods_price;
            if (num2 == null) {
                this.goods_price = DEFAULT_GOODS_PRICE;
            } else {
                this.goods_price = num2;
            }
            Integer num3 = builder.goods_num;
            if (num3 == null) {
                this.goods_num = DEFAULT_GOODS_NUM;
            } else {
                this.goods_num = num3;
            }
            Integer num4 = builder.pay_type;
            if (num4 == null) {
                this.pay_type = DEFAULT_PAY_TYPE;
            } else {
                this.pay_type = num4;
            }
            Long l = builder.user_id;
            if (l == null) {
                this.user_id = DEFAULT_USER_ID;
            } else {
                this.user_id = l;
            }
            Integer num5 = builder.tb_timestamp;
            if (num5 == null) {
                this.tb_timestamp = DEFAULT_TB_TIMESTAMP;
            } else {
                this.tb_timestamp = num5;
            }
            Integer num6 = builder.timestamp;
            if (num6 == null) {
                this.timestamp = DEFAULT_TIMESTAMP;
            } else {
                this.timestamp = num6;
            }
            String str3 = builder.goods_name;
            if (str3 == null) {
                this.goods_name = "";
            } else {
                this.goods_name = str3;
            }
            Integer num7 = builder.scene_id;
            if (num7 == null) {
                this.scene_id = DEFAULT_SCENE_ID;
            } else {
                this.scene_id = num7;
            }
            Integer num8 = builder.goods_user_level;
            if (num8 == null) {
                this.goods_user_level = DEFAULT_GOODS_USER_LEVEL;
            } else {
                this.goods_user_level = num8;
            }
            Integer num9 = builder.goods_duration;
            if (num9 == null) {
                this.goods_duration = DEFAULT_GOODS_DURATION;
            } else {
                this.goods_duration = num9;
            }
            String str4 = builder.goods_pic;
            if (str4 == null) {
                this.goods_pic = "";
            } else {
                this.goods_pic = str4;
            }
            Integer num10 = builder.terminal;
            if (num10 == null) {
                this.terminal = DEFAULT_TERMINAL;
            } else {
                this.terminal = num10;
            }
            Long l2 = builder.open_id;
            if (l2 == null) {
                this.open_id = DEFAULT_OPEN_ID;
            } else {
                this.open_id = l2;
            }
            Integer num11 = builder.gift_count;
            if (num11 == null) {
                this.gift_count = DEFAULT_GIFT_COUNT;
            } else {
                this.gift_count = num11;
            }
            Integer num12 = builder.currency;
            if (num12 == null) {
                this.currency = DEFAULT_CURRENCY;
                return;
            } else {
                this.currency = num12;
                return;
            }
        }
        this.order_id = builder.order_id;
        this.goods_unit = builder.goods_unit;
        this.tdou_num = builder.tdou_num;
        this.goods_price = builder.goods_price;
        this.goods_num = builder.goods_num;
        this.pay_type = builder.pay_type;
        this.user_id = builder.user_id;
        this.tb_timestamp = builder.tb_timestamp;
        this.timestamp = builder.timestamp;
        this.goods_name = builder.goods_name;
        this.scene_id = builder.scene_id;
        this.goods_user_level = builder.goods_user_level;
        this.goods_duration = builder.goods_duration;
        this.goods_pic = builder.goods_pic;
        this.terminal = builder.terminal;
        this.open_id = builder.open_id;
        this.gift_count = builder.gift_count;
        this.currency = builder.currency;
    }
}
