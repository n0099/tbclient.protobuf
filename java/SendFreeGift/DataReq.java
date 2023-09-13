package tbclient.SendFreeGift;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes2.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_BENEFIT_USERNAME = "";
    public static final String DEFAULT_SCENE_FROM = "";
    @ProtoField(tag = 2, type = Message.Datatype.UINT64)
    public final Long benefit_userid;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String benefit_username;
    @ProtoField(tag = 5)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f1481common;
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer gift_id;
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer num;
    @ProtoField(tag = 8, type = Message.Datatype.UINT64)
    public final Long post_id;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String scene_from;
    @ProtoField(tag = 7, type = Message.Datatype.UINT64)
    public final Long thread_id;
    public static final Integer DEFAULT_GIFT_ID = 0;
    public static final Long DEFAULT_BENEFIT_USERID = 0L;
    public static final Integer DEFAULT_NUM = 0;
    public static final Long DEFAULT_THREAD_ID = 0L;
    public static final Long DEFAULT_POST_ID = 0L;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<DataReq> {
        public Long benefit_userid;
        public String benefit_username;

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f1482common;
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
            this.gift_id = dataReq.gift_id;
            this.benefit_userid = dataReq.benefit_userid;
            this.benefit_username = dataReq.benefit_username;
            this.num = dataReq.num;
            this.f1482common = dataReq.f1481common;
            this.scene_from = dataReq.scene_from;
            this.thread_id = dataReq.thread_id;
            this.post_id = dataReq.post_id;
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
            String str = builder.benefit_username;
            if (str == null) {
                this.benefit_username = "";
            } else {
                this.benefit_username = str;
            }
            Integer num2 = builder.num;
            if (num2 == null) {
                this.num = DEFAULT_NUM;
            } else {
                this.num = num2;
            }
            this.f1481common = builder.f1482common;
            String str2 = builder.scene_from;
            if (str2 == null) {
                this.scene_from = "";
            } else {
                this.scene_from = str2;
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
                return;
            } else {
                this.post_id = l3;
                return;
            }
        }
        this.gift_id = builder.gift_id;
        this.benefit_userid = builder.benefit_userid;
        this.benefit_username = builder.benefit_username;
        this.num = builder.num;
        this.f1481common = builder.f1482common;
        this.scene_from = builder.scene_from;
        this.thread_id = builder.thread_id;
        this.post_id = builder.post_id;
    }
}
