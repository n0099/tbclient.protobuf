package tbclient.SendFreeGift;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes9.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_BENEFIT_USERNAME = "";
    public static final String DEFAULT_SCENE_FROM = "";
    @ProtoField(tag = 2, type = Message.Datatype.UINT64)
    public final Long benefit_userid;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String benefit_username;
    @ProtoField(tag = 5)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f14980common;
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

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.gift_id == null) {
                this.gift_id = DEFAULT_GIFT_ID;
            } else {
                this.gift_id = builder.gift_id;
            }
            if (builder.benefit_userid == null) {
                this.benefit_userid = DEFAULT_BENEFIT_USERID;
            } else {
                this.benefit_userid = builder.benefit_userid;
            }
            if (builder.benefit_username == null) {
                this.benefit_username = "";
            } else {
                this.benefit_username = builder.benefit_username;
            }
            if (builder.num == null) {
                this.num = DEFAULT_NUM;
            } else {
                this.num = builder.num;
            }
            this.f14980common = builder.f14981common;
            if (builder.scene_from == null) {
                this.scene_from = "";
            } else {
                this.scene_from = builder.scene_from;
            }
            if (builder.thread_id == null) {
                this.thread_id = DEFAULT_THREAD_ID;
            } else {
                this.thread_id = builder.thread_id;
            }
            if (builder.post_id == null) {
                this.post_id = DEFAULT_POST_ID;
                return;
            } else {
                this.post_id = builder.post_id;
                return;
            }
        }
        this.gift_id = builder.gift_id;
        this.benefit_userid = builder.benefit_userid;
        this.benefit_username = builder.benefit_username;
        this.num = builder.num;
        this.f14980common = builder.f14981common;
        this.scene_from = builder.scene_from;
        this.thread_id = builder.thread_id;
        this.post_id = builder.post_id;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<DataReq> {
        public Long benefit_userid;
        public String benefit_username;

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f14981common;
        public Integer gift_id;
        public Integer num;
        public Long post_id;
        public String scene_from;
        public Long thread_id;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.gift_id = dataReq.gift_id;
                this.benefit_userid = dataReq.benefit_userid;
                this.benefit_username = dataReq.benefit_username;
                this.num = dataReq.num;
                this.f14981common = dataReq.f14980common;
                this.scene_from = dataReq.scene_from;
                this.thread_id = dataReq.thread_id;
                this.post_id = dataReq.post_id;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }
}
