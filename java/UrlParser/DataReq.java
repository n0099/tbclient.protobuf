package tbclient.UrlParser;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes22.dex */
public final class DataReq extends Message {
    public static final Long DEFAULT_FORUM_ID = 0L;
    public static final Integer DEFAULT_LINK_NUM = 0;
    public static final String DEFAULT_URL = "";
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f5148common;
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long forum_id;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer link_num;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String url;

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.f5148common = builder.f5149common;
            if (builder.forum_id == null) {
                this.forum_id = DEFAULT_FORUM_ID;
            } else {
                this.forum_id = builder.forum_id;
            }
            if (builder.link_num == null) {
                this.link_num = DEFAULT_LINK_NUM;
            } else {
                this.link_num = builder.link_num;
            }
            if (builder.url == null) {
                this.url = "";
                return;
            } else {
                this.url = builder.url;
                return;
            }
        }
        this.f5148common = builder.f5149common;
        this.forum_id = builder.forum_id;
        this.link_num = builder.link_num;
        this.url = builder.url;
    }

    /* loaded from: classes22.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f5149common;
        public Long forum_id;
        public Integer link_num;
        public String url;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.f5149common = dataReq.f5148common;
                this.forum_id = dataReq.forum_id;
                this.link_num = dataReq.link_num;
                this.url = dataReq.url;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }
}
