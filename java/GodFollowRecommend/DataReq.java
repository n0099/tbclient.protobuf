package tbclient.GodFollowRecommend;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes8.dex */
public final class DataReq extends Message {
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f69445common;
    @ProtoField(tag = 3, type = Message.Datatype.INT64)
    public final Long forum_id;
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long user_id;
    public static final Long DEFAULT_USER_ID = 0L;
    public static final Long DEFAULT_FORUM_ID = 0L;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f69446common;
        public Long forum_id;
        public Long user_id;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.f69446common = dataReq.f69445common;
            this.user_id = dataReq.user_id;
            this.forum_id = dataReq.forum_id;
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
            this.f69445common = builder.f69446common;
            Long l = builder.user_id;
            if (l == null) {
                this.user_id = DEFAULT_USER_ID;
            } else {
                this.user_id = l;
            }
            Long l2 = builder.forum_id;
            if (l2 == null) {
                this.forum_id = DEFAULT_FORUM_ID;
                return;
            } else {
                this.forum_id = l2;
                return;
            }
        }
        this.f69445common = builder.f69446common;
        this.user_id = builder.user_id;
        this.forum_id = builder.forum_id;
    }
}
