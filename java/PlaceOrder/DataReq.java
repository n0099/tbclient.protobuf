package tbclient.PlaceOrder;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes7.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_BENEFIT_USERNAME = "";
    public static final String DEFAULT_SCENE_FROM = "";
    @ProtoField(tag = 9, type = Message.Datatype.INT64)
    public final Long account_id;
    @ProtoField(tag = 10, type = Message.Datatype.INT32)
    public final Integer account_type;
    @ProtoField(tag = 4, type = Message.Datatype.UINT64)
    public final Long benefit_userid;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String benefit_username;
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f69723common;
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer gift_id;
    @ProtoField(tag = 6, type = Message.Datatype.UINT32)
    public final Integer num;
    @ProtoField(tag = 8, type = Message.Datatype.UINT64)
    public final Long post_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String scene_from;
    @ProtoField(tag = 7, type = Message.Datatype.UINT64)
    public final Long thread_id;
    public static final Integer DEFAULT_GIFT_ID = 0;
    public static final Long DEFAULT_BENEFIT_USERID = 0L;
    public static final Integer DEFAULT_NUM = 0;
    public static final Long DEFAULT_THREAD_ID = 0L;
    public static final Long DEFAULT_POST_ID = 0L;
    public static final Long DEFAULT_ACCOUNT_ID = 0L;
    public static final Integer DEFAULT_ACCOUNT_TYPE = 0;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<DataReq> {
        public Long account_id;
        public Integer account_type;
        public Long benefit_userid;
        public String benefit_username;

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f69724common;
        public Integer gift_id;
        public Integer num;
        public Long post_id;
        public String scene_from;
        public Long thread_id;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.f69724common = dataReq.f69723common;
            this.scene_from = dataReq.scene_from;
            this.gift_id = dataReq.gift_id;
            this.benefit_userid = dataReq.benefit_userid;
            this.benefit_username = dataReq.benefit_username;
            this.num = dataReq.num;
            this.thread_id = dataReq.thread_id;
            this.post_id = dataReq.post_id;
            this.account_id = dataReq.account_id;
            this.account_type = dataReq.account_type;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }

    public DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.f69723common = builder.f69724common;
            String str = builder.scene_from;
            if (str == null) {
                this.scene_from = "";
            } else {
                this.scene_from = str;
            }
            Integer num = builder.gift_id;
            if (num == null) {
                this.gift_id = DEFAULT_GIFT_ID;
            } else {
                this.gift_id = num;
            }
            Long l = builder.benefit_userid;
            if (l == null) {
                this.benefit_userid = DEFAULT_BENEFIT_USERID;
            } else {
                this.benefit_userid = l;
            }
            String str2 = builder.benefit_username;
            if (str2 == null) {
                this.benefit_username = "";
            } else {
                this.benefit_username = str2;
            }
            Integer num2 = builder.num;
            if (num2 == null) {
                this.num = DEFAULT_NUM;
            } else {
                this.num = num2;
            }
            Long l2 = builder.thread_id;
            if (l2 == null) {
                this.thread_id = DEFAULT_THREAD_ID;
            } else {
                this.thread_id = l2;
            }
            Long l3 = builder.post_id;
            if (l3 == null) {
                this.post_id = DEFAULT_POST_ID;
            } else {
                this.post_id = l3;
            }
            Long l4 = builder.account_id;
            if (l4 == null) {
                this.account_id = DEFAULT_ACCOUNT_ID;
            } else {
                this.account_id = l4;
            }
            Integer num3 = builder.account_type;
            if (num3 == null) {
                this.account_type = DEFAULT_ACCOUNT_TYPE;
                return;
            } else {
                this.account_type = num3;
                return;
            }
        }
        this.f69723common = builder.f69724common;
        this.scene_from = builder.scene_from;
        this.gift_id = builder.gift_id;
        this.benefit_userid = builder.benefit_userid;
        this.benefit_username = builder.benefit_username;
        this.num = builder.num;
        this.thread_id = builder.thread_id;
        this.post_id = builder.post_id;
        this.account_id = builder.account_id;
        this.account_type = builder.account_type;
    }
}
