package tbclient.SendGiftAndroid;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes8.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_PASSWORD = "";
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f14685common;
    @ProtoField(tag = 6, type = Message.Datatype.INT64)
    public final Long gift_from;
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer gift_id;
    @ProtoField(tag = 5, type = Message.Datatype.UINT32)
    public final Integer num;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String password;
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer price;
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long receiver_id;
    public static final Long DEFAULT_RECEIVER_ID = 0L;
    public static final Integer DEFAULT_GIFT_ID = 0;
    public static final Integer DEFAULT_PRICE = 0;
    public static final Integer DEFAULT_NUM = 0;
    public static final Long DEFAULT_GIFT_FROM = 0L;

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.f14685common = builder.f14686common;
            if (builder.receiver_id == null) {
                this.receiver_id = DEFAULT_RECEIVER_ID;
            } else {
                this.receiver_id = builder.receiver_id;
            }
            if (builder.gift_id == null) {
                this.gift_id = DEFAULT_GIFT_ID;
            } else {
                this.gift_id = builder.gift_id;
            }
            if (builder.price == null) {
                this.price = DEFAULT_PRICE;
            } else {
                this.price = builder.price;
            }
            if (builder.num == null) {
                this.num = DEFAULT_NUM;
            } else {
                this.num = builder.num;
            }
            if (builder.gift_from == null) {
                this.gift_from = DEFAULT_GIFT_FROM;
            } else {
                this.gift_from = builder.gift_from;
            }
            if (builder.password == null) {
                this.password = "";
                return;
            } else {
                this.password = builder.password;
                return;
            }
        }
        this.f14685common = builder.f14686common;
        this.receiver_id = builder.receiver_id;
        this.gift_id = builder.gift_id;
        this.price = builder.price;
        this.num = builder.num;
        this.gift_from = builder.gift_from;
        this.password = builder.password;
    }

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f14686common;
        public Long gift_from;
        public Integer gift_id;
        public Integer num;
        public String password;
        public Integer price;
        public Long receiver_id;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.f14686common = dataReq.f14685common;
                this.receiver_id = dataReq.receiver_id;
                this.gift_id = dataReq.gift_id;
                this.price = dataReq.price;
                this.num = dataReq.num;
                this.gift_from = dataReq.gift_from;
                this.password = dataReq.password;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }
}
