package tbclient.AlaTab;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes2.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_LAST_VIEWED_FEEDS = "";
    public static final Integer DEFAULT_PN = 0;
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f14419common;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String last_viewed_feeds;
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer pn;

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.f14419common = builder.f14420common;
            if (builder.pn == null) {
                this.pn = DEFAULT_PN;
            } else {
                this.pn = builder.pn;
            }
            if (builder.last_viewed_feeds == null) {
                this.last_viewed_feeds = "";
                return;
            } else {
                this.last_viewed_feeds = builder.last_viewed_feeds;
                return;
            }
        }
        this.f14419common = builder.f14420common;
        this.pn = builder.pn;
        this.last_viewed_feeds = builder.last_viewed_feeds;
    }

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f14420common;
        public String last_viewed_feeds;
        public Integer pn;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.f14420common = dataReq.f14419common;
                this.pn = dataReq.pn;
                this.last_viewed_feeds = dataReq.last_viewed_feeds;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }
}
