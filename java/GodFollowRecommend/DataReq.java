package tbclient.GodFollowRecommend;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes11.dex */
public final class DataReq extends Message {
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f1171common;
    @ProtoField(tag = 3, type = Message.Datatype.INT64)
    public final Long forum_id;
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long user_id;
    public static final Long DEFAULT_USER_ID = 0L;
    public static final Long DEFAULT_FORUM_ID = 0L;

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.f1171common = builder.f1172common;
            if (builder.user_id == null) {
                this.user_id = DEFAULT_USER_ID;
            } else {
                this.user_id = builder.user_id;
            }
            if (builder.forum_id == null) {
                this.forum_id = DEFAULT_FORUM_ID;
                return;
            } else {
                this.forum_id = builder.forum_id;
                return;
            }
        }
        this.f1171common = builder.f1172common;
        this.user_id = builder.user_id;
        this.forum_id = builder.forum_id;
    }

    /* loaded from: classes11.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f1172common;
        public Long forum_id;
        public Long user_id;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.f1172common = dataReq.f1171common;
                this.user_id = dataReq.user_id;
                this.forum_id = dataReq.forum_id;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }
}
