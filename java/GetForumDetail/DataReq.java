package tbclient.GetForumDetail;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes7.dex */
public final class DataReq extends Message {
    public static final Long DEFAULT_FORUM_ID = 0L;
    @ProtoField(tag = 2)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f69422common;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long forum_id;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f69423common;
        public Long forum_id;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.forum_id = dataReq.forum_id;
            this.f69423common = dataReq.f69422common;
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
            Long l = builder.forum_id;
            if (l == null) {
                this.forum_id = DEFAULT_FORUM_ID;
            } else {
                this.forum_id = l;
            }
            this.f69422common = builder.f69423common;
            return;
        }
        this.forum_id = builder.forum_id;
        this.f69422common = builder.f69423common;
    }
}
