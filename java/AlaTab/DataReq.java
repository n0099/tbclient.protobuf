package tbclient.AlaTab;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes8.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_LAST_VIEWED_FEEDS = "";
    public static final Integer DEFAULT_PN = 0;
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f72660common;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String last_viewed_feeds;
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer pn;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f72661common;
        public String last_viewed_feeds;
        public Integer pn;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.f72661common = dataReq.f72660common;
            this.pn = dataReq.pn;
            this.last_viewed_feeds = dataReq.last_viewed_feeds;
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
            this.f72660common = builder.f72661common;
            Integer num = builder.pn;
            if (num == null) {
                this.pn = DEFAULT_PN;
            } else {
                this.pn = num;
            }
            String str = builder.last_viewed_feeds;
            if (str == null) {
                this.last_viewed_feeds = "";
                return;
            } else {
                this.last_viewed_feeds = str;
                return;
            }
        }
        this.f72660common = builder.f72661common;
        this.pn = builder.pn;
        this.last_viewed_feeds = builder.last_viewed_feeds;
    }
}
